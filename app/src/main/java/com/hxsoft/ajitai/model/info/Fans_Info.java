package com.hxsoft.ajitai.model.info;


import java.io.Serializable;
import java.util.ArrayList;

public class Fans_Info implements Serializable {

        /**
         * total : 2
         * per_page : 10
         * current_page : 1
         * last_page : 1
         * data : [{"id":6,"brand_id":14,"user":{"id":10,"username":"15251435195","avatar":"http://cdn.yck2046.com/uploads/20200116/1b5b0c2d18def6fb380feed96c753ec0.png","url":"/u/10"}},{"id":10,"brand_id":14,"user":{"id":9,"username":"u9","avatar":"http://cdn.yck2046.com/uploads/20200116/1b5b0c2d18def6fb380feed96c753ec0.png","url":"/u/9"}}]
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

        public static class DataBean implements Serializable {
            /**
             * id : 6
             * brand_id : 14
             * user : {"id":10,"username":"15251435195","avatar":"http://cdn.yck2046.com/uploads/20200116/1b5b0c2d18def6fb380feed96c753ec0.png","url":"/u/10"}
             */

            private int id;
            private int brand_id;
            private UserBean user;

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

            public UserBean getUser() {
                return user;
            }

            public void setUser(UserBean user) {
                this.user = user;
            }

            public static class UserBean {
                /**
                 * id : 10
                 * username : 15251435195
                 * avatar : http://cdn.yck2046.com/uploads/20200116/1b5b0c2d18def6fb380feed96c753ec0.png
                 * url : /u/10
                 */

                private int id;
                private String username;
                private String avatar;
                private String url;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
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




