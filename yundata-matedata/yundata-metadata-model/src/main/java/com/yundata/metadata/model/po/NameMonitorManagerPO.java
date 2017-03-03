package com.yundata.metadata.model.po;

import java.io.Serializable;
import java.util.Date;

public class NameMonitorManagerPO implements Serializable {
    private String nameId;

    private String monitorName;

    private String monitorType;

    private String monitorNature;

    private String monitorConditions;

    private String monitorCategory;

    private String adminUserInfoId;

    private String childUserInfoId;

    private Integer isAttention;

    private String monitStatus;

    private Date addTime;

    private String addUserId;

    private Date updateTime;

    private String updateUserId;

    private Integer isDel;

    private String subUserId;

    private String linkMan;

    private String memo;

    private String context;

    private static final long serialVersionUID = 1L;

    public String getNameId() {
        return nameId;
    }

    public void setNameId(String nameId) {
        this.nameId = nameId == null ? null : nameId.trim();
    }

    public String getMonitorName() {
        return monitorName;
    }

    public void setMonitorName(String monitorName) {
        this.monitorName = monitorName == null ? null : monitorName.trim();
    }

    public String getMonitorType() {
        return monitorType;
    }

    public void setMonitorType(String monitorType) {
        this.monitorType = monitorType == null ? null : monitorType.trim();
    }

    public String getMonitorNature() {
        return monitorNature;
    }

    public void setMonitorNature(String monitorNature) {
        this.monitorNature = monitorNature == null ? null : monitorNature.trim();
    }

    public String getMonitorConditions() {
        return monitorConditions;
    }

    public void setMonitorConditions(String monitorConditions) {
        this.monitorConditions = monitorConditions == null ? null : monitorConditions.trim();
    }

    public String getMonitorCategory() {
        return monitorCategory;
    }

    public void setMonitorCategory(String monitorCategory) {
        this.monitorCategory = monitorCategory == null ? null : monitorCategory.trim();
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

    public Integer getIsAttention() {
        return isAttention;
    }

    public void setIsAttention(Integer isAttention) {
        this.isAttention = isAttention;
    }

    public String getMonitStatus() {
        return monitStatus;
    }

    public void setMonitStatus(String monitStatus) {
        this.monitStatus = monitStatus == null ? null : monitStatus.trim();
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

    public String getSubUserId() {
        return subUserId;
    }

    public void setSubUserId(String subUserId) {
        this.subUserId = subUserId == null ? null : subUserId.trim();
    }

    public String getLinkMan() {
        return linkMan;
    }

    public void setLinkMan(String linkMan) {
        this.linkMan = linkMan == null ? null : linkMan.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context == null ? null : context.trim();
    }
}