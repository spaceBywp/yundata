package com.yundata.config;


import org.apache.commons.pool2.impl.GenericKeyedObjectPoolConfig;
import org.cleverframe.fastdfs.client.DefaultStorageClient;
import org.cleverframe.fastdfs.client.DefaultTrackerClient;
import org.cleverframe.fastdfs.client.StorageClient;
import org.cleverframe.fastdfs.client.TrackerClient;
import org.cleverframe.fastdfs.conn.DefaultCommandExecutor;
import org.cleverframe.fastdfs.pool.ConnectionPool;
import org.cleverframe.fastdfs.pool.PooledConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by 2 on 2017/2/27.
 */
@Component
public class fastDfsConfig {

    private static ConnectionPool connectionPool;

    @Bean
    public StorageClient storageClient() {
        PooledConnectionFactory pooledConnectionFactory = new PooledConnectionFactory(500, 500);
        GenericKeyedObjectPoolConfig conf = new GenericKeyedObjectPoolConfig();
        conf.setMaxTotal(200);
        conf.setMaxTotalPerKey(200);
        conf.setMaxIdlePerKey(100);
        connectionPool = new ConnectionPool(pooledConnectionFactory, conf);
        Set<String> trackerSet = new HashSet<String>();
        trackerSet.add("192.168.51.118:22122");
        DefaultCommandExecutor commandExecutor = new DefaultCommandExecutor(trackerSet, connectionPool);
        TrackerClient trackerClient = new DefaultTrackerClient(commandExecutor);
        return new DefaultStorageClient(commandExecutor, trackerClient);
    }

    @Bean
    public TrackerClient trackerClient() {
        PooledConnectionFactory pooledConnectionFactory = new PooledConnectionFactory(500, 500);
        GenericKeyedObjectPoolConfig conf = new GenericKeyedObjectPoolConfig();
        conf.setMaxTotal(200);
        conf.setMaxTotalPerKey(200);
        conf.setMaxIdlePerKey(100);
        connectionPool = new ConnectionPool(pooledConnectionFactory, conf);
        Set<String> trackerSet = new HashSet<String>();
        trackerSet.add("192.168.51.118:22122");
        DefaultCommandExecutor commandExecutor = new DefaultCommandExecutor(trackerSet, connectionPool);
        return new DefaultTrackerClient(commandExecutor);
    }


}
