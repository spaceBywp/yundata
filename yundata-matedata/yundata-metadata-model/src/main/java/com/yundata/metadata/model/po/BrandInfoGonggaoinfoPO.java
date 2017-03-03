package com.yundata.metadata.model.po;

import java.io.Serializable;
import java.util.Date;

public class BrandInfoGonggaoinfoPO implements Serializable {
    private String id;

    private String zch;

    private String gjfl;

    private String csggqh;

    private Date csggrq;

    private String zcggqh;

    private Date zcggrq;

    private String zyqqx;

    private Date zyqqxEnd;

    private Double hasXuzhan;

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

    public String getCsggqh() {
        return csggqh;
    }

    public void setCsggqh(String csggqh) {
        this.csggqh = csggqh == null ? null : csggqh.trim();
    }

    public Date getCsggrq() {
        return csggrq;
    }

    public void setCsggrq(Date csggrq) {
        this.csggrq = csggrq;
    }

    public String getZcggqh() {
        return zcggqh;
    }

    public void setZcggqh(String zcggqh) {
        this.zcggqh = zcggqh == null ? null : zcggqh.trim();
    }

    public Date getZcggrq() {
        return zcggrq;
    }

    public void setZcggrq(Date zcggrq) {
        this.zcggrq = zcggrq;
    }

    public String getZyqqx() {
        return zyqqx;
    }

    public void setZyqqx(String zyqqx) {
        this.zyqqx = zyqqx == null ? null : zyqqx.trim();
    }

    public Date getZyqqxEnd() {
        return zyqqxEnd;
    }

    public void setZyqqxEnd(Date zyqqxEnd) {
        this.zyqqxEnd = zyqqxEnd;
    }

    public Double getHasXuzhan() {
        return hasXuzhan;
    }

    public void setHasXuzhan(Double hasXuzhan) {
        this.hasXuzhan = hasXuzhan;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }
}