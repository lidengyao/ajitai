package com.hxsoft.ajitai.model.info;


import java.io.Serializable;

public class CreateOrder_Info implements Serializable {

    /**
     * orderNo : 88df45b495d34c948619a3b375040d80
     * isNeedPay : true
     */

    private String orderNo;
    private Boolean isNeedPay;

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Boolean isIsNeedPay() {
        return isNeedPay;
    }

    public void setIsNeedPay(Boolean isNeedPay) {
        this.isNeedPay = isNeedPay;
    }
}



