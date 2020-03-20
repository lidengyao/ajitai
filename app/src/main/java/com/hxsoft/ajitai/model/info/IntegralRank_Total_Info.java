package com.hxsoft.ajitai.model.info;

import java.io.Serializable;
import java.util.List;

public class IntegralRank_Total_Info implements Serializable {


    /**
     * own_rank : 10
     * rank : {"total":4,"per_page":15,"current_page":1,"last_page":1,"data":[{"id":1,"user_id":12,"activity_id":1,"obtain_integral":0,"obtain_money":"0.00","status":0,"promoter_parent_id":0,"relationship_path":"","brand_id":0,"username":"13062818820","avatar":"http://cdn.yck2046.com/uploads/20200116/1b5b0c2d18def6fb380feed96c753ec0.png","url":"/u/12"},{"id":4,"user_id":10,"activity_id":1,"obtain_integral":0,"obtain_money":"0.00","status":0,"promoter_parent_id":0,"relationship_path":"","brand_id":0,"username":"15251435195","avatar":"http:/cdn.yck2046.com/upload/6A3D1287-29D4-4126-B91E-940AE26CD9FC.png","url":"/u/10"},{"id":5,"user_id":9,"activity_id":1,"obtain_integral":0,"obtain_money":"0.00","status":0,"promoter_parent_id":0,"relationship_path":"","brand_id":0,"username":"u9","avatar":"http://cdn.yck2046.com/uploads/20200116/1b5b0c2d18def6fb380feed96c753ec0.png","url":"/u/9"},{"id":6,"user_id":14,"activity_id":1,"obtain_integral":0,"obtain_money":"0.00","status":0,"promoter_parent_id":0,"relationship_path":"","brand_id":0,"username":"18652646857","avatar":"http://cdn.yck2046.com/uploads/20200116/1b5b0c2d18def6fb380feed96c753ec0.png","url":"/u/14"}]}
     */

    private int own_rank;
    private RankBean rank;

    public int getOwn_rank() {
        return own_rank;
    }

    public void setOwn_rank(int own_rank) {
        this.own_rank = own_rank;
    }

    public RankBean getRank() {
        return rank;
    }

    public void setRank(RankBean rank) {
        this.rank = rank;
    }

    public static class RankBean {
        /**
         * total : 4
         * per_page : 15
         * current_page : 1
         * last_page : 1
         * data : [{"id":1,"user_id":12,"activity_id":1,"obtain_integral":0,"obtain_money":"0.00","status":0,"promoter_parent_id":0,"relationship_path":"","brand_id":0,"username":"13062818820","avatar":"http://cdn.yck2046.com/uploads/20200116/1b5b0c2d18def6fb380feed96c753ec0.png","url":"/u/12"},{"id":4,"user_id":10,"activity_id":1,"obtain_integral":0,"obtain_money":"0.00","status":0,"promoter_parent_id":0,"relationship_path":"","brand_id":0,"username":"15251435195","avatar":"http:/cdn.yck2046.com/upload/6A3D1287-29D4-4126-B91E-940AE26CD9FC.png","url":"/u/10"},{"id":5,"user_id":9,"activity_id":1,"obtain_integral":0,"obtain_money":"0.00","status":0,"promoter_parent_id":0,"relationship_path":"","brand_id":0,"username":"u9","avatar":"http://cdn.yck2046.com/uploads/20200116/1b5b0c2d18def6fb380feed96c753ec0.png","url":"/u/9"},{"id":6,"user_id":14,"activity_id":1,"obtain_integral":0,"obtain_money":"0.00","status":0,"promoter_parent_id":0,"relationship_path":"","brand_id":0,"username":"18652646857","avatar":"http://cdn.yck2046.com/uploads/20200116/1b5b0c2d18def6fb380feed96c753ec0.png","url":"/u/14"}]
         */

        private int total;
        private int per_page;
        private int current_page;
        private int last_page;
        private List<DataBean> data;

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

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class DataBean {
            /**
             * id : 1
             * user_id : 12
             * activity_id : 1
             * obtain_integral : 0
             * obtain_money : 0.00
             * status : 0
             * promoter_parent_id : 0
             * relationship_path :
             * brand_id : 0
             * username : 13062818820
             * avatar : http://cdn.yck2046.com/uploads/20200116/1b5b0c2d18def6fb380feed96c753ec0.png
             * url : /u/12
             */

            private int id;
            private int user_id;
            private int activity_id;
            private int obtain_integral;
            private String obtain_money;
            private int status;
            private int promoter_parent_id;
            private String relationship_path;
            private int brand_id;
            private String username;
            private String avatar;
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

            public int getPromoter_parent_id() {
                return promoter_parent_id;
            }

            public void setPromoter_parent_id(int promoter_parent_id) {
                this.promoter_parent_id = promoter_parent_id;
            }

            public String getRelationship_path() {
                return relationship_path;
            }

            public void setRelationship_path(String relationship_path) {
                this.relationship_path = relationship_path;
            }

            public int getBrand_id() {
                return brand_id;
            }

            public void setBrand_id(int brand_id) {
                this.brand_id = brand_id;
            }

            public String getUsername() {
                return username;
            }

            public void setUsername(String username) {
                this.username = username;
            }

            public String getAvatar() {
                return avatar;
            }

            public void setAvatar(String avatar) {
                this.avatar = avatar;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }
        }
    }
}


