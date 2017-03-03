package com.yundata.metadata.model.po;

import java.io.Serializable;
import java.util.Date;

public class TDictDetailPO implements Serializable {
    private String dictDetailId;

    private String classId;

    private String detailCode;

    private String classCode;

    private String name;

    private String args1;

    private String args2;

    private Date addTime;

    private String addUserId;

    private Date updateTime;

    private String updateUserId;

    private Integer isDel;

    private Integer orderby;

    private static final long serialVersionUID = 1L;

    public String getDictDetailId() {
        return dictDetailId;
    }

    public void setDictDetailId(String dictDetailId) {
        this.dictDetailId = dictDetailId == null ? null : dictDetailId.trim();
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId == null ? null : classId.trim();
    }

    public String getDetailCode() {
        return detailCode;
    }

    public void setDetailCode(String detailCode) {
        this.detailCode = detailCode == null ? null : detailCode.trim();
    }

    public String getClassCode() {
        return classCode;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode == null ? null : classCode.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getArgs1() {
        return args1;
    }

    public void setArgs1(String args1) {
        this.args1 = args1 == null ? null : args1.trim();
    }

    public String getArgs2() {
        return args2;
    }

    public void setArgs2(String args2) {
        this.args2 = args2 == null ? null : args2.trim();
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

    public Integer getOrderby() {
        return orderby;
    }

    public void setOrderby(Integer orderby) {
        this.orderby = orderby;
    }
}