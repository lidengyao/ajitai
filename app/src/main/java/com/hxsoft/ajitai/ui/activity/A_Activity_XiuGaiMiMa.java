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

import com.hxsoft.ajitai.AppContext;
import com.hxsoft.ajitai.R;
import com.hxsoft.ajitai.base.MvpActivity;
import com.hxsoft.ajitai.model.bean.A_UserUpdatecurrent_Bean;
import com.hxsoft.ajitai.present.A_XiuGaiMiMa_Present;
import com.hxsoft.ajitai.ui.view.A_XiuGaiMiMa_View;
import com.hxsoft.ajitai.utils.DbKeyS;
import com.hxsoft.ajitai.utils.EncryptionUtil;
import com.hxsoft.ajitai.utils.MStringUtils;
import com.hxsoft.ajitai.utils.SpUtils;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by jinxh on 16/2/1.
 */
public class A_Activity_XiuGaiMiMa extends MvpActivity<A_XiuGaiMiMa_Present> implements A_XiuGaiMiMa_View {


    @Bind(R.id.SysNameIV)
    TextView SysNameIV;
    @Bind(R.id.QieHuanZhangHaoRL)
    RelativeLayout QieHuanZhangHaoRL;
    @Bind(R.id.oldpassword_ET)
    EditText oldpasswordET;
    @Bind(R.id.newpassword_ET)
    EditText newpasswordET;
    @Bind(R.id.OKBtn)
    Button OKBtn;
    @Bind(R.id.RootView)
    RelativeLayout RootView;

    @Override
    protected int getLayoutId() {
        return R.layout.a_activity_xiugaimima;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);

        oldpasswordET.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (oldpasswordET.getText().toString().length() > 0 && newpasswordET.getText().toString().length() > 0) {
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

        newpasswordET.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (oldpasswordET.getText().toString().length() > 0 && newpasswordET.getText().toString().length() > 0) {
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
                if (oldpasswordET.getText().toString().equals("")) {
                    showMessage("请输入原始密码");
                    return;
                }

                if (newpasswordET.getText().toString().equals("")) {
                    showMessage("请输入新密码");
                    return;
                }


                A_UserUpdatecurrent_Bean a_userUpdatecurrent_bean = new A_UserUpdatecurrent_Bean();

                String oldPwd = oldpasswordET.getText().toString();
                String newPwd = newpasswordET.getText().toString();
                String oldPwdStr = "";
                String newPwdStr = "";
                try {
                    oldPwdStr = EncryptionUtil.Encrypt(oldPwd, AppContext.sKey);
                    newPwdStr = EncryptionUtil.Encrypt(newPwd, AppContext.sKey);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                a_userUpdatecurrent_bean.setOldpassword(oldPwdStr);
                a_userUpdatecurrent_bean.setPassword(newPwdStr);
                mPresenter.adminUserUpdatecurrent(a_userUpdatecurrent_bean, getContext());
            }
        });
    }

    @Override
    protected A_XiuGaiMiMa_Present createPresenter() {
        return new A_XiuGaiMiMa_Present();
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
    public void userUpdatecurrentSuccess(Boolean model) {
        if (model) {
            showMessage("密码修改成功");
            SpUtils.saveSettingNote(getContext(), DbKeyS.token, null);
            SpUtils.saveSettingNote(getContext(), DbKeyS.isLogin, null);
            Intent intent = new Intent(getContext(), A_LoginActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
            finish();
        } else {
            showMessage("密码修改失败");
        }
    }

    @Override
    public void onFailure(int code, String msg) {
        showMessage(msg);
    }
}
