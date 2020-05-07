package com.hxsoft.ajitai.model.bean;

import java.io.Serializable;

/**
 * Created by lidengyao on 2016-09-29 0029.
 */
public class A_Cuserreceipt_Bean implements Serializable {

    /**
     * rid : 3
     * uid : 1
     * unitname : 无锡弘晓软件有限公司123
     * identifyno : 91320202MA1MTDC92H2
     * address : 无锡新吴区观山路1号316
     * phone : 18952460824
     * bankname : 中国建设银行雪浪支行-2
     * bankaccount : 3205016174800000085
     * createTime : 2020-04-30 16:45:19
     * updateTime : null
     */

    private Integer rid;
    private Integer uid;
    private String unitname;
    private String identifyno;
    private String address;
    private String phone;
    private String bankname;
    private String bankaccount;
    private String createTime;
    private String updateTime;

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUnitname() {
        return unitname;
    }

    public void setUnitname(String unitname) {
        this.unitname = unitname;
    }

    public String getIdentifyno() {
        return identifyno;
    }

    public void setIdentifyno(String identifyno) {
        this.identifyno = identifyno;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    public String getBankaccount() {
        return bankaccount;
    }

    public void setBankaccount(String bankaccount) {
        this.bankaccount = bankaccount;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }
}
