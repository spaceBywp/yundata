package com.yundata.metadata.model.po;

import java.io.Serializable;

public class BBakPO implements Serializable {
    private String nameb;

    private static final long serialVersionUID = 1L;

    public String getNameb() {
        return nameb;
    }

    public void setNameb(String nameb) {
        this.nameb = nameb == null ? null : nameb.trim();
    }
}