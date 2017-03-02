package com.yundata.web;

import org.cleverframe.fastdfs.client.StorageClient;
import org.cleverframe.fastdfs.client.TrackerClient;
import org.cleverframe.fastdfs.model.StorePath;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * Created by 2 on 2017/2/27.
 */
@RestController
public class myCollection {
    @Autowired
    StorageClient storageClient;
    @Autowired
    TrackerClient trackerClient;

    @RequestMapping(value = "/upfiles", method = RequestMethod.POST)
    public String upfiles(@RequestParam("file") MultipartFile file) {
        try {
            StorePath storePath = storageClient.uploadFile("group1", file.getInputStream(), file.getSize(), "zip");
            return storePath.getFullPath();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "";
    }
}
