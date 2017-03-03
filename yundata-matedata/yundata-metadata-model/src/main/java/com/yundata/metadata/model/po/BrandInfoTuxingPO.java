package com.yundata.metadata.model.po;

import java.io.Serializable;
import java.util.Date;

public class BrandInfoTuxingPO implements Serializable {
    private String id;

    private String code;

    private String gjfl;

    private String zch;

    private Date lastUpdateDate;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getGjfl() {
        return gjfl;
    }

    public void setGjfl(String gjfl) {
        this.gjfl = gjfl == null ? null : gjfl.trim();
    }

    public String getZch() {
        return zch;
    }

    public void setZch(String zch) {
        this.zch = zch == null ? null : zch.trim();
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }
}