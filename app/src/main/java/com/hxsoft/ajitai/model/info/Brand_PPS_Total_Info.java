package com.hxsoft.ajitai.model.info;


import java.io.Serializable;
import java.util.ArrayList;

public class Brand_PPS_Total_Info implements Serializable {

        /**
         * total : 2
         * per_page : 2
         * current_page : 1
         * last_page : 1
         * data : [{"id":14,"user_id":10,"name":"ldy","province":32767,"city":32767,"district":0,"mobile":"15251435195","contact_name":"李登耀","logo":"http://cdn.yck2046.com/uploads/20200116/1b5b0c2d18def6fb380feed96c753ec0.png","business_license":"http://cdn.yck2046.com/uploads/20200116/1b5b0c2d18def6fb380feed96c753ec0.png","facade_img":"http://cdn.yck2046.com/uploads/20200116/1b5b0c2d18def6fb380feed96c753ec0.png","praise_rate":"0.00","status":1},{"id":13,"user_id":11,"name":"阿迪达斯","province":1,"city":1,"district":0,"mobile":"13062818829","contact_name":"李伟伟","logo":"http://cdn.yck2046.com/uploads/20200116/1b5b0c2d18def6fb380feed96c753ec0.png","business_license":"http://cdn.yck2046.com/uploads/20200116/1b5b0c2d18def6fb380feed96c753ec0.png","facade_img":"http://cdn.yck2046.com/uploads/20200116/1b5b0c2d18def6fb380feed96c753ec0.png","praise_rate":"0.00","status":1}]
         */

        private int total;
        private int per_page;
        private int current_page;
        private int last_page;
        private ArrayList<Brand_PPS_Info> data;

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

        public ArrayList<Brand_PPS_Info> getData() {
            return data;
        }

        public void setData(ArrayList<Brand_PPS_Info> data) {
            this.data = data;
        }

    }




