package com.yundata.metadata.model.po;

import java.io.Serializable;

public class TDictDetailPOWithBLOBs extends TDictDetailPO implements Serializable {
    private byte[] args3;

    private String args4;

    private static final long serialVersionUID = 1L;

    public byte[] getArgs3() {
        return args3;
    }

    public void setArgs3(byte[] args3) {
        this.args3 = args3;
    }

    public String getArgs4() {
        return args4;
    }

    public void setArgs4(String args4) {
        this.args4 = args4 == null ? null : args4.trim();
    }
}