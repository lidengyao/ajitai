package com.hxsoft.ajitai.model.info;

import java.io.Serializable;

public class ListTaskDetailInfo implements Serializable {



    /**
     * id : 170
     * unitName : 连云港支队下属派出所企业004
     * createTime : 1574418394392
     * status : 2
     */

    private Integer id;
    private String unitName;
    private long createTime;
    private Integer status;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
