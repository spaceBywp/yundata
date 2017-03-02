package com.yundata.metadata.model.po;

import java.io.Serializable;

public class SbggNotifyPO implements Serializable {
    private String id;

    private String email;

    private Integer lastNotifySbggqh;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getLastNotifySbggqh() {
        return lastNotifySbggqh;
    }

    public void setLastNotifySbggqh(Integer lastNotifySbggqh) {
        this.lastNotifySbggqh = lastNotifySbggqh;
    }
}