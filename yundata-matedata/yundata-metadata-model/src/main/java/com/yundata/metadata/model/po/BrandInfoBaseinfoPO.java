package com.yundata.metadata.model.po;

import java.io.Serializable;
import java.util.Date;

public class BrandInfoBaseinfoPO implements Serializable {
    private String id;

    private String zch;

    private String gjfl;

    private String sbwzLs;

    private Date sqrq;

    private String sqrmcZw;

    private Double needAttention;

    private Date lastUpdateDate;

    private Double sourcetype;

    private Double blindperiod;

    private String tags;

    private String zchNumber;

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

    public String getSbwzLs() {
        return sbwzLs;
    }

    public void setSbwzLs(String sbwzLs) {
        this.sbwzLs = sbwzLs == null ? null : sbwzLs.trim();
    }

    public Date getSqrq() {
        return sqrq;
    }

    public void setSqrq(Date sqrq) {
        this.sqrq = sqrq;
    }

    public String getSqrmcZw() {
        return sqrmcZw;
    }

    public void setSqrmcZw(String sqrmcZw) {
        this.sqrmcZw = sqrmcZw == null ? null : sqrmcZw.trim();
    }

    public Double getNeedAttention() {
        return needAttention;
    }

    public void setNeedAttention(Double needAttention) {
        this.needAttention = needAttention;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public Double getSourcetype() {
        return sourcetype;
    }

    public void setSourcetype(Double sourcetype) {
        this.sourcetype = sourcetype;
    }

    public Double getBlindperiod() {
        return blindperiod;
    }

    public void setBlindperiod(Double blindperiod) {
        this.blindperiod = blindperiod;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags == null ? null : tags.trim();
    }

    public String getZchNumber() {
        return zchNumber;
    }

    public void setZchNumber(String zchNumber) {
        this.zchNumber = zchNumber == null ? null : zchNumber.trim();
    }
}