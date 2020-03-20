package com.hxsoft.ajitai.model.info;


import java.io.Serializable;

public class BrandActivityData_Info implements Serializable {


    /**
     * pv : 8
     * uv : 2
     * sign_count : 6
     * order_count : 4
     * promoter_order_count : 1
     */

    private int pv;
    private int uv;
    private int sign_count;
    private int order_count;
    private int promoter_order_count;

    public int getPv() {
        return pv;
    }

    public void setPv(int pv) {
        this.pv = pv;
    }

    public int getUv() {
        return uv;
    }

    public void setUv(int uv) {
        this.uv = uv;
    }

    public int getSign_count() {
        return sign_count;
    }

    public void setSign_count(int sign_count) {
        this.sign_count = sign_count;
    }

    public int getOrder_count() {
        return order_count;
    }

    public void setOrder_count(int order_count) {
        this.order_count = order_count;
    }

    public int getPromoter_order_count() {
        return promoter_order_count;
    }

    public void setPromoter_order_count(int promoter_order_count) {
        this.promoter_order_count = promoter_order_count;
    }
}




