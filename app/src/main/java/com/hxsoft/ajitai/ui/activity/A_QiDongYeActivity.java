package com.hxsoft.ajitai.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.hxsoft.ajitai.Constants;
import com.hxsoft.ajitai.R;
import com.hxsoft.ajitai.base.BasePresent;
import com.hxsoft.ajitai.base.MvpActivity;
import com.hxsoft.ajitai.model.info.PhoneLoginInfo;
import com.hxsoft.ajitai.present.LoginPresent;
import com.hxsoft.ajitai.ui.view.LoginView;
import com.hxsoft.ajitai.utils.DbKeyS;
import com.hxsoft.ajitai.utils.MStringUtils;
import com.hxsoft.ajitai.utils.SpUtils;
import com.hxsoft.ajitai.wxapi.WXAPI;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;

import java.util.Timer;
import java.util.TimerTask;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by jinxh on 16/2/1.
 */
public class A_QiDongYeActivity extends MvpActivity {
    private IWXAPI api;
    @Override
    protected int getLayoutId() {
        return R.layout.a_activity_qidongye;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        WXAPI.Init(this);
        api = WXAPIFactory.createWXAPI(this, Constants.APP_ID, false);
        regToWx();



        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                String isLogin = SpUtils.getSettingNote(getContext(), DbKeyS.isLogin);
                if (isLogin != null && isLogin.equals("1")) {
                    Intent intent = new Intent(getContext(), A_Main_Activity.class);
                    startActivity(intent);
                } else {
                    Intent intent = new Intent(getContext(), A_LoginActivity.class);
                    startActivity(intent);
                }

            }
        };
        Timer timer = new Timer();
        timer.schedule(task, 1500);
    }

    private void regToWx() {
        api = WXAPIFactory.createWXAPI(this, Constants.APP_ID, false);
        api.registerApp(Constants.APP_ID);
    }

    @Override
    protected BasePresent createPresenter() {
        return null;
    }

    @Override
    protected void initEvent() {
        super.initEvent();
    }

    @Override
    protected void initData() {
        super.initData();
    }

    @Override
    protected void initView() {
        super.initView();
    }

}
