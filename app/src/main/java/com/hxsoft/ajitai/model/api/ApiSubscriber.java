package com.hxsoft.ajitai.model.api;


import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import com.hxsoft.ajitai.AppContext;
import com.hxsoft.ajitai.ui.activity.A_LoginActivity;
import com.hxsoft.ajitai.utils.DbKeyS;
import com.hxsoft.ajitai.utils.SpUtils;

import java.net.UnknownHostException;

import retrofit2.adapter.rxjava.HttpException;
import rx.Subscriber;

/**
 * Created by jinxh on 16/5/30.
 */
public class ApiSubscriber<T> extends Subscriber<ResponseBean<T>> {

    public static int UNKNOWN_CODE = -1;
    private ApiCallBack apiCallback;

    private Context _context;

    public ApiSubscriber(ApiCallBack apiCallback, Context context) {
        this.apiCallback = apiCallback;
        _context = context;
    }

    @Override
    public void onCompleted() {
        apiCallback.onCompleted();
    }

    @Override
    public void onStart() {
        super.onStart();
        apiCallback.onStart();
    }

    @Override
    public void onError(Throwable e) {
        e.printStackTrace();

        if (e instanceof HttpException || e instanceof UnknownHostException) {
            HttpException httpException = (HttpException) e;
            apiCallback.onFailure(httpException.code(), e.getMessage());
        } else {
            apiCallback.onFailure(UNKNOWN_CODE, e.getMessage());
        }
        apiCallback.onCompleted();
    }

    @Override
    public void onNext(ResponseBean<T> httpBean) {
        if (httpBean.getCode().equals("0")) {
//            AppContext.dbHelper.SetData_Bottom(DbKeyS.yck_token, "1");
//            SpUtils.saveSettingNote(_context, DbKeyS.yck_token, "1");
            apiCallback.onSuccess(httpBean.getBody());
        } else {
            if (httpBean.getCode().equals("499")) {
//                AppContext.dbHelper.SetData_Bottom(DbKeyS.yck_token, "-1");
//                SpUtils.saveSettingNote(_context, DbKeyS.yck_token, "-1");
            }
            apiCallback.onFailure(Integer.parseInt(httpBean.getCode()), httpBean.getMsg());
        }
    }
}
