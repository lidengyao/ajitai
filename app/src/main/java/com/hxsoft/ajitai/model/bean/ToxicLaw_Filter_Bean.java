package com.hxsoft.ajitai.model.bean;

import java.io.Serializable;

/*
法律法规
 */
public class ToxicLaw_Filter_Bean implements Serializable {

    //    @ApiModelProperty("法律法规id")
    private Integer id;

    //    @ApiModelProperty("法律法规标题")
    private String title;

    //    @ApiModelProperty("发布人id")
    private Integer publisher;

    //    @ApiModelProperty("发布时间")
    private Long publishTime;

    //    @ApiModelProperty("发布时间转成date类型")
    private String pbTime;

    //    @ApiModelProperty("关键字")
    private String keywords;

    //    @ApiModelProperty("创建时间")
    private Long createTime;

    //    @ApiModelProperty("修改时间")
    private Long updateTime;

    //    @ApiModelProperty("法律法规内容")
    private String content;

    //    @ApiModelProperty("搜索开始时间")
    private Long searchStartTime;

    //    @ApiModelProperty("搜索结束时间")
    private Long searchEndTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPublisher() {
        return publisher;
    }

    public void setPublisher(Integer publisher) {
        this.publisher = publisher;
    }

    public Long getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Long publishTime) {
        this.publishTime = publishTime;
    }

    public String getPbTime() {
        return pbTime;
    }

    public void setPbTime(String pbTime) {
        this.pbTime = pbTime;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getSearchStartTime() {
        return searchStartTime;
    }

    public void setSearchStartTime(Long searchStartTime) {
        this.searchStartTime = searchStartTime;
    }

    public Long getSearchEndTime() {
        return searchEndTime;
    }

    public void setSearchEndTime(Long searchEndTime) {
        this.searchEndTime = searchEndTime;
    }
}
