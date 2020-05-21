package com.hxsoft.ajitai.ui.activity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.hxsoft.ajitai.R;
import com.hxsoft.ajitai.base.BasePresent;
import com.hxsoft.ajitai.base.MvpActivity;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by jinxh on 16/2/1.
 */
public class A_Activity_XiuGaiMiMa extends MvpActivity {


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
