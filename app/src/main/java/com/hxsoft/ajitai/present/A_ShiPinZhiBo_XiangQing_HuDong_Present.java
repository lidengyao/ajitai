package com.hxsoft.ajitai.present;

import android.content.Context;

import com.hxsoft.ajitai.base.BasePresent;
import com.hxsoft.ajitai.model.api.APIService_AJiTai;
import com.hxsoft.ajitai.model.api.ApiCallBack;
import com.hxsoft.ajitai.model.api.ApiSubscriber;
import com.hxsoft.ajitai.model.api.ResponseBean;
import com.hxsoft.ajitai.model.api.RetrofitClient;
import com.hxsoft.ajitai.model.info.A_Cvideocomment_Total_Info;
import com.hxsoft.ajitai.model.info.A_Cvideostream_Info;
import com.hxsoft.ajitai.model.info.A_addcomment_Bean;
import com.hxsoft.ajitai.ui.view.A_ShiPinZhiBo_XiangQing_HuDong_View;
import com.hxsoft.ajitai.ui.view.A_ShiPinZhiBo_XiangQing_View;
import com.hxsoft.ajitai.utils.FailOpeater;
import com.hxsoft.ajitai.utils.FileUtils;

import rx.Observable;

/**
 * Created by jinxh on 16/2/1.
 */
public class A_ShiPinZhiBo_XiangQing_HuDong_Present extends BasePresent<A_ShiPinZhiBo_XiangQing_HuDong_View> {


    //直播添加评论
    public void cvideocommentAddcomment(A_addcomment_Bean a_addcomment_bean, Context context) {

        String tip = "A_ShiPinZhiBo_XiangQing_HuDong_Present-cvideocommentAddcomment-直播添加评论\r\n";
        FileUtils.writeLogToFile(tip);
        Observable<ResponseBean<Boolean>> observable = RetrofitClient.builderRetrofit(context).create(APIService_AJiTai.class).cvideocommentAddcomment(a_addcomment_bean);
        addIOSubscription(observable, new ApiSubscriber(new ApiCallBack<Boolean>() {
            @Override
            public void onStart() {
                super.onStart();
                if (getView() != null) {
                    getView().showLoading();
                }
            }

            @Override
            public void onSuccess(Boolean model) {
                if (getView() != null) {
                    getView().cvideocommentAddcommentSuccess(model);
                }
            }

            @Override
            public void onFailure(int code, String msg) {
                if (getView() != null) {
                    FailOpeater.SetFail(code, tip, msg, context);
                }
            }

            @Override
            public void onCompleted() {
                if (getView() != null) {
                    getView().dismissLoading();
                }
            }
        }, context));
    }

    //直播评论分页查询
    public void cvideostreamPage(Integer vid, Integer page, Integer size, Context context) {

        String tip = "A_ShiPinZhiBo_XiangQing_Present-cvideostreamLeave-离开直播间\r\n";
        FileUtils.writeLogToFile(tip);
        Observable<ResponseBean<A_Cvideocomment_Total_Info>> observable = RetrofitClient.builderRetrofit(context).create(APIService_AJiTai.class).cvideostreamPage(vid, page, size);
        addIOSubscription(observable, new ApiSubscriber(new ApiCallBack<A_Cvideocomment_Total_Info>() {
            @Override
            public void onStart() {
                super.onStart();
                if (getView() != null) {
                    getView().showLoading();
                }
            }

            @Override
            public void onSuccess(A_Cvideocomment_Total_Info model) {
                if (getView() != null) {
                    getView().cvideostreamPageSuccess(model);
                }
            }

            @Override
            public void onFailure(int code, String msg) {
                if (getView() != null) {
                    FailOpeater.SetFail(code, tip, msg, context);
                }
            }

            @Override
            public void onCompleted() {
                if (getView() != null) {
                    getView().dismissLoading();
                }
            }
        }, context));
    }


}
