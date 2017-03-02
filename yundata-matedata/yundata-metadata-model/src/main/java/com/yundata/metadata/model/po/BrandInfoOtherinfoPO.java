package com.yundata.metadata.model.po;

import java.io.Serializable;
import java.util.Date;

public class BrandInfoOtherinfoPO implements Serializable {
    private String id;

    private String zch;

    private String gjfl;

    private String sfgysb;

    private String sblx;

    private Double colorgroup;

    private Date hqzdrq;

    private Date gjzcrq;

    private Date yxqrq;

    private Date lastUpdateDate;

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

    public String getSfgysb() {
        return sfgysb;
    }

    public void setSfgysb(String sfgysb) {
        this.sfgysb = sfgysb == null ? null : sfgysb.trim();
    }

    public String getSblx() {
        return sblx;
    }

    public void setSblx(String sblx) {
        this.sblx = sblx == null ? null : sblx.trim();
    }

    public Double getColorgroup() {
        return colorgroup;
    }

    public void setColorgroup(Double colorgroup) {
        this.colorgroup = colorgroup;
    }

    public Date getHqzdrq() {
        return hqzdrq;
    }

    public void setHqzdrq(Date hqzdrq) {
        this.hqzdrq = hqzdrq;
    }

    public Date getGjzcrq() {
        return gjzcrq;
    }

    public void setGjzcrq(Date gjzcrq) {
        this.gjzcrq = gjzcrq;
    }

    public Date getYxqrq() {
        return yxqrq;
    }

    public void setYxqrq(Date yxqrq) {
        this.yxqrq = yxqrq;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }
}