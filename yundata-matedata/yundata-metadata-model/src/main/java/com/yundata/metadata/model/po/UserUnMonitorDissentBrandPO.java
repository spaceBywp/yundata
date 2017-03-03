package com.yundata.metadata.model.po;

import java.io.Serializable;
import java.util.Date;

public class UserUnMonitorDissentBrandPO implements Serializable {
    private String brandId;

    private String userInfoId;

    private Date createDate;

    private String zch;

    private Double gjfl;

    private Double brandInfoId;

    private static final long serialVersionUID = 1L;

    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId == null ? null : brandId.trim();
    }

    public String getUserInfoId() {
        return userInfoId;
    }

    public void setUserInfoId(String userInfoId) {
        this.userInfoId = userInfoId == null ? null : userInfoId.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getZch() {
        return zch;
    }

    public void setZch(String zch) {
        this.zch = zch == null ? null : zch.trim();
    }

    public Double getGjfl() {
        return gjfl;
    }

    public void setGjfl(Double gjfl) {
        this.gjfl = gjfl;
    }

    public Double getBrandInfoId() {
        return brandInfoId;
    }

    public void setBrandInfoId(Double brandInfoId) {
        this.brandInfoId = brandInfoId;
    }
}