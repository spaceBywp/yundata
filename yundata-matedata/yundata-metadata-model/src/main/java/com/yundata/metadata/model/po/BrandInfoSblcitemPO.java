package com.yundata.metadata.model.po;

import java.io.Serializable;
import java.util.Date;

public class BrandInfoSblcitemPO implements Serializable {
    private String id;

    private String zch;

    private String gjfl;

    private String sblcitem;

    private Date lastUpdateDate;

    private Double manualFlag;

    private Double lastest;

    private Date sblcdate;

    private Double displayOrder;

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

    public String getSblcitem() {
        return sblcitem;
    }

    public void setSblcitem(String sblcitem) {
        this.sblcitem = sblcitem == null ? null : sblcitem.trim();
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public Double getManualFlag() {
        return manualFlag;
    }

    public void setManualFlag(Double manualFlag) {
        this.manualFlag = manualFlag;
    }

    public Double getLastest() {
        return lastest;
    }

    public void setLastest(Double lastest) {
        this.lastest = lastest;
    }

    public Date getSblcdate() {
        return sblcdate;
    }

    public void setSblcdate(Date sblcdate) {
        this.sblcdate = sblcdate;
    }

    public Double getDisplayOrder() {
        return displayOrder;
    }

    public void setDisplayOrder(Double displayOrder) {
        this.displayOrder = displayOrder;
    }
}