package com.hxsoft.ajitai.model.bean;

import java.io.Serializable;

public class UserIndexBean implements Serializable {


    private String nickname;
    private String avatar;
    private String birthday;
    private String gender;
    private String tenement_name;
    private String tenement_address;

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getTenement_name() {
        return tenement_name;
    }

    public void setTenement_name(String tenement_name) {
        this.tenement_name = tenement_name;
    }

    public String getTenement_address() {
        return tenement_address;
    }

    public void setTenement_address(String tenement_address) {
        this.tenement_address = tenement_address;
    }
}
