package com.yundata.metadata.model.po;

import java.io.Serializable;
import java.util.Date;

public class UserInfoPO implements Serializable {
    private String userInfoId;

    private Integer category;

    private String loginCode;

    private String password;

    private String applyUserPersonalIdcard;

    private String applyUserId;

    private String corpDljgId;

    private String name;

    private String gender;

    private String mobile;

    private String telephone;

    private String qq;

    private Date regDate;

    private Integer status;

    private String activeCode;

    private Integer isCorpAdmin;

    private String otherCorpName;

    private Date lastLoginDate;

    private String parentId;

    private String membershipLevel;

    private String regIp;

    private Integer loginCount;

    private String mmYs;

    private String loginIp;

    private String mobileTrue;

    private Integer mobileHaveVerified;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public String getUserInfoId() {
        return userInfoId;
    }

    public void setUserInfoId(String userInfoId) {
        this.userInfoId = userInfoId == null ? null : userInfoId.trim();
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public String getLoginCode() {
        return loginCode;
    }

    public void setLoginCode(String loginCode) {
        this.loginCode = loginCode == null ? null : loginCode.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getApplyUserPersonalIdcard() {
        return applyUserPersonalIdcard;
    }

    public void setApplyUserPersonalIdcard(String applyUserPersonalIdcard) {
        this.applyUserPersonalIdcard = applyUserPersonalIdcard == null ? null : applyUserPersonalIdcard.trim();
    }

    public String getApplyUserId() {
        return applyUserId;
    }

    public void setApplyUserId(String applyUserId) {
        this.applyUserId = applyUserId == null ? null : applyUserId.trim();
    }

    public String getCorpDljgId() {
        return corpDljgId;
    }

    public void setCorpDljgId(String corpDljgId) {
        this.corpDljgId = corpDljgId == null ? null : corpDljgId.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getActiveCode() {
        return activeCode;
    }

    public void setActiveCode(String activeCode) {
        this.activeCode = activeCode == null ? null : activeCode.trim();
    }

    public Integer getIsCorpAdmin() {
        return isCorpAdmin;
    }

    public void setIsCorpAdmin(Integer isCorpAdmin) {
        this.isCorpAdmin = isCorpAdmin;
    }

    public String getOtherCorpName() {
        return otherCorpName;
    }

    public void setOtherCorpName(String otherCorpName) {
        this.otherCorpName = otherCorpName == null ? null : otherCorpName.trim();
    }

    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    public String getMembershipLevel() {
        return membershipLevel;
    }

    public void setMembershipLevel(String membershipLevel) {
        this.membershipLevel = membershipLevel == null ? null : membershipLevel.trim();
    }

    public String getRegIp() {
        return regIp;
    }

    public void setRegIp(String regIp) {
        this.regIp = regIp == null ? null : regIp.trim();
    }

    public Integer getLoginCount() {
        return loginCount;
    }

    public void setLoginCount(Integer loginCount) {
        this.loginCount = loginCount;
    }

    public String getMmYs() {
        return mmYs;
    }

    public void setMmYs(String mmYs) {
        this.mmYs = mmYs == null ? null : mmYs.trim();
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp == null ? null : loginIp.trim();
    }

    public String getMobileTrue() {
        return mobileTrue;
    }

    public void setMobileTrue(String mobileTrue) {
        this.mobileTrue = mobileTrue == null ? null : mobileTrue.trim();
    }

    public Integer getMobileHaveVerified() {
        return mobileHaveVerified;
    }

    public void setMobileHaveVerified(Integer mobileHaveVerified) {
        this.mobileHaveVerified = mobileHaveVerified;
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
}