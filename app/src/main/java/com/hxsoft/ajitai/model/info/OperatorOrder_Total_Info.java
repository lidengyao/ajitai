package com.hxsoft.ajitai.model.info;

import java.io.Serializable;
import java.util.ArrayList;

public class OperatorOrder_Total_Info implements Serializable {


    /**
     * total_amount : 1200
     * total : 4
     * per_page : 15
     * current_page : 1
     * last_page : 1
     * data : [{"id":32,"order_sn":"15840038446397","order_name":"日本虚空藏窑 小花唐草系列九谷烧手工茶壶","order_sn_out":"","order_image_url":"https://yck-oss.oss-cn-hangzhou.aliyuncs.com/uploads/20200222/16774_P_1557733998358.jpeg","write_off_code":"","goods_id":31,"brand_id":13,"goods_price":"300.00","goods_number":1,"order_amount":"300.00","user_id":26,"order_status":5,"pay_type":1,"integral":0,"remark":"","refund_remark":"","refund_time":0,"activity_id":1,"operator_id":0,"promoter_id":5,"sales_price":"1000.00","promoter_parent_id":0,"promoter_brand_id":13,"promoter_parent_user_id":0,"write_off_user_id":0,"create_time_text":"2020-03-12 17:04","order_status_text":"已核销","pay_time_text":"","write_off_time_text":"","pay_type_text":"微信支付","write_off_code_text":"","brand_name":"阿迪达斯","nickname":"13062810007","mobile":"13062810007","username":"13062810007","promoter_name":"","write_off_user_name":""},{"id":31,"order_sn":"15840033479052","order_name":"日本虚空藏窑 小花唐草系列九谷烧手工茶壶","order_sn_out":"","order_image_url":"https://yck-oss.oss-cn-hangzhou.aliyuncs.com/uploads/20200222/16774_P_1557733998358.jpeg","write_off_code":"","goods_id":31,"brand_id":13,"goods_price":"300.00","goods_number":1,"order_amount":"300.00","user_id":26,"order_status":5,"pay_type":1,"integral":0,"remark":"","refund_remark":"","refund_time":0,"activity_id":1,"operator_id":0,"promoter_id":5,"sales_price":"1000.00","promoter_parent_id":0,"promoter_brand_id":13,"promoter_parent_user_id":0,"write_off_user_id":0,"create_time_text":"2020-03-12 16:55","order_status_text":"已核销","pay_time_text":"","write_off_time_text":"","pay_type_text":"微信支付","write_off_code_text":"","brand_name":"阿迪达斯","nickname":"13062810007","mobile":"13062810007","username":"13062810007","promoter_name":"","write_off_user_name":""},{"id":30,"order_sn":"15840033392676","order_name":"日本虚空藏窑 小花唐草系列九谷烧手工茶壶","order_sn_out":"","order_image_url":"https://yck-oss.oss-cn-hangzhou.aliyuncs.com/uploads/20200222/16774_P_1557733998358.jpeg","write_off_code":"","goods_id":31,"brand_id":13,"goods_price":"300.00","goods_number":1,"order_amount":"300.00","user_id":26,"order_status":4,"pay_type":1,"integral":0,"remark":"","refund_remark":"","refund_time":0,"activity_id":1,"operator_id":0,"promoter_id":5,"sales_price":"1000.00","promoter_parent_id":0,"promoter_brand_id":13,"promoter_parent_user_id":0,"write_off_user_id":0,"create_time_text":"2020-03-12 16:55","order_status_text":"已支付","pay_time_text":"","write_off_time_text":"","pay_type_text":"微信支付","write_off_code_text":"","brand_name":"阿迪达斯","nickname":"13062810007","mobile":"13062810007","username":"13062810007","promoter_name":"","write_off_user_name":""},{"id":29,"order_sn":"15840033218640","order_name":"日本虚空藏窑 小花唐草系列九谷烧手工茶壶","order_sn_out":"","order_image_url":"https://yck-oss.oss-cn-hangzhou.aliyuncs.com/uploads/20200222/16774_P_1557733998358.jpeg","write_off_code":"","goods_id":31,"brand_id":13,"goods_price":"300.00","goods_number":1,"order_amount":"300.00","user_id":26,"order_status":4,"pay_type":1,"integral":0,"remark":"","refund_remark":"","refund_time":0,"activity_id":1,"operator_id":0,"promoter_id":5,"sales_price":"1000.00","promoter_parent_id":11,"promoter_brand_id":13,"promoter_parent_user_id":0,"write_off_user_id":1,"create_time_text":"2020-03-12 16:55","order_status_text":"已支付","pay_time_text":"","write_off_time_text":"","pay_type_text":"微信支付","write_off_code_text":"","brand_name":"阿迪达斯","nickname":"13062810007","mobile":"13062810007","username":"13062810007","promoter_name":"","write_off_user_name":"admin"}]
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
         * id : 32
         * order_sn : 15840038446397
         * order_name : 日本虚空藏窑 小花唐草系列九谷烧手工茶壶
         * order_sn_out :
         * order_image_url : https://yck-oss.oss-cn-hangzhou.aliyuncs.com/uploads/20200222/16774_P_1557733998358.jpeg
         * write_off_code :
         * goods_id : 31
         * brand_id : 13
         * goods_price : 300.00
         * goods_number : 1
         * order_amount : 300.00
         * user_id : 26
         * order_status : 5
         * pay_type : 1
         * integral : 0
         * remark :
         * refund_remark :
         * refund_time : 0
         * activity_id : 1
         * operator_id : 0
         * promoter_id : 5
         * sales_price : 1000.00
         * promoter_parent_id : 0
         * promoter_brand_id : 13
         * promoter_parent_user_id : 0
         * write_off_user_id : 0
         * create_time_text : 2020-03-12 17:04
         * order_status_text : 已核销
         * pay_time_text :
         * write_off_time_text :
         * pay_type_text : 微信支付
         * write_off_code_text :
         * brand_name : 阿迪达斯
         * nickname : 13062810007
         * mobile : 13062810007
         * username : 13062810007
         * promoter_name :
         * write_off_user_name :
         */

