package com.hxsoft.ajitai.model.info;


import java.io.Serializable;
import java.util.ArrayList;

public class Goods_Total_Info implements Serializable {

        /**
         * total : 3
         * per_page : 10
         * current_page : 1
         * last_page : 1
         * data : [{"id":33,"name":"日本虚空藏窑 小花唐草系列九谷烧手工茶壶004","number":65525,"sold_number":10,"unit":"个","price":"11058.00","type":1,"promote_price":"1000.00","book_price":"300.00","head_img":"https://yck-oss.oss-cn-hangzhou.aliyuncs.com/uploads/20200222/16774_P_1557733998358.jpeg","intro_img":"https://yck-oss.oss-cn-hangzhou.aliyuncs.com/uploads/20200222/16774_P_1557733998565.jpeg;https://yck-oss.oss-cn-hangzhou.aliyuncs.com/uploads/20200222/16774_P_1557733998610.jpeg","video":"https://v.youku.com/v_show/id_XNDUwMjM0NjMyMA==.html?spm=a2hcb.12675304.m_2561_c_17131.d_1&amp;s=5354d5f1042948ee8448","desc":"商品材质 陶瓷\n商品功能（特点） 喝茶，观赏\n使用方式 手握\n规格尺寸 高 13.2cm\\,直径 10.5cm","brand_id":13,"purchase_limit":1,"buy_rule":1},{"id":32,"name":"日本虚空藏窑 小花唐草系列九谷烧手工茶壶001","number":65525,"sold_number":10,"unit":"个","price":"2058.00","type":1,"promote_price":"1000.00","book_price":"300.00","head_img":"https://yck-oss.oss-cn-hangzhou.aliyuncs.com/uploads/20200222/16774_P_1557733998358.jpeg","intro_img":"https://yck-oss.oss-cn-hangzhou.aliyuncs.com/uploads/20200222/16774_P_1557733998565.jpeg;https://yck-oss.oss-cn-hangzhou.aliyuncs.com/uploads/20200222/16774_P_1557733998610.jpeg","video":"https://v.youku.com/v_show/id_XNDUwMjM0NjMyMA==.html?spm=a2hcb.12675304.m_2561_c_17131.d_1&amp;s=5354d5f1042948ee8448","desc":"商品材质 陶瓷\n商品功能（特点） 喝茶，观赏\n使用方式 手握\n规格尺寸 高 13.2cm\\,直径 10.5cm","brand_id":13,"purchase_limit":1,"buy_rule":1},{"id":31,"name":"日本虚空藏窑 小花唐草系列九谷烧手工茶壶","number":65525,"sold_number":10,"unit":"个","price":"1058.00","type":1,"promote_price":"1000.00","book_price":"300.00","head_img":"https://yck-oss.oss-cn-hangzhou.aliyuncs.com/uploads/20200222/16774_P_1557733998358.jpeg","intro_img":"https://yck-oss.oss-cn-hangzhou.aliyuncs.com/uploads/20200222/16774_P_1557733998565.jpeg;https://yck-oss.oss-cn-hangzhou.aliyuncs.com/uploads/20200222/16774_P_1557733998610.jpeg","video":"https://v.youku.com/v_show/id_XNDUwMjM0NjMyMA==.html?spm=a2hcb.12675304.m_2561_c_17131.d_1&amp;s=5354d5f1042948ee8448","desc":"商品材质 陶瓷\n商品功能（特点） 喝茶，观赏\n使用方式 手握\n规格尺寸 高 13.2cm\\,直径 10.5cm","brand_id":13,"purchase_limit":1,"buy_rule":1}]
         */

        private int total;
        private int per_page;
        private int current_page;
        private int last_page;
        private ArrayList<Goods_Info> data;

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public int getPer_page() {
            return per_page;
        }

        public void setPer_page(int per_page) {
            this.per_page = per_page;
        }

        public int getCurrent_page() {
            return current_page;
        }

        public void setCurrent_page(int current_page) {
            this.current_page = current_page;
        }

        public int getLast_page() {
            return last_page;
        }

        public void setLast_page(int last_page) {
            this.last_page = last_page;
        }

        public ArrayList<Goods_Info> getData() {
            return data;
        }

        public void setData(ArrayList<Goods_Info> data) {
            this.data = data;
        }

    }





