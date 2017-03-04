package com.yundata.manager;

import com.yundata.demo.DemoCollection;
import com.yundata.demo.model.test;
import com.yundata.mongo.DemoCollectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 2 on 2017/3/4.
 */
@RestController
public class MyController {
    @Autowired
    DemoCollectionRepository demoCollectionRepository;

    
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