        private int id;
        private String order_sn;
        private String order_name;
        private String order_sn_out;
        private String order_image_url;
        private String write_off_code;
        private int goods_id;
        private int brand_id;
        private String goods_price;
        private int goods_number;
        private String order_amount;
        private int user_id;
        private int order_status;
        private int pay_type;
        private int integral;
        private String remark;
        private String refund_remark;
        private int refund_time;
        private int activity_id;
        private int operator_id;
        private int promoter_id;
        private String sales_price;
        private int promoter_parent_id;
        private int promoter_brand_id;
        private int promoter_parent_user_id;
        private int write_off_user_id;
        private String create_time_text;
        private String order_status_text;
        private String pay_time_text;
        private String write_off_time_text;
        private String pay_type_text;
        private String write_off_code_text;
        private String brand_name;
        private String nickname;
        private String mobile;
        private String username;
        private String promoter_name;
        private String write_off_user_name;
        private String avatar;

        public String getAvatar() {
            return avatar;
        }

        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }

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

        public String getOrder_name() {
            return order_name;
        }

        public void setOrder_name(String order_name) {
            this.order_name = order_name;
        }

        public String getOrder_sn_out() {
            return order_sn_out;
        }

        public void setOrder_sn_out(String order_sn_out) {
            this.order_sn_out = order_sn_out;
        }

        public String getOrder_image_url() {
            return order_image_url;
        }

        public void setOrder_image_url(String order_image_url) {
            this.order_image_url = order_image_url;
        }

        public String getWrite_off_code() {
            return write_off_code;
        }

        public void setWrite_off_code(String write_off_code) {
            this.write_off_code = write_off_code;
        }

        public int getGoods_id() {
            return goods_id;
        }

        public void setGoods_id(int goods_id) {
            this.goods_id = goods_id;
        }

        public int getBrand_id() {
            return brand_id;
        }

        public void setBrand_id(int brand_id) {
            this.brand_id = brand_id;
        }

        public String getGoods_price() {
            return goods_price;
        }

        public void setGoods_price(String goods_price) {
            this.goods_price = goods_price;
        }

        public int getGoods_number() {
            return goods_number;
        }

        public void setGoods_number(int goods_number) {
            this.goods_number = goods_number;
        }

        public String getOrder_amount() {
            return order_amount;
        }

        public void setOrder_amount(String order_amount) {
            this.order_amount = order_amount;
        }

        public int getUser_id() {
            return user_id;
        }

        public void setUser_id(int user_id) {
            this.user_id = user_id;
        }

        public int getOrder_status() {
            return order_status;
        }

        public void setOrder_status(int order_status) {
            this.order_status = order_status;
        }

        public int getPay_type() {
            return pay_type;
        }

        public void setPay_type(int pay_type) {
            this.pay_type = pay_type;
        }

        public int getIntegral() {
            return integral;
        }

        public void setIntegral(int integral) {
            this.integral = integral;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public String getRefund_remark() {
            return refund_remark;
        }

        public void setRefund_remark(String refund_remark) {
            this.refund_remark = refund_remark;
        }

        public int getRefund_time() {
            return refund_time;
        }

        public void setRefund_time(int refund_time) {
            this.refund_time = refund_time;
        }

        public int getActivity_id() {
            return activity_id;
        }

        public void setActivity_id(int activity_id) {
            this.activity_id = activity_id;
        }

        public int getOperator_id() {
            return operator_id;
        }

        public void setOperator_id(int operator_id) {
            this.operator_id = operator_id;
        }

        public int getPromoter_id() {
            return promoter_id;
        }

        public void setPromoter_id(int promoter_id) {
            this.promoter_id = promoter_id;
        }

        public String getSales_price() {
            return sales_price;
        }

        public void setSales_price(String sales_price) {
            this.sales_price = sales_price;
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

        public int getPromoter_parent_user_id() {
            return promoter_parent_user_id;
        }

        public void setPromoter_parent_user_id(int promoter_parent_user_id) {
            this.promoter_parent_user_id = promoter_parent_user_id;
        }

        public int getWrite_off_user_id() {
            return write_off_user_id;
        }

        public void setWrite_off_user_id(int write_off_user_id) {
            this.write_off_user_id = write_off_user_id;
        }

        public String getCreate_time_text() {
            return create_time_text;
        }

        public void setCreate_time_text(String create_time_text) {
            this.create_time_text = create_time_text;
        }

        public String getOrder_status_text() {
            return order_status_text;
        }

        public void setOrder_status_text(String order_status_text) {
            this.order_status_text = order_status_text;
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

        public String getWrite_off_code_text() {
            return write_off_code_text;
        }

        public void setWrite_off_code_text(String write_off_code_text) {
            this.write_off_code_text = write_off_code_text;
        }

        public String getBrand_name() {
            return brand_name;
        }

        public void setBrand_name(String brand_name) {
            this.brand_name = brand_name;
        }

        public String getNickname() {
            return nickname;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public String getMobile() {
            return mobile;
        }

        public void setMobile(String mobile) {
            this.mobile = mobile;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPromoter_name() {
            return promoter_name;
        }

        public void setPromoter_name(String promoter_name) {
            this.promoter_name = promoter_name;
        }

        public String getWrite_off_user_name() {
            return write_off_user_name;
        }

        public void setWrite_off_user_name(String write_off_user_name) {
            this.write_off_user_name = write_off_user_name;
        }
    }
}

