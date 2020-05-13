package com.hxsoft.ajitai.present;

import android.content.Context;

import com.hxsoft.ajitai.base.BasePresent;
import com.hxsoft.ajitai.model.api.APIService_AJiTai;
import com.hxsoft.ajitai.model.api.ApiCallBack;
import com.hxsoft.ajitai.model.api.ApiSubscriber;
import com.hxsoft.ajitai.model.api.ResponseBean;
import com.hxsoft.ajitai.model.api.RetrofitClient;
import com.hxsoft.ajitai.model.info.CreateOrder_Bean;
import com.hxsoft.ajitai.model.info.CreateOrder_Info;
import com.hxsoft.ajitai.model.info.KeCheng_Info;
import com.hxsoft.ajitai.ui.view.A_ChongZhi_View;
import com.hxsoft.ajitai.ui.view.A_WoDeKeCheng_XuanZeKeCheng_View;
import com.hxsoft.ajitai.utils.FailOpeater;
import com.hxsoft.ajitai.utils.FileUtils;
import com.hxsoft.ajitai.utils.LogCode;

import java.util.ArrayList;

import rx.Observable;

/**
 * Created by jinxh on 16/2/1.
 */
public class A_ChongZhi_Present extends BasePresent<A_ChongZhi_View> {


    //创建订单（充值）
    public void orderCreate(CreateOrder_Bean createOrder_bean, Context context) {
        String tip = "A_WoDeKeCheng_XuanZeKeCheng_Present-orderCreate-创建订单（充值）\r\n";
        FileUtils.writeLogToFile(tip);

        Observable<ResponseBean<CreateOrder_Info>> observable = RetrofitClient.builderRetrofit(context).create(APIService_AJiTai.class).
                orderCreate(createOrder_bean);
        addIOSubscription(observable, new ApiSubscriber(new ApiCallBack<CreateOrder_Info>() {
            @Override
            public void onStart() {
                super.onStart();
                if (getView() != null) {
                    getView().showLoading();
                }
            }

            @Override
            public void onSuccess(CreateOrder_Info model) {
                if (getView() != null) {
                    getView().orderCreateSuccess(model);
                }
            }

            @Override
            public void onFailure(int code, String msg) {
                if (getView() != null) {
                    getView().showMessage(msg);
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
