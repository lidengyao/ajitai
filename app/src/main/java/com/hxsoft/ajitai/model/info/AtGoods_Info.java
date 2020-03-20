package com.hxsoft.ajitai.model.info;


import java.io.Serializable;
import java.util.ArrayList;

public class AtGoods_Info implements Serializable {

    /**
     * total : 5
     * per_page : 15
     * current_page : 1
     * last_page : 1
     * data : [{"id":5,"goods_id":5,"name":"阿迪达斯三叶草","price":"2000.00","number":100,"sold_number":0,"head_img":"img","type":2,"promote_price":"1800.00","book_price":"140.00","brand_id":4,"brand_name":"李宁"},{"id":4,"goods_id":4,"name":"iphone90s","price":"7000.00","number":100,"sold_number":0,"head_img":"img","type":2,"promote_price":"2222.00","book_price":"2221.00","brand_id":5,"brand_name":"纽拜伦"},{"id":3,"goods_id":3,"name":"阿迪达斯三叶草","price":"2000.00","number":100,"sold_number":0,"head_img":"img","type":1,"promote_price":"1800.00","book_price":"140.00","brand_id":4,"brand_name":"李宁"},{"id":2,"goods_id":2,"name":"iphone90s","price":"7000.00","number":100,"sold_number":0,"head_img":"img","type":1,"promote_price":"2222.00","book_price":"2221.00","brand_id":5,"brand_name":"纽拜伦"},{"id":1,"goods_id":1,"name":"阿迪达斯三叶草","price":"2000.00","number":90,"sold_number":10,"head_img":"img","type":1,"promote_price":"1800.00","book_price":"140.00","brand_id":4,"brand_name":"李宁"}]
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

    public static class DataBean implements Serializable{
        /**
         * id : 5
         * goods_id : 5
         * name : 阿迪达斯三叶草
         * price : 2000.00
         * number : 100
         * sold_number : 0
         * head_img : img
         * type : 2
         * promote_price : 1800.00
         * book_price : 140.00
         * brand_id : 4
         * brand_name : 李宁
         */

        private int id;
        private int goods_id;
        private String name;
        private String price;
        private int number;
        private int sold_number;
        private String head_img;
        private int type;
        private String promote_price;
        private String book_price;
        private int brand_id;
        private String brand_name;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getGoods_id() {
            return goods_id;
        }

        public void setGoods_id(int goods_id) {
            this.goods_id = goods_id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public int getSold_number() {
            return sold_number;
        }

        public void setSold_number(int sold_number) {
            this.sold_number = sold_number;
        }

        public String getHead_img() {
            return head_img;
        }

        public void setHead_img(String head_img) {
            this.head_img = head_img;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public String getPromote_price() {
            return promote_price;
        }

        public void setPromote_price(String promote_price) {
            this.promote_price = promote_price;
        }

        public String getBook_price() {
            return book_price;
        }

        public void setBook_price(String book_price) {
            this.book_price = book_price;
        }

        public int getBrand_id() {
            return brand_id;
        }

        public void setBrand_id(int brand_id) {
            this.brand_id = brand_id;
        }

        public String getBrand_name() {
            return brand_name;
        }

        public void setBrand_name(String brand_name) {
            this.brand_name = brand_name;
        }
    }
}



