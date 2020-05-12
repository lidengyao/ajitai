package com.hxsoft.ajitai.present;

import android.content.Context;

import com.hxsoft.ajitai.base.BasePresent;
import com.hxsoft.ajitai.model.api.APIService_AJiTai;
import com.hxsoft.ajitai.model.api.ApiCallBack;
import com.hxsoft.ajitai.model.api.ApiSubscriber;
import com.hxsoft.ajitai.model.api.ResponseBean;
import com.hxsoft.ajitai.model.api.RetrofitClient;
import com.hxsoft.ajitai.ui.view.A_QianBao_View;
import com.hxsoft.ajitai.utils.FailOpeater;
import com.hxsoft.ajitai.utils.FileUtils;

import rx.Observable;

/**
 * Created by jinxh on 16/2/1.
 */
public class A_QianBao_Present extends BasePresent<A_QianBao_View> {


    public void ajitaipayQueryBalance(Context context) {
        String tip = "A_WoDeKeCheng_Present-goodsCgoodsPagebytype-钱包余额(APP)\r\n";
        FileUtils.writeLogToFile(tip);

        Observable<ResponseBean<Double>> observable = RetrofitClient.builderRetrofit(context).create(APIService_AJiTai.class).
                ajitaipayQueryBalance();
        addIOSubscription(observable, new ApiSubscriber(new ApiCallBack<Double>() {
            @Override
            public void onStart() {
                super.onStart();
                if (getView() != null) {
                    getView().showLoading();
                }
            }

            @Override
            public void onSuccess(Double model) {
                if (getView() != null) {
                    getView().ajitaipayQueryBalanceSuccess(model);
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
