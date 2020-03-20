package com.hxsoft.ajitai.model.info;


import java.io.Serializable;
import java.util.List;

public class Goods_Info implements Serializable {


    /**
     * id : 65
     * name : 哔哩哔哩3123123
     * number : 65515
     * sold_number : 20
     * unit : 个
     * price : 1058.00
     * type : 3
     * promote_price : 1000.00
     * book_price : 300.00
     * head_img : https://yck-oss.oss-cn-hangzhou.aliyuncs.com/uploads/20200222/16774_P_1557733998358.jpeg
     * intro_img : ["https://yck-oss.oss-cn-hangzhou.aliyuncs.com/uploads/20200222/16774_P_1557733998565.jpeg","https://yck-oss.oss-cn-hangzhou.aliyuncs.com/uploads/20200222/16774_P_1557733998610.jpeg"]
     * video : https://v.youku.com/v_show/id_XNDUwMjM0NjMyMA==.html?spm=a2hcb.12675304.m_2561_c_17131.d_1&amp;s=5354d5f1042948ee8448
     * desc : 商品材质 陶瓷
     商品功能（特点） 喝茶，观赏
     使用方式 手握
     规格尺寸 高 13.2cm\,直径 10.5cm
     * brand_id : 13
     * purchase_limit : 1
     * buy_rule : 1
     * status : 0
     * activity_id : 1
     */

    private int id;
    private String name;
    private int number;
    private int sold_number;
    private String unit;
    private String price;
    private int type;
    private String promote_price;
    private String book_price;
    private String head_img;
    private String video;
    private String desc;
    private int brand_id;
    private int purchase_limit;
    private int buy_rule;
    private int status;
    private int activity_id;
    private List<String> intro_img;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getSold_number() {
        return sold_number;
    }

    public void setSold_number(int sold_number) {
        this.sold_number = sold_number;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getPromote_price() {
        return promote_price;
    }

    public void setPromote_price(String promote_price) {
        this.promote_price = promote_price;
    }

    public String getBook_price() {
        return book_price;
    }

    public void setBook_price(String book_price) {
        this.book_price = book_price;
    }

    public String getHead_img() {
        return head_img;
    }

    public void setHead_img(String head_img) {
        this.head_img = head_img;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(int brand_id) {
        this.brand_id = brand_id;
    }

    public int getPurchase_limit() {
        return purchase_limit;
    }

    public void setPurchase_limit(int purchase_limit) {
        this.purchase_limit = purchase_limit;
    }

    public int getBuy_rule() {
        return buy_rule;
    }

    public void setBuy_rule(int buy_rule) {
        this.buy_rule = buy_rule;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getActivity_id() {
        return activity_id;
    }

    public void setActivity_id(int activity_id) {
        this.activity_id = activity_id;
    }

    public List<String> getIntro_img() {
        return intro_img;
    }

    public void setIntro_img(List<String> intro_img) {
        this.intro_img = intro_img;
    }
}





