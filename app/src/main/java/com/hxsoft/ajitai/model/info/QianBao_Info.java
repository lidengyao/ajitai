package com.hxsoft.ajitai.model.info;


import java.io.Serializable;

public class QianBao_Info implements Serializable {


    /**
     * id : null
     * uid : null
     * balance : 0.03
     * createTime : null
     * updateTime : null
     */

    private Integer id;
    private Integer uid;
    private Double balance;
    private String createTime;
    private String updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
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



