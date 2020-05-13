package com.hxsoft.ajitai.model.info;


import java.io.Serializable;
import java.util.ArrayList;

public class KeCheng_Info implements Serializable {


    /**
     * goodsid : be4004c3b2ffc6c94b418c0a0a666342
     * goodstype : 1
     * goodsname : 7天课程
     * goodsurl : http://image.hxsoft.net/goods/05da0a05aaae41b4.jpg
     * price : 63
     */

    private String goodsid;
    private Integer goodstype;
    private String goodsname;
    private String goodsurl;
    private Double price;

    public String getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(String goodsid) {
        this.goodsid = goodsid;
    }

    public Integer getGoodstype() {
        return goodstype;
    }

    public void setGoodstype(Integer goodstype) {
        this.goodstype = goodstype;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname;
    }

    public String getGoodsurl() {
        return goodsurl;
    }

    public void setGoodsurl(String goodsurl) {
        this.goodsurl = goodsurl;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}




