package com.hxsoft.ajitai.model.info;

import java.io.Serializable;
import java.util.ArrayList;

public class SpreadList_Total_Info implements Serializable {


    /**
     * total : 1
     * per_page : 10
     * current_page : 1
     * last_page : 1
     * data : [{"id":5,"user_id":9,"activity_id":1,"parent_id":0,"obtain_integral":0,"obtain_money":"0.00","status":0,"activity":{"id":1,"operator_id":5,"name":"活动名称","type":1,"pavilion_name":"展馆名称","address":"展馆名称","view_count":0,"live_count":0,"start_time":1585701568,"end_time":1586047168,"deadline_time":1582462718,"head_img":"http://47.92.221.41/image/zhiboyi.png","intro_img":["http://cdn.yck2046.com/uploads/20200116/1b5b0c2d18def6fb380feed96c753ec0.png"],"status":0,"desc":"活动描述","start_time_text":"2020-04-01 08:39","surplus_time_text":"23天17时31分10秒","status_text":"未发布","type_text":"线上活动"}}]
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

    public static class DataBean implements  Serializable{
        /**
         * id : 5
         * user_id : 9
         * activity_id : 1
         * parent_id : 0
         * obtain_integral : 0
         * obtain_money : 0.00
         * status : 0
         * activity : {"id":1,"operator_id":5,"name":"活动名称","type":1,"pavilion_name":"展馆名称","address":"展馆名称","view_count":0,"live_count":0,"start_time":1585701568,"end_time":1586047168,"deadline_time":1582462718,"head_img":"http://47.92.221.41/image/zhiboyi.png","intro_img":["http://cdn.yck2046.com/uploads/20200116/1b5b0c2d18def6fb380feed96c753ec0.png"],"status":0,"desc":"活动描述","start_time_text":"2020-04-01 08:39","surplus_time_text":"23天17时31分10秒","status_text":"未发布","type_text":"线上活动"}
         */

        private int id;
        private int user_id;
        private int activity_id;
        private int parent_id;
        private int obtain_integral;
        private String obtain_money;
        private int status;
        private ActivityBean activity;

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

        public int getParent_id() {
            return parent_id;
        }

        public void setParent_id(int parent_id) {
            this.parent_id = parent_id;
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

        public ActivityBean getActivity() {
            return activity;
        }

        public void setActivity(ActivityBean activity) {
            this.activity = activity;
        }

        public static class ActivityBean implements Serializable{
            /**
             * id : 1
             * operator_id : 5
             * name : 活动名称
             * type : 1
             * pavilion_name : 展馆名称
             * address : 展馆名称
             * view_count : 0
             * live_count : 0
             * start_time : 1585701568
             * end_time : 1586047168
             * deadline_time : 1582462718
             * head_img : http://47.92.221.41/image/zhiboyi.png
             * intro_img : ["http://cdn.yck2046.com/uploads/20200116/1b5b0c2d18def6fb380feed96c753ec0.png"]
             * status : 0
             * desc : 活动描述
             * start_time_text : 2020-04-01 08:39
             * surplus_time_text : 23天17时31分10秒
             * status_text : 未发布
             * type_text : 线上活动
             */

            private int id;
            private int operator_id;
            private String name;
            private int type;
            private String pavilion_name;
            private String address;
            private int view_count;
            private int live_count;
            private int start_time;
            private int end_time;
            private int deadline_time;
            private String head_img;
            private int status;
            private String desc;
            private String start_time_text;
            private String surplus_time_text;
            private String status_text;
            private String type_text;
            private ArrayList<String> intro_img;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getOperator_id() {
                return operator_id;
            }

            public void setOperator_id(int operator_id) {
                this.operator_id = operator_id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public String getPavilion_name() {
                return pavilion_name;
            }

            public void setPavilion_name(String pavilion_name) {
                this.pavilion_name = pavilion_name;
            }

            public String getAddress() {
                return address;
            }

            public void setAddress(String address) {
                this.address = address;
            }

            public int getView_count() {
                return view_count;
            }

            public void setView_count(int view_count) {
                this.view_count = view_count;
            }

            public int getLive_count() {
                return live_count;
            }

            public void setLive_count(int live_count) {
                this.live_count = live_count;
            }

            public int getStart_time() {
                return start_time;
            }

            public void setStart_time(int start_time) {
                this.start_time = start_time;
            }

            public int getEnd_time() {
                return end_time;
            }

            public void setEnd_time(int end_time) {
                this.end_time = end_time;
            }

            public int getDeadline_time() {
                return deadline_time;
            }

            public void setDeadline_time(int deadline_time) {
                this.deadline_time = deadline_time;
            }

            public String getHead_img() {
                return head_img;
            }

            public void setHead_img(String head_img) {
                this.head_img = head_img;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
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

            public ArrayList<String> getIntro_img() {
                return intro_img;
            }

            public void setIntro_img(ArrayList<String> intro_img) {
                this.intro_img = intro_img;
            }
        }
    }
}
