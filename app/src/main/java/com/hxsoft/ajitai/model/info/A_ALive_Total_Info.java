package com.hxsoft.ajitai.model.info;


import java.io.Serializable;
import java.util.ArrayList;

public class A_ALive_Total_Info implements Serializable {


    /**
     * records : [{"vid":101,"sname":"测试直播xaadfasdf1","status":0,"starttime":"2020-05-15 12:00:00","endtime":"2020-05-15 18:00:00","number":0},{"vid":102,"sname":"测试adsfasdff","status":0,"starttime":"2020-05-15 12:00:00","endtime":"2020-05-15 18:00:00","number":0},{"vid":104,"sname":"直播名称49","status":0,"starttime":"2003-08-08 22:29:08","endtime":"2015-10-10 21:31:11","number":0}]
     * total : 3
     * size : 10
     * current : 1
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
    private ArrayList<A_ALive_Info> records;
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

    public ArrayList<A_ALive_Info> getRecords() {
        return records;
    }

    public void setRecords(ArrayList<A_ALive_Info> records) {
        this.records = records;
    }

    public ArrayList<?> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<?> orders) {
        this.orders = orders;
    }

}



