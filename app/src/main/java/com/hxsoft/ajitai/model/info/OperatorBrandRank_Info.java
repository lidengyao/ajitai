package com.hxsoft.ajitai.model.info;


import java.io.Serializable;

public class OperatorBrandRank_Info implements Serializable {


    /**
     * brand_id : 13
     * share_count : 1
     * view_count : 1
     * sign_count : 2
     * order_count : 6
     * employee_promoter_order_count : 6
     * promoter_order_count : 0
     * id : 1
     * brand_name : 阿迪达斯
     */

    private int brand_id;
    private String share_count;
    private String view_count;
    private String sign_count;
    private String order_count;
    private String employee_promoter_order_count;
    private String promoter_order_count;
    private int id;
    private String brand_name;

    public int getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(int brand_id) {
        this.brand_id = brand_id;
    }

    public String getShare_count() {
        return share_count;
    }

    public void setShare_count(String share_count) {
        this.share_count = share_count;
    }

    public String getView_count() {
        return view_count;
    }

    public void setView_count(String view_count) {
        this.view_count = view_count;
    }

    public String getSign_count() {
        return sign_count;
    }

    public void setSign_count(String sign_count) {
        this.sign_count = sign_count;
    }

    public String getOrder_count() {
        return order_count;
    }

    public void setOrder_count(String order_count) {
        this.order_count = order_count;
    }

    public String getEmployee_promoter_order_count() {
        return employee_promoter_order_count;
    }

    public void setEmployee_promoter_order_count(String employee_promoter_order_count) {
        this.employee_promoter_order_count = employee_promoter_order_count;
    }

    public String getPromoter_order_count() {
        return promoter_order_count;
    }

    public void setPromoter_order_count(String promoter_order_count) {
        this.promoter_order_count = promoter_order_count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand_name() {
        return brand_name;
    }

    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name;
    }
}




