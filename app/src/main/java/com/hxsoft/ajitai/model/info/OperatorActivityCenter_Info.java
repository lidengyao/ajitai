package com.hxsoft.ajitai.model.info;


import java.io.Serializable;

public class OperatorActivityCenter_Info implements Serializable {

    /**
     * pv : 0
     * uv : 0
     * sign_count : 0
     * order_count : 0
     * employee_count : 0
     * brand_count : 0
     * wx_qr :
     * sms_balance : 0
     */

    private int pv;
    private int uv;
    private int sign_count;
    private int order_count;
    private int employee_count;
    private int brand_count;
    private String wx_qr;
    private int sms_balance;

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

    public int getEmployee_count() {
        return employee_count;
    }

    public void setEmployee_count(int employee_count) {
        this.employee_count = employee_count;
    }

    public int getBrand_count() {
        return brand_count;
    }

    public void setBrand_count(int brand_count) {
        this.brand_count = brand_count;
    }

    public String getWx_qr() {
        return wx_qr;
    }

    public void setWx_qr(String wx_qr) {
        this.wx_qr = wx_qr;
    }

    public int getSms_balance() {
        return sms_balance;
    }

    public void setSms_balance(int sms_balance) {
        this.sms_balance = sms_balance;
    }
}




