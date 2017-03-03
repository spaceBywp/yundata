package com.yundata;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
@ServletComponentScan
public class FilesApplication {

    public static void main(String[] args) {

        new SpringApplicationBuilder(FilesApplication.class).web(true).run(args);
    }

}