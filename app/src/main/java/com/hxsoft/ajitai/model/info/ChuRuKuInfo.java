package com.hxsoft.ajitai.model.info;


import java.io.Serializable;
import java.util.List;

public class ChuRuKuInfo implements Serializable {

    /**
     * id : 19
     * companyId : 10
     * companyName : 连云港第一剧毒处理公司1
     * warehouseId : 1
     * warehouseName : 仓库一号
     * outgoType : 2
     * outgoTypeName : 销售出库
     * orderId : null
     * recordStartTime : 0
     * recordEndTime : 0
     * outgoTime : 1557650591000
     * outgoDate : 2019.05.12 16:43:11
     * outgoMemberOne : 7
     * outgoMemberOneName : 测试2
     * outgoMemberTwo : 7
     * outgoMemberTwoName : 李登耀
     * outgoApprovaler : 5
     * outgoApprovalerName : 你好
     * isUnreal : 0
     * outgoBasis : 1
     * outgoBisisNumber : FDFFDDFCHH5555
     * outgoKeeperOne : 7
     * outgoKeeperOneName : 测试2
     * outgoKeeperTwo : 4
     * outgoKeeperTwoName : 李登耀
     * senceSuperviser : 1
     * senceSuperviserName : 蔡小双
     * createTime : 1557650665271
     * createTimeDate : 2019.05.12 16:44:25
     * updateTime : 1557650665271
     * remark : 铁傀儡看来
     * goodsDetailList : [{"id":19,"operateUnitId":10,"operateUnitName":"连云港第一剧毒处理公司1","twrId":19,"tpaId":null,"goodsId":1,"goodsName":"氯化钾","goodsUnit":"千克","goodsWeight":"525","minPacheageNumber":"585","barCodeNumber":"854","createTime":null,"createDate":"2019.05.12 16:44:25","updateTime":null,"updateDate":"2019.05.12 16:44:25","remark":null}]
     */

    private int id;
    private int companyId;
    private String companyName;
    private int warehouseId;
    private String warehouseName;
    private int outgoType;
    private String outgoTypeName;
    private int orderId;
    private String recordStartTime;
    private String recordEndTime;
    private long outgoTime;
    private String outgoDate;
    private int outgoMemberOne;
    private String outgoMemberOneName;
    private int outgoMemberTwo;
    private String outgoMemberTwoName;
    private int outgoApprovaler;
    private String outgoApprovalerName;
    private int isUnreal;
    private int outgoBasis;
    private String outgoBisisNumber;
    private int outgoKeeperOne;
    private String outgoKeeperOneName;
    private int outgoKeeperTwo;
    private String outgoKeeperTwoName;
    private int senceSuperviser;
    private String senceSuperviserName;
    private long createTime;
    private String createTimeDate;
    private long updateTime;
    private String remark;
    private List<GoodsDetailListBean> goodsDetailList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(int warehouseId) {
        this.warehouseId = warehouseId;
    }

