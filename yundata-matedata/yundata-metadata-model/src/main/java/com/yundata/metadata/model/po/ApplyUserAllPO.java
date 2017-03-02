package com.yundata.metadata.model.po;

import java.io.Serializable;

public class ApplyUserAllPO implements Serializable {
    private String id;

    private Integer type;

    private String sqrmcZw;

    private String idCardNo;

    private Double brandCount;

    private String shengfenCode;

    private String filterChar;

    private String sqrmcZwIdCardNo;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getSqrmcZw() {
        return sqrmcZw;
    }

    public void setSqrmcZw(String sqrmcZw) {
        this.sqrmcZw = sqrmcZw == null ? null : sqrmcZw.trim();
    }

    public String getIdCardNo() {
        return idCardNo;
    }

    public void setIdCardNo(String idCardNo) {
        this.idCardNo = idCardNo == null ? null : idCardNo.trim();
    }

    public Double getBrandCount() {
        return brandCount;
    }

    public void setBrandCount(Double brandCount) {
        this.brandCount = brandCount;
    }

    public String getShengfenCode() {
        return shengfenCode;
    }

    public void setShengfenCode(String shengfenCode) {
        this.shengfenCode = shengfenCode == null ? null : shengfenCode.trim();
    }

    public String getFilterChar() {
        return filterChar;
    }

    public void setFilterChar(String filterChar) {
        this.filterChar = filterChar == null ? null : filterChar.trim();
    }

    public String getSqrmcZwIdCardNo() {
        return sqrmcZwIdCardNo;
    }

    public void setSqrmcZwIdCardNo(String sqrmcZwIdCardNo) {
        this.sqrmcZwIdCardNo = sqrmcZwIdCardNo == null ? null : sqrmcZwIdCardNo.trim();
    }
}