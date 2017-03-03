package com.yundata.metadata.model.po;

import java.io.Serializable;

public class ABakPO implements Serializable {
    private String namea;

    private static final long serialVersionUID = 1L;

    public String getNamea() {
        return namea;
    }

    public void setNamea(String namea) {
        this.namea = namea == null ? null : namea.trim();
    }
}