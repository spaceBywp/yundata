package com.yundata.Htstrixs;

import com.yundata.service.ComputeClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class ComputeClientHystrix implements ComputeClient {
    @Override
    public Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b) {
        return -9999;
    }

    @Override
    public String from() {
        return "from请求进入断路器";
    }

    @Override
    public String app(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b) {
        return "app进入断路器";
    }

}