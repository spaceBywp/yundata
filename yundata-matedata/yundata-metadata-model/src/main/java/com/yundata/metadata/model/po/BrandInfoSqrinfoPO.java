package com.yundata.metadata.model.po;

import java.io.Serializable;
import java.util.Date;

public class BrandInfoSqrinfoPO implements Serializable {
    private String id;

    private String zch;

    private String gjfl;

    private String sqrmcZw;

    private String sqrmcYw;

    private String sqrdzZw;

    private String sqrdzYw;

    private String idCardNo;

    private String sqr2;

    private String sqr3;

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

    public String getSqrmcZw() {
        return sqrmcZw;
    }

    public void setSqrmcZw(String sqrmcZw) {
        this.sqrmcZw = sqrmcZw == null ? null : sqrmcZw.trim();
    }

    public String getSqrmcYw() {
        return sqrmcYw;
    }

    public void setSqrmcYw(String sqrmcYw) {
        this.sqrmcYw = sqrmcYw == null ? null : sqrmcYw.trim();
    }

    public String getSqrdzZw() {
        return sqrdzZw;
    }

    public void setSqrdzZw(String sqrdzZw) {
        this.sqrdzZw = sqrdzZw == null ? null : sqrdzZw.trim();
    }

    public String getSqrdzYw() {
        return sqrdzYw;
    }

    public void setSqrdzYw(String sqrdzYw) {
        this.sqrdzYw = sqrdzYw == null ? null : sqrdzYw.trim();
    }

    public String getIdCardNo() {
        return idCardNo;
    }

    public void setIdCardNo(String idCardNo) {
        this.idCardNo = idCardNo == null ? null : idCardNo.trim();
    }

    public String getSqr2() {
        return sqr2;
    }

    public void setSqr2(String sqr2) {
        this.sqr2 = sqr2 == null ? null : sqr2.trim();
    }

    public String getSqr3() {
        return sqr3;
    }

    public void setSqr3(String sqr3) {
        this.sqr3 = sqr3 == null ? null : sqr3.trim();
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }
}