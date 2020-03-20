package com.hxsoft.ajitai.model.info;

import java.io.Serializable;
import java.util.ArrayList;

public class OperatorActivitySign_Total_Info implements Serializable {


    /**
     * total_amount : 6000
     * total : 6
     * per_page : 15
     * current_page : 1
     * last_page : 1
     * data : [{"id":30,"order_sn":"","activity_id":1,"user_id":25,"ticket_id":1,"ticket_name":"一等票","ticket_number":1,"ticket_price":"1000.00","pay_type":1,"ticket_price_total":"1000.00","user_name":"李伟伟","mobile":"13062818829","status":2,"ticket_code":"","pay_time":0,"write_off_time":0,"brand_id":0,"promoter_id":5,"promoter_parent_id":4,"promoter_brand_id":13,"operator_id":5,"create_time_text":"2020-03-12 13:47","status_text":"已支付","pay_time_text":"","write_off_time_text":"","pay_type_text":"微信支付","ticket_code_text":""},{"id":29,"order_sn":"","activity_id":1,"user_id":25,"ticket_id":1,"ticket_name":"一等票","ticket_number":1,"ticket_price":"1000.00","pay_type":1,"ticket_price_total":"1000.00","user_name":"李伟伟","mobile":"13062818829","status":2,"ticket_code":"","pay_time":0,"write_off_time":0,"brand_id":0,"promoter_id":5,"promoter_parent_id":4,"promoter_brand_id":13,"operator_id":5,"create_time_text":"2020-03-12 13:47","status_text":"已支付","pay_time_text":"","write_off_time_text":"","pay_type_text":"微信支付","ticket_code_text":""},{"id":28,"order_sn":"","activity_id":1,"user_id":25,"ticket_id":1,"ticket_name":"一等票","ticket_number":1,"ticket_price":"1000.00","pay_type":1,"ticket_price_total":"1000.00","user_name":"李伟伟","mobile":"13062818829","status":2,"ticket_code":"","pay_time":0,"write_off_time":0,"brand_id":0,"promoter_id":5,"promoter_parent_id":10,"promoter_brand_id":13,"operator_id":5,"create_time_text":"2020-03-12 13:47","status_text":"已支付","pay_time_text":"","write_off_time_text":"","pay_type_text":"微信支付","ticket_code_text":""},{"id":27,"order_sn":"","activity_id":1,"user_id":25,"ticket_id":1,"ticket_name":"一等票","ticket_number":1,"ticket_price":"1000.00","pay_type":1,"ticket_price_total":"1000.00","user_name":"李伟伟","mobile":"13062818829","status":2,"ticket_code":"","pay_time":0,"write_off_time":0,"brand_id":0,"promoter_id":5,"promoter_parent_id":10,"promoter_brand_id":13,"operator_id":5,"create_time_text":"2020-03-12 13:47","status_text":"已支付","pay_time_text":"","write_off_time_text":"","pay_type_text":"微信支付","ticket_code_text":""},{"id":26,"order_sn":"","activity_id":1,"user_id":25,"ticket_id":1,"ticket_name":"一等票","ticket_number":1,"ticket_price":"1000.00","pay_type":1,"ticket_price_total":"1000.00","user_name":"李伟伟","mobile":"13062818829","status":2,"ticket_code":"","pay_time":0,"write_off_time":0,"brand_id":0,"promoter_id":5,"promoter_parent_id":4,"promoter_brand_id":13,"operator_id":5,"create_time_text":"2020-03-12 13:46","status_text":"已支付","pay_time_text":"","write_off_time_text":"","pay_type_text":"微信支付","ticket_code_text":""},{"id":25,"order_sn":"","activity_id":1,"user_id":25,"ticket_id":1,"ticket_name":"一等票","ticket_number":1,"ticket_price":"1000.00","pay_type":1,"ticket_price_total":"1000.00","user_name":"李伟伟","mobile":"13062818829","status":2,"ticket_code":"","pay_time":0,"write_off_time":0,"brand_id":0,"promoter_id":5,"promoter_parent_id":4,"promoter_brand_id":13,"operator_id":5,"create_time_text":"2020-03-12 13:45","status_text":"已支付","pay_time_text":"","write_off_time_text":"","pay_type_text":"微信支付","ticket_code_text":""}]
     */

    private int total_amount;
    private int total;
    private int per_page;
    private int current_page;
    private int last_page;
    private ArrayList<DataBean> data;

    public int getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(int total_amount) {
        this.total_amount = total_amount;
    }

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
         * id : 30
         * order_sn :
         * activity_id : 1
         * user_id : 25
         * ticket_id : 1
         * ticket_name : 一等票
         * ticket_number : 1
         * ticket_price : 1000.00
         * pay_type : 1
         * ticket_price_total : 1000.00
         * user_name : 李伟伟
         * mobile : 13062818829
         * status : 2
         * ticket_code :
         * pay_time : 0
         * write_off_time : 0
         * brand_id : 0
         * promoter_id : 5
         * promoter_parent_id : 4
         * promoter_brand_id : 13
         * operator_id : 5
         * create_time_text : 2020-03-12 13:47
         * status_text : 已支付
         * pay_time_text :
         * write_off_time_text :
         * pay_type_text : 微信支付
         * ticket_code_text :
         */

        private int id;
        private String order_sn;
        private int activity_id;
        private int user_id;
        private int ticket_id;
        private String ticket_name;
        private int ticket_number;
        private String ticket_price;
        private int pay_type;
        private String ticket_price_total;
        private String user_name;
        private String mobile;
        private int status;
        private String ticket_code;
        private int pay_time;
        private int write_off_time;
        private int brand_id;
        private int promoter_id;
        private int promoter_parent_id;
        private int promoter_brand_id;
        private int operator_id;
        private String create_time_text;
        private String status_text;
        private String pay_time_text;
        private String write_off_time_text;
        private String pay_type_text;
        private String ticket_code_text;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getOrder_sn() {
            return order_sn;
        }

        public void setOrder_sn(String order_sn) {
            this.order_sn = order_sn;
        }

        public int getActivity_id() {
            return activity_id;
        }

        public void setActivity_id(int activity_id) {
            this.activity_id = activity_id;
        }

        public int getUser_id() {
            return user_id;
        }

        public void setUser_id(int user_id) {
            this.user_id = user_id;
        }

        public int getTicket_id() {
            return ticket_id;
        }

        public void setTicket_id(int ticket_id) {
            this.ticket_id = ticket_id;
        }

        public String getTicket_name() {
            return ticket_name;
        }

        public void setTicket_name(String ticket_name) {
            this.ticket_name = ticket_name;
        }

        public int getTicket_number() {
            return ticket_number;
        }

        public void setTicket_number(int ticket_number) {
            this.ticket_number = ticket_number;
        }

        public String getTicket_price() {
            return ticket_price;
        }

        public void setTicket_price(String ticket_price) {
            this.ticket_price = ticket_price;
        }

        public int getPay_type() {
            return pay_type;
        }

        public void setPay_type(int pay_type) {
            this.pay_type = pay_type;
        }

        public String getTicket_price_total() {
            return ticket_price_total;
        }

        public void setTicket_price_total(String ticket_price_total) {
            this.ticket_price_total = ticket_price_total;
        }

        public String getUser_name() {
            return user_name;
        }

        public void setUser_name(String user_name) {
            this.user_name = user_name;
        }

        public String getMobile() {
            return mobile;
        }

        public void setMobile(String mobile) {
            this.mobile = mobile;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public String getTicket_code() {
            return ticket_code;
        }

        public void setTicket_code(String ticket_code) {
            this.ticket_code = ticket_code;
        }

        public int getPay_time() {
            return pay_time;
        }

        public void setPay_time(int pay_time) {
            this.pay_time = pay_time;
        }

        public int getWrite_off_time() {
            return write_off_time;
        }

        public void setWrite_off_time(int write_off_time) {
            this.write_off_time = write_off_time;
        }

        public int getBrand_id() {
            return brand_id;
        }

        public void setBrand_id(int brand_id) {
            this.brand_id = brand_id;
        }

        public int getPromoter_id() {
            return promoter_id;
        }

        public void setPromoter_id(int promoter_id) {
            this.promoter_id = promoter_id;
        }

        public int getPromoter_parent_id() {
            return promoter_parent_id;
        }

        public void setPromoter_parent_id(int promoter_parent_id) {
            this.promoter_parent_id = promoter_parent_id;
        }

        public int getPromoter_brand_id() {
            return promoter_brand_id;
        }

        public void setPromoter_brand_id(int promoter_brand_id) {
            this.promoter_brand_id = promoter_brand_id;
        }

        public int getOperator_id() {
            return operator_id;
        }

        public void setOperator_id(int operator_id) {
            this.operator_id = operator_id;
        }

        public String getCreate_time_text() {
            return create_time_text;
        }

        public void setCreate_time_text(String create_time_text) {
            this.create_time_text = create_time_text;
        }

        public String getStatus_text() {
            return status_text;
        }

        public void setStatus_text(String status_text) {
            this.status_text = status_text;
        }

        public String getPay_time_text() {
            return pay_time_text;
        }

        public void setPay_time_text(String pay_time_text) {
            this.pay_time_text = pay_time_text;
        }

        public String getWrite_off_time_text() {
            return write_off_time_text;
        }

        public void setWrite_off_time_text(String write_off_time_text) {
            this.write_off_time_text = write_off_time_text;
        }

        public String getPay_type_text() {
            return pay_type_text;
        }

        public void setPay_type_text(String pay_type_text) {
            this.pay_type_text = pay_type_text;
        }

        public String getTicket_code_text() {
            return ticket_code_text;
        }

        public void setTicket_code_text(String ticket_code_text) {
            this.ticket_code_text = ticket_code_text;
        }
    }
}

