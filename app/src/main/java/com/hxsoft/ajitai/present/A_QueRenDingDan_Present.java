package com.hxsoft.ajitai.present;

import android.content.Context;

import com.hxsoft.ajitai.base.BasePresent;
import com.hxsoft.ajitai.model.api.APIService_AJiTai;
import com.hxsoft.ajitai.model.api.ApiCallBack;
import com.hxsoft.ajitai.model.api.ApiSubscriber;
import com.hxsoft.ajitai.model.api.ResponseBean;
import com.hxsoft.ajitai.model.api.RetrofitClient;
import com.hxsoft.ajitai.model.info.Cuseraddress_Info;
import com.hxsoft.ajitai.ui.view.A_QueRenDingDan_View;
import com.hxsoft.ajitai.utils.FailOpeater;
import com.hxsoft.ajitai.utils.FileUtils;

import rx.Observable;

/**
 * Created by jinxh on 16/2/1.
 */
public class A_QueRenDingDan_Present extends BasePresent<A_QueRenDingDan_View> {

    //获取默认地址
    public void adminCuseraddressDefaultbyperson(Context context) {

        String tip = "A_QueRenDingDan_Present-adminCuseraddressDefaultbyperson-获取默认地址\r\n";
        FileUtils.writeLogToFile(tip);
        Observable<ResponseBean<Cuseraddress_Info>> observable = RetrofitClient.builderRetrofit(context).create(APIService_AJiTai.class).adminCuseraddressDefaultbyperson();
        addIOSubscription(observable, new ApiSubscriber(new ApiCallBack<Cuseraddress_Info>() {
            @Override
            public void onStart() {
                super.onStart();
                if (getView() != null) {
                    getView().showLoading();
                }
            }

            @Override
            public void onSuccess(Cuseraddress_Info model) {
                if (getView() != null) {
                    getView().adminCuseraddressDefaultbypersonSuccess(model);
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
