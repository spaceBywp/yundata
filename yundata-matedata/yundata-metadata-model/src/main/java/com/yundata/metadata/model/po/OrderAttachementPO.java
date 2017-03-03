package com.yundata.metadata.model.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class OrderAttachementPO implements Serializable {
    private String id;

    private String orderId;

    private String fileName;

    private String path;

    private Date createTime;

    private Date updateTime;

    private Integer subType;

    private String phone;

    private String memo;

    private String userInfoId;

    private String remitBankNum;

    private String remitName;

    private BigDecimal remitPrice;

    private String amountInWords;

    private Date remitDate;

    private String operatingPersonnelId;

    private Integer auditingStatus;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getSubType() {
        return subType;
    }

    public void setSubType(Integer subType) {
        this.subType = subType;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public String getUserInfoId() {
        return userInfoId;
    }

    public void setUserInfoId(String userInfoId) {
        this.userInfoId = userInfoId == null ? null : userInfoId.trim();
    }

    public String getRemitBankNum() {
        return remitBankNum;
    }

    public void setRemitBankNum(String remitBankNum) {
        this.remitBankNum = remitBankNum == null ? null : remitBankNum.trim();
    }

    public String getRemitName() {
        return remitName;
    }

    public void setRemitName(String remitName) {
        this.remitName = remitName == null ? null : remitName.trim();
    }

    public BigDecimal getRemitPrice() {
        return remitPrice;
    }

    public void setRemitPrice(BigDecimal remitPrice) {
        this.remitPrice = remitPrice;
    }

    public String getAmountInWords() {
        return amountInWords;
    }

    public void setAmountInWords(String amountInWords) {
        this.amountInWords = amountInWords == null ? null : amountInWords.trim();
    }

    public Date getRemitDate() {
        return remitDate;
    }

    public void setRemitDate(Date remitDate) {
        this.remitDate = remitDate;
    }

    public String getOperatingPersonnelId() {
        return operatingPersonnelId;
    }

    public void setOperatingPersonnelId(String operatingPersonnelId) {
        this.operatingPersonnelId = operatingPersonnelId == null ? null : operatingPersonnelId.trim();
    }

    public Integer getAuditingStatus() {
        return auditingStatus;
    }

    public void setAuditingStatus(Integer auditingStatus) {
        this.auditingStatus = auditingStatus;
    }
}