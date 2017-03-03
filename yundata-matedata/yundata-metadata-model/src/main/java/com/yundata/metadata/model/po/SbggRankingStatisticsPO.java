package com.yundata.metadata.model.po;

import java.io.Serializable;

public class SbggRankingStatisticsPO implements Serializable {
    private String id;

    private String dlrmc;

    private String shengfen;

    private String city;

    private Integer chushenCount;

    private Integer sbggqh;

    private Integer weici;

    private String simpleName;

    private Integer lastWeici;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getDlrmc() {
        return dlrmc;
    }

    public void setDlrmc(String dlrmc) {
        this.dlrmc = dlrmc == null ? null : dlrmc.trim();
    }

    public String getShengfen() {
        return shengfen;
    }

    public void setShengfen(String shengfen) {
        this.shengfen = shengfen == null ? null : shengfen.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public Integer getChushenCount() {
        return chushenCount;
    }

    public void setChushenCount(Integer chushenCount) {
        this.chushenCount = chushenCount;
    }

    public Integer getSbggqh() {
        return sbggqh;
    }

    public void setSbggqh(Integer sbggqh) {
        this.sbggqh = sbggqh;
    }

    public Integer getWeici() {
        return weici;
    }

    public void setWeici(Integer weici) {
        this.weici = weici;
    }

    public String getSimpleName() {
        return simpleName;
    }

    public void setSimpleName(String simpleName) {
        this.simpleName = simpleName == null ? null : simpleName.trim();
    }

    public Integer getLastWeici() {
        return lastWeici;
    }

    public void setLastWeici(Integer lastWeici) {
        this.lastWeici = lastWeici;
    }
}