package com.hxsoft.ajitai.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.hxsoft.ajitai.Constants;
import com.hxsoft.ajitai.R;
import com.hxsoft.ajitai.base.MvpActivity;
import com.hxsoft.ajitai.model.info.PhoneLoginInfo;
import com.hxsoft.ajitai.present.LoginPresent;
import com.hxsoft.ajitai.ui.view.LoginView;
import com.hxsoft.ajitai.utils.DbKeyS;
import com.hxsoft.ajitai.utils.JPushControl;
import com.hxsoft.ajitai.utils.MStringUtils;
import com.hxsoft.ajitai.utils.SpUtils;
import com.hxsoft.ajitai.wxapi.WXAPI;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;

import butterknife.Bind;
import butterknife.ButterKnife;
import cn.hutool.db.Db;

/**
 * Created by jinxh on 16/2/1.
 */
public class A_LoginActivity extends MvpActivity<LoginPresent> implements View.OnClickListener, LoginView {

    @Bind(R.id.MobileET)
    EditText MobileET;
    @Bind(R.id.OKBtn)
    Button OKBtn;
    @Bind(R.id.MiMaDengLuTV)
    TextView MiMaDengLuTV;
    @Bind(R.id.CenterTV)
    TextView CenterTV;
    @Bind(R.id.WeiXinIV)
    ImageView WeiXinIV;

    private IWXAPI api;
    @Override
    protected int getLayoutId() {
        return R.layout.a_activity_login;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation

        ButterKnife.bind(this);

        api = WXAPIFactory.createWXAPI(this, Constants.APP_ID, false);

        MobileET.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (MobileET.getText().toString().length() == 11) {
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

        OKBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (MStringUtils.IsNullOrEmpty(MobileET.getText().toString())) {
                    showMessage("请输入手机号");
                    return;
                }
                if (MobileET.getText().toString().length() != 11) {
                    showMessage("请输入11位手机号");
                    return;
                }
                if (!MobileET.getText().toString().substring(0, 1).equals("1")) {
                    showMessage("请输入正确手机号");
                    return;
                }
                Intent intent = new Intent(getContext(), A_LoginActivity_YanZheng.class);
                intent.putExtra("mobile", MobileET.getText().toString());
                startActivity(intent);
            }
        });

        MiMaDengLuTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), A_LoginActivity_MiMa.class);
                startActivity(intent);
            }
        });

        WeiXinIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!api.isWXAppInstalled()) {
                    Toast.makeText(getContext(), "您的设备未安装微信客户端", Toast.LENGTH_SHORT).show();
                } else {
                    WXAPI.Login();
                }
            }
        });
    }

    @Override
    protected LoginPresent createPresenter() {
        return new LoginPresent();
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
    public void loginSuccess(PhoneLoginInfo model) {
        SpUtils.saveSettingNote(getContext(), DbKeyS.isLogin, "1");

    }

    @Override
    public void onFailure(int code, String msg) {
        showMessage(msg);
    }

}
