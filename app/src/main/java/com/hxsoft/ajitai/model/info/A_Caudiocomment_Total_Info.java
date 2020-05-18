package com.hxsoft.ajitai.model.info;


import java.io.Serializable;
import java.util.ArrayList;

public class A_Caudiocomment_Total_Info implements Serializable {


    /**
     * current : 0
     * hitCount : true
     * pages : 0
     * records : [{"aid":0,"avatar":"string","cid":0,"content":"string","createTime":"2020-05-18T17:12:42.632Z","ctype":0,"nickname":"string","replycontent":"string","replyid":0,"replynickname":"string","status":0,"uid":0}]
     * searchCount : true
     * size : 0
     * total : 0
     */

    private int current;
    private boolean hitCount;
    private int pages;
    private boolean searchCount;
    private int size;
    private int total;
    private ArrayList<A_Caudiocomment_Info> records;

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

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public boolean isSearchCount() {
        return searchCount;
    }

    public void setSearchCount(boolean searchCount) {
        this.searchCount = searchCount;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public ArrayList<A_Caudiocomment_Info> getRecords() {
        return records;
    }

    public void setRecords(ArrayList<A_Caudiocomment_Info> records) {
        this.records = records;
    }


}



