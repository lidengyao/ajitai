package com.hxsoft.ajitai.model.info;


import java.io.Serializable;
import java.util.ArrayList;

public class A_Order_Total_Info implements Serializable {


    /**
     * records : [{"orderNo":"14e3393b-ad7f-4486-af7c-73cc002807e9","status":0,"shippingReceiverName":null,"shippingReceiverMobile":null,"shippingReceiverAddress":null,"createTime":"2020-05-08 13:17:55","payment":30,"isNeedReceipt":0,"productList":[{"num":1,"title":"XXX书ww","image":"https://resource.smartisan.com/resource/1a4b3d159317fe26377b2db040aaa2dc.jpg","price":10,"totalFee":10},{"num":2,"title":"yyy书yyy","image":"https://resource.smartisan.com/resource/1a4b3d159317fe26377b2db040aaa2dc.jpg","price":10,"totalFee":20}],"time":"2020-05-08 13:17:55","goodsNum":null},{"orderNo":"b49437da-4bf2-4483-8476-d01904ee81f2","status":0,"shippingReceiverName":null,"shippingReceiverMobile":null,"shippingReceiverAddress":null,"createTime":"2020-05-08 15:53:30","payment":30,"isNeedReceipt":1,"productList":[{"num":1,"title":"XXX书ww","image":"https://resource.smartisan.com/resource/1a4b3d159317fe26377b2db040aaa2dc.jpg","price":10,"totalFee":10},{"num":2,"title":"yyy书yyy","image":"https://resource.smartisan.com/resource/1a4b3d159317fe26377b2db040aaa2dc.jpg","price":10,"totalFee":20}],"time":"2020-05-08 15:53:30","goodsNum":null}]
     * total : 3
     * size : 2
     * current : 0
     * orders : []
     * hitCount : false
     * searchCount : true
     * pages : 2
     */

    private Integer total;
    private Integer size;
    private Integer current;
    private Boolean hitCount;
    private Boolean searchCount;
    private Integer pages;
    private ArrayList<A_Order_Info> records;
    private ArrayList<?> orders;

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getCurrent() {
        return current;
    }

    public void setCurrent(Integer current) {
        this.current = current;
    }

    public Boolean isHitCount() {
        return hitCount;
    }

    public void setHitCount(Boolean hitCount) {
        this.hitCount = hitCount;
    }

    public Boolean isSearchCount() {
        return searchCount;
    }

    public void setSearchCount(Boolean searchCount) {
        this.searchCount = searchCount;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public ArrayList<A_Order_Info> getRecords() {
        return records;
    }

    public void setRecords(ArrayList<A_Order_Info> records) {
        this.records = records;
    }

    public ArrayList<?> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<?> orders) {
        this.orders = orders;
    }

}



