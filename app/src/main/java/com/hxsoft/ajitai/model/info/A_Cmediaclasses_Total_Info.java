package com.hxsoft.ajitai.model.info;


import java.io.Serializable;
import java.util.ArrayList;

public class A_Cmediaclasses_Total_Info implements Serializable {


    /**
     * records : [{"cid":105,"classname":"类型名称73","skind":2,"starttime":"2014-09-10 15:02:13","endtime":"2008-10-23 18:39:07","timelabel":"2014-09-10 15:02-18:39","status":0,"upcid":0,"faceurl":"http://image.hxsoft.net/image/ti11111111111mg.jpg","description":null,"createTime":"2020-05-18 09:45:53","updateTime":"2020-05-18 09:49:51","joinnumber":0}]
     * total : 1
     * size : 10
     * current : 1
     * orders : []
     * hitCount : false
     * page : 1
     * searchCount : true
     * pages : 1
     */

    private Integer total;
    private Integer size;
    private Integer current;
    private boolean hitCount;
    private Integer page;
    private boolean searchCount;
    private Integer pages;
    private ArrayList<A_Cmediaclasses_Info> records;
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

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
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

    public ArrayList<A_Cmediaclasses_Info> getRecords() {
        return records;
    }

    public void setRecords(ArrayList<A_Cmediaclasses_Info> records) {
        this.records = records;
    }

    public ArrayList<?> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<?> orders) {
        this.orders = orders;
    }

}



