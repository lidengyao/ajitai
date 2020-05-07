package com.hxsoft.ajitai.model.info;


import java.io.Serializable;
import java.util.ArrayList;

public class Cuserreceipt_Info implements Serializable {


    /**
     * records : [{"rid":3,"uid":1,"unitname":"无锡弘晓软件有限公司123","identifyno":"91320202MA1MTDC92H2","address":"无锡新吴区观山路1号316","phone":"18952460824","bankname":"中国建设银行雪浪支行-2","bankaccount":"3205016174800000085","createTime":"2020-04-30 16:45:19","updateTime":null},{"rid":4,"uid":1,"unitname":"无锡弘晓软件有限公司001","identifyno":"91320202MA1MTDC92H2","address":"无锡新吴区观山路1号316","phone":"18952460824","bankname":"中国建设银行雪浪支行-2","bankaccount":"3205016174800000085","createTime":"2020-05-06 11:34:13","updateTime":null}]
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
         * rid : 3
         * uid : 1
         * unitname : 无锡弘晓软件有限公司123
         * identifyno : 91320202MA1MTDC92H2
         * address : 无锡新吴区观山路1号316
         * phone : 18952460824
         * bankname : 中国建设银行雪浪支行-2
         * bankaccount : 3205016174800000085
         * createTime : 2020-04-30 16:45:19
         * updateTime : null
         */

        private Integer rid;
        private Integer uid;
        private String unitname;
        private String identifyno;
        private String address;
        private String phone;
        private String bankname;
        private String bankaccount;
        private String createTime;
        private Object updateTime;

        public Integer getRid() {
            return rid;
        }

        public void setRid(Integer rid) {
            this.rid = rid;
        }

        public Integer getUid() {
            return uid;
        }

        public void setUid(Integer uid) {
            this.uid = uid;
        }

        public String getUnitname() {
            return unitname;
        }

        public void setUnitname(String unitname) {
            this.unitname = unitname;
        }

        public String getIdentifyno() {
            return identifyno;
        }

        public void setIdentifyno(String identifyno) {
            this.identifyno = identifyno;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getBankname() {
            return bankname;
        }

        public void setBankname(String bankname) {
            this.bankname = bankname;
        }

        public String getBankaccount() {
            return bankaccount;
        }

        public void setBankaccount(String bankaccount) {
            this.bankaccount = bankaccount;
        }

        public String getCreateTime() {
            return createTime;
        }

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        public Object getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(Object updateTime) {
            this.updateTime = updateTime;
        }
    }
}



