package com.yundata.metadata.model.po;

import java.io.Serializable;

public class ApplyUserPersonalIdCardPO implements Serializable {
    private String id;

    private String sqrmcZw;

    private String idCardNo;

    private String qq;

    private Integer addType;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getSqrmcZw() {
        return sqrmcZw;
    }

    public void setSqrmcZw(String sqrmcZw) {
        this.sqrmcZw = sqrmcZw == null ? null : sqrmcZw.trim();
    }

    public String getIdCardNo() {
        return idCardNo;
    }

    public void setIdCardNo(String idCardNo) {
        this.idCardNo = idCardNo == null ? null : idCardNo.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public Integer getAddType() {
        return addType;
    }

    public void setAddType(Integer addType) {
        this.addType = addType;
    }
}