package com.yundata.metadata.model.po;

import java.io.Serializable;
import java.util.Date;

public class BrandManagePO extends BrandManagePOKey implements Serializable {
    private String id;

    private String brandName;

    private String registrantNameIdCard;

    private String registrantName;

    private Date registrantTime;

    private String dljgName;

    private Integer inNotice;

    private Integer inSimilar;

    private Integer inStatus;

    private String childUserInfoId;

    private Integer brandStatus;

    private Date addTime;

    private String addUserId;

    private Date updateTime;

    private String updateUserId;

    private Integer isDel;

    private String applyId;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName == null ? null : brandName.trim();
    }

    public String getRegistrantNameIdCard() {
        return registrantNameIdCard;
    }

    public void setRegistrantNameIdCard(String registrantNameIdCard) {
        this.registrantNameIdCard = registrantNameIdCard == null ? null : registrantNameIdCard.trim();
    }

    public String getRegistrantName() {
        return registrantName;
    }

    public void setRegistrantName(String registrantName) {
        this.registrantName = registrantName == null ? null : registrantName.trim();
    }

    public Date getRegistrantTime() {
        return registrantTime;
    }

    public void setRegistrantTime(Date registrantTime) {
        this.registrantTime = registrantTime;
    }

    public String getDljgName() {
        return dljgName;
    }

    public void setDljgName(String dljgName) {
        this.dljgName = dljgName == null ? null : dljgName.trim();
    }

    public Integer getInNotice() {
        return inNotice;
    }

    public void setInNotice(Integer inNotice) {
        this.inNotice = inNotice;
    }

    public Integer getInSimilar() {
        return inSimilar;
    }

    public void setInSimilar(Integer inSimilar) {
        this.inSimilar = inSimilar;
    }

    public Integer getInStatus() {
        return inStatus;
    }

    public void setInStatus(Integer inStatus) {
        this.inStatus = inStatus;
    }

    public String getChildUserInfoId() {
        return childUserInfoId;
    }

    public void setChildUserInfoId(String childUserInfoId) {
        this.childUserInfoId = childUserInfoId == null ? null : childUserInfoId.trim();
    }

    public Integer getBrandStatus() {
        return brandStatus;
    }

    public void setBrandStatus(Integer brandStatus) {
        this.brandStatus = brandStatus;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public String getAddUserId() {
        return addUserId;
    }

    public void setAddUserId(String addUserId) {
        this.addUserId = addUserId == null ? null : addUserId.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(String updateUserId) {
        this.updateUserId = updateUserId == null ? null : updateUserId.trim();
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public String getApplyId() {
        return applyId;
    }

    public void setApplyId(String applyId) {
        this.applyId = applyId == null ? null : applyId.trim();
    }
}