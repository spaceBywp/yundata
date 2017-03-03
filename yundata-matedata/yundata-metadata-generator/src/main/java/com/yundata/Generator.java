package com.yundata;


import com.yundata.generator.util.GeneratorConfigXml;
import com.yundata.generator.util.GeneratorMetadata;

/**
 * Created by john on 2016/4/8.
 */
public class Generator {
    public static void main(String[] args) {
        String generatorConfigPath = GeneratorConfigXml.generate();
        GeneratorMetadata.remove();
        GeneratorMetadata.generate(generatorConfigPath);
    }
}
