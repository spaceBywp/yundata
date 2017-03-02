package com.yundata.metadata.model.po;

import java.io.Serializable;
import java.util.Date;

public class AddressManagerPO implements Serializable {
    private String id;

    private String addresseeName;

    private String telephone;

    private String localProvince;

    private String localCity;

    private String localTown;

    private String streetAddress;

    private String zipCode;

    private String operatingPersonnelId;

    private String userInfoId;

    private Date createTime;

    private Date updateTime;

    private Integer isDefault;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getAddresseeName() {
        return addresseeName;
    }

    public void setAddresseeName(String addresseeName) {
        this.addresseeName = addresseeName == null ? null : addresseeName.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getLocalProvince() {
        return localProvince;
    }

    public void setLocalProvince(String localProvince) {
        this.localProvince = localProvince == null ? null : localProvince.trim();
    }

    public String getLocalCity() {
        return localCity;
    }

    public void setLocalCity(String localCity) {
        this.localCity = localCity == null ? null : localCity.trim();
    }

    public String getLocalTown() {
        return localTown;
    }

    public void setLocalTown(String localTown) {
        this.localTown = localTown == null ? null : localTown.trim();
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress == null ? null : streetAddress.trim();
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode == null ? null : zipCode.trim();
    }

    public String getOperatingPersonnelId() {
        return operatingPersonnelId;
    }

    public void setOperatingPersonnelId(String operatingPersonnelId) {
        this.operatingPersonnelId = operatingPersonnelId == null ? null : operatingPersonnelId.trim();
    }

    public String getUserInfoId() {
        return userInfoId;
    }

    public void setUserInfoId(String userInfoId) {
        this.userInfoId = userInfoId == null ? null : userInfoId.trim();
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

    public Integer getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Integer isDefault) {
        this.isDefault = isDefault;
    }
}