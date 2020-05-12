package com.hxsoft.ajitai.present;

import android.content.Context;

import com.hxsoft.ajitai.base.BasePresent;
import com.hxsoft.ajitai.model.api.APIService_AJiTai;
import com.hxsoft.ajitai.model.api.ApiCallBack;
import com.hxsoft.ajitai.model.api.ApiSubscriber;
import com.hxsoft.ajitai.model.api.ResponseBean;
import com.hxsoft.ajitai.model.api.RetrofitClient;
import com.hxsoft.ajitai.model.info.KeCheng_Info;
import com.hxsoft.ajitai.ui.view.A_WoDeKeCheng_View;
import com.hxsoft.ajitai.utils.FileUtils;
import com.hxsoft.ajitai.utils.LogCode;

import rx.Observable;

/**
 * Created by jinxh on 16/2/1.
 */
public class A_WoDeKeCheng_Present extends BasePresent<A_WoDeKeCheng_View> {


    public void goodsCgoodsPagebytype(Integer current, Integer size, Integer type, Context context) {
        String tip = "A_WoDeKeCheng_Present-goodsCgoodsPagebytype-获取当前课程套餐(APP)\r\n";
        FileUtils.writeLogToFile(tip);

        Observable<ResponseBean<KeCheng_Info>> observable = RetrofitClient.builderRetrofit(context).create(APIService_AJiTai.class).
                goodsCgoodsPagebytype(current, size,type);
        addIOSubscription(observable, new ApiSubscriber(new ApiCallBack<KeCheng_Info>() {
            @Override
            public void onStart() {
                super.onStart();
                if (getView() != null) {
                    getView().showLoading();
                }
            }

            @Override
            public void onSuccess(KeCheng_Info model) {
                if (getView() != null) {
                    getView().goodsCgoodsPagebytypeSuccess(model);
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

}
