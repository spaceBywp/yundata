package com.yundata.metadata.model.po;

import java.io.Serializable;

public class SbggSongdaPO implements Serializable {
    private Integer sbggqh;

    private String name;

    private Integer startPage;

    private Integer startY;

    private static final long serialVersionUID = 1L;

    public Integer getSbggqh() {
        return sbggqh;
    }

    public void setSbggqh(Integer sbggqh) {
        this.sbggqh = sbggqh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getStartPage() {
        return startPage;
    }

    public void setStartPage(Integer startPage) {
        this.startPage = startPage;
    }

    public Integer getStartY() {
        return startY;
    }

    public void setStartY(Integer startY) {
        this.startY = startY;
    }
}