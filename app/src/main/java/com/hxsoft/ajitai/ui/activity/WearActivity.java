package com.hxsoft.ajitai.ui.activity;

import android.os.Bundle;
import android.view.View;

import com.hxsoft.ajitai.R;
import com.hxsoft.ajitai.base.MvpActivity;
import com.hxsoft.ajitai.model.info.PhoneLoginInfo;
import com.hxsoft.ajitai.present.LoginPresent;
import com.hxsoft.ajitai.ui.view.LoginView;

import butterknife.ButterKnife;

/**
 * Created by jinxh on 16/2/1.
 */
public class WearActivity extends MvpActivity<LoginPresent> implements View.OnClickListener, LoginView {

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
    protected int getLayoutId() {
        return R.layout.activity_wear;
    }

    @Override
    public void onClick(View v) {
    }


    @Override
    public void loginSuccess(PhoneLoginInfo model) {
        showMessage("登陆成功");

    }

    @Override
    public void onFailure(int code, String msg) {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
//            View decorView = getWindow().getDecorView();
//
//            int option = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
//
//                    | View.SYSTEM_UI_FLAG_LAYOUT_STABLE;
//
//            decorView.setSystemUiVisibility(option);
//            getWindow().setStatusBarColor(Color.TRANSPARENT);
//        }

    }
}
