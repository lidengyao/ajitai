package com.hxsoft.ajitai.model.bean;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by lidengyao on 2016-09-29 0029.
 */
public class A_UserUpdatecurrent_Bean implements Serializable {


    /**
     * address : 0
     * addressinfo : string
     * area : 0
     * avatar : string
     * city : 0
     * createTime : 2020-05-22T00:57:46.380Z
     * deptId : 0
     * email : string
     * identify : string
     * nickname : string
     * oldpassword : string
     * password : string
     * phone : string
     * province : 0
     * role : [0]
     * sex : 0
     * udesc : string
     * uid : 0
     * updateTime : 2020-05-22T00:57:46.381Z
     * usertype : 0
     */

    private Integer address;
    private String addressinfo;
    private Integer area;
    private String avatar;
    private Integer city;
    private String createTime;
    private Integer deptId;
    private String email;
    private String identify;
    private String nickname;
    private String oldpassword;
    private String password;
    private String phone;
    private Integer province;
    private Integer sex;
    private String udesc;
    private Integer uid;
    private String updateTime;
    private Integer usertype;
    private ArrayList<Integer> role;

    public Integer getAddress() {
        return address;
    }

    public void setAddress(Integer address) {
        this.address = address;
    }

    public String getAddressinfo() {
        return addressinfo;
    }

    public void setAddressinfo(String addressinfo) {
        this.addressinfo = addressinfo;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Integer getCity() {
        return city;
    }

    public void setCity(Integer city) {
        this.city = city;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdentify() {
        return identify;
    }

    public void setIdentify(String identify) {
        this.identify = identify;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getOldpassword() {
        return oldpassword;
    }

    public void setOldpassword(String oldpassword) {
        this.oldpassword = oldpassword;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getProvince() {
        return province;
    }

    public void setProvince(Integer province) {
        this.province = province;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getUdesc() {
        return udesc;
    }

    public void setUdesc(String udesc) {
        this.udesc = udesc;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getUsertype() {
        return usertype;
    }

    public void setUsertype(Integer usertype) {
        this.usertype = usertype;
    }

    public ArrayList<Integer> getRole() {
        return role;
    }

    public void setRole(ArrayList<Integer> role) {
        this.role = role;
    }
}
