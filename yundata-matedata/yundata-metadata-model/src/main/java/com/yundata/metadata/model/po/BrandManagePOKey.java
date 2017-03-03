package com.yundata.metadata.model.po;

import java.io.Serializable;

public class BrandManagePOKey implements Serializable {
    private String brandType;

    private String registNum;

    private String adminUserInfoId;

    private static final long serialVersionUID = 1L;

    public String getBrandType() {
        return brandType;
    }

    public void setBrandType(String brandType) {
        this.brandType = brandType == null ? null : brandType.trim();
    }

    public String getRegistNum() {
        return registNum;
    }

    public void setRegistNum(String registNum) {
        this.registNum = registNum == null ? null : registNum.trim();
    }

    public String getAdminUserInfoId() {
        return adminUserInfoId;
    }

    public void setAdminUserInfoId(String adminUserInfoId) {
        this.adminUserInfoId = adminUserInfoId == null ? null : adminUserInfoId.trim();
    }
}