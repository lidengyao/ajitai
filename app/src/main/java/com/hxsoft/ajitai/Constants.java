package com.hxsoft.ajitai;

public class Constants {
    public static final String APP_ID = "wxa5cad93b1a90dff5";
    public static final String AppSecret = "ccd18110692f3444221b736d522bf1df";


    public static final int PERMISSIONS_REQUEST_STORAGE = 1;

    //oss相关
    public static final String STS_SERVER_URL = "http://139.196.137.228:9999/dict/ali/sts/securitytoken";//STS 地址
    public static final String BUCKET_NAME = "hxsoft-ajitai";
    public static final String BUCKET_NAME_IMAGE = "image";
    public static final String OSS_ENDPOINT = "oss-cn-shanghai.aliyuncs.com";
    public static final String OSS_IMGURL = "https://hxsoft-ajitai.oss-cn-shanghai.aliyuncs.com/"+BUCKET_NAME_IMAGE+"/";

    public static class ShowMsgActivity {
        public static final String STitle = "showmsg_title";
        public static final String SMessage = "showmsg_message";
        public static final String BAThumbData = "showmsg_thumb_data";
    }
}
