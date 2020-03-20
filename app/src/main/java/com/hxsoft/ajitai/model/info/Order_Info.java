package com.hxsoft.ajitai.model.info;

import java.io.Serializable;

public class Order_Info implements Serializable {

    /**
     * id : 21
     * order_sn : 15823540693850
     * order_name : 日本虚空藏窑 小花唐草系列九谷烧手工茶壶
     * order_sn_out :
     * order_image_url : https://yck-oss.oss-cn-hangzhou.aliyuncs.com/uploads/20200222/16774_P_1557733998358.jpeg
     * write_off_code :
     * goods_id : 31
     * brand_id : 13
     * goods_price : 300.00
     * goods_number : 2
     * order_amount : 600.00
     * user_id : 11
     * order_status : 0
     * pay_type : 1
     * brand : {"id":13,"brand_name":"阿迪达斯","logo":"http://cdn.yck2046.com/uploads/20200116/1b5b0c2d18def6fb380feed96c753ec0.png","praise_rate":"0.00","province":130000,"city":130100,"district":0,"address":"延安西路1116号","longitude":"","latitude":"","province_text":"河北省","city_text":"石家庄市"}
     * create_time_text : 2020-02-22 14:47
     * order_status_text : 未支付
     * pay_time_text :
     * write_off_time_text :
     * pay_type_text : 微信
     * write_off_code_text :
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
    private BrandBean brand;
    private String create_time_text;
    private String order_status_text;
    private String pay_time_text;
    private String write_off_time_text;
    private String pay_type_text;
    private String write_off_code_text;

    public int getIntegral() {
        return integral;
    }

    public void setIntegral(int integral) {
        this.integral = integral;
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

    public BrandBean getBrand() {
        return brand;
    }

    public void setBrand(BrandBean brand) {
        this.brand = brand;
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

    public static class BrandBean implements Serializable {
        /**
         * id : 13
         * brand_name : 阿迪达斯
         * logo : http://cdn.yck2046.com/uploads/20200116/1b5b0c2d18def6fb380feed96c753ec0.png
         * praise_rate : 0.00
         * province : 130000
         * city : 130100
         * district : 0
         * address : 延安西路1116号
         * longitude :
         * latitude :
         * province_text : 河北省
         * city_text : 石家庄市
         */

        private int id;
        private String brand_name;
        private String logo;
        private String praise_rate;
        private int province;
        private int city;
        private int district;
        private String address;
        private String longitude;
        private String latitude;
        private String province_text;
        private String city_text;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getBrand_name() {
            return brand_name;
        }

        public void setBrand_name(String brand_name) {
            this.brand_name = brand_name;
        }

        public String getLogo() {
            return logo;
        }

        public void setLogo(String logo) {
            this.logo = logo;
        }

        public String getPraise_rate() {
            return praise_rate;
        }

        public void setPraise_rate(String praise_rate) {
            this.praise_rate = praise_rate;
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

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
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

        public String getProvince_text() {
            return province_text;
        }

        public void setProvince_text(String province_text) {
            this.province_text = province_text;
        }

        public String getCity_text() {
            return city_text;
        }

        public void setCity_text(String city_text) {
            this.city_text = city_text;
        }
    }
}


