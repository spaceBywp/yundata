package com.yundata.web;

import com.yundata.demo.DemoCollection;
import com.yundata.demo.model.test;
import com.yundata.metadata.dao.mapper.UserInfoPOMapper;
import com.yundata.metadata.model.po.UserInfoPO;
import com.yundata.metadata.model.po.UserInfoPOExample;
import com.yundata.mongo.DemoCollectionRepository;
import com.yundata.tasks.DynamicScheduledTask;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by liangchong998 on 2016/8/18.
 */
@Controller
public class HomeController {

    private Logger logger = Logger.getLogger(HomeController.class);

    @Autowired
    UserInfoPOMapper userInfoPOMapper;

    @Autowired
    RedisService redisService;

    @Autowired
    DynamicScheduledTask dynamicScheduledTask;

    @Autowired
    DemoCollectionRepository demoCollectionRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @Cacheable(value = "reportcache", keyGenerator = "wiselyKeyGenerator")
    public Model index(Model Model) {
        UserInfoPOExample applyUserExample = new UserInfoPOExample();
        UserInfoPOExample.Criteria criteria = applyUserExample.createCriteria();
        int num = userInfoPOMapper.countByExample(applyUserExample);


        UserInfoPO userInfoPO = userInfoPOMapper.selectByPrimaryKey("test001");
        Model.addAttribute("name", "liangchong998");
        Model.addAttribute("name2", num);

        boolean f = redisService.set("mytestUserIngo", userInfoPO, 60L);

        logger.info("f=========" + f);


        return Model;
    }

    // 更新动态任务时间
    @RequestMapping("/updateDynamicScheduledTask")
    @ResponseBody
    public String updateDynamicScheduledTask() {
        dynamicScheduledTask.setCron("0/10 * * * * ?");
        UserInfoPO userInfoPO = (UserInfoPO) redisService.get("mytestUserIngo");
        logger.info("userInfoPO  = = = = = = = = = " + userInfoPO.getUserInfoId());
        return "ok";
    }

    // 更新动态任务时间2
    @RequestMapping("/updateDynamicScheduledTask2")
    @ResponseBody
    public String updateDynamicScheduledTask2() {
        dynamicScheduledTask.setCron2("0/10 * * * * ?");
        return "ok";
    }

    @RequestMapping("/mongott")
    public String mongottt() {
        List<test> list = new ArrayList<test>();
        test tr = new test();
        test tr2 = new test();

        tr.setBbb(111);
        tr.setAaa(222);

        tr2.setAaa(333);
        tr2.setBbb(444);

        list.add(tr);

        list.add(tr);
        list.add(tr2);
        DemoCollection demoCollection = new DemoCollection();

        demoCollection.setTt(tr);

        demoCollection.setId("123123123123123");
        demoCollection.setName("alibaba");
        demoCollection.setTtt(list);

        demoCollectionRepository.save(demoCollection);

        demoCollectionRepository.findAll();


        System.out.println(demoCollectionRepository.findAll());
        return "index";
    }
}