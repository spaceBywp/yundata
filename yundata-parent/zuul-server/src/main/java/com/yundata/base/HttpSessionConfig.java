package com.yundata.base;

import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * Created by 2 on 2017/3/1.
 */
@Configuration
@EnableRedisHttpSession
public class HttpSessionConfig {
}
