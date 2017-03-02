package com.yundata.generator.util;

import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

/**
 * Created by john on 2016/4/8.
 */
public class PropertiesUtil {
    public static Map<String, String> readProperties(String fileName) {
        Map<String, String> map = new HashMap<String, String>();
        ClassPathResource cp = new ClassPathResource(fileName);
        Properties properties = new Properties();
        try {
            properties.load(cp.getInputStream());
        } catch (IOException e) {
            System.err.println("can not load " + fileName);
        }
        for (Iterator its = properties.keySet().iterator(); its.hasNext(); ) {
            String zkey = (String) its.next();
            map.put(zkey, properties.getProperty(zkey).trim());
        }
        return map;
    }


}
