package com.hxsoft.ajitai.model.info;


import java.io.Serializable;
import java.util.ArrayList;

public class CreateCconscious_Bean implements Serializable {


    /**
     * address : string
     * bankaccount : string
     * bankname : string
     * conferUid : 0
     * goodstype : 0
     * identifyno : string
     * isFormCart : 0
     * isNeedReceipt : 0
     * phone : string
     * productArrayList : [{"goodsid":"string","num":0,"price":0,"remark":"string"}]
     * receiptBelong : 0
     * receiptReceiverEmail : string
     * receiptReceiverMobile : string
     * receiptType : 0
     * shippingReceiverAddress : string
     * shippingReceiverMobile : string
     * shippingReceiverName : string
     * unitname : string
     */

    private Double payment;
    private String address;
    private String bankaccount;
    private String bankname;
    private Integer conferUid;
    private Integer goodstype;
    private String identifyno;
    private Integer isFormCart;
    private Integer isNeedReceipt;
    private String phone;
    private Integer receiptBelong;
    private String receiptReceiverEmail;
    private String receiptReceiverMobile;
    private Integer receiptType;
    private String shippingReceiverAddress;
    private String shippingReceiverMobile;
    private String shippingReceiverName;
    private String unitname;
    private ArrayList<ProductArrayListBean> productList;


    public Double getPayment() {
        return payment;
    }

    public void setPayment(Double payment) {
        this.payment = payment;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBankaccount() {
        return bankaccount;
    }

    public void setBankaccount(String bankaccount) {
        this.bankaccount = bankaccount;
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    public Integer getConferUid() {
        return conferUid;
    }

    public void setConferUid(Integer conferUid) {
        this.conferUid = conferUid;
    }

    public Integer getGoodstype() {
        return goodstype;
    }

    public void setGoodstype(Integer goodstype) {
        this.goodstype = goodstype;
    }

    public String getIdentifyno() {
        return identifyno;
    }

    public void setIdentifyno(String identifyno) {
        this.identifyno = identifyno;
    }

    public Integer getIsFormCart() {
        return isFormCart;
    }

    public void setIsFormCart(Integer isFormCart) {
        this.isFormCart = isFormCart;
    }

    public Integer getIsNeedReceipt() {
        return isNeedReceipt;
    }

    public void setIsNeedReceipt(Integer isNeedReceipt) {
        this.isNeedReceipt = isNeedReceipt;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getReceiptBelong() {
        return receiptBelong;
    }

    public void setReceiptBelong(Integer receiptBelong) {
        this.receiptBelong = receiptBelong;
    }

    public String getReceiptReceiverEmail() {
        return receiptReceiverEmail;
    }

    public void setReceiptReceiverEmail(String receiptReceiverEmail) {
        this.receiptReceiverEmail = receiptReceiverEmail;
    }

    public String getReceiptReceiverMobile() {
        return receiptReceiverMobile;
    }

    public void setReceiptReceiverMobile(String receiptReceiverMobile) {
        this.receiptReceiverMobile = receiptReceiverMobile;
    }

    public Integer getReceiptType() {
        return receiptType;
    }

    public void setReceiptType(Integer receiptType) {
        this.receiptType = receiptType;
    }

    public String getShippingReceiverAddress() {
        return shippingReceiverAddress;
    }

    public void setShippingReceiverAddress(String shippingReceiverAddress) {
        this.shippingReceiverAddress = shippingReceiverAddress;
    }

    public String getShippingReceiverMobile() {
        return shippingReceiverMobile;
    }

    public void setShippingReceiverMobile(String shippingReceiverMobile) {
        this.shippingReceiverMobile = shippingReceiverMobile;
    }

    public String getShippingReceiverName() {
        return shippingReceiverName;
    }

    public void setShippingReceiverName(String shippingReceiverName) {
        this.shippingReceiverName = shippingReceiverName;
    }

    public String getUnitname() {
        return unitname;
    }

    public void setUnitname(String unitname) {
        this.unitname = unitname;
    }

    public ArrayList<ProductArrayListBean> getProductArrayList() {
        return productList;
    }

    public void setProductArrayList(ArrayList<ProductArrayListBean> productArrayList) {
        this.productList = productArrayList;
    }

    public static class ProductArrayListBean {
        /**
         * goodsid : string
         * num : 0
         * price : 0
         * remark : string
         */

        private String goodsid;
        private Integer num;
        private Double price;
        private String remark;

        public String getGoodsid() {
            return goodsid;
        }

        public void setGoodsid(String goodsid) {
            this.goodsid = goodsid;
        }

        public Integer getNum() {
            return num;
        }

        public void setNum(Integer num) {
            this.num = num;
        }

        public Double getPrice() {
            return price;
        }

        public void setPrice(Double price) {
            this.price = price;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }
    }
}



