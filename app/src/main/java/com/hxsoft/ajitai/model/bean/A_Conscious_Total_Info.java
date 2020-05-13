package com.hxsoft.ajitai.model.bean;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class A_Conscious_Total_Info implements Serializable {

    /**
     * records : [{"cid":1,"uid":1,"position":"XXX","nickname":"修","avatar":"102b80ca0aff433cbe1ef996eb0abf19","content":"测试内容","relaycid":0,"status":0,"createTime":"2020-05-13 10:14:40","extrals":[{"type":2,"uri":"http://image.hxsoft.net/image/xxxxx.jpg"},{"type":2,"uri":"http://image.hxsoft.net/image/yyyy.jpg"}],"thumbs":[{"uid":1,"nickname":"修"}],"comments":[{"cmid":2,"uid":1,"nickname":"修","content":"测试评论"}]},{"cid":2,"uid":1,"position":"XXX","nickname":"修","avatar":"102b80ca0aff433cbe1ef996eb0abf19","content":"测试内容12345","relaycid":0,"status":0,"createTime":"2020-05-13 10:19:42","extrals":[{"type":2,"uri":"http://image.hxsoft.net/image/xxxxx.jpg"},{"type":2,"uri":"http://image.hxsoft.net/image/yyyy.jpg"}],"thumbs":[],"comments":[]},{"cid":3,"uid":1,"position":"XXX","nickname":"修","avatar":"102b80ca0aff433cbe1ef996eb0abf19","content":"测试内容","relaycid":0,"status":0,"createTime":"2020-05-13 15:38:39","extrals":[{"type":2,"uri":"http://image.hxsoft.net/image/xxxxx.jpg"},{"type":2,"uri":"http://image.hxsoft.net/image/yyyy.jpg"}],"thumbs":[],"comments":[]},{"cid":4,"uid":1,"position":"XXX","nickname":"修","avatar":"102b80ca0aff433cbe1ef996eb0abf19","content":"今天天气真好","relaycid":0,"status":0,"createTime":"2020-05-13 16:07:40","extrals":[{"type":2,"uri":"http://image.hxsoft.net/image/xxxxx.jpg"},{"type":2,"uri":"http://image.hxsoft.net/image/yyyy.jpg"}],"thumbs":[],"comments":[]}]
     * total : 0
     * size : 10
     * current : 0
     * orders : []
     * hitCount : false
     * page : null
     * searchCount : false
     * pages : 0
     */

    private Integer total;
    private Integer size;
    private Integer current;
    private boolean hitCount;
    private Integer page;
    private boolean searchCount;
    private Integer pages;
    private ArrayList<A_Conscious_Info> records;
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

    public ArrayList<A_Conscious_Info> getRecords() {
        return records;
    }

    public void setRecords(ArrayList<A_Conscious_Info> records) {
        this.records = records;
    }

    public ArrayList<?> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<?> orders) {
        this.orders = orders;
    }
}

