package com.yundata.metadata.model.po;

import java.io.Serializable;

public class TBrandReportPO implements Serializable {
    private Long userId;

    private String brandName;

    private String brandReg;

    private String brandCategory;

    private String brandApply;

    private static final long serialVersionUID = 1L;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName == null ? null : brandName.trim();
    }

    public String getBrandReg() {
        return brandReg;
    }

    public void setBrandReg(String brandReg) {
        this.brandReg = brandReg == null ? null : brandReg.trim();
    }

    public String getBrandCategory() {
        return brandCategory;
    }

    public void setBrandCategory(String brandCategory) {
        this.brandCategory = brandCategory == null ? null : brandCategory.trim();
    }

    public String getBrandApply() {
        return brandApply;
    }

    public void setBrandApply(String brandApply) {
        this.brandApply = brandApply == null ? null : brandApply.trim();
    }
}