package com.yundata.metadata.model.po;

import java.io.Serializable;

public class GoodsCodeBrandRefPO implements Serializable {
    private String id;

    private String gjfl;

    private String code;

    private String fenleiName;

    private String refZch;

    private Double isGood;

    private String pId;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getGjfl() {
        return gjfl;
    }

    public void setGjfl(String gjfl) {
        this.gjfl = gjfl == null ? null : gjfl.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getFenleiName() {
        return fenleiName;
    }

    public void setFenleiName(String fenleiName) {
        this.fenleiName = fenleiName == null ? null : fenleiName.trim();
    }

    public String getRefZch() {
        return refZch;
    }

    public void setRefZch(String refZch) {
        this.refZch = refZch == null ? null : refZch.trim();
    }

    public Double getIsGood() {
        return isGood;
    }

    public void setIsGood(Double isGood) {
        this.isGood = isGood;
    }

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId == null ? null : pId.trim();
    }
}