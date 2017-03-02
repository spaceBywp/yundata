package com.yundata.web;

import com.yundata.mq.Sender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class RabbitmqController {

    @Autowired
    private Sender sender;

    @RequestMapping("/send")
    public String send(HttpServletRequest request, String msg) {
        sender.send(msg);
        return "Send OK.";
    }
}