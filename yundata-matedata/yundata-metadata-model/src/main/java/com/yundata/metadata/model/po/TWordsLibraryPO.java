package com.yundata.metadata.model.po;

import java.io.Serializable;

public class TWordsLibraryPO implements Serializable {
    private Integer length;

    private String location;

    private String type;

    private String word;

    private static final long serialVersionUID = 1L;

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word == null ? null : word.trim();
    }
}