package com.hxsoft.ajitai.model.bean;

import java.io.Serializable;

public class Basecode_Bean implements Serializable {

    /**
     * id : null
     * pid : null
     * lbcType : null
     * lbcTypeName : 直管单位
     * lbcKeyword : zhiguandanwei
     */

    private Integer id;
    private Integer pid;
    private Object lbcType;
    private String lbcTypeName;
    private String lbcKeyword;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Object getLbcType() {
        return lbcType;
    }

    public void setLbcType(Object lbcType) {
        this.lbcType = lbcType;
    }

    public String getLbcTypeName() {
        return lbcTypeName;
    }

    public void setLbcTypeName(String lbcTypeName) {
        this.lbcTypeName = lbcTypeName;
    }

    public String getLbcKeyword() {
        return lbcKeyword;
    }

    public void setLbcKeyword(String lbcKeyword) {
        this.lbcKeyword = lbcKeyword;
    }
}
