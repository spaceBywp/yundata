package com.yundata.metadata.model.po;

import java.io.Serializable;

public class CorpDljgPO implements Serializable {
    private String id;

    private String corpName;

    private String address;

    private String telephone;

    private String otherName;

    private String qq;

    private String shengfen;

    private String city;

    private String simpleName;

    private String shengfenCn;

    private String cityCn;

    private String pc;

    private Short graspedCount;

    private String shengfenCode;

    private String cityCode;

    private Double synDlr;

    private String contactPhone;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getCorpName() {
        return corpName;
    }

    public void setCorpName(String corpName) {
        this.corpName = corpName == null ? null : corpName.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getOtherName() {
        return otherName;
    }

    public void setOtherName(String otherName) {
        this.otherName = otherName == null ? null : otherName.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public String getShengfen() {
        return shengfen;
    }

    public void setShengfen(String shengfen) {
        this.shengfen = shengfen == null ? null : shengfen.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getSimpleName() {
        return simpleName;
    }

    public void setSimpleName(String simpleName) {
        this.simpleName = simpleName == null ? null : simpleName.trim();
    }

    public String getShengfenCn() {
        return shengfenCn;
    }

    public void setShengfenCn(String shengfenCn) {
        this.shengfenCn = shengfenCn == null ? null : shengfenCn.trim();
    }

    public String getCityCn() {
        return cityCn;
    }

    public void setCityCn(String cityCn) {
        this.cityCn = cityCn == null ? null : cityCn.trim();
    }

    public String getPc() {
        return pc;
    }

    public void setPc(String pc) {
        this.pc = pc == null ? null : pc.trim();
    }

    public Short getGraspedCount() {
        return graspedCount;
    }

    public void setGraspedCount(Short graspedCount) {
        this.graspedCount = graspedCount;
    }

    public String getShengfenCode() {
        return shengfenCode;
    }

    public void setShengfenCode(String shengfenCode) {
        this.shengfenCode = shengfenCode == null ? null : shengfenCode.trim();
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode == null ? null : cityCode.trim();
    }

    public Double getSynDlr() {
        return synDlr;
    }

    public void setSynDlr(Double synDlr) {
        this.synDlr = synDlr;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone == null ? null : contactPhone.trim();
    }
}