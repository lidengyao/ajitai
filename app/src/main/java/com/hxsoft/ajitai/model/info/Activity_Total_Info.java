package com.hxsoft.ajitai.model.info;

import java.io.Serializable;
import java.util.ArrayList;

public class Activity_Total_Info implements Serializable {

        /**
         * total : 5
         * per_page : 15
         * current_page : 1
         * last_page : 1
         * data : [{"id":5,"operator_id":14,"name":"活动名称005","type":1,"pavilion_name":"展馆名称0045","address":"展馆名称005","view_count":0,"live_count":0,"start_time":1582534718,"end_time":1582564718,"deadline_time":1582462718,"head_img":"http://cdn.yck2046.com/uploads/20200116/1b5b0c2d18def6fb380feed96c753ec0.png","intro_img":["http://cdn.yck2046.com/uploads/20200116/1b5b0c2d18def6fb380feed96c753ec0.png"],"status":1,"desc":"活动描述","start_time_text":"2020-02-24 16:58","surplus_time_text":"","status_text":"已发布","type_text":"线上活动"},{"id":4,"operator_id":13,"name":"活动名称004","type":1,"pavilion_name":"展馆名称0043","address":"展馆名称004","view_count":0,"live_count":0,"start_time":1582534718,"end_time":1582564718,"deadline_time":1582462718,"head_img":"http://cdn.yck2046.com/uploads/20200116/1b5b0c2d18def6fb380feed96c753ec0.png","intro_img":["http://cdn.yck2046.com/uploads/20200116/1b5b0c2d18def6fb380feed96c753ec0.png"],"status":1,"desc":"活动描述","start_time_text":"2020-02-24 16:58","surplus_time_text":"","status_text":"已发布","type_text":"线上活动"},{"id":3,"operator_id":13,"name":"活动名称003","type":1,"pavilion_name":"展馆名称003","address":"展馆名称003","view_count":0,"live_count":0,"start_time":1582534718,"end_time":1582564718,"deadline_time":1582462718,"head_img":"http://cdn.yck2046.com/uploads/20200116/1b5b0c2d18def6fb380feed96c753ec0.png","intro_img":["http://cdn.yck2046.com/uploads/20200116/1b5b0c2d18def6fb380feed96c753ec0.png"],"status":1,"desc":"活动描述","start_time_text":"2020-02-24 16:58","surplus_time_text":"","status_text":"已发布","type_text":"线上活动"},{"id":2,"operator_id":13,"name":"活动名称002","type":1,"pavilion_name":"展馆名称002","address":"展馆名称003","view_count":0,"live_count":0,"start_time":1582534718,"end_time":1582564718,"deadline_time":1582462718,"head_img":"http://cdn.yck2046.com/uploads/20200116/1b5b0c2d18def6fb380feed96c753ec0.png","intro_img":["http://cdn.yck2046.com/uploads/20200116/1b5b0c2d18def6fb380feed96c753ec0.png"],"status":1,"desc":"活动描述","start_time_text":"2020-02-24 16:58","surplus_time_text":"","status_text":"已发布","type_text":"线上活动"},{"id":1,"operator_id":13,"name":"活动名称","type":1,"pavilion_name":"展馆名称","address":"展馆名称","view_count":0,"live_count":0,"start_time":1582534718,"end_time":1582564718,"deadline_time":1582462718,"head_img":"http://cdn.yck2046.com/uploads/20200116/1b5b0c2d18def6fb380feed96c753ec0.png","intro_img":["http://cdn.yck2046.com/uploads/20200116/1b5b0c2d18def6fb380feed96c753ec0.png"],"status":1,"desc":"活动描述","start_time_text":"2020-02-24 16:58","surplus_time_text":"","status_text":"已发布","type_text":"线上活动"}]
         */

        private int total;
        private int per_page;
        private int current_page;
        private int last_page;
        private ArrayList<Activity_Info> data;

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

        public ArrayList<Activity_Info> getData() {
            return data;
        }

        public void setData(ArrayList<Activity_Info> data) {
            this.data = data;
        }

    }
