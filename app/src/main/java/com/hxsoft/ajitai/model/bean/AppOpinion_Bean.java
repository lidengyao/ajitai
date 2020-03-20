package com.hxsoft.ajitai.model.bean;

import java.io.Serializable;

public class AppOpinion_Bean implements Serializable {

//    @ApiModelProperty("数据id")
    private Integer id;

//    @ApiModelProperty("用户id")
    private Integer userId;

//    @ApiModelProperty("意见内容")
    private String content;

//    @ApiModelProperty("创建时间")
    private Long createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }
}
