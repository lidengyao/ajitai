package com.hxsoft.ajitai.model.bean;

import java.io.Serializable;

/**
 * Created by lidengyao on 2016-09-29 0029.
 */
public class A_Cuseraddress_Bean implements Serializable {


    /**
     * username : 收件人002
     * phone : 18810269001
     * addrcode : 20
     * address : 观山路1号
     * isdefault : 1
     */

    private Integer aid;
    private String username;
    private String phone;
    private Integer addrcode;

    private String address;
    private Integer isdefault;

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getAddrcode() {
        return addrcode;
    }

    public void setAddrcode(Integer addrcode) {
        this.addrcode = addrcode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getIsdefault() {
        return isdefault;
    }

    public void setIsdefault(Integer isdefault) {
        this.isdefault = isdefault;
    }
}
