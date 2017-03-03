package com.yundata.metadata.model.po;

import java.io.Serializable;
import java.util.Date;

public class BrandInfoSbggLcPO implements Serializable {
    private String id;

    private String zch;

    private String gjfl;

    private Integer issue;

    private String sbggCategoryName;

    private Integer page;

    private Date sbggDate;

    private Integer category;

    private Integer lastest;

    private String registrantNameIdCard;

    private String registrantName;

    private String brandName;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getZch() {
        return zch;
    }

    public void setZch(String zch) {
        this.zch = zch == null ? null : zch.trim();
    }

    public String getGjfl() {
        return gjfl;
    }

    public void setGjfl(String gjfl) {
        this.gjfl = gjfl == null ? null : gjfl.trim();
    }

    public Integer getIssue() {
        return issue;
    }

    public void setIssue(Integer issue) {
        this.issue = issue;
    }

    public String getSbggCategoryName() {
        return sbggCategoryName;
    }

    public void setSbggCategoryName(String sbggCategoryName) {
        this.sbggCategoryName = sbggCategoryName == null ? null : sbggCategoryName.trim();
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Date getSbggDate() {
        return sbggDate;
    }

    public void setSbggDate(Date sbggDate) {
        this.sbggDate = sbggDate;
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public Integer getLastest() {
        return lastest;
    }

    public void setLastest(Integer lastest) {
        this.lastest = lastest;
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

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName == null ? null : brandName.trim();
    }
}