package com.hxsoft.ajitai.model.info;


import java.io.Serializable;
import java.util.List;

public class CheLiangJianKongInfo implements Serializable {

    /**
     * id : 5
     * saleUnitName : 连云港第一剧毒处理公司1
     * unitName : 连云港第一剧毒处理公司1
     * goodsName : C4
     * driverName : 蔡健雅
     * vehicleNumber : 苏G1234P
     * driverTel : 1805194590
     * transportStartTime : 1559115472000
     * transportEndPlace : 上海市宝山区大场镇锦秋路50
     * startLongtitude : 120.27871253957169
     * startLatitude : 31.588057342008806
     * endLongtitude : 121.40352235170998
     * endLatitude : 31.319140454513114
     * goodsNames : ["C4"]
     */

    private int id;
    private String saleUnitName;
    private String unitName;
    private String goodsName;
    private String driverName;
    private String vehicleNumber;
    private String driverTel;
    private long transportStartTime;
    private String transportEndPlace;
    private String startLongtitude;
    private String startLatitude;
    private String endLongtitude;
    private String endLatitude;
    private List<String> goodsNames;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSaleUnitName() {
        return saleUnitName;
    }

    public void setSaleUnitName(String saleUnitName) {
        this.saleUnitName = saleUnitName;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getDriverTel() {
        return driverTel;
    }

    public void setDriverTel(String driverTel) {
        this.driverTel = driverTel;
    }

    public long getTransportStartTime() {
        return transportStartTime;
    }

    public void setTransportStartTime(long transportStartTime) {
        this.transportStartTime = transportStartTime;
    }

    public String getTransportEndPlace() {
        return transportEndPlace;
    }

    public void setTransportEndPlace(String transportEndPlace) {
        this.transportEndPlace = transportEndPlace;
    }

    public String getStartLongtitude() {
        return startLongtitude;
    }

    public void setStartLongtitude(String startLongtitude) {
        this.startLongtitude = startLongtitude;
    }

    public String getStartLatitude() {
        return startLatitude;
    }

    public void setStartLatitude(String startLatitude) {
        this.startLatitude = startLatitude;
    }

    public String getEndLongtitude() {
        return endLongtitude;
    }

    public void setEndLongtitude(String endLongtitude) {
        this.endLongtitude = endLongtitude;
    }

    public String getEndLatitude() {
        return endLatitude;
    }

    public void setEndLatitude(String endLatitude) {
        this.endLatitude = endLatitude;
    }

    public List<String> getGoodsNames() {
        return goodsNames;
    }

    public void setGoodsNames(List<String> goodsNames) {
        this.goodsNames = goodsNames;
    }
}

