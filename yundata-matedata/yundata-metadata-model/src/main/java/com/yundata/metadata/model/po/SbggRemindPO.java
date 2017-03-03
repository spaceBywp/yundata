package com.yundata.metadata.model.po;

import java.io.Serializable;

public class SbggRemindPO implements Serializable {
    private String id;

    private String adminUserInfoId;

    private String registNumber;

    private Integer categoryNumber;

    private String remind;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getAdminUserInfoId() {
        return adminUserInfoId;
    }

    public void setAdminUserInfoId(String adminUserInfoId) {
        this.adminUserInfoId = adminUserInfoId == null ? null : adminUserInfoId.trim();
    }

    public String getRegistNumber() {
        return registNumber;
    }

    public void setRegistNumber(String registNumber) {
        this.registNumber = registNumber == null ? null : registNumber.trim();
    }

    public Integer getCategoryNumber() {
        return categoryNumber;
    }

    public void setCategoryNumber(Integer categoryNumber) {
        this.categoryNumber = categoryNumber;
    }

    public String getRemind() {
        return remind;
    }

    public void setRemind(String remind) {
        this.remind = remind == null ? null : remind.trim();
    }
}