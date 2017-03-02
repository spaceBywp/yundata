package com.yundata.metadata.model.po;

import java.io.Serializable;
import java.util.Date;

public class UserJsBrandMessagePO implements Serializable {
    private String jsMsgId;

    private String userInfoId;

    private String regNum;

    private String intcls;

    private Date addTime;

    private String addUserId;

    private Date updateTime;

    private String updateUserId;

    private Integer isDel;

    private String monitStatus;

    private String context;

    private static final long serialVersionUID = 1L;

    public String getJsMsgId() {
        return jsMsgId;
    }

    public void setJsMsgId(String jsMsgId) {
        this.jsMsgId = jsMsgId == null ? null : jsMsgId.trim();
    }

    public String getUserInfoId() {
        return userInfoId;
    }

    public void setUserInfoId(String userInfoId) {
        this.userInfoId = userInfoId == null ? null : userInfoId.trim();
    }

    public String getRegNum() {
        return regNum;
    }

    public void setRegNum(String regNum) {
        this.regNum = regNum == null ? null : regNum.trim();
    }

    public String getIntcls() {
        return intcls;
    }

    public void setIntcls(String intcls) {
        this.intcls = intcls == null ? null : intcls.trim();
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

    public String getMonitStatus() {
        return monitStatus;
    }

    public void setMonitStatus(String monitStatus) {
        this.monitStatus = monitStatus == null ? null : monitStatus.trim();
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context == null ? null : context.trim();
    }
}