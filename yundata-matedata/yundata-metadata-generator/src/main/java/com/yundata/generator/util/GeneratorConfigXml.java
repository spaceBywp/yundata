package com.yundata.generator.util;


import com.yundata.generator.Model.Table;
import com.yundata.generator.jdbc.WeJdbcTemplate;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratorConfigXml {
    public static String generate() {
        Map<String, String> cfgMap = PropertiesUtil.readProperties("cfg.properties");
        FilesPath filesPath = new FilesPath();
        String poTargetProject = filesPath.getModelModulePath().replace("\\", "/");
        String mapperTargetProject = filesPath.getMapperModulePath().replace("\\", "/");
        List<Table> tableList = new ArrayList<Table>();
        String table_schema = cfgMap.get("jdbc.url").substring(cfgMap.get("jdbc.url").lastIndexOf("/") + 1, cfgMap.get("jdbc.url").length());
        List<Map<String, Object>> tableNameList = WeJdbcTemplate.getAllTableFromDb(table_schema);
        for (Map<String, Object> map : tableNameList) {
            tableList.add(new Table(map.get("table_name").toString()));
        }
        String localDriveDir = filesPath.getGeneratorModuleResourcesPath() + File.separator + "mysql";
        String localDrivePath = localDriveDir + File.separator + new File(localDriveDir).listFiles()[0].getName();
        Map<String, Object> dataMap = new HashMap<String, Object>();
        dataMap.put("location", localDrivePath);
        dataMap.put("driverClass", cfgMap.get("jdbc.driverClassName"));
        dataMap.put("connectionUrl", cfgMap.get("jdbc.url"));
        dataMap.put("userId", cfgMap.get("jdbc.username"));
        dataMap.put("password", cfgMap.get("jdbc.password"));
        dataMap.put("modelTargetPackage", cfgMap.get("modelPoPath"));
        dataMap.put("sqlMapTargetPackage", cfgMap.get("xmlPath"));
        dataMap.put("javaClientTargetPackage", cfgMap.get("mapperPath"));
        dataMap.put("poTargetProject", poTargetProject);
        dataMap.put("mapperTargetProject", mapperTargetProject);

        dataMap.put("tablesList", tableList);

        String generatorConfigPath = "generatorConfig.xml";
//        String generatorConfigPath=new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss").format(new Date()) + File.separator + "generatorConfig.xml";
        String outPath = filesPath.getGeneratorModuleResourcesPath() + File.separator + generatorConfigPath;
        try {
            FreemarkerUtils.generateToFile("", "generatorConfigTemplate.ftl", outPath, dataMap, "UTF-8");
            System.out.println("generatorConfig.xml 文件生成完毕");
            return outPath.replace(File.separatorChar, '/');
        } catch (IOException e) {
            System.out.println("generatorConfig.xml 文件生成失败");
            e.printStackTrace();
            return outPath.replace(File.separatorChar, '/');
        }
    }
}
