package com.yundata.generator.util;

import java.io.File;
import java.util.Map;

/**
 * Created by john on 2015/11/23.
 */
public class FilesPath {
    private String projectPath;//项目路径
    private String generatorClassPath;//generator模块target目录路径
    private String mapperModulePath;//mapper模块路径
    private String modelModulePath;//model模块路径
    private String generatorModulePath;//generator模块路径
    private String xmlPath;//xml文件存放路径
    private String mapperPath;//mapper文件存放路径
    private String modelPoPath;//model存放路径
    private String generatorModuleResourcesPath;//generator模块Resources目录路径

    {
        init();
    }

    private void init() {
        Map<String, String> cfgMap = PropertiesUtil.readProperties("cfg.properties");
        if (generatorClassPath == null || "".equals(generatorClassPath.trim())) {
            generatorClassPath = getClass().getResource("/").getFile().toString();
            generatorClassPath = generatorClassPath.substring(1, generatorClassPath.lastIndexOf('/'));
            generatorClassPath = generatorClassPath.substring(0, generatorClassPath.lastIndexOf('/')).replace('/', File.separatorChar);
        }
        if (generatorModulePath == null || "".equals(generatorModulePath.trim())) {
            generatorModulePath = generatorClassPath.substring(0, generatorClassPath.lastIndexOf('\\'));
        }
        if (projectPath == null || "".equals(projectPath.trim())) {
            projectPath = generatorModulePath.substring(0, generatorModulePath.lastIndexOf('\\'));
        }


        if (mapperModulePath == null || "".equals(mapperModulePath.trim())) {
            mapperModulePath = projectPath + File.separator + cfgMap.get("mapperModuleName");
        }
        if (modelModulePath == null || "".equals(modelModulePath.trim())) {
            modelModulePath = projectPath + File.separator + cfgMap.get("modelModuleName");
        }
        if (xmlPath == null || "".equals(xmlPath.trim())) {
            xmlPath = mapperModulePath + File.separator + "src" + File.separator + "main" + File.separator
                    + "java" + File.separator + cfgMap.get("xmlPath").replace('.', File.separatorChar);
        }
        if (mapperPath == null || "".equals(mapperPath.trim())) {
            mapperPath = mapperModulePath + File.separator + "src" + File.separator + "main" + File.separator
                    + "java" + File.separator + cfgMap.get("mapperPath").replace('.', File.separatorChar);
        }
        if (modelPoPath == null || "".equals(modelPoPath.trim())) {
            modelPoPath = modelModulePath + File.separator + "src" + File.separator + "main" + File.separator
                    + "java" + File.separator + cfgMap.get("modelPoPath").replace('.', File.separatorChar);
        }
        if (generatorModuleResourcesPath == null || "".equals(generatorModuleResourcesPath.trim())) {
            generatorModuleResourcesPath = generatorModulePath + File.separator + "src" + File.separator + "main" + File.separator
                    + "resources";
        }
    }

    public String getProjectPath() {
        return projectPath;
    }

    public String getGeneratorClassPath() {
        return generatorClassPath;
    }

    public String getMapperModulePath() {
        return mapperModulePath;
    }

    public String getModelModulePath() {
        return modelModulePath;
    }

    public String getGeneratorModulePath() {
        return generatorModulePath;
    }

    public String getXmlPath() {
        return xmlPath;
    }

    public String getMapperPath() {
        return mapperPath;
    }

    public String getModelPoPath() {
        return modelPoPath;
    }

    public String getGeneratorModuleResourcesPath() {
        return generatorModuleResourcesPath;
    }

    @Override
    public String toString() {
        return "FilesPath{" +
                "projectPath='" + projectPath + '\'' +
                ", generatorClassPath='" + generatorClassPath + '\'' +
                ", mapperModulePath='" + mapperModulePath + '\'' +
                ", modelModulePath='" + modelModulePath + '\'' +
                ", generatorModulePath='" + generatorModulePath + '\'' +
                ", xmlPath='" + xmlPath + '\'' +
                ", mapperPath='" + mapperPath + '\'' +
                ", modelPoPath='" + modelPoPath + '\'' +
                ", generatorModuleResourcesPath='" + generatorModuleResourcesPath + '\'' +
                '}';
    }

    public static void main(String[] args) {
        FilesPath filesPath = new FilesPath();
        System.out.println(filesPath.toString());
    }
}