    public String getWarehouseName() {
        return warehouseName;
    }

    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
    }

    public int getOutgoType() {
        return outgoType;
    }

    public void setOutgoType(int outgoType) {
        this.outgoType = outgoType;
    }

    public String getOutgoTypeName() {
        return outgoTypeName;
    }

    public void setOutgoTypeName(String outgoTypeName) {
        this.outgoTypeName = outgoTypeName;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getRecordStartTime() {
        return recordStartTime;
    }

    public void setRecordStartTime(String recordStartTime) {
        this.recordStartTime = recordStartTime;
    }

    public String getRecordEndTime() {
        return recordEndTime;
    }

    public void setRecordEndTime(String recordEndTime) {
        this.recordEndTime = recordEndTime;
    }

    public long getOutgoTime() {
        return outgoTime;
    }

    public void setOutgoTime(long outgoTime) {
        this.outgoTime = outgoTime;
    }

    public String getOutgoDate() {
        return outgoDate;
    }

    public void setOutgoDate(String outgoDate) {
        this.outgoDate = outgoDate;
    }

    public int getOutgoMemberOne() {
        return outgoMemberOne;
    }

    public void setOutgoMemberOne(int outgoMemberOne) {
        this.outgoMemberOne = outgoMemberOne;
    }

    public String getOutgoMemberOneName() {
        return outgoMemberOneName;
    }

    public void setOutgoMemberOneName(String outgoMemberOneName) {
        this.outgoMemberOneName = outgoMemberOneName;
    }

    public int getOutgoMemberTwo() {
        return outgoMemberTwo;
    }

    public void setOutgoMemberTwo(int outgoMemberTwo) {
        this.outgoMemberTwo = outgoMemberTwo;
    }

    public String getOutgoMemberTwoName() {
        return outgoMemberTwoName;
    }

    public void setOutgoMemberTwoName(String outgoMemberTwoName) {
        this.outgoMemberTwoName = outgoMemberTwoName;
    }

    public int getOutgoApprovaler() {
        return outgoApprovaler;
    }

    public void setOutgoApprovaler(int outgoApprovaler) {
        this.outgoApprovaler = outgoApprovaler;
    }

    public String getOutgoApprovalerName() {
        return outgoApprovalerName;
    }

    public void setOutgoApprovalerName(String outgoApprovalerName) {
        this.outgoApprovalerName = outgoApprovalerName;
    }

    public int getIsUnreal() {
        return isUnreal;
    }

    public void setIsUnreal(int isUnreal) {
        this.isUnreal = isUnreal;
    }

    public int getOutgoBasis() {
        return outgoBasis;
    }

    public void setOutgoBasis(int outgoBasis) {
        this.outgoBasis = outgoBasis;
    }

    public String getOutgoBisisNumber() {
        return outgoBisisNumber;
    }

    public void setOutgoBisisNumber(String outgoBisisNumber) {
        this.outgoBisisNumber = outgoBisisNumber;
    }

    public int getOutgoKeeperOne() {
        return outgoKeeperOne;
    }

    public void setOutgoKeeperOne(int outgoKeeperOne) {
        this.outgoKeeperOne = outgoKeeperOne;
    }

    public String getOutgoKeeperOneName() {
        return outgoKeeperOneName;
    }

    public void setOutgoKeeperOneName(String outgoKeeperOneName) {
        this.outgoKeeperOneName = outgoKeeperOneName;
    }

    public int getOutgoKeeperTwo() {
        return outgoKeeperTwo;
    }

    public void setOutgoKeeperTwo(int outgoKeeperTwo) {
        this.outgoKeeperTwo = outgoKeeperTwo;
    }

    public String getOutgoKeeperTwoName() {
        return outgoKeeperTwoName;
    }

    public void setOutgoKeeperTwoName(String outgoKeeperTwoName) {
        this.outgoKeeperTwoName = outgoKeeperTwoName;
    }

    public int getSenceSuperviser() {
        return senceSuperviser;
    }

    public void setSenceSuperviser(int senceSuperviser) {
        this.senceSuperviser = senceSuperviser;
    }

    public String getSenceSuperviserName() {
        return senceSuperviserName;
    }

    public void setSenceSuperviserName(String senceSuperviserName) {
        this.senceSuperviserName = senceSuperviserName;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public String getCreateTimeDate() {
        return createTimeDate;
    }

    public void setCreateTimeDate(String createTimeDate) {
        this.createTimeDate = createTimeDate;
    }

    public long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(long updateTime) {
        this.updateTime = updateTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public List<GoodsDetailListBean> getGoodsDetailList() {
        return goodsDetailList;
    }

    public void setGoodsDetailList(List<GoodsDetailListBean> goodsDetailList) {
        this.goodsDetailList = goodsDetailList;
    }

    public static class GoodsDetailListBean {
        /**
         * id : 19
         * operateUnitId : 10
         * operateUnitName : 连云港第一剧毒处理公司1
         * twrId : 19
         * tpaId : null
         * goodsId : 1
         * goodsName : 氯化钾
         * goodsUnit : 千克
         * goodsWeight : 525
         * minPacheageNumber : 585
         * barCodeNumber : 854
         * createTime : null
         * createDate : 2019.05.12 16:44:25
         * updateTime : null
         * updateDate : 2019.05.12 16:44:25
         * remark : null
         */

        private int id;
        private int operateUnitId;
        private String operateUnitName;
        private int twrId;
        private int tpaId;
        private int goodsId;
        private String goodsName;
        private String goodsUnit;
        private String goodsWeight;
        private String minPacheageNumber;
        private String barCodeNumber;
        private String createTime;
        private String createDate;
        private String updateTime;
        private String updateDate;
        private String remark;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getOperateUnitId() {
            return operateUnitId;
        }

        public void setOperateUnitId(int operateUnitId) {
            this.operateUnitId = operateUnitId;
        }

        public String getOperateUnitName() {
            return operateUnitName;
        }

        public void setOperateUnitName(String operateUnitName) {
            this.operateUnitName = operateUnitName;
        }

        public int getTwrId() {
            return twrId;
        }

        public void setTwrId(int twrId) {
            this.twrId = twrId;
        }

        public int getTpaId() {
            return tpaId;
        }

        public void setTpaId(int tpaId) {
            this.tpaId = tpaId;
        }

        public int getGoodsId() {
            return goodsId;
        }

        public void setGoodsId(int goodsId) {
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

        public String getCreateTime() {
            return createTime;
        }

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        public String getCreateDate() {
            return createDate;
        }

        public void setCreateDate(String createDate) {
            this.createDate = createDate;
        }

        public String getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(String updateTime) {
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
}

