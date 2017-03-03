package com.yundata.metadata.model.po;

import java.io.Serializable;
import java.util.Date;

public class SbggPO implements Serializable {
    private String id;

    private Integer hasStatic;

    private Date sbggDate;

    private Integer yearissue;

    private String tmid;

    private Date publishDate;

    private Date startDate;

    private Integer sbggqh;

    private Integer progress;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getHasStatic() {
        return hasStatic;
    }

    public void setHasStatic(Integer hasStatic) {
        this.hasStatic = hasStatic;
    }

    public Date getSbggDate() {
        return sbggDate;
    }

    public void setSbggDate(Date sbggDate) {
        this.sbggDate = sbggDate;
    }

    public Integer getYearissue() {
        return yearissue;
    }

    public void setYearissue(Integer yearissue) {
        this.yearissue = yearissue;
    }

    public String getTmid() {
        return tmid;
    }

    public void setTmid(String tmid) {
        this.tmid = tmid == null ? null : tmid.trim();
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Integer getSbggqh() {
        return sbggqh;
    }

    public void setSbggqh(Integer sbggqh) {
        this.sbggqh = sbggqh;
    }

    public Integer getProgress() {
        return progress;
    }

    public void setProgress(Integer progress) {
        this.progress = progress;
    }
}