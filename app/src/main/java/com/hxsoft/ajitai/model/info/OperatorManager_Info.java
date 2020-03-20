package com.hxsoft.ajitai.model.info;


import java.io.Serializable;
import java.util.ArrayList;

public class OperatorManager_Info implements Serializable {


    /**
     * total : 5
     * per_page : 15
     * current_page : 1
     * last_page : 1
     * data : [{"id":7,"user_id":25,"activity_id":1,"brand_id":22,"operator_id":5,"status":1,"create_time":0,"username":"13062810006","mobile":"13062810006","nickname":"13062810006","url":"/u/25"},{"id":6,"user_id":26,"activity_id":1,"brand_id":22,"operator_id":5,"status":1,"create_time":0,"username":"13062810007","mobile":"13062810007","nickname":"13062810007","url":"/u/26"},{"id":3,"user_id":27,"activity_id":1,"brand_id":22,"operator_id":5,"status":1,"create_time":0,"username":"13062810008","mobile":"13062810008","nickname":"13062810008","url":"/u/27"},{"id":2,"user_id":28,"activity_id":1,"brand_id":22,"operator_id":5,"status":1,"create_time":0,"username":"13062810009","mobile":"13062810009","nickname":"13062810009","url":"/u/28"},{"id":1,"user_id":29,"activity_id":1,"brand_id":0,"operator_id":5,"status":0,"create_time":0,"username":"13062810003","mobile":"13062810003","nickname":"13062810003","url":"/u/29"}]
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
         * id : 7
         * user_id : 25
         * activity_id : 1
         * brand_id : 22
         * operator_id : 5
         * status : 1
         * create_time : 0
         * username : 13062810006
         * mobile : 13062810006
         * nickname : 13062810006
         * url : /u/25
         */

        private int id;
        private int user_id;
        private int activity_id;
        private int brand_id;
        private int operator_id;
        private int status;
        private int create_time;
        private String username;
        private String mobile;
        private String nickname;
        private String url;

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

        public int getActivity_id() {
            return activity_id;
        }

        public void setActivity_id(int activity_id) {
            this.activity_id = activity_id;
        }

        public int getBrand_id() {
            return brand_id;
        }

        public void setBrand_id(int brand_id) {
            this.brand_id = brand_id;
        }

        public int getOperator_id() {
            return operator_id;
        }

        public void setOperator_id(int operator_id) {
            this.operator_id = operator_id;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public int getCreate_time() {
            return create_time;
        }

        public void setCreate_time(int create_time) {
            this.create_time = create_time;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getMobile() {
            return mobile;
        }

        public void setMobile(String mobile) {
            this.mobile = mobile;
        }

        public String getNickname() {
            return nickname;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }
}




