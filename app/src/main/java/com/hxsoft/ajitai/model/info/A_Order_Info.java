package com.hxsoft.ajitai.model.info;


import java.io.Serializable;
import java.util.ArrayList;

public class A_Order_Info implements Serializable {

    /**
     * orderNo : 14e3393b-ad7f-4486-af7c-73cc002807e9
     * status : 0
     * shippingReceiverName : null
     * shippingReceiverMobile : null
     * shippingReceiverAddress : null
     * createTime : 2020-05-08 13:17:55
     * payment : 30
     * isNeedReceipt : 0
     * productList : [{"num":1,"title":"XXX书ww","image":"https://resource.smartisan.com/resource/1a4b3d159317fe26377b2db040aaa2dc.jpg","price":10,"totalFee":10},{"num":2,"title":"yyy书yyy","image":"https://resource.smartisan.com/resource/1a4b3d159317fe26377b2db040aaa2dc.jpg","price":10,"totalFee":20}]
     * time : 2020-05-08 13:17:55
     * goodsNum : null
     */

    private String orderNo;
    private Integer status;
    private String shippingReceiverName;
    private String shippingReceiverMobile;
    private String shippingReceiverAddress;
    private String createTime;
    private Double payment;
    private Integer isNeedReceipt;
    private String time;
    private Integer goodsNum;
    private ArrayList<ProductListBean> productList;
    private Integer goodstype;

    public Integer getGoodstype() {
        return goodstype;
    }

    public void setGoodstype(Integer goodstype) {
        this.goodstype = goodstype;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getShippingReceiverName() {
        return shippingReceiverName;
    }

    public void setShippingReceiverName(String shippingReceiverName) {
        this.shippingReceiverName = shippingReceiverName;
    }

    public String getShippingReceiverMobile() {
        return shippingReceiverMobile;
    }

    public void setShippingReceiverMobile(String shippingReceiverMobile) {
        this.shippingReceiverMobile = shippingReceiverMobile;
    }

    public String getShippingReceiverAddress() {
        return shippingReceiverAddress;
    }

    public void setShippingReceiverAddress(String shippingReceiverAddress) {
        this.shippingReceiverAddress = shippingReceiverAddress;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Double getPayment() {
        return payment;
    }

    public void setPayment(Double payment) {
        this.payment = payment;
    }

    public Integer getIsNeedReceipt() {
        return isNeedReceipt;
    }

    public void setIsNeedReceipt(Integer isNeedReceipt) {
        this.isNeedReceipt = isNeedReceipt;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Integer getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(Integer goodsNum) {
        this.goodsNum = goodsNum;
    }

    public ArrayList<ProductListBean> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<ProductListBean> productList) {
        this.productList = productList;
    }

    public static class ProductListBean implements Serializable {
        /**
         * num : 1
         * title : XXX书ww
         * image : https://resource.smartisan.com/resource/1a4b3d159317fe26377b2db040aaa2dc.jpg
         * price : 10
         * totalFee : 10
         */

        private Integer num;
        private String title;
        private String image;
        private Double price;
        private Double totalFee;

        public Integer getNum() {
            return num;
        }

        public void setNum(Integer num) {
            this.num = num;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public Double getPrice() {
            return price;
        }

        public void setPrice(Double price) {
            this.price = price;
        }

        public Double getTotalFee() {
            return totalFee;
        }

        public void setTotalFee(Double totalFee) {
            this.totalFee = totalFee;
        }
    }
}




