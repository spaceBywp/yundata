package com.yundata.metadata.model.po;

import java.io.Serializable;
import java.util.Date;

public class BrandInfoStatusinfoPO implements Serializable {
    private String id;

    private String zch;

    private String gjfl;

    private Date newProcessDate;

    private String lastsblcitem;

    private Double status;

    private Date lastUpdateDate;

    private Double progress;

    private String newProcess;

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

    public Date getNewProcessDate() {
        return newProcessDate;
    }

    public void setNewProcessDate(Date newProcessDate) {
        this.newProcessDate = newProcessDate;
    }

    public String getLastsblcitem() {
        return lastsblcitem;
    }

    public void setLastsblcitem(String lastsblcitem) {
        this.lastsblcitem = lastsblcitem == null ? null : lastsblcitem.trim();
    }

    public Double getStatus() {
        return status;
    }

    public void setStatus(Double status) {
        this.status = status;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public Double getProgress() {
        return progress;
    }

    public void setProgress(Double progress) {
        this.progress = progress;
    }

    public String getNewProcess() {
        return newProcess;
    }

    public void setNewProcess(String newProcess) {
        this.newProcess = newProcess == null ? null : newProcess.trim();
    }
}