package com.hxsoft.ajitai.model.info;

import java.io.Serializable;

public class Banner_Info implements Serializable {


    //@ApiModelProperty("数据id")
    private Integer id;

    //@ApiModelProperty("图片地址")
    private String imgUrl;

    //@ApiModelProperty("图片名称")
    private String imgName;

    //@ApiModelProperty("排序")
    private Integer sort;

    //@ApiModelProperty("状态")
    private Integer status;

    //ApiModelProperty("创建时间")
    private Long createTime;

    //@ApiModelProperty("修改时间")
    private Long updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getImgName() {
        return imgName;
    }

    public void setImgName(String imgName) {
        this.imgName = imgName;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }
}
