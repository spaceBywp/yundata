package com.yundata.metadata.model.po;

import java.io.Serializable;

public class SbggOcrPO implements Serializable {
    private String id;

    private String zch;

    private Integer page;

    private String anchor;

    private Integer sbggCategory;

    private Integer sbggqh;

    private String registrantNameIdCard;

    private String sqrmcZw;

    private String dlrmc;

    private String gjfl;

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

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public String getAnchor() {
        return anchor;
    }

    public void setAnchor(String anchor) {
        this.anchor = anchor == null ? null : anchor.trim();
    }

    public Integer getSbggCategory() {
        return sbggCategory;
    }

    public void setSbggCategory(Integer sbggCategory) {
        this.sbggCategory = sbggCategory;
    }

    public Integer getSbggqh() {
        return sbggqh;
    }

    public void setSbggqh(Integer sbggqh) {
        this.sbggqh = sbggqh;
    }

    public String getRegistrantNameIdCard() {
        return registrantNameIdCard;
    }

    public void setRegistrantNameIdCard(String registrantNameIdCard) {
        this.registrantNameIdCard = registrantNameIdCard == null ? null : registrantNameIdCard.trim();
    }

    public String getSqrmcZw() {
        return sqrmcZw;
    }

    public void setSqrmcZw(String sqrmcZw) {
        this.sqrmcZw = sqrmcZw == null ? null : sqrmcZw.trim();
    }

    public String getDlrmc() {
        return dlrmc;
    }

    public void setDlrmc(String dlrmc) {
        this.dlrmc = dlrmc == null ? null : dlrmc.trim();
    }

    public String getGjfl() {
        return gjfl;
    }

    public void setGjfl(String gjfl) {
        this.gjfl = gjfl == null ? null : gjfl.trim();
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName == null ? null : brandName.trim();
    }
}