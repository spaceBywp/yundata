package com.yundata.metadata.model.po;

import java.io.Serializable;

public class UserRolePO implements Serializable {
    private String id;

    private String roleId;

    private String userId;

    private Integer category;

    private Integer isCorpAdmin;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public Integer getIsCorpAdmin() {
        return isCorpAdmin;
    }

    public void setIsCorpAdmin(Integer isCorpAdmin) {
        this.isCorpAdmin = isCorpAdmin;
    }
}