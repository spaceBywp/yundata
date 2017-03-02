Spring cloud 微服务框架搭建
====================
spring cloud demo
---------------------

    Spring Cloud 为开发人员提供了一系列的工具来快速构建分布式系统的通用模型 
例如：配置管理、服务发现、断路器、智能路由、微代理、控制总线、一次性Token(没研究到)、全局锁(没研究到)、决策竞选(没研究到)、分布式session、集群状态等等
分布式系统的协助需要一大堆的模型，使用Spring Cloud开发者能快速的建立支持实现这些模式的服务和应用程序
他们将适用于任何分布式环境，无论是开发者的个人电脑还是生产环境，还是云平台

这个demo能够帮助开发人员快速的搭建起一个spring cloud构建的微服务结构
### 未完成事项

 
> 1-全链路监测
>
> 2-网关层的权限控制完善
> 
> 3-权重调整和限流策略



    快速使用该项目,需要开发人员首先了解目录结构
以下是该项目的结构介绍


1. yundata (根目录)
    - yundata-common（公用模块部分）
    - yundata-matedata（元数据部分）
        1. yundata-metadata-generator(mysql自动生成mapper/xml和model的工具项目)
        2. yundata-metadata-mapper(存放generator生成的mapper和xml)
        3. yundata-metadata-model(存放generator生成的model)
        4. 其他DTO,可以自己生成新的项目为其他服务提供基本的DTO传输对象
    - yundata-parent（分布式服务根目录/分布式服务父项目，方便依赖和版本的统一管理）
        1. eureka-server（分布式服务的注册中心）
        2. config-server（配置文件服务，为其他服务提供配置文件信息）
        3. zuul-server (网关服务，对外屏蔽内部api接口，可以进行权限验证和限流(没有研究到))
        4. feign-server (负载和断路服务,为后端的其他微服务提供负载功能和快速失败)
        5. compute-service(微服务一号~，可以自己在里面实现业务逻辑)
        6. file-server(文件服务，与compute-service一样，使用fastdfs实现文件上传下载)
        7. turbine-server(断路请求监控服务)


<blockquote>
<p>基础服务的集成</p>
</blockquote>

1. config-server
    - 已经集成的服务
        1. bus(通过config-server服务，动态修改该项目配置文件)
    - 未集成的服务
        1. 配置文件对称加密
2. feign-server
    - 已经集成的服务
        1. thymeleaf(方便测试使用，实际生产环境中使用前后端分离)
        2. bus(通过config-server服务，动态修改该项目配置文件)
        3.feign 自动支持hystrix
3. compute-service
    - 已经集成的服务
        1. mybatis
        2. rabbitmq
        3. thymeleaf(方便测试使用，实际生产环境中使用前后端分离)
        4. bus(通过config-server服务，动态修改该项目配置文件)
        5. redis
    - 未集成的服务
        1. mongodb
        2. kafka
        3. elasticsearch
        4. 根据自身的业务需求所需的其他服务
4. file-server
    - 已经集成的服务
        1. mybatis
        2. thymeleaf(方便测试使用，实际生产环境中使用前后端分离)
        3. bus(通过config-server服务，动态修改该项目配置文件)
        4. fastdfs（文件服务）
    - 未集成的服务
        1. 根据自身的业务需求所需的其他服务
5. zuul-server
    - 已经集成的服务
        1. ribbon（zuul本身支持ribbon实现负载）
        2. spring session
    - 未集成的服务
        1. 权限控制
        2. 流量限流   
<blockquote>
<p>服务所需的环境搭建</p>
</blockquote>

> rabbitMq 
>> 安装教程[点击这里看看][1]

> mysql安装教程
>> 安装教程[点击这里看看][2]

> fastdfs
>> 安装教程[点击这里看看][3]

[1]: http://xpenxpen.iteye.com/blog/1474608/
[2]: http://blog.csdn.net/qq_27376871/article/details/51279211/
[3]: http://blog.csdn.net/xyang81/article/details/52837974

### 特别注意
        config-server中需要配置github(或者其他服务，本地目录，项目本身)
    另外，在本次项目中config-server使用properties 格式的配置文件
    URL与配置文件的映射关系如下：
    /{application}/{profile}[/{label}]
    /{application}-{profile}.yml
    /{label}/{application}-{profile}.yml
    /{application}-{profile}.properties
    /{label}/{application}-{profile}.properties

举个栗子<br/>
- config-server 服务配置的远程配置文件地址是https://github.com/spaceBywp/config-server/下的 configserver/目录
<br/>
则服务compute-service的配置文件命名规范应该是:
<br/>默认配置文件
compute-service.properties
<br/>开发环境配置文件
compute-service-dev.properties
<br/>测试环境配置文件
compute-service-test.properties
<br/>生产环境配置文件
compute-service-prod.properties


### 来自开发者的吐槽
    ps:
    2017-02-28  这里多说一句，提交代码的时候不小心把自己的github账号和密码都提交上来了，被迫已经修改了账号和密码，这脑子，简直了~~~~~
    2017-03-02  本地仓库出了问题，于是乎删除github上面项目，重新提交