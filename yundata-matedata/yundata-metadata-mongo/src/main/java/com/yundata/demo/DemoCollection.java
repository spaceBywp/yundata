package com.yundata.demo;

import com.yundata.demo.model.test;
import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.util.List;

/**
 * Created by 2 on 2017/3/3.
 */
public class DemoCollection implements Serializable {
    @Id
    private String id;
    private String name;
    private String haha;
    private test tt;
    private List<test> ttt;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHaha() {
        return haha;
    }

    public void setHaha(String haha) {
        this.haha = haha;
    }

    public test getTt() {
        return tt;
    }

    public void setTt(test tt) {
        this.tt = tt;
    }

    public List<test> getTtt() {
        return ttt;
    }

    public void setTtt(List<test> ttt) {
        this.ttt = ttt;
    }

    @Override
    public String toString() {
        return "DemoCollection{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", haha='" + haha + '\'' +
                ", tt=" + tt +
                ", ttt=" + ttt +
                '}';
    }
}
