package com.hxsoft.ajitai.model.info;


import java.io.Serializable;
import java.util.ArrayList;

public class OperatorBrand_Total_Info implements Serializable {


    /**
     * total : 3
     * per_page : 15
     * current_page : 1
     * last_page : 1
     * data : [{"id":3,"brand_id":14,"activity_id":1,"status":1,"operator_id":5,"brand_name":"ldy","logo":"https://yck-oss.oss-cn-hangzhou.aliyuncs.com/1583338645571293.jpg","praise_rate":"0.00","province":130000,"city":130100,"district":0,"address":"延安西路1116号","longitude":"","latitude":"","qr_code":"https://yck2046.com/qrcode/build?text=eyJicmFuZF9pZCI6MTQsInNjZW5lcyI6IkFERF9FTVBMT1lFRSJ9"},{"id":2,"brand_id":22,"activity_id":1,"status":1,"operator_id":5,"brand_name":"微软","logo":"http://cdn.yck2046.com/uploads/20200311/0e6d9882484d31508f316f8cd880983e.png","praise_rate":"0.00","province":110000,"city":110105,"district":0,"address":"上海市宝山区菊联路233弄","longitude":"","latitude":"","qr_code":"https://yck2046.com/qrcode/build?text=eyJicmFuZF9pZCI6MjIsInNjZW5lcyI6IkFERF9FTVBMT1lFRSJ9"},{"id":1,"brand_id":13,"activity_id":1,"status":1,"operator_id":5,"brand_name":"阿迪达斯","logo":"https://yck-oss.oss-cn-hangzhou.aliyuncs.com/1583338645571293.jpg","praise_rate":"0.00","province":130000,"city":130100,"district":0,"address":"延安西路1116号","longitude":"","latitude":"","qr_code":"https://yck2046.com/qrcode/build?text=eyJicmFuZF9pZCI6MTMsInNjZW5lcyI6IkFERF9FTVBMT1lFRSJ9"}]
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
         * id : 3
         * brand_id : 14
         * activity_id : 1
         * status : 1
         * operator_id : 5
         * brand_name : ldy
         * logo : https://yck-oss.oss-cn-hangzhou.aliyuncs.com/1583338645571293.jpg
         * praise_rate : 0.00
         * province : 130000
         * city : 130100
         * district : 0
         * address : 延安西路1116号
         * longitude :
         * latitude :
         * qr_code : https://yck2046.com/qrcode/build?text=eyJicmFuZF9pZCI6MTQsInNjZW5lcyI6IkFERF9FTVBMT1lFRSJ9
         */

        private int id;
        private int brand_id;
        private int activity_id;
        private int status;
        private int operator_id;
        private String brand_name;
        private String logo;
        private String praise_rate;
        private int province;
        private int city;
        private int district;
        private String address;
        private String longitude;
        private String latitude;
        private String contact_name;
        private String mobile;
        private String qr_code;

        public String getContact_name() {
            return contact_name;
        }

        public void setContact_name(String contact_name) {
            this.contact_name = contact_name;
        }

        public String getMobile() {
            return mobile;
        }

        public void setMobile(String mobile) {
            this.mobile = mobile;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getBrand_id() {
            return brand_id;
        }

        public void setBrand_id(int brand_id) {
            this.brand_id = brand_id;
        }

        public int getActivity_id() {
            return activity_id;
        }

        public void setActivity_id(int activity_id) {
            this.activity_id = activity_id;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public int getOperator_id() {
            return operator_id;
        }

        public void setOperator_id(int operator_id) {
            this.operator_id = operator_id;
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

        public String getQr_code() {
            return qr_code;
        }

        public void setQr_code(String qr_code) {
            this.qr_code = qr_code;
        }
    }
}




