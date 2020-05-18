package com.hxsoft.ajitai.present;

import android.content.Context;

import com.hxsoft.ajitai.base.BasePresent;
import com.hxsoft.ajitai.model.api.APIService_AJiTai;
import com.hxsoft.ajitai.model.api.ApiCallBack;
import com.hxsoft.ajitai.model.api.ApiSubscriber;
import com.hxsoft.ajitai.model.api.ResponseBean;
import com.hxsoft.ajitai.model.api.RetrofitClient;
import com.hxsoft.ajitai.model.info.Cuseraddress_Total_Info;
import com.hxsoft.ajitai.model.info.WenZhang_Total_Info;
import com.hxsoft.ajitai.ui.view.A_ShouHuoDiZhi_View;
import com.hxsoft.ajitai.ui.view.A_WenZhangYueDu_View;
import com.hxsoft.ajitai.utils.FailOpeater;
import com.hxsoft.ajitai.utils.FileUtils;

import rx.Observable;

/**
 * Created by jinxh on 16/2/1.
 */
public class A_WenZhangYueDu_Present extends BasePresent<A_WenZhangYueDu_View> {


    //心灵甘露列表
    public void adminCuseraddressPage(Integer page, Integer size, Context context) {
        String tip = "A_WenZhangYueDu_Present-adminCuseraddressPage-心灵甘露列表(APP)\r\n";
        FileUtils.writeLogToFile(tip);

        Observable<ResponseBean<WenZhang_Total_Info>> observable = RetrofitClient.builderRetrofit(context).create(APIService_AJiTai.class).heartnectarPage(page, size);
        addIOSubscription(observable, new ApiSubscriber(new ApiCallBack<WenZhang_Total_Info>() {
            @Override
            public void onStart() {
                super.onStart();
                if (getView() != null) {
                    getView().showLoading();
                }
            }

            @Override
            public void onSuccess(WenZhang_Total_Info model) {
                if (getView() != null) {
                    getView().heartnectarPageSuccess(model);
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
