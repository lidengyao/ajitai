package com.hxsoft.ajitai.model.info;

import java.io.Serializable;

public class OrderInfo implements Serializable {


    /**
     * id : 5
     * order_sn :
     * activity_id : 1
     * user_id : 10
     * ticket_id : 1
     * ticket_name : 一等票
     * ticket_number : 2
     * ticket_price : 1000.00
     * pay_type : 1
     * ticket_price_total : 2000.00
     * user_name : 张光强
     * mobile : 15251435196
     * status : 2
     * ticket_code : 123456
     * pay_time : 0
     * write_off_time : 0
     * brand_id : 0
     * promoter_id : 0
     * promoter_parent_id : 0
     * promoter_brand_id : 0
     * operator_id : 5
     * activity : {"id":1,"name":"活动名称","address":"展馆名称","pavilion_name":"展馆名称","head_img":"http://47.92.221.41/image/zhiboyi.png","start_time":1585701568,"start_time_text":"2020-04-01 08:39","surplus_time_text":"20天10时51分","status_text":"","type_text":""}
     * operator : {"id":5,"user_id":10,"name":"随便起个名字","province":110000,"city":110100,"district":0,"mobile":"15251435195","contact_name":"小李","company_name":"小XX李科技","intro":"案例分析hvvhghg","status":0,"activity_available_count":0,"longitude":"1","latitude":"1","wx_qr":"","avatar":"http:/cdn.yck2046.com/upload/DF2307DC-34F4-43D7-8830-3F2D11B85DE1.png","qr_code":"https://yck2046.com/qrcode/build?text=eyJvcGVyYXRvcl9pZCI6NSwic2NlbmVzIjoiQUREX0VNUExPWUVFIn0="}
     * create_time_text : 2020-03-02 09:33
     * status_text : 已支付
     * pay_time_text :
     * write_off_time_text :
     * pay_type_text : 微信支付
     * ticket_code_text : https://yck2046.com/qrcode/build?text=123456
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
    private ActivityBean activity;
    private OperatorBean operator;
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

    public ActivityBean getActivity() {
        return activity;
    }

    public void setActivity(ActivityBean activity) {
        this.activity = activity;
    }

    public OperatorBean getOperator() {
        return operator;
    }

    public void setOperator(OperatorBean operator) {
        this.operator = operator;
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

    public static class ActivityBean {
        /**
         * id : 1
         * name : 活动名称
         * address : 展馆名称
         * pavilion_name : 展馆名称
         * head_img : http://47.92.221.41/image/zhiboyi.png
         * start_time : 1585701568
         * start_time_text : 2020-04-01 08:39
         * surplus_time_text : 20天10时51分
         * status_text :
         * type_text :
         */

        private int id;
        private String name;
        private String address;
        private String pavilion_name;
        private String head_img;
        private int start_time;
        private String start_time_text;
        private String surplus_time_text;
        private String status_text;
        private String type_text;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getPavilion_name() {
            return pavilion_name;
        }

        public void setPavilion_name(String pavilion_name) {
            this.pavilion_name = pavilion_name;
        }

        public String getHead_img() {
            return head_img;
        }

        public void setHead_img(String head_img) {
            this.head_img = head_img;
        }

        public int getStart_time() {
            return start_time;
        }

        public void setStart_time(int start_time) {
            this.start_time = start_time;
        }

        public String getStart_time_text() {
            return start_time_text;
        }

        public void setStart_time_text(String start_time_text) {
            this.start_time_text = start_time_text;
        }

        public String getSurplus_time_text() {
            return surplus_time_text;
        }

        public void setSurplus_time_text(String surplus_time_text) {
            this.surplus_time_text = surplus_time_text;
        }

        public String getStatus_text() {
            return status_text;
        }

        public void setStatus_text(String status_text) {
            this.status_text = status_text;
        }

        public String getType_text() {
            return type_text;
        }

        public void setType_text(String type_text) {
            this.type_text = type_text;
        }
    }

    public static class OperatorBean {
        /**
         * id : 5
         * user_id : 10
         * name : 随便起个名字
         * province : 110000
         * city : 110100
         * district : 0
         * mobile : 15251435195
         * contact_name : 小李
         * company_name : 小XX李科技
         * intro : 案例分析hvvhghg
         * status : 0
         * activity_available_count : 0
         * longitude : 1
         * latitude : 1
         * wx_qr :
         * avatar : http:/cdn.yck2046.com/upload/DF2307DC-34F4-43D7-8830-3F2D11B85DE1.png
         * qr_code : https://yck2046.com/qrcode/build?text=eyJvcGVyYXRvcl9pZCI6NSwic2NlbmVzIjoiQUREX0VNUExPWUVFIn0=
         */

        private int id;
        private int user_id;
        private String name;
        private int province;
        private int city;
        private int district;
        private String mobile;
        private String contact_name;
        private String company_name;
        private String intro;
        private int status;
        private int activity_available_count;
        private String longitude;
        private String latitude;
        private String wx_qr;
        private String avatar;
        private String qr_code;

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

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getProvince() {
            return province;
        }

        public void setProvince(int province) {
            this.province = province;
        }

        public int getCity() {
            return city;
        }

        public void setCity(int city) {
            this.city = city;
        }

        public int getDistrict() {
            return district;
        }

        public void setDistrict(int district) {
            this.district = district;
        }

        public String getMobile() {
            return mobile;
        }

        public void setMobile(String mobile) {
            this.mobile = mobile;
        }

        public String getContact_name() {
            return contact_name;
        }

        public void setContact_name(String contact_name) {
            this.contact_name = contact_name;
        }

        public String getCompany_name() {
            return company_name;
        }

        public void setCompany_name(String company_name) {
            this.company_name = company_name;
        }

        public String getIntro() {
            return intro;
        }

        public void setIntro(String intro) {
            this.intro = intro;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public int getActivity_available_count() {
            return activity_available_count;
        }

        public void setActivity_available_count(int activity_available_count) {
            this.activity_available_count = activity_available_count;
        }

        public String getLongitude() {
            return longitude;
        }

        public void setLongitude(String longitude) {
            this.longitude = longitude;
        }

        public String getLatitude() {
            return latitude;
        }

        public void setLatitude(String latitude) {
            this.latitude = latitude;
        }

        public String getWx_qr() {
            return wx_qr;
        }

        public void setWx_qr(String wx_qr) {
            this.wx_qr = wx_qr;
        }

        public String getAvatar() {
            return avatar;
        }

        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }

        public String getQr_code() {
            return qr_code;
        }

        public void setQr_code(String qr_code) {
            this.qr_code = qr_code;
        }
    }
}
