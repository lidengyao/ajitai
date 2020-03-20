package com.hxsoft.ajitai.model.info;

import java.io.Serializable;
import java.util.ArrayList;

public class SpreadCenter_Total_Info implements Serializable {

        /**
         * id : 4
         * user_id : 10
         * activity_id : 1
         * obtain_integral : 0
         * obtain_money : 0.00
         * status : 0
         * total_data : [{"event_type":4,"count":2},{"event_type":1,"count":2},{"event_type":2,"count":1}]
         * today_data : []
         */

        private int id;
        private int user_id;
        private int activity_id;
        private int obtain_integral;
        private String obtain_money;
        private int status;
        private ArrayList<TotalDataBean> total_data;
        private ArrayList<TotalDataBean> today_data;

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

        public int getObtain_integral() {
            return obtain_integral;
        }

        public void setObtain_integral(int obtain_integral) {
            this.obtain_integral = obtain_integral;
        }

        public String getObtain_money() {
            return obtain_money;
        }

        public void setObtain_money(String obtain_money) {
            this.obtain_money = obtain_money;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public ArrayList<TotalDataBean> getTotal_data() {
            return total_data;
        }

        public void setTotal_data(ArrayList<TotalDataBean> total_data) {
            this.total_data = total_data;
        }

        public ArrayList<TotalDataBean> getToday_data() {
            return today_data;
        }

        public void setToday_data(ArrayList<TotalDataBean> today_data) {
            this.today_data = today_data;
        }

        public static class TotalDataBean implements Serializable{
            /**
             * event_type : 4
             * count : 2
             */

            private int event_type;
            private int count;

            public int getEvent_type() {
                return event_type;
            }

            public void setEvent_type(int event_type) {
                this.event_type = event_type;
            }

            public int getCount() {
                return count;
            }

            public void setCount(int count) {
                this.count = count;
            }
        }
    }


