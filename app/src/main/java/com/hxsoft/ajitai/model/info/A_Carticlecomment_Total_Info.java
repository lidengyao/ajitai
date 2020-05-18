package com.hxsoft.ajitai.model.info;


import java.io.Serializable;
import java.util.ArrayList;

public class A_Carticlecomment_Total_Info implements Serializable {


    /**
     * records : [{"cid":3,"uid":1,"nickname":"测试","avatar":"http://image.hxsoft.net/http://image.hxsoft.net/asdfasdfsadfasdf","ctype":1,"content":"测试评论","createTime":"2020-05-18 21:39:53"},{"cid":4,"uid":1,"nickname":"测试","avatar":"http://image.hxsoft.net/http://image.hxsoft.net/asdfasdfsadfasdf","ctype":1,"content":"测试评论","createTime":"2020-05-18 21:39:54"},{"cid":5,"uid":1,"nickname":"测试","avatar":"http://image.hxsoft.net/http://image.hxsoft.net/asdfasdfsadfasdf","ctype":1,"content":"测试评论","createTime":"2020-05-18 21:39:54"},{"cid":6,"uid":1,"nickname":"测试","avatar":"http://image.hxsoft.net/http://image.hxsoft.net/asdfasdfsadfasdf","ctype":1,"content":"测试评论","createTime":"2020-05-18 21:39:54"},{"cid":7,"uid":1,"nickname":"测试","avatar":"http://image.hxsoft.net/http://image.hxsoft.net/asdfasdfsadfasdf","ctype":1,"content":"测试评论","createTime":"2020-05-18 21:39:55"},{"cid":8,"uid":1,"nickname":"测试","avatar":"http://image.hxsoft.net/http://image.hxsoft.net/asdfasdfsadfasdf","ctype":1,"content":"测试评论","createTime":"2020-05-18 21:39:55"},{"cid":9,"uid":1,"nickname":"测试","avatar":"http://image.hxsoft.net/http://image.hxsoft.net/asdfasdfsadfasdf","ctype":1,"content":"测试评论","createTime":"2020-05-18 21:39:56"},{"cid":10,"uid":1,"nickname":"测试","avatar":"http://image.hxsoft.net/http://image.hxsoft.net/asdfasdfsadfasdf","ctype":1,"content":"测试评论","createTime":"2020-05-18 21:39:56"},{"cid":11,"uid":1,"nickname":"测试","avatar":"http://image.hxsoft.net/http://image.hxsoft.net/asdfasdfsadfasdf","ctype":1,"content":"测试评论","createTime":"2020-05-18 21:39:57"}]
     * total : 9
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
    private ArrayList<A_Carticlecomment_Info> records;
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

    public ArrayList<A_Carticlecomment_Info> getRecords() {
        return records;
    }

    public void setRecords(ArrayList<A_Carticlecomment_Info> records) {
        this.records = records;
    }

    public ArrayList<?> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<?> orders) {
        this.orders = orders;
    }

}



