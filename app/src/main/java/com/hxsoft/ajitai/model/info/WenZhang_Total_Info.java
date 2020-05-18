package com.hxsoft.ajitai.model.info;


import java.io.Serializable;
import java.util.ArrayList;

public class WenZhang_Total_Info implements Serializable {


    /**
     * current : 0
     * hitCount : true
     * pages : 0
     * records : [{"createtime":"2020-05-18T11:44:10.598Z","faceurl":"string","readers":0,"thumb":0,"title":"string"}]
     * searchCount : true
     * size : 0
     * total : 0
     */

    private Integer current;
    private boolean hitCount;
    private Integer pages;
    private boolean searchCount;
    private Integer size;
    private Integer total;
    private ArrayList<Heartnectar_Info> records;

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

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public boolean isSearchCount() {
        return searchCount;
    }

    public void setSearchCount(boolean searchCount) {
        this.searchCount = searchCount;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ArrayList<Heartnectar_Info> getRecords() {
        return records;
    }

    public void setRecords(ArrayList<Heartnectar_Info> records) {
        this.records = records;
    }

}



