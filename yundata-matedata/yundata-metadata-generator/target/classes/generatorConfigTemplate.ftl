<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE generatorConfiguration PUBLIC "-//mybatis.org//DTD MyBatis Generator Configuration 1.0//EN"
        "http://mybatis.org/dtd/mybatis-generator-config_1_0.dtd" >
<generatorConfiguration>
    <!-- classPathEntry:数据库的JDBC驱动的jar包地址 -->
    <classPathEntry location="${location}"/>
    <context id="default" targetRuntime="MyBatis3">
        <plugin type="org.mybatis.generator.plugins.SerializablePlugin"></plugin>
        <commentGenerator>
            <property name="suppressAllComments" value="true"/>
        </commentGenerator>
        <jdbcConnection driverClass="${driverClass}" connectionURL="${connectionUrl}" userId="${userId}" password="${password}"/>
        <javaTypeResolver>
            <property name="forceBigDecimals" value="false"/>
        </javaTypeResolver>
    <#--生成po存放位置-->
        <javaModelGenerator targetPackage="${modelTargetPackage}" targetProject="${poTargetProject}/src/main/java">
            <property name="trimStrings" value="true"/>
        </javaModelGenerator>
    <#--生成mapper xml文件存放位置-->
        <sqlMapGenerator targetPackage="${sqlMapTargetPackage}" targetProject="${mapperTargetProject}/src/main/java"/>
    <#--生成mapper接口存放位置-->
        <javaClientGenerator targetPackage="${javaClientTargetPackage}" targetProject="${mapperTargetProject}/src/main/java" type="XMLMAPPER"/>
    <#list tablesList as table>
        <table tableName="${table.tableName}" domainObjectName="${table.modelName}"></table>
    </#list>
    </context>
</generatorConfiguration>