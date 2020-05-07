package com.hxsoft.ajitai.model.info;


import java.io.Serializable;
import java.util.ArrayList;

public class Cuseraddress_Info implements Serializable {

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
         * aid : 2
         * uid : 1
         * username : 0987123
         * phone : 18952460823
         * addrcode : 20
         * address : 观山路1号
         * isdefault : 1
         * createTime : 2020-04-30 14:16:33
         * updateTime : 2020-04-30 14:22:03
         */

        private Integer aid;
        private Integer uid;
        private String username;
        private String phone;
        private Integer addrcode;
        private String address;
        private Integer isdefault;
        private String createTime;
        private String updateTime;

        public Integer getAid() {
            return aid;
        }

        public void setAid(Integer aid) {
            this.aid = aid;
        }

        public Integer getUid() {
            return uid;
        }

        public void setUid(Integer uid) {
            this.uid = uid;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public Integer getAddrcode() {
            return addrcode;
        }

        public void setAddrcode(Integer addrcode) {
            this.addrcode = addrcode;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public Integer getIsdefault() {
            return isdefault;
        }

        public void setIsdefault(Integer isdefault) {
            this.isdefault = isdefault;
        }

        public String getCreateTime() {
            return createTime;
        }

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        public String getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
        }
    }
}



