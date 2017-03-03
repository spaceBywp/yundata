package com.yundata.metadata.model.po;

import java.io.Serializable;

public class AuthCountPO implements Serializable {
    private Integer id;

    private String authCategory;

    private String count;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAuthCategory() {
        return authCategory;
    }

    public void setAuthCategory(String authCategory) {
        this.authCategory = authCategory == null ? null : authCategory.trim();
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count == null ? null : count.trim();
    }
}