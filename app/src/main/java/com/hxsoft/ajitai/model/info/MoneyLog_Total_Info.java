package com.hxsoft.ajitai.model.info;


import java.io.Serializable;
import java.util.ArrayList;

public class MoneyLog_Total_Info implements Serializable {


    /**
     * total : 3
     * per_page : 10
     * current_page : 1
     * last_page : 1
     * data : [{"id":1,"user_id":10,"money":"+10.00","after":"110.00","memo":"微信充值","createtime":"2020-03-09 18:06:44"},{"id":2,"user_id":10,"money":"-90.00","after":"20.00","memo":"香港广场红木家具套餐定金","createtime":"2020-03-09 18:06:44"},{"id":3,"user_id":10,"money":"+200.00","after":"220.00","memo":"活动抢红包","createtime":"2020-03-09 18:06:44"}]
     */

    private int total;
    private int per_page;
    private int current_page;
    private int last_page;
    private ArrayList<DataBean> data;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getPer_page() {
        return per_page;
    }

    public void setPer_page(int per_page) {
        this.per_page = per_page;
    }

    public int getCurrent_page() {
        return current_page;
    }

    public void setCurrent_page(int current_page) {
        this.current_page = current_page;
    }

    public int getLast_page() {
        return last_page;
    }

    public void setLast_page(int last_page) {
        this.last_page = last_page;
    }

    public ArrayList<DataBean> getData() {
        return data;
    }

    public void setData(ArrayList<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * id : 1
         * user_id : 10
         * money : +10.00
         * after : 110.00
         * memo : 微信充值
         * createtime : 2020-03-09 18:06:44
         */

        private int id;
        private int user_id;
        private String money;
        private String after;
        private String memo;
        private String createtime;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getUser_id() {
            return user_id;
        }

        public void setUser_id(int user_id) {
            this.user_id = user_id;
        }

        public String getMoney() {
            return money;
        }

        public void setMoney(String money) {
            this.money = money;
        }

        public String getAfter() {
            return after;
        }

        public void setAfter(String after) {
            this.after = after;
        }

        public String getMemo() {
            return memo;
        }

        public void setMemo(String memo) {
            this.memo = memo;
        }

        public String getCreatetime() {
            return createtime;
        }

        public void setCreatetime(String createtime) {
            this.createtime = createtime;
        }
    }
}




