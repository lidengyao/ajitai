package com.hxsoft.ajitai.utils;


import com.hxsoft.ajitai.R;

public class ChooseMenuIcon {

    public static int a;

    public static int getMenuIcon(int id) {

        switch (id) {

            //剧毒化学品
            case SysType.c_danweibeian:
                return R.mipmap.c_danweibeian;
            case SysType.c_danweibeianbiangeng:
                return R.mipmap.c_danweibeianbiangeng;
            case SysType.c_renyuanbeian:
                return R.mipmap.c_renyuanbeian;
            case SysType.c_goumaizheng:
                return R.mipmap.c_goumaizheng;
            case SysType.c_churuku:
                return R.mipmap.c_churuku;
            case SysType.c_qiyesuoding:
                return R.mipmap.c_qiyesuoding;
            case SysType.c_yingjiyuanguanli:
                return R.mipmap.c_yingjiyuanguanli;
            case SysType.c_yingjizhuanjiaguanli:
                return R.mipmap.c_yingjizhuanjiaguanli;
            case SysType.c_kufangjiankong:
                return R.mipmap.c_kufangjiankong;
            case SysType.c_cheliangguanli:
                return R.mipmap.c_cheliangguanli;
            case SysType.c_cangkuguanli:
                return R.mipmap.cangkuguanli;
            case SysType.c_zhenggaitongzhi:
                return R.mipmap.zhenggaitongzhi;


            case SysType.c_fabutongzhi:
                return R.mipmap.c_fabutongzhi;
            case SysType.c_jieshoutongzhi:
                return R.mipmap.c_jieshoutongzhi;
            case SysType.c_falvfagui:
                return R.mipmap.c_falvfagui;
            case SysType.c_yewuzixun:
                return R.mipmap.c_yewuzixun;


            case SysType.c_yonghuguanli:
                return R.mipmap.c_yonghuguanli;
            case SysType.c_goumaixukeshenpi:
                return R.mipmap.c_goumaixukeshenpi;
            case SysType.c_goumaixukezhengchaxun:
                return R.mipmap.c_goumaixukezhengchaxun;
            case SysType.c_jiesuoshenqingshenpi:
                return R.mipmap.c_jiesuoshenqingshenpi;
            case SysType.c_suodingjiluchaxun:
                return R.mipmap.c_suodingjiluchaxun;
            case SysType.c_yuanguanli:
                return R.mipmap.c_yuanguanli;
            case SysType.c_daibanshixiang:
                return R.mipmap.c_daibanshixiang;
            case SysType.c_yujingtixing:
                return R.mipmap.c_yujingtixing;
            case SysType.c_danweiguanli:
                return R.mipmap.c_danweiguanli;
            case SysType.c_renyuanguanli:
                return R.mipmap.c_renyuanguanli;
            case SysType.c_sijibeian:
                return R.mipmap.c_siji;


            //民用爆炸物
            case SysType.b_danweibeian:
                return R.mipmap.b_danweibeian;
            case SysType.b_renyuanguanli:
                return R.mipmap.b_renyuanguanli;
            case SysType.b_goumaixukezhengguanli:
                return R.mipmap.b_goumaixukezhengguanli;
            case SysType.b_yunshuxukezhengguanli:
                return R.mipmap.b_yunshuxukezhengguanli;
            case SysType.b_shujushangbao:
                return R.mipmap.b_shujushangbao;
            case SysType.b_goumairukubeian:
                return R.mipmap.b_goumairukubeian;
            case SysType.b_shiyongchukubeian:
                return R.mipmap.b_shiyongchukubeian;
            case SysType.b_hetongxiangmuxinxixieru:
                return R.mipmap.b_hetongxiangmuxinxixieru;
            case SysType.b_baopozuoyexiangmushenqing:
                return R.mipmap.b_baopozuoyexiangmushenqing;
            case SysType.b_baopozuoyehetongbeian:
                return R.mipmap.b_baopozuoyehetongbeian;
            case SysType.b_baopozuoyexiangmubeian:
                return R.mipmap.b_baopozuoyexiangmubeian;
            case SysType.b_renyuanguanlichaxun:
                return R.mipmap.b_renyuanguanlichaxun;
            case SysType.b_goumaixukezhengchaxun:
                return R.mipmap.b_goumaixukezhengchaxun;
            case SysType.b_yunshuxukezhengchaxun:
                return R.mipmap.b_yunshuxukezhengchaxun;
            case SysType.b_yingjiyuanguanli:
                return R.mipmap.b_yingjiyuanguanli;
            case SysType.b_yingjizhuanjiaguanli:
                return R.mipmap.b_yingjizhuanjiaguanli;
            case SysType.b_kufangjiankong:
                return R.mipmap.b_kufangjiankong;
            case SysType.b_cheliangjiankong:
                return R.mipmap.c_cheliangguanli;
            case SysType.b_yujingguanli:
                return R.mipmap.b_yujingtixing;
            case SysType.b_tongzhigonggao:
                return R.mipmap.b_fabutongzhi;
            case SysType.b_falvfagui:
                return R.mipmap.b_falvfagui;
            case SysType.b_yewuzixun:
                return R.mipmap.b_yewuzixun;
            case SysType.b_xiugaimima:
                return R.mipmap.b_xiugaimima;

            //易制爆危险品
            case SysType.y_goumaixukezhengchaxun:
                return R.mipmap.y_goumaixukezhengchaxun;
            case SysType.y_goumaixukeshenpi:
                return R.mipmap.y_goumaixukeshenpi;
            case SysType.y_jiesuoshenqingshenpi:
                return R.mipmap.y_jiesuoshenqingshenpi;
            case SysType.y_danweizhuxiao:
                return R.mipmap.y_danweizhuxiao;
            case SysType.y_qiyesuoding:
                return R.mipmap.y_qiyesuoding;
            case SysType.y_gouxiaohetong:
                return R.mipmap.gouxiaohetong;
            case SysType.y_jingbanrenguanli:
                return R.mipmap.jingbanren;
            case SysType.y_kehuhecha:
                return R.mipmap.kehuhecha;
            case SysType.y_goumairuke:
                return R.mipmap.goumairuku;
            case SysType.y_cangkuguanli:
                return R.mipmap.cangkuguanli;
            case SysType.y_zhenggaitongzhi:
                return R.mipmap.zhenggaitongzhi;


            case SysType.y_danweibeian:
                return R.mipmap.y_danweibeian;
            case SysType.y_danweibeianbiangeng:
                return R.mipmap.y_danweibeianbiangeng;
            case SysType.y_renyuanbeian:
                return R.mipmap.y_renyuanbeian;
            case SysType.y_goumaizheng:
                return R.mipmap.y_goumaizheng;
            case SysType.y_churuku:
                return R.mipmap.y_churuku;
            case SysType.y_suodingjiluchaxun:
                return R.mipmap.y_suodingjiluchaxun;

            case SysType.y_yingjiyuanguanli:
                return R.mipmap.y_yingjiyuanguanli;
            case SysType.y_yingjizhuanjiaguanli:
                return R.mipmap.y_yingjizhuanjiaguanli;

            case SysType.y_kufangjiankong:
                return R.mipmap.y_kufangjiankong;
            case SysType.y_cheliangjiankong:
                return R.mipmap.y_cheliangjiankong;
            case SysType.y_yujingguanli:
                return R.mipmap.y_yujingguanli;

            case SysType.y_fabutongzhi:
                return R.mipmap.y_fabutongzhi;
            case SysType.y_jieshoutongzhi:
                return R.mipmap.y_jieshoutongzhi;
            case SysType.y_falvfagui:
                return R.mipmap.y_falvfagui;
            case SysType.y_yewuzixun:
                return R.mipmap.y_yewuzixun;

            case SysType.y_yonghuguanli:
                return R.mipmap.y_yonghuguanli;
            case SysType.y_sijiguanli:
                return R.mipmap.y_siji;

            //烟花爆竹
            case SysType.z_danweichaxun:
                return R.mipmap.z_danweichaxun;
            case SysType.z_danweirenyuanguanli:
                return R.mipmap.z_danweirenyuanguanli;
            case SysType.z_ranfangxukezhengxinxi:
                return R.mipmap.z_ranfangxukezhengxinxi;
            case SysType.z_yunshuxukezhengxinxi:
                return R.mipmap.z_yunshuxukezhengxinxi;
            case SysType.z_danweibeian:
                return R.mipmap.z_danweibeian;
            case SysType.z_goumairukubeian:
                return R.mipmap.z_goumairukubeian;
            case SysType.z_xiaoshouchukubeian:
                return R.mipmap.z_xiaoshouchukubeian;
            case SysType.z_suodingjiluchaxun:
                return R.mipmap.z_suodingjiluchaxun;
            case SysType.z_yingjiyuanguanli:
                return R.mipmap.z_yingjiyuanguanli;
            case SysType.z_yingjizhuanjiaguanli:
                return R.mipmap.z_yingjizhuanjiaguanli;
            case SysType.z_kufangjiankong:
                return R.mipmap.z_kufangjiankong;
            case SysType.z_cheliangjiankong:
                return R.mipmap.z_cheliangjiankong;
            case SysType.z_yujingguanli:
                return R.mipmap.z_yujingguanli;
            case SysType.z_tongzhigonggao:
                return R.mipmap.z_tongzhigonggao;
            case SysType.z_falvfagui:
                return R.mipmap.z_falvfagui;
            case SysType.z_yewuzixun:
                return R.mipmap.z_yewuzixun;
            case SysType.z_yonghuguanli:
                return R.mipmap.z_yonghuguanli;
            default:
                return R.mipmap.logo;
        }

    }
}
