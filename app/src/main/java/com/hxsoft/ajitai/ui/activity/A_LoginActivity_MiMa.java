package com.hxsoft.ajitai.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.gson.Gson;
import com.hxsoft.ajitai.AppContext;
import com.hxsoft.ajitai.R;
import com.hxsoft.ajitai.base.MvpActivity;
import com.hxsoft.ajitai.model.bean.A_LoginBean;
import com.hxsoft.ajitai.model.bean.A_LoginInfo;
import com.hxsoft.ajitai.present.A_LoginPresent;
import com.hxsoft.ajitai.ui.view.A_LoginView;
import com.hxsoft.ajitai.utils.DbKeyS;
import com.hxsoft.ajitai.utils.EncryptionUtil;
import com.hxsoft.ajitai.utils.JPushControl;
import com.hxsoft.ajitai.utils.MStringUtils;
import com.hxsoft.ajitai.utils.SpUtils;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by jinxh on 16/2/1.
 */
public class A_LoginActivity_MiMa extends MvpActivity<A_LoginPresent> implements View.OnClickListener, A_LoginView {


    @Bind(R.id.SysNameIV)
    TextView SysNameIV;
    @Bind(R.id.QieHuanZhangHaoRL)
    RelativeLayout QieHuanZhangHaoRL;
    @Bind(R.id.OKBtn)
    Button OKBtn;
    @Bind(R.id.username_ET)
    EditText usernameET;
    @Bind(R.id.password_ET)
    EditText passwordET;

    @Override
    protected int getLayoutId() {
        return R.layout.a_activity_login_mima;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);


        if (AppContext.debug) {
            usernameET.setText("admin");
            passwordET.setText("123456");
        }

        if (passwordET.getText().toString().length() > 0) {
            OKBtn.setBackground(getResources().getDrawable(R.drawable.sysbtn_gray_f1d649_4_shape));
            OKBtn.setTextColor(getResources().getColor(R.color.C242424));
            OKBtn.setEnabled(true);
        }
        OKBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(getContext(), A_Main_Activity.class);
//                startActivity(intent);

                String username = usernameET.getText().toString();
                String password = passwordET.getText().toString();

                if (MStringUtils.IsNullOrEmpty(username)) {
                    showMessage("请输入用户名");
                    return;
                }


                if (MStringUtils.IsNullOrEmpty(password)) {
                    showMessage("请输入密码");
                    return;
                }
                String sPassword = "";
                try {
                    sPassword = EncryptionUtil.Encrypt(password, AppContext.sKey);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                A_LoginBean a_loginBean = new A_LoginBean();
                a_loginBean.setUsername(username);
                a_loginBean.setPassword(sPassword);
                a_loginBean.setScope("client");
                a_loginBean.setClient_id("app");
                a_loginBean.setClient_secret("app");
                a_loginBean.setGrant_type("password");

                mPresenter.login(a_loginBean, getContext());

            }
        });

        passwordET.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (passwordET.getText().toString().length() > 0) {
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
    }

    @Override
    protected A_LoginPresent createPresenter() {
        return new A_LoginPresent();
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
    public void onClick(View v) {

    }

    @Override
    public void loginSuccess(A_LoginInfo model) {
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

}
