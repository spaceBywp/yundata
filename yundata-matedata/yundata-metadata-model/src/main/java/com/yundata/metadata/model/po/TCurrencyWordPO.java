package com.yundata.metadata.model.po;

import java.io.Serializable;

public class TCurrencyWordPO implements Serializable {
    private String word;

    private Integer category;

    private static final long serialVersionUID = 1L;

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word == null ? null : word.trim();
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }
}