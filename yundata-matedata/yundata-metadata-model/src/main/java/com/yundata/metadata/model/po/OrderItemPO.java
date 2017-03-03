package com.yundata.metadata.model.po;

import java.io.Serializable;
import java.math.BigDecimal;

public class OrderItemPO implements Serializable {
    private String itemId;

    private String orderInfoId;

    private String itemName;

    private BigDecimal itemPrice;

    private String hiddenValue;

    private static final long serialVersionUID = 1L;

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId == null ? null : itemId.trim();
    }

    public String getOrderInfoId() {
        return orderInfoId;
    }

    public void setOrderInfoId(String orderInfoId) {
        this.orderInfoId = orderInfoId == null ? null : orderInfoId.trim();
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName == null ? null : itemName.trim();
    }

    public BigDecimal getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(BigDecimal itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getHiddenValue() {
        return hiddenValue;
    }

    public void setHiddenValue(String hiddenValue) {
        this.hiddenValue = hiddenValue == null ? null : hiddenValue.trim();
    }
}