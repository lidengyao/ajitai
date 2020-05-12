package com.hxsoft.ajitai.model.info;


import java.io.Serializable;
import java.util.ArrayList;

public class Cuseraddress_Total_Info implements Serializable {

    /**
     * records : [{"aid":2,"uid":1,"username":"0987123","phone":"18952460823","addrcode":20,"address":"观山路1号","isdefault":1,"createTime":"2020-04-30 14:16:33","updateTime":"2020-04-30 14:22:03"},{"aid":3,"uid":1,"username":"收件人001","phone":"18810269001","addrcode":20,"address":"观山路1号","isdefault":1,"createTime":"2020-05-06 11:28:35","updateTime":null}]
     * total : 2
     * size : 10
     * current : 0
     * orders : []
     * hitCount : false
     * searchCount : true
     * pages : 1
     */

    private Integer total;
    private Integer size;
    private Integer current;
    private boolean hitCount;
    private boolean searchCount;
    private Integer pages;
    private ArrayList<Cuseraddress_Info> records;
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

    public boolean isHitCount() {
        return hitCount;
    }

    public void setHitCount(boolean hitCount) {
        this.hitCount = hitCount;
    }

    public boolean isSearchCount() {
        return searchCount;
    }

    public void setSearchCount(boolean searchCount) {
        this.searchCount = searchCount;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public ArrayList<Cuseraddress_Info> getRecords() {
        return records;
    }

    public void setRecords(ArrayList<Cuseraddress_Info> records) {
        this.records = records;
    }

    public ArrayList<?> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<?> orders) {
        this.orders = orders;
    }

}



