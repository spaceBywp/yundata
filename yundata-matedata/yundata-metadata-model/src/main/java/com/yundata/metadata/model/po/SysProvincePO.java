package com.yundata.metadata.model.po;

import java.io.Serializable;

public class SysProvincePO implements Serializable {
    private String code;

    private String shengfenCn;

    private String shengfen;

    private static final long serialVersionUID = 1L;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getShengfenCn() {
        return shengfenCn;
    }

    public void setShengfenCn(String shengfenCn) {
        this.shengfenCn = shengfenCn == null ? null : shengfenCn.trim();
    }

    public String getShengfen() {
        return shengfen;
    }

    public void setShengfen(String shengfen) {
        this.shengfen = shengfen == null ? null : shengfen.trim();
    }
}