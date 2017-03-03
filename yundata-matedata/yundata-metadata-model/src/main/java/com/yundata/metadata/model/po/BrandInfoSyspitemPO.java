package com.yundata.metadata.model.po;

import java.io.Serializable;
import java.util.Date;

public class BrandInfoSyspitemPO implements Serializable {
    private String id;

    private String zch;

    private String gjfl;

    private String gjflqz;

    private Double flag;

    private Date lastUpdateDate;

    private Double displayOrder;

    private Double delflag;

    private String syspitem;

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

    public String getGjflqz() {
        return gjflqz;
    }

    public void setGjflqz(String gjflqz) {
        this.gjflqz = gjflqz == null ? null : gjflqz.trim();
    }

    public Double getFlag() {
        return flag;
    }

    public void setFlag(Double flag) {
        this.flag = flag;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public Double getDisplayOrder() {
        return displayOrder;
    }

    public void setDisplayOrder(Double displayOrder) {
        this.displayOrder = displayOrder;
    }

    public Double getDelflag() {
        return delflag;
    }

    public void setDelflag(Double delflag) {
        this.delflag = delflag;
    }

    public String getSyspitem() {
        return syspitem;
    }

    public void setSyspitem(String syspitem) {
        this.syspitem = syspitem == null ? null : syspitem.trim();
    }
}