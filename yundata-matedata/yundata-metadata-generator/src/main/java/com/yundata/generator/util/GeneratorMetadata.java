package com.yundata.generator.util;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class GeneratorMetadata {
    public static void generate(String generatorConfigPath) {
        try {
            List<String> warnings = new ArrayList<String>();
            boolean overwrite = true;
            File configFile = new File(generatorConfigPath);
            ConfigurationParser cp = new ConfigurationParser(warnings);
            Configuration config = cp.parseConfiguration(configFile);
            DefaultShellCallback callback = new DefaultShellCallback(overwrite);
            MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
            myBatisGenerator.generate(null);
            configFile.deleteOnExit();
            System.out.println(">>>>>>>>>所有文件重新生成完毕");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void remove() {
        FilesPath filesPath = new FilesPath();
        File mapperPath = new File(filesPath.getMapperPath());
        if (mapperPath.isDirectory()) {
            File[] mapperFiles = mapperPath.listFiles();
            for (File file : mapperFiles) {
                if (!file.getName().equals(".gitkeep")) {
                    file.delete();
                }
            }
            System.out.println(">>>>>>>>>mapper接口已清空    (" + mapperPath + ")");
        } else {
            System.out.println("<<<<<<<<<mapper接口路径不存在  (" + mapperPath + ")");
        }
        File xmlPath = new File(filesPath.getXmlPath());
        if (xmlPath.isDirectory()) {
            File[] daoImplFiles = xmlPath.listFiles();
            for (File file : daoImplFiles) {
                if (!file.getName().equals(".gitkeep"))
                    file.delete();
            }
            System.out.println(">>>>>>>>>xml已清空 (" + xmlPath + ")");
        } else {
            System.out.println("<<<<<<<<<xml路径不存在   (" + xmlPath + ")");
        }
        File modelPoPath = new File(filesPath.getModelPoPath());
        if (modelPoPath.isDirectory()) {
            File[] modelPoFiles = modelPoPath.listFiles();
            for (File file : modelPoFiles) {
                if (!file.getName().equals(".gitkeep"))
                    file.delete();
            }
            System.out.println(">>>>>>>>>model已清空   (" + modelPoPath + ")");
        } else {
            System.out.println("<<<<<<<<<model路径不存在 (" + modelPoPath + ")");
        }
    }
}
