package com.example.springboot.ai.comment;

import com.example.springboot.ai.components.OpenAIHelper;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

@Component
public class ToutiaoAutoCommenter extends AbstractAutoCommenter {

    @Value("${chromedriver.path}")
    private String CHROME_DRIVER_PATH;

    @Value("${article.urls.path}")
    private String ARTICLE_PATH;

    @Value("${browser.userDataDir}")
    private String USER_DATA_DIR;

    @Value("${openai.api-key}")
    private String OPENAI_API_KEY;

    @Value("${login.username}")
    private String loginUsername;

    @Value("${login.password}")
    private String loginPassword;

    @Autowired
    private OpenAIHelper openAIHelper;

    @Override
    public void startAutoComment() {
        WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver", CHROME_DRIVER_PATH);

        ChromeOptions options = configureChromeOptions();
        driver = new ChromeDriver(options);

        try {
            if (!isLoggedIn()) {
                if (!login()) {
                    log.error("登录失败，无法执行评论操作");
                    driver.close();
                    return;
                }
            }

            List<String> articleUrls = readUrls();
            if (articleUrls.isEmpty()) {
                log.info("文章链接文件为空，没有文章需要评论");
                return;
            }

            doComment(articleUrls);
        } finally {
            driver.close();
        }
    }

    @Override
    protected ChromeOptions configureChromeOptions() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-popup-blocking");
        options.addArguments("--disable-notifications");
        options.addArguments("--disable-blink-features=AutomationControlled");
        options.addArguments("--disable-infobars");
        options.addArguments("--disable-dev-shm-usage"); // 解决Docker环境下的内存问题
        options.addArguments("--no-sandbox"); // 解决Linux环境下的权限问题
        options.addArguments("--user-data-dir=" + USER_DATA_DIR);
        options.addArguments("user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/104.0.5112.81 Safari/537.36");
        options.addArguments("--window-size=1920,1080");
        return options;
    }

    @Override
    protected boolean isLoggedIn() {
        try {
            driver.get("http://www.toutiao.com");
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3).getSeconds());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".login-button")));
            return false;
        } catch (Exception e) {
            return true;
        }
    }

    @Override
    protected boolean login() {
        try {
            driver.get("http://www.toutiao.com");
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5).getSeconds());

            WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".login-button")));
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", loginButton);

            WebElement accountLoginOption = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("li[aria-label='账密登录']")));
            accountLoginOption.click();

            WebElement usernameField = wait.until(ExpectedConditions.presenceOfElementLocated(By.className("web-login-normal-input__input")));
            usernameField.sendKeys(loginUsername);

            WebElement passwordField = wait.until(ExpectedConditions.presenceOfElementLocated(By.className("web-login-button-input__input")));
            passwordField.sendKeys(loginPassword);

            WebElement agreeCheckbox = wait.until(ExpectedConditions.elementToBeClickable(By.className("web-login-confirm-info__checkbox")));
            if (!agreeCheckbox.isSelected()) {
                agreeCheckbox.click();
            }

            WebElement loginSubmitButton = driver.findElement(By.className("web-login-button"));
            loginSubmitButton.click();

            driver.navigate().refresh();

            return isLoggedIn();
        } catch (Exception e) {
            log.error("登录失败: {}", e.getMessage());
            return false;
        }
    }

    @Override
    protected List<String> readUrls() {
        List<String> articleUrls = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(ARTICLE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    articleUrls.add(line.trim());
                }
            }
        } catch (IOException e) {
            log.error("读取文章链接文件时出错", e);
        }
        return articleUrls;
    }

    @Override
    protected void comment(String url) {
        driver.get(url);
        try {
            // 判断链接类型
            String urlType = parseUrlType(url);
            log.info("链接类型: {}", urlType);

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5).getSeconds());

            if (urlType.equals("视频")) {
                WebElement commentIcon = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".comment-icon")));
                commentIcon.click();
            }

            WebElement commentBox = wait.until(ExpectedConditions.presenceOfElementLocated(By.className("comment-textarea")));

            String articleTitle = driver.getTitle();
            log.info("获取文章标题: {}", articleTitle);

            String comment = openAIHelper.generateComment(articleTitle);
            log.info("评论内容: {}", comment);
            commentBox.sendKeys(comment);

            WebElement commentButton = driver.findElement(By.className("submit-btn"));
            commentButton.click();
            Thread.sleep(3000);
        } catch (Exception e) {
            log.error("评论文章时出错", e);
        }
    }

    // 判断链接类型的方法
    private String parseUrlType(String url) {
        try {
            URL toutiaoUrl = new URL(url);
            String path = toutiaoUrl.getPath();

            if (path.contains("/video/")) {
                return "视频";
            } else {
                return "文章";
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "无效链接";
        }
    }
}