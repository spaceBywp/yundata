package com.yundata.metadata.model.po;

import java.io.Serializable;

public class DictIndustryGjflPO implements Serializable {
    private String id;

    private String name;

    private String gjfls;

    private String relatedGjfls;

    private Double amount;

    private String gjflsName;

    private String relatedGjflsName;

    private Double displayOrder;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getGjfls() {
        return gjfls;
    }

    public void setGjfls(String gjfls) {
        this.gjfls = gjfls == null ? null : gjfls.trim();
    }

    public String getRelatedGjfls() {
        return relatedGjfls;
    }

    public void setRelatedGjfls(String relatedGjfls) {
        this.relatedGjfls = relatedGjfls == null ? null : relatedGjfls.trim();
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getGjflsName() {
        return gjflsName;
    }

    public void setGjflsName(String gjflsName) {
        this.gjflsName = gjflsName == null ? null : gjflsName.trim();
    }

    public String getRelatedGjflsName() {
        return relatedGjflsName;
    }

    public void setRelatedGjflsName(String relatedGjflsName) {
        this.relatedGjflsName = relatedGjflsName == null ? null : relatedGjflsName.trim();
    }

    public Double getDisplayOrder() {
        return displayOrder;
    }

    public void setDisplayOrder(Double displayOrder) {
        this.displayOrder = displayOrder;
    }
}