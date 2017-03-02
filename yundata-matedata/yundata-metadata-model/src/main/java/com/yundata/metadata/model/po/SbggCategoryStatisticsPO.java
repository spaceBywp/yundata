package com.yundata.metadata.model.po;

import java.io.Serializable;

public class SbggCategoryStatisticsPO implements Serializable {
    private String id;

    private String categoryNo;

    private Integer stasticsValue;

    private Integer issue;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getCategoryNo() {
        return categoryNo;
    }

    public void setCategoryNo(String categoryNo) {
        this.categoryNo = categoryNo == null ? null : categoryNo.trim();
    }

    public Integer getStasticsValue() {
        return stasticsValue;
    }

    public void setStasticsValue(Integer stasticsValue) {
        this.stasticsValue = stasticsValue;
    }

    public Integer getIssue() {
        return issue;
    }

    public void setIssue(Integer issue) {
        this.issue = issue;
    }
}