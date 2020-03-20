package com.hxsoft.ajitai.model.api;

import com.hxsoft.ajitai.model.bean.CheLiangGuiJi_Bean;
import com.hxsoft.ajitai.model.bean.CheLiangGuiJi_ShiShi_Bean;
import com.hxsoft.ajitai.model.bean.ResponseBean;
import com.hxsoft.ajitai.model.info.CheLiangJianKong_GuiJi_Info;
import com.hxsoft.ajitai.model.info.CheLiangJianKong_ShiShi_Info;

import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by jinxh on 16/2/17.
 */
public interface APIService_1 {

    //车辆监控-列表
    @POST("road/list")
    Observable<ResponseBean<CheLiangJianKong_GuiJi_Info>> roldlist(@Body CheLiangGuiJi_Bean cheLiangGuiJi_bean);

    //车辆监控实时位置
    @POST("road/current")
    Observable<ResponseBean<CheLiangJianKong_ShiShi_Info>> roldcurrent(@Body CheLiangGuiJi_ShiShi_Bean cheLiangGuiJi_shiShi_bean);

    //法律法规详情
    @GET("video/realtime/{id}")
    Observable<ResponseBean<String>> realtime(@Path("id") int id);
}
