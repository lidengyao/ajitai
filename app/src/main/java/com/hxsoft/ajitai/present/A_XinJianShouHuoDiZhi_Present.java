package com.hxsoft.ajitai.present;

import android.content.Context;

import com.hxsoft.ajitai.base.BasePresent;
import com.hxsoft.ajitai.model.api.APIService_AJiTai;
import com.hxsoft.ajitai.model.api.ApiCallBack;
import com.hxsoft.ajitai.model.api.ApiSubscriber;
import com.hxsoft.ajitai.model.api.ResponseBean;
import com.hxsoft.ajitai.model.api.RetrofitClient;
import com.hxsoft.ajitai.model.bean.A_Cuseraddress_Bean;
import com.hxsoft.ajitai.model.info.Cuseraddress_Info;
import com.hxsoft.ajitai.ui.view.A_ShouHuoDiZhi_View;
import com.hxsoft.ajitai.ui.view.A_XinJianShouHuoDiZhi_View;
import com.hxsoft.ajitai.utils.FileUtils;
import com.hxsoft.ajitai.utils.LogCode;

import retrofit2.http.Body;
import retrofit2.http.POST;
import rx.Observable;

/**
 * Created by jinxh on 16/2/1.
 */
public class A_XinJianShouHuoDiZhi_Present extends BasePresent<A_XinJianShouHuoDiZhi_View> {


    //邮寄地址新增
    public void adminCuseraddressAdd(A_Cuseraddress_Bean a_cuseraddress_bean, Context context) {
        String tip = "A_ShouHuoDiZhi_Present-adminCuseraddress-邮寄地址新增(APP)\r\n";
        FileUtils.writeLogToFile(tip);
        Observable<ResponseBean<Boolean>> observable = RetrofitClient.builderRetrofit(context).create(APIService_AJiTai.class).adminCuseraddressAdd(a_cuseraddress_bean);

        // 此处请求接口
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
                    getView().adminCuseraddressAddSuccess(model);
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

    //邮寄地址修改
    public void adminCuseraddressUpdate(A_Cuseraddress_Bean a_cuseraddress_bean, Context context) {
        String tip = "A_ShouHuoDiZhi_Present-adminCuseraddress-邮寄地址修改(APP)\r\n";
        FileUtils.writeLogToFile(tip);
        Observable<ResponseBean<Boolean>> observable = RetrofitClient.builderRetrofit(context).create(APIService_AJiTai.class).adminCuseraddressUpdate(a_cuseraddress_bean);

        // 此处请求接口
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
                    getView().adminCuseraddressUpdateSuccess(model);
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

    //邮寄地址删除
    public void adminCuseraddressDelete(Integer aid, Context context) {
        String tip = "A_ShouHuoDiZhi_Present-adminCuseraddress-邮寄地址新增(APP)\r\n";
        FileUtils.writeLogToFile(tip);
        Observable<ResponseBean<Boolean>> observable = RetrofitClient.builderRetrofit(context).create(APIService_AJiTai.class).adminCuseraddressDelete(aid);

        // 此处请求接口
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
                    getView().adminCuseraddressDeleteSuccess(model);
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
