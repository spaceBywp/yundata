package com.yundata.metadata.model.po;

import java.io.Serializable;
import java.util.Date;

public class MobileVerifiedCodePO implements Serializable {
    private String id;

    private String mobile;

    private String code;

    private Integer codeType;

    private Integer sendCount;

    private String email;

    private Integer status;

    private Date createDate;

    private Date updateDate;

    private String addUserInfoId;

    private String updateUserInfoId;

    private Date termOfValidity;

    private Date proofTime;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public Integer getCodeType() {
        return codeType;
    }

    public void setCodeType(Integer codeType) {
        this.codeType = codeType;
    }

    public Integer getSendCount() {
        return sendCount;
    }

    public void setSendCount(Integer sendCount) {
        this.sendCount = sendCount;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getAddUserInfoId() {
        return addUserInfoId;
    }

    public void setAddUserInfoId(String addUserInfoId) {
        this.addUserInfoId = addUserInfoId == null ? null : addUserInfoId.trim();
    }

    public String getUpdateUserInfoId() {
        return updateUserInfoId;
    }

    public void setUpdateUserInfoId(String updateUserInfoId) {
        this.updateUserInfoId = updateUserInfoId == null ? null : updateUserInfoId.trim();
    }

    public Date getTermOfValidity() {
        return termOfValidity;
    }

    public void setTermOfValidity(Date termOfValidity) {
        this.termOfValidity = termOfValidity;
    }

    public Date getProofTime() {
        return proofTime;
    }

    public void setProofTime(Date proofTime) {
        this.proofTime = proofTime;
    }
}