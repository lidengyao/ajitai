package com.hxsoft.ajitai.model.bean;

import java.io.Serializable;

/**
 * Created by lidengyao on 2016-09-29 0029.
 */
public class A_UserUpdatecurrent_Bean implements Serializable {

    /**
     * nickname : 测试
     * phone : 18810269616
     * udesc : 个人介绍
     * avatar : asdfasdfsadfasdf
     * address : 30
     * sex : 2
     */

    private String nickname;
    private String phone;
    private String udesc;
    private String avatar;
    private int address;
    private int sex;

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUdesc() {
        return udesc;
    }

    public void setUdesc(String udesc) {
        this.udesc = udesc;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public int getAddress() {
        return address;
    }

    public void setAddress(int address) {
        this.address = address;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }
}
