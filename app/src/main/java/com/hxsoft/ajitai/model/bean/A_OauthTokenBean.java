package com.hxsoft.ajitai.model.bean;

/**
 * Created by lidengyao on 2016-09-29 0029.
 */
public class A_OauthTokenBean {


    /**
     * deviceid : 15251435195-001
     * mobile : 15251435195
     * checknum : 534474
     * scope : client
     * client_id : app
     * client_secret : app
     * grant_type : phone_sms
     */

    private String deviceid;
    private String mobile;
    private String checknum;
    private String scope;
    private String client_id;
    private String client_secret;
    private String grant_type;

    public String getDeviceid() {
        return deviceid;
    }

    public void setDeviceid(String deviceid) {
        this.deviceid = deviceid;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getChecknum() {
        return checknum;
    }

    public void setChecknum(String checknum) {
        this.checknum = checknum;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getClient_id() {
        return client_id;
    }

    public void setClient_id(String client_id) {
        this.client_id = client_id;
    }

    public String getClient_secret() {
        return client_secret;
    }

    public void setClient_secret(String client_secret) {
        this.client_secret = client_secret;
    }

    public String getGrant_type() {
        return grant_type;
    }

    public void setGrant_type(String grant_type) {
        this.grant_type = grant_type;
    }
}
