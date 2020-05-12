package com.hxsoft.ajitai.model.info;


import java.io.Serializable;
import java.util.ArrayList;

public class KeCheng_Info implements Serializable {

    /**
     * records : [{"goodsid":"be4004c3b2ffc6c94b418c0a0a666342","goodstype":1,"goodsname":"7天课程","goodsurl":"http://image.hxsoft.net/goods/05da0a05aaae41b4.jpg","price":63},{"goodsid":"c587fdb58e48d67fcf72a7e09ecfa3a8","goodstype":1,"goodsname":"21天课程","goodsurl":"http://image.hxsoft.net/goods/05da0a05aaae41b4.jpg","price":189},{"goodsid":"e8cd1894bca9e78c734a5519b2eed81c","goodstype":1,"goodsname":"35天课程","goodsurl":"http://image.hxsoft.net/goods/05da0a05aaae41b4.jpg","price":315}]
     * total : 3
     * size : 10
     * current : 0
     * orders : []
     * hitCount : false
     * type : 1
     * searchCount : true
     * pages : 1
     */

    private Integer total;
    private Integer size;
    private Integer current;
    private Boolean hitCount;
    private Integer type;
    private Boolean searchCount;
    private Integer pages;
    private ArrayList<RecordsBean> records;
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

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
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

    public ArrayList<RecordsBean> getRecords() {
        return records;
    }

    public void setRecords(ArrayList<RecordsBean> records) {
        this.records = records;
    }

    public ArrayList<?> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<?> orders) {
        this.orders = orders;
    }

    public static class RecordsBean implements Serializable{
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
}



