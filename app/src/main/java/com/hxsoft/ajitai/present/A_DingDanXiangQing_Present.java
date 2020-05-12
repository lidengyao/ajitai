package com.hxsoft.ajitai.present;

import android.content.Context;

import com.hxsoft.ajitai.base.BasePresent;
import com.hxsoft.ajitai.model.api.APIService_AJiTai;
import com.hxsoft.ajitai.model.api.ApiCallBack;
import com.hxsoft.ajitai.model.api.ApiSubscriber;
import com.hxsoft.ajitai.model.api.ResponseBean;
import com.hxsoft.ajitai.model.api.RetrofitClient;
import com.hxsoft.ajitai.model.info.A_Order_Info;
import com.hxsoft.ajitai.ui.view.A_DingDanXiangQing_View;
import com.hxsoft.ajitai.utils.FileUtils;
import com.hxsoft.ajitai.utils.LogCode;

import rx.Observable;

/**
 * Created by jinxh on 16/2/1.
 */
public class A_DingDanXiangQing_Present extends BasePresent<A_DingDanXiangQing_View> {


    //订单详情
    public void orderQuery(String orderNo, Context context) {
        String tip = "A_DingDanXiangQing_Present-orderQuery-订单详情(APP)\r\n";
        FileUtils.writeLogToFile(tip);

        Observable<ResponseBean<A_Order_Info>> observable = RetrofitClient.builderRetrofit(context).create(APIService_AJiTai.class).orderQuery(orderNo);
        addIOSubscription(observable, new ApiSubscriber(new ApiCallBack<A_Order_Info>() {
            @Override
            public void onStart() {
                super.onStart();
                if (getView() != null) {
                    getView().showLoading();
                }
            }

            @Override
            public void onSuccess(A_Order_Info model) {
                if (getView() != null) {
                    getView().orderQuerySuccess(model);
                }
            }

            @Override
            public void onFailure(int code, String msg) {
                if (getView() != null) {
                    getView().showMessage(LogCode.GetCode(tip) + msg);
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

    //取消订单
    public void orderCannel(String orderNo, Context context) {
        String tip = "A_DingDanXiangQing_Present-orderCannel-取消订单(APP)\r\n";
        FileUtils.writeLogToFile(tip);
        Observable<ResponseBean<String>> observable = RetrofitClient.builderRetrofit(context).create(APIService_AJiTai.class).orderCannel(orderNo);

        // 此处请求接口
        addIOSubscription(observable, new ApiSubscriber(new ApiCallBack<String>() {
            @Override
            public void onStart() {
                super.onStart();
                if (getView() != null) {
                    getView().showLoading();
                }
            }

            @Override
            public void onSuccess(String model) {
                if (getView() != null) {
                    getView().orderCannelSuccess(model);
                }
            }

            @Override
            public void onFailure(int code, String msg) {
                if (getView() != null) {
                    getView().onFailure(code, LogCode.GetCode(tip) + msg);
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
