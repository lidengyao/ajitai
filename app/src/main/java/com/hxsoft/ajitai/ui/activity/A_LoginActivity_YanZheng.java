package com.hxsoft.ajitai.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.gson.Gson;
import com.hxsoft.ajitai.R;
import com.hxsoft.ajitai.base.MvpActivity;
import com.hxsoft.ajitai.model.bean.A_LoginInfo;
import com.hxsoft.ajitai.model.bean.A_OauthTokenBean;
import com.hxsoft.ajitai.model.bean.A_PushChecknumBean;
import com.hxsoft.ajitai.model.info.OauthToken_Info;
import com.hxsoft.ajitai.present.A_YanZhengMa_LoginPresent;
import com.hxsoft.ajitai.ui.view.A_YanZhengMa_LoginView;
import com.hxsoft.ajitai.utils.DbKeyS;
import com.hxsoft.ajitai.utils.JPushControl;
import com.hxsoft.ajitai.utils.SpUtils;

import java.util.UUID;
import java.util.logging.Level;

import butterknife.Bind;
import butterknife.ButterKnife;
import cn.hutool.db.Db;

/**
 * Created by jinxh on 16/2/1.
 */
public class A_LoginActivity_YanZheng extends MvpActivity<A_YanZhengMa_LoginPresent> implements A_YanZhengMa_LoginView {


    @Bind(R.id.SysNameIV)
    TextView SysNameIV;
    @Bind(R.id.QieHuanZhangHaoRL)
    RelativeLayout QieHuanZhangHaoRL;
    @Bind(R.id.Mobile_TV)
    TextView MobileTV;
    @Bind(R.id.getCodeBtn)
    Button getCodeBtn;
    @Bind(R.id.OKBtn)
    Button OKBtn;
    @Bind(R.id.YanZhengMa_ET)
    EditText YanZhengMaET;
    private CountDownTimer countDownTimer;
    private String mobile;

    @Override
    protected int getLayoutId() {
        return R.layout.a_activity_login_yanzheng;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);

        mobile = getIntent().getStringExtra("mobile");//15251435195
        MobileTV.setText(mobile.substring(0, 3) + "****" + mobile.substring(7, 11));

        String deviceId = UUID.randomUUID().toString();
        SpUtils.saveSettingNote(getContext(), DbKeyS.deviceid, deviceId);

        A_PushChecknumBean a_pushChecknumBean = new A_PushChecknumBean();
        a_pushChecknumBean.setDeviceid(deviceId);
        a_pushChecknumBean.setMobile(mobile);
        mPresenter.pushChecknum(a_pushChecknumBean, getContext());
        getCodeBtn.setEnabled(false);
        countDownTimer = new CountDownTimer((60 * 1000), 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                String value = String.valueOf((int) (millisUntilFinished / 1000));
                getCodeBtn.setText(value + "s");

            }

            @Override
            public void onFinish() {
                getCodeBtn.setEnabled(true);
                getCodeBtn.setText("获取验证码");
            }
        }.start();

        OKBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String deviceId = SpUtils.getSettingNote(getContext(), DbKeyS.deviceid);
                A_OauthTokenBean a_oauthTokenBean = new A_OauthTokenBean();
                a_oauthTokenBean.setDeviceid(deviceId);
                a_oauthTokenBean.setMobile(mobile);
                a_oauthTokenBean.setChecknum(YanZhengMaET.getText().toString());
                a_oauthTokenBean.setScope("client");
                a_oauthTokenBean.setClient_id("app");
                a_oauthTokenBean.setClient_secret("app");
                a_oauthTokenBean.setGrant_type("phone_sms");

                mPresenter.oauthToken(a_oauthTokenBean, getContext());

            }
        });

        YanZhengMaET.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (YanZhengMaET.getText().toString().length() > 0) {
                    OKBtn.setBackground(getResources().getDrawable(R.drawable.sysbtn_gray_f1d649_4_shape));
                    OKBtn.setTextColor(getResources().getColor(R.color.C242424));
                    OKBtn.setEnabled(true);
                } else {
                    OKBtn.setBackground(getResources().getDrawable(R.drawable.sysbtn_gray_ebebeb_4_shape));
                    OKBtn.setTextColor(getResources().getColor(R.color.CA8A8A8));
                    OKBtn.setEnabled(false);
                }
            }
        });

        getCodeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getCodeBtn.setEnabled(false);
                A_PushChecknumBean a_pushChecknumBean = new A_PushChecknumBean();
                a_pushChecknumBean.setDeviceid(deviceId);
                a_pushChecknumBean.setMobile(mobile);
                mPresenter.pushChecknum(a_pushChecknumBean, getContext());
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        countDownTimer.cancel();
    }

    @Override
    protected A_YanZhengMa_LoginPresent createPresenter() {
        return new A_YanZhengMa_LoginPresent();
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


    @Override
    public void pushChecknumSuccess(Boolean model) {
        if (model)
            showMessage("验证码已发送成功");
        else {
            showMessage("验证码已发送失败");
        }
    }

    @Override
    public void oauthTokenSuccess(A_LoginInfo model) {
        if (model == null) {
            showMessage("登陆失败");
            return;
        }
        SpUtils.saveSettingNote(getContext(), DbKeyS.token, model.getAccess_token());
        SpUtils.saveSettingNote(getContext(), DbKeyS.isLogin, "1");

        Gson gson = new Gson();
        String gsonStr = gson.toJson(model);
        SpUtils.saveSettingNote(getContext(), DbKeyS.A_LoginInfo, gsonStr);
        JPushControl.SetJPush(getContext());
        Intent intent = new Intent(getContext(), A_Main_Activity.class);
        startActivity(intent);
    }

    @Override
    public void onFailure(int code, String msg) {
        showMessage(msg);
    }
}
