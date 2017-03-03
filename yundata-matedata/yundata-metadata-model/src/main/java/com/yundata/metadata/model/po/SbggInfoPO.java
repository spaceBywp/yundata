package com.yundata.metadata.model.po;

import java.io.Serializable;
import java.util.Date;

public class SbggInfoPO implements Serializable {
    private String id;

    private String brandName;

    private String brandType;

    private String brandGroup;

    private Date applyDate;

    private String registNum;

    private String registrantNameIdCard;

    private String registrantName;

    private String adminUserInfoId;

    private String childUserInfoId;

    private Integer brandStatus;

    private String applyId;

    private Integer isMonitor;

    private Integer isAttention;

    private String remind;

    private Date addTime;

    private String addUserId;

    private Date updateTime;

    private String updateUserId;

    private Integer isDel;

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

    public String getBrandType() {
        return brandType;
    }

    public void setBrandType(String brandType) {
        this.brandType = brandType == null ? null : brandType.trim();
    }

    public String getBrandGroup() {
        return brandGroup;
    }

    public void setBrandGroup(String brandGroup) {
        this.brandGroup = brandGroup == null ? null : brandGroup.trim();
    }

    public Date getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(Date applyDate) {
        this.applyDate = applyDate;
    }

    public String getRegistNum() {
        return registNum;
    }

    public void setRegistNum(String registNum) {
        this.registNum = registNum == null ? null : registNum.trim();
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

    public String getAdminUserInfoId() {
        return adminUserInfoId;
    }

    public void setAdminUserInfoId(String adminUserInfoId) {
        this.adminUserInfoId = adminUserInfoId == null ? null : adminUserInfoId.trim();
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

    public String getApplyId() {
        return applyId;
    }

    public void setApplyId(String applyId) {
        this.applyId = applyId == null ? null : applyId.trim();
    }

    public Integer getIsMonitor() {
        return isMonitor;
    }

    public void setIsMonitor(Integer isMonitor) {
        this.isMonitor = isMonitor;
    }

    public Integer getIsAttention() {
        return isAttention;
    }

    public void setIsAttention(Integer isAttention) {
        this.isAttention = isAttention;
    }

    public String getRemind() {
        return remind;
    }

    public void setRemind(String remind) {
        this.remind = remind == null ? null : remind.trim();
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
}