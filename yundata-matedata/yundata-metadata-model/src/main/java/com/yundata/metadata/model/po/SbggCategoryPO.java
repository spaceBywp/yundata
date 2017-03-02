package com.yundata.metadata.model.po;

import java.io.Serializable;

public class SbggCategoryPO implements Serializable {
    private String id;

    private String sbggId;

    private String categoryName;

    private Integer startPage;

    private Integer endPage;

    private Integer finishedDownloadGif;

    private Integer finishedOcr;

    private String code;

    private Integer sbggqh;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getSbggId() {
        return sbggId;
    }

    public void setSbggId(String sbggId) {
        this.sbggId = sbggId == null ? null : sbggId.trim();
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
    }

    public Integer getStartPage() {
        return startPage;
    }

    public void setStartPage(Integer startPage) {
        this.startPage = startPage;
    }

    public Integer getEndPage() {
        return endPage;
    }

    public void setEndPage(Integer endPage) {
        this.endPage = endPage;
    }

    public Integer getFinishedDownloadGif() {
        return finishedDownloadGif;
    }

    public void setFinishedDownloadGif(Integer finishedDownloadGif) {
        this.finishedDownloadGif = finishedDownloadGif;
    }

    public Integer getFinishedOcr() {
        return finishedOcr;
    }

    public void setFinishedOcr(Integer finishedOcr) {
        this.finishedOcr = finishedOcr;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public Integer getSbggqh() {
        return sbggqh;
    }

    public void setSbggqh(Integer sbggqh) {
        this.sbggqh = sbggqh;
    }
}