package com.hxsoft.ajitai.model.info;

import java.io.Serializable;

public class ToxicWhouseGoodsDetail implements Serializable {


    private Integer id;

    /**
     * 操作单位id
     */
    private Integer operateUnitId;

    /**
     * 操作单位名称
     */
    private String operateUnitName;

    /**
     * 出入库记录id
     */
    private Integer twrId;

    /**
     * 证件id
     * 如果涉及到证件，比如购买证
     */
    private Integer tpaId;

    /**
     * 物品id
     */
    private Integer goodsId;

    /**
     * 物品名
     */
    private String goodsName;

    /**
     * 物品计量单位
     */
    private String goodsUnit;

    /**
     * 物品数量
     */
    private String goodsWeight;

    /**
     * 最小包装数量
     */
    private String minPacheageNumber;

    /**
     * 条码数量
     */
    private String barCodeNumber;

    /**
     * 数据添加时间
     */
    private Long createTime;

    /**
     * 数据添加时间格式化
     */
    private String createDate;

    private Long updateTime;

    private String updateDate;
    /**
     * 备注
     */
    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOperateUnitId() {
        return operateUnitId;
    }

    public void setOperateUnitId(Integer operateUnitId) {
        this.operateUnitId = operateUnitId;
    }

    public String getOperateUnitName() {
        return operateUnitName;
    }

    public void setOperateUnitName(String operateUnitName) {
        this.operateUnitName = operateUnitName;
    }

    public Integer getTwrId() {
        return twrId;
    }

    public void setTwrId(Integer twrId) {
        this.twrId = twrId;
    }

    public Integer getTpaId() {
        return tpaId;
    }

    public void setTpaId(Integer tpaId) {
        this.tpaId = tpaId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsUnit() {
        return goodsUnit;
    }

    public void setGoodsUnit(String goodsUnit) {
        this.goodsUnit = goodsUnit;
    }

    public String getGoodsWeight() {
        return goodsWeight;
    }

    public void setGoodsWeight(String goodsWeight) {
        this.goodsWeight = goodsWeight;
    }

    public String getMinPacheageNumber() {
        return minPacheageNumber;
    }

    public void setMinPacheageNumber(String minPacheageNumber) {
        this.minPacheageNumber = minPacheageNumber;
    }

    public String getBarCodeNumber() {
        return barCodeNumber;
    }

    public void setBarCodeNumber(String barCodeNumber) {
        this.barCodeNumber = barCodeNumber;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
