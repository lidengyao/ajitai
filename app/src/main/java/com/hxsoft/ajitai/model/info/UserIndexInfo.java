package com.hxsoft.ajitai.model.info;

import java.io.Serializable;

public class UserIndexInfo implements Serializable {


    /**
     * userinfo : {"id":10,"type":"0","username":"15251435195","nickname":"修修","mobile":"15251435195","avatar":"http://cdn.yck2046.com/uploads/20200116/1b5b0c2d18def6fb380feed96c753ec0.png","gender":"1","birthday":null,"money":"0.00","withdraw_money":0}
     */

    private UserinfoBean userinfo;

    public UserinfoBean getUserinfo() {
        return userinfo;
    }

    public void setUserinfo(UserinfoBean userinfo) {
        this.userinfo = userinfo;
    }

    public static class UserinfoBean {
        /**
         * id : 10
         * type : 0
         * username : 15251435195
         * nickname : 修修
         * mobile : 15251435195
         * avatar : http://cdn.yck2046.com/uploads/20200116/1b5b0c2d18def6fb380feed96c753ec0.png
         * gender : 1
         * birthday : null
         * money : 0.00
         * withdraw_money : 0
         */

        private int id;
        private String type;
        private String username;
        private String nickname;
        private String mobile;
        private String avatar;
        private String gender;
        private String birthday;
        private String money;
        private int withdraw_money;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getNickname() {
            return nickname;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public String getMobile() {
            return mobile;
        }

        public void setMobile(String mobile) {
            this.mobile = mobile;
        }

        public String getAvatar() {
            return avatar;
        }

        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public String getBirthday() {
            return birthday;
        }

        public void setBirthday(String birthday) {
            this.birthday = birthday;
        }

        public String getMoney() {
            return money;
        }

        public void setMoney(String money) {
            this.money = money;
        }

        public int getWithdraw_money() {
            return withdraw_money;
        }

        public void setWithdraw_money(int withdraw_money) {
            this.withdraw_money = withdraw_money;
        }
    }

}
