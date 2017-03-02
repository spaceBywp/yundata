package com.yundata.metadata.model.po;

import java.io.Serializable;
import java.util.Date;

public class UserAddMonitorApplyUserPO implements Serializable {
    private String id;

    private String adminUserInfoId;

    private String applyUserId;

    private Date addDate;

    private Integer isValid;

    private Integer category;

    private Integer inSimilar;

    private Integer inNotice;

    private String subUserInfoId;

    private String sqrmcZw;

    private String idCardNo;

    private String code;

    private String applyType;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getAdminUserInfoId() {
        return adminUserInfoId;
    }

    public void setAdminUserInfoId(String adminUserInfoId) {
        this.adminUserInfoId = adminUserInfoId == null ? null : adminUserInfoId.trim();
    }

    public String getApplyUserId() {
        return applyUserId;
    }

    public void setApplyUserId(String applyUserId) {
        this.applyUserId = applyUserId == null ? null : applyUserId.trim();
    }

    public Date getAddDate() {
        return addDate;
    }

    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }

    public Integer getIsValid() {
        return isValid;
    }

    public void setIsValid(Integer isValid) {
        this.isValid = isValid;
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public Integer getInSimilar() {
        return inSimilar;
    }

    public void setInSimilar(Integer inSimilar) {
        this.inSimilar = inSimilar;
    }

    public Integer getInNotice() {
        return inNotice;
    }

    public void setInNotice(Integer inNotice) {
        this.inNotice = inNotice;
    }

    public String getSubUserInfoId() {
        return subUserInfoId;
    }

    public void setSubUserInfoId(String subUserInfoId) {
        this.subUserInfoId = subUserInfoId == null ? null : subUserInfoId.trim();
    }

    public String getSqrmcZw() {
        return sqrmcZw;
    }

    public void setSqrmcZw(String sqrmcZw) {
        this.sqrmcZw = sqrmcZw == null ? null : sqrmcZw.trim();
    }

    public String getIdCardNo() {
        return idCardNo;
    }

    public void setIdCardNo(String idCardNo) {
        this.idCardNo = idCardNo == null ? null : idCardNo.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getApplyType() {
        return applyType;
    }

    public void setApplyType(String applyType) {
        this.applyType = applyType == null ? null : applyType.trim();
    }
}