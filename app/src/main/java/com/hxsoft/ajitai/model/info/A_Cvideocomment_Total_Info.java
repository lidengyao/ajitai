package com.hxsoft.ajitai.model.info;


import java.io.Serializable;
import java.util.ArrayList;

public class A_Cvideocomment_Total_Info implements Serializable {


    /**
     * records : [{"cid":101,"sid":101,"uid":1,"nickname":"测试","avatar":"http://image.hxsoft.net/asdfasdfsadfasdf","ctype":1,"replyid":0,"content":"测试回复1","status":1,"createTime":"2020-05-18 16:53:02"},{"cid":100,"sid":101,"uid":1,"nickname":"测试","avatar":"http://image.hxsoft.net/asdfasdfsadfasdf","ctype":1,"replyid":0,"content":"测试回复","status":1,"createTime":"2020-05-18 16:51:02"}]
     * total : 2
     * size : 10
     * current : 1
     * orders : []
     * hitCount : false
     * page : null
     * searchCount : true
     * pages : 1
     */

    private int total;
    private int size;
    private int current;
    private boolean hitCount;
    private Object page;
    private boolean searchCount;
    private int pages;
    private ArrayList<A_Cvideocomment_Info> records;
    private ArrayList<?> orders;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        this.current = current;
    }

    public boolean isHitCount() {
        return hitCount;
    }

    public void setHitCount(boolean hitCount) {
        this.hitCount = hitCount;
    }

    public Object getPage() {
        return page;
    }

    public void setPage(Object page) {
        this.page = page;
    }

    public boolean isSearchCount() {
        return searchCount;
    }

    public void setSearchCount(boolean searchCount) {
        this.searchCount = searchCount;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public ArrayList<A_Cvideocomment_Info> getRecords() {
        return records;
    }

    public void setRecords(ArrayList<A_Cvideocomment_Info> records) {
        this.records = records;
    }

    public ArrayList<?> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<?> orders) {
        this.orders = orders;
    }
    
}



