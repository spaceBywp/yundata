package com.yundata.web;

import com.yundata.service.ComputeClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    ComputeClient computeClient;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Integer add() {
        return computeClient.add(10, 20);
    }

    @RequestMapping(value = "/from")
    public String from() {
        return computeClient.from();
    }

    @RequestMapping(value = "/app")
    public String app(@RequestParam Integer a, @RequestParam Integer b) {
        return computeClient.app(a, b);
    }
}