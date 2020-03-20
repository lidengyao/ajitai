package com.hxsoft.ajitai.model.info;


import java.io.Serializable;

public class BrandActivityCenter_Info implements Serializable {


    /**
     * uv : 0
     * sign_count : 0
     * order_count : 0
     * promoter_order_count : 0
     * employee_count : 0
     */

    private int uv;
    private int sign_count;
    private int order_count;
    private int promoter_order_count;
    private int employee_count;

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

    public int getEmployee_count() {
        return employee_count;
    }

    public void setEmployee_count(int employee_count) {
        this.employee_count = employee_count;
    }
}




