


本专栏基于Springboot2.0，配套自己写的代码例子和图例。内容涉及从基础入门到微服务架构的实践，包括基础的配置用法，web，数据库，Redis，日志使用，也涉及到企业级开发的消息队列，Mongodb，ElasticSearch、OAuth2.0、JWT、还有微服务系列Spring Cloud、Dubbo、Spring Cloud Aliaba，形成一个体系的博客，并有源码的简单分析，适合作为入门的教程

对应博客专栏：[SpringBoot2.0与微服务实践系列教程](https://blog.csdn.net/u014427391/category_9195353.html)，本专栏的例子代码暂时托管于GitHub，在Github上clone到本地既可，[github下载链接](https://github.com/u014427391/springbootexamples)，本博客会不定时更新补充
![在这里插入图片描述](https://i-blog.csdnimg.cn/blog_migrate/fab83fde6540d5d4768078af089ab090.png)

- Spring框架：作为JavaEE框架领域的一款重要的开源框架，在企业应用开发中有着很重要的作用，同时Spring框架及其子框架很多，所以知识量很广。
- Spring Boot：一款Spring系统的一款框架，是2014年推出的一款使Spring框架开发变得容易的框架。学过Spring框架的都知识，Spring框架难以避免地需要配置不少XMl，而使用Spring Boot框架的话，就可以使用注解开发，极大地简化基于Spring框架的开发。Spring Boot充分利用了JavaConfig的配置模式以及“约定优于配置”的理念，能够极大的简化基于Spring MVC的Web应用和REST服务开发。
- Spring Cloud：Spring Cloud为分布式微服务提供了一套体系的解决方案，为开发者提供了来快速构建分布式系统中的一些常见方案（例如配置管理、服务发现、断路器、智能路由、微代理、控制总线、一次性令牌、全局锁、领导选举、分布式会话，集群状态等等）
- Spring Cloud Alibaba：Spring Cloud Alibaba 是阿里巴巴提供的微服务开发一站式解决方案，是阿里巴巴开源中间件与 Spring Cloud 体系的融合。

- 开发环境

  - JDK 1.8
  - SpringBoot2.3.2.RELEASE
  - SpringCloud(Hoxton.SR9)
  - SpringCloudAlibaba2.2.2.RELEASE
  - MybatisPlus3.4.3.4
  - Maven 3.2+
  - Mysql5.7.36

- 开发工具

  - IntelliJ IDEA

  - smartGit

  - Navicat

    ringBoot项目可以使用阿里云提供的脚手架快速创建项目：	
    [https://start.aliyun.com/bootstrap.html](https://start.aliyun.com/bootstrap.html)

![在这里插入图片描述](https://i-blog.csdnimg.cn/blog_migrate/c3d052ce8ce14dffd170b6e09bb7e286.png)

@[toc]

## 学习入门前言

[SpringBoot系列之快速创建项目教程](https://blog.csdn.net/u014427391/article/details/102870300)

## 一、配置使用篇

### 1.1 配置文件用法

- [SpringBoot系列之外部配置用法简介](https://blog.csdn.net/u014427391/article/details/102995991)&nbsp;&nbsp;&nbsp; &nbsp;>> [code download](https://github.com/u014427391/springbootexamples/tree/master/springboot-config)
- [SpringBoot系列之配置文件加载位置](https://blog.csdn.net/u014427391/article/details/102994600)&nbsp;&nbsp;&nbsp; &nbsp;>> [code download](https://github.com/u014427391/springbootexamples/tree/master/springboot-config)
- [SpringBoot系列之配置文件占位符使用](https://blog.csdn.net/u014427391/article/details/102985940)&nbsp;&nbsp;&nbsp; &nbsp;>> [code download](https://github.com/u014427391/springbootexamples/tree/master/springboot-config)

### 1.2 配置注解使用介绍

- [SpringBoot系列之@PropertySource用法简介](https://blog.csdn.net/u014427391/article/details/102931513)&nbsp;&nbsp;&nbsp; &nbsp;>> [code download](https://github.com/u014427391/springbootexamples/tree/master/springboot-config)
- [SpringBoot系列之@Value和@ConfigurationProperties](https://blog.csdn.net/u014427391/article/details/102887045)&nbsp;&nbsp;&nbsp; &nbsp;>> [code download](https://github.com/u014427391/springbootexamples/tree/master/springboot-config)

### 1.3 YAML配置使用

- [SpringBoot系列之YAML配置用法学习笔记](https://blog.csdn.net/u014427391/article/details/102877780)&nbsp;&nbsp;&nbsp; &nbsp;>> [code download](https://github.com/u014427391/springbootexamples/tree/master/springboot-config)
- [SpringBoot系列之@PropertySource读取yaml文件](https://blog.csdn.net/u014427391/article/details/103235131)&nbsp;&nbsp;&nbsp; &nbsp;>> [code download](https://github.com/u014427391/springbootexamples/tree/master/springboot-config)

### 1.4 配置profis多环境

- [SpringBoot系列之profiles配置多环境用法介绍](https://blog.csdn.net/u014427391/article/details/102931424)&nbsp;&nbsp;&nbsp; &nbsp;>> [code download](https://github.com/u014427391/springbootexamples/tree/master/springboot-config)
- [SpringBoot系列之profiles配置多环境使用补充](https://blog.csdn.net/u014427391/article/details/89792248)&nbsp;&nbsp;&nbsp; &nbsp;>> [code download](https://github.com/u014427391/springbootexamples/tree/master/springboot-config)

## 二、数据访问篇

### 2.1 JDBC数据访问

- [SpringBoot系列之JDBC数据访问](https://blog.csdn.net/u014427391/article/details/103538659)&nbsp;&nbsp;&nbsp; &nbsp;>> [code download](https://github.com/u014427391/springbootexamples/tree/master/sppringboot-jdbc)

### 2.2 ORM框架Mybatis

- [SpringBoot系列之集成Mybatis教程](https://blog.csdn.net/u014427391/article/details/103547514)&nbsp;&nbsp;&nbsp; &nbsp;>> [code download](https://github.com/u014427391/springbootexamples/tree/master/springboot-mybatis)

### 2.3 Spring data JPA

- [SpringBoot系列之Spring Data Jpa集成教程](https://blog.csdn.net/u014427391/article/details/103551914)&nbsp;&nbsp;&nbsp; &nbsp;>> [code download](https://github.com/u014427391/springbootexamples/tree/master/springboot-jpa)
- [SpringBoot系列之JPA实现按年月日查询](https://smilenicky.blog.csdn.net/article/details/135852229)


### 2.4 Mybatis Plus

- [SpringBoot系列之集成MybatisPlus](https://blog.csdn.net/u014427391/article/details/121888057)&nbsp;&nbsp;&nbsp; &nbsp;>> [code download](https://github.com/u014427391/springbootexamples/tree/master/springboot-mybatis-plus)
- [SpringBoot系列之MyBatis Plus自动填充实现](https://smilenicky.blog.csdn.net/article/details/134184177)&nbsp;&nbsp;&nbsp; &nbsp;>> [code download](https://github.com/u014427391/springbootexamples/tree/master/springboot-mybatis-plus)
- [SpringBoot系列之MybatisPlus实现分组查询](https://smilenicky.blog.csdn.net/article/details/135885378)
### 2.5 连接池Druid

- [SpringBoot系列之集成Druid配置数据源监控](https://blog.csdn.net/u014427391/article/details/103547228)&nbsp;&nbsp;&nbsp; &nbsp;>> [code download](https://github.com/u014427391/springbootexamples/tree/master/sppringboot-jdbc)
- [SpringBoot系列之Druid进行维度的统计和监控](https://blog.csdn.net/u014427391/article/details/70890506)&nbsp;&nbsp;&nbsp; &nbsp;>> [code download](https://github.com/u014427391/springbootexamples/tree/master/sppringboot-jdbc)

## 三、日志处理篇

### 3.1 基础入门系列

- [SpringBoot系列之日志框架介绍及其原理简介](https://blog.csdn.net/u014427391/article/details/103082396)&nbsp;&nbsp;&nbsp; &nbsp;>> [code download](https://github.com/u014427391/springbootexamples/tree/master/springboot-logging-logback)
- [SpringBoot系列之日志框架使用教程](https://smilenicky.blog.csdn.net/article/details/103101517)&nbsp;&nbsp;&nbsp; &nbsp;>> [code download](https://github.com/u014427391/springbootexamples/tree/master/springboot-logging-logback)

### 3.2 logback入门

- [SpringBoot系列之集成logback实现日志打印](https://blog.csdn.net/u014427391/article/details/86848207)&nbsp;&nbsp;&nbsp; &nbsp;>> [code download](https://github.com/u014427391/springbootexamples/tree/master/springboot-logging-logback)

### 3.3 log4j入门

- [SpringBoot系列之切换log4j日志框架](https://blog.csdn.net/u014427391/article/details/103108102)&nbsp;&nbsp;&nbsp; &nbsp;>> [code download](https://github.com/u014427391/springbootexamples/tree/master/springboot-logging-log4j)

## 四、Web使用篇

### 4.1 模板引擎之jsp

- [SpringBoot系列之集成jsp模板引擎](https://blog.csdn.net/u014427391/article/details/103445785)&nbsp;&nbsp;&nbsp; &nbsp;>> [code download](https://github.com/u014427391/springbootexamples/tree/master/springboot-jsp)

### 4.2 模板引擎之Thymeleaf

- [SpringBoot系列之集成Thymeleaf用法手册](https://blog.csdn.net/u014427391/article/details/103241846)&nbsp;&nbsp;&nbsp; &nbsp;>> [code download](https://github.com/thymeleaf/thymeleafexamples-gtvg)

### 4.3 国际化多语言

- [SpringBoot系列之i18n国际化多语言支持教程](https://blog.csdn.net/u014427391/article/details/103226530)&nbsp;&nbsp;&nbsp; &nbsp;>> [code download](https://github.com/u014427391/springbootexamples/tree/master/springboot-web)

### 4.4 RESTFul API支持

- [SpringBoot系列之HATEOAS用法简介](https://blog.csdn.net/u014427391/article/details/102650252)&nbsp;&nbsp;&nbsp; &nbsp;>> [code download](https://github.com/u014427391/springbootexamples/tree/master/springboot-hateoas)
- [SpringBoot系列之基于Jersey实现RESTFul风格文件上传API](https://blog.csdn.net/u014427391/article/details/132254789) &nbsp;>> [code download](https://github.com/u014427391/springbootexamples/tree/master/springboot-jersey)
- [SpringBoot系列之集成Resteasy实现RESTFul接口](https://blog.csdn.net/u014427391/article/details/132260754) &nbsp;>> [code download](https://github.com/u014427391/springbootexamples/tree/master/springboot-jboss-resteasy)

### 4.5 在线文档Swagger

- [SpringBoot系列之集成Swagger2](https://blog.csdn.net/u014427391/article/details/90706219)&nbsp;&nbsp;&nbsp; &nbsp;>> [code download](https://github.com/u014427391/springbootexamples)

### 4.6 Spring validation校验

- [SpringBoot系列之表单参数校验整理](https://blog.csdn.net/u014427391/article/details/122298707) &nbsp;&nbsp;&nbsp; &nbsp;>> [code download](https://github.com/u014427391/springbootexamples/tree/master/springboot-validated)
- [SpringBoot系列之自定义枚举类的数据校验注解](https://blog.csdn.net/u014427391/article/details/121980957)&nbsp;&nbsp;&nbsp; &nbsp;>> [code download](https://github.com/u014427391/springbootexamples/tree/master/springboot-validated)

### 4.7 RestTemplate

- [SpringBoot系列之RestTemplate使用示例](https://smilenicky.blog.csdn.net/article/details/108831497)

### 4.8 EasyExcel报表

- [SpringBoot系列之集成EasyExcel导入合并行数据](https://blog.csdn.net/u014427391/article/details/123529499) &nbsp;&nbsp;&nbsp; &nbsp;>> [code download](https://github.com/u014427391/springbootexamples/tree/master/springboot-easyexcel)
- [SpringBoot系列之对Excel报表的校验提示](https://blog.csdn.net/u014427391/article/details/123532264)&nbsp;&nbsp;&nbsp; &nbsp;>> [code download](https://github.com/u014427391/springbootexamples/tree/master/springboot-easyexcel)

### 4.9 Jacksons应用

- [SpringBoot系列之自定义Jackson对象映射器](https://smilenicky.blog.csdn.net/article/details/134184022)

### 4.10 WebSocket应用
- [SpringBoot系列之搭建WebSocket应用](https://smilenicky.blog.csdn.net/article/details/139777159)
## 五、缓存处理篇

### 5.1 缓存入门

- [SpringBoot系列之项目中缓存使用详细教程](https://blog.csdn.net/u014427391/article/details/105226170)     &nbsp;&nbsp;&nbsp; &nbsp;>> [code download](https://github.com/u014427391/springbootexamples/tree/master/springboot-cache)

### 5.2 集成Redis教程

- [SpringBoot系列之集成Redis实现缓存处理](https://blog.csdn.net/u014427391/article/details/78799623)&nbsp;&nbsp;&nbsp; &nbsp;>> [code download](https://github.com/u014427391/jeeplatform)
- [SpringBoot系列之使用Redis做Mybatis二级缓存](https://blog.csdn.net/u014427391/article/details/122255831)&nbsp;&nbsp;&nbsp; &nbsp;>> [code download](https://github.com/u014427391/springbootexamples/tree/master/springboot-mybatis-plus)
- [SpringBoot系列之使用Redis ZSet实现排序分页](https://smilenicky.blog.csdn.net/article/details/134772873)
- [SpringBoot系列之集成Redission入门与实践](https://smilenicky.blog.csdn.net/article/details/134202872)&nbsp;&nbsp;&nbsp; &nbsp;>> [code download](https://github.com/u014427391/springbootexamples/tree/master/springboot-redisson)
- [SpringBoot系列之使用Redis实现延时队列](https://smilenicky.blog.csdn.net/article/details/136164815)
- [SpringBoot系列之集成Jedis教程](https://smilenicky.blog.csdn.net/article/details/134580788)
- [SpringBoot系列之基于Jedis实现分布式锁](https://smilenicky.blog.csdn.net/article/details/134884618)

### 5.3 集成MongoDB教程

- [SpringBoot系列之Spring Data MongoDB教程](https://blog.csdn.net/u014427391/article/details/122717644)&nbsp;&nbsp;&nbsp; &nbsp;>> [code download](https://github.com/u014427391/springbootexamples/tree/master/springboot-mongodb)
- [SpringBoot系列之MongoCollection示例](https://blog.csdn.net/u014427391/article/details/122828065)&nbsp;&nbsp;&nbsp; &nbsp;>> [code download](https://github.com/u014427391/springbootexamples/tree/master/springboot-mongodb)
- [SpringBoot系列之MongoDB Aggregations](https://blog.csdn.net/u014427391/article/details/122828360)&nbsp;&nbsp;&nbsp; &nbsp;>> [code download](https://github.com/u014427391/springbootexamples/tree/master/springboot-mongodb)
- [SpringBoot系列之MongoTemplate加PageHelper分页实现](https://smilenicky.blog.csdn.net/article/details/128012318)&nbsp;&nbsp;&nbsp; &nbsp;>> [code download](https://github.com/u014427391/springbootexamples/tree/master/springboot-mongodb)
- [SpringBoot系列之基于MongoRepository实现分页](https://smilenicky.blog.csdn.net/article/details/128216735)&nbsp;&nbsp;&nbsp; &nbsp;>> [code download](https://github.com/u014427391/springbootexamples/tree/master/springboot-mongodb)

## 六、消息队列篇

### 6.1 消息队列之RabbitMQ

- [SpringBoot系列之RabbitMQ使用实用教程](https://blog.csdn.net/u014427391/article/details/105414281)&nbsp;&nbsp;&nbsp; &nbsp;>> [code download](https://github.com/u014427391/springbootexamples/tree/master/springboot-rabbitmq)

### 6.2 消息队列之kafka

- [SpringBoot系列之集成kafka实现事件发布](https://blog.csdn.net/u014427391/article/details/122091467)&nbsp;&nbsp;&nbsp; &nbsp;>> [code download](https://github.com/u014427391/springbootexamples/tree/master/springboot-kafka)

## 七、 微服务之Dubbo

- [SpringBoot系列之集成Dubbo实现微服务教程](https://blog.csdn.net/u014427391/article/details/103848114)&nbsp;&nbsp;&nbsp; &nbsp;>> [code download](https://github.com/u014427391/springbootexamples/tree/master/springboot-dubbo)
- [SpringBoot系列之集成Dubbo的方式](https://blog.csdn.net/u014427391/article/details/103945442)&nbsp;&nbsp;&nbsp; &nbsp;>> [code download](https://github.com/u014427391/springbootexamples/tree/master/springboot-dubbo)

## 八、 微服务之Spring Cloud

### 8.1 服务治理实现

- [SpringCloud系列使用Netflix Eureka进行服务治理](https://blog.csdn.net/u014427391/article/details/107567035)

### 8.2 声明式服务调用

- [SpringCloud系列之声明式服务调用Netflix Feign](https://blog.csdn.net/u014427391/article/details/107632921)  

### 8.3 客户端负载均衡

- [SpringCloud系列之客户端负载均衡Netflix Ribbon](https://blog.csdn.net/u014427391/article/details/107662300)

### 8.4 服务容错保护

- [SpringCloud系列之服务容错保护Netflix Hystrix](https://blog.csdn.net/u014427391/article/details/107819700)

### 8.5 API网关服务

- [SpringCloud系列之API网关服务Zuul](https://blog.csdn.net/u014427391/article/details/107845774) 
- [SpringCloud系列之API Gateway开发手册](https://blog.csdn.net/u014427391/article/details/108584446)

### 8.6 分布式配置中心

- [SpringCloud系列之分布式配置中心极速入门与实践](https://blog.csdn.net/u014427391/article/details/108491861) 

## 九、微服务之Spring Cloud Alibaba

### 9.1  Nacos服务注册与发现

- [Spring Cloud Alibaba系列之快速开始搭建Nacos环境](https://smilenicky.blog.csdn.net/article/details/111628299)
- [Spring Cloud Alibaba系列之Nacos服务注册与发现](https://smilenicky.blog.csdn.net/article/details/111518470)

### 9.2  Nacos分布式配置中心

- [Spring Cloud Alibaba系列之Nacos分布式配置中心](https://smilenicky.blog.csdn.net/article/details/111519080)

### 9.3  Nacos集成分布式服务组件Dubbo

- [SpringCloud Alibaba系列之分布式服务组件Dubbo](https://smilenicky.blog.csdn.net/article/details/112826860)

### 9.4  集成阿里Canal监听MySQL

- [SpringBoot系列之集成阿里canal监听MySQL Binlog](https://blog.csdn.net/u014427391/article/details/121989219)
- [SpringBoot系列之canal和kafka实现异步实时更新](https://blog.csdn.net/u014427391/article/details/122211056)

### 9.5  服务防护组件Sentinel

- [Spring Cloud Alibaba系列之服务防护组件Sentinel](https://smilenicky.blog.csdn.net/article/details/113603534)



## 十、单点登录篇

### 10.1 单点登录入门

- [ 单点登录集群安装教程](http://blog.csdn.net/u014427391/article/details/78653482)

### 10.2 单点登录框架CAS

- [CAS单点登录系列之原理简单介绍](https://blog.csdn.net/u014427391/article/details/82083995)
- [CAS系列之使用cas overlay搭建服务端（一）](https://blog.csdn.net/u014427391/article/details/105818468)
- [CAS 5.3.1系列之支持JDBC认证登录（二）](https://blog.csdn.net/u014427391/article/details/105603895)
- [CAS 5.3.1系列之自定义JDBC认证策略（三）](https://blog.csdn.net/u014427391/article/details/105820486)
- [CAS 5.3.1系列之自定义Shiro认证策略（四）](https://blog.csdn.net/u014427391/article/details/105820586)

### 10.3 单点登录方案OAuth2.0

- [OAuth2.0系列之集成JWT实现单点登录](https://smilenicky.blog.csdn.net/article/details/106017401)

### 10.4 前后端分类鉴权JWT

- [SpringBoot系列之前后端接口安全技术JWT](https://smilenicky.blog.csdn.net/article/details/107099840)

## 十一、OAuth2.0篇

### 11.1 OAuth2.0入门

- [OAuth2.0系列之基本概念和运作流程（一）](https://smilenicky.blog.csdn.net/article/details/106543396)

### 11.2 OAuth2.0四种模式

- [OAuth2.0系列之授权码模式实践教程（二）](https://smilenicky.blog.csdn.net/article/details/106551368)
- [OAuth2.0系列之简化模式实践教程（三）](https://smilenicky.blog.csdn.net/article/details/106686607)
- [OAuth2.0系列之密码模式实践教程（四）](https://smilenicky.blog.csdn.net/article/details/106687880)
- [OAuth2.0系列之客户端模式实践教程（五）](https://smilenicky.blog.csdn.net/article/details/106689987)

### 11.3 OAuth2.0信息存储

- [OAuth2.0系列之信息数据库存储教程（六）](https://smilenicky.blog.csdn.net/article/details/106757121)
- [OAuth2.0系列之信息Redis存储教程（七）](https://smilenicky.blog.csdn.net/article/details/106790398)
- [OAuth2.0系列之JWT令牌实践教程（八）](https://smilenicky.blog.csdn.net/article/details/106805642)

## 十二、搜索引擎篇

### 12.1 搜索引擎之Elasticsearch

- [SpringBoot系列之Elasticsearch极速入门与实践教程](https://smilenicky.blog.csdn.net/article/details/107365858)&nbsp;&nbsp;&nbsp; &nbsp;>> [code download](https://github.com/u014427391/springbootexamples/tree/master/springboot-elasticsearch)

## 十三、Task任务篇

### 13.1 异步任务使用

- [SpringBoot系列之异步任务@Async使用教程](https://smilenicky.blog.csdn.net/article/details/107458630)&nbsp;&nbsp;&nbsp; &nbsp;>> [code download](https://github.com/u014427391/springbootexamples/tree/master/springboot-async)

### 13.2 定时任务使用

- [SpringBoot系列之使用Spring Task实现定时任务](https://smilenicky.blog.csdn.net/article/details/107488534)&nbsp;&nbsp;&nbsp; &nbsp;>> [code download](https://github.com/u014427391/springbootexamples/tree/master/springboot-scheduler-task)

### 13.3 邮件任务使用

- [SpringBoot系列之发送邮件极速入门与实践](https://smilenicky.blog.csdn.net/article/details/107517585)&nbsp;&nbsp;&nbsp; &nbsp;>> [code download](https://github.com/u014427391/springbootexamples/tree/master/springboot-email)

## 十四、部署监控篇

### 14.1 热部署实践

- [SpringBoot系统之devtools热部署实现教程](https://smilenicky.blog.csdn.net/article/details/107531226)&nbsp;&nbsp;&nbsp; &nbsp;>> [code download](https://github.com/u014427391/springbootexamples/tree/master/springboot-deploy)
- [Spring Boot Actuator系统监控与管理入门教程](https://smilenicky.blog.csdn.net/article/details/107535188)&nbsp;&nbsp;&nbsp; &nbsp;>> [code download](https://github.com/u014427391/springbootexamples/tree/master/springboot-actuator)

## 十五、安全授权篇

### 15.1 SpringSecurity使用

- [Spring Security系列之极速入门与实践教程](https://smilenicky.blog.csdn.net/article/details/107559687)&nbsp;&nbsp;&nbsp; &nbsp;>> [code download](https://github.com/u014427391/springbootexamples/tree/master/springboot-security)

## 十六、AI应用篇
- [SpringBoot系列之Spring AI+DeekSeek创建AI应用](https://smilenicky.blog.csdn.net/article/details/145666415)  &nbsp;&nbsp;&nbsp; &nbsp;>> [code download](https://github.com/u014427391/springbootexamples/tree/master/springboot-ai-demo)

## 十六、源码学习篇

### 16.1 SpringBoot自动配置原理

- [SpringBoot源码学习系列之自动配置原理简介](https://blog.csdn.net/u014427391/article/details/102844681)
- [SpringBoot源码学习系列之异常处理自动配置](https://blog.csdn.net/u014427391/article/details/103334278)
- [SpringBoot源码学习系列之Locale自动配置](https://blog.csdn.net/u014427391/article/details/103258401)
- [SpringBoot源码学习系列之SpringMVC自动配置](https://blog.csdn.net/u014427391/article/details/103240199)

### 16.2 SpringBoot嵌入式Servlet容器

- [SpringBoot源码学习系列之嵌入式Servlet容器](https://blog.csdn.net/u014427391/article/details/103425427)

### 16.3 SpringBoot注解系列

- [SpringBoot源码学习系列之@PropertySource注解实现](https://blog.csdn.net/u014427391/article/details/103258216)

### 16.4 SpringBoot自定义Starter

- [SpringBoot系列之自定义starter实践教程](https://blog.csdn.net/u014427391/article/details/103807042)

## 拓展篇

### 函数式编程语言

- [SpringBoot系列之集成Scala开发API接口](https://smilenicky.blog.csdn.net/article/details/124326849)

技术博客公众号
![微信](https://i-blog.csdnimg.cn/blog_migrate/7b8ef397c8784853ca86a820e351c5d4.png)
