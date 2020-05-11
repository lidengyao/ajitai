package com.hxsoft.ajitai.ui.activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.hxsoft.ajitai.R;
import com.hxsoft.ajitai.base.MvpActivity;
import com.hxsoft.ajitai.present.A_SheZhi_Present;
import com.hxsoft.ajitai.present.A_ShouHuoDiZhi_Present;
import com.hxsoft.ajitai.present.LoginPresent;
import com.hxsoft.ajitai.ui.view.A_SheZhi_View;
import com.hxsoft.ajitai.ui.view.A_ShouHuoDiZhi_View;
import com.hxsoft.ajitai.utils.DbKeyS;
import com.hxsoft.ajitai.utils.SpUtils;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by jinxh on 16/2/1.
 */
public class A_Activity_SheZhi extends MvpActivity<A_SheZhi_Present> implements A_SheZhi_View {


    @Bind(R.id.SysNameIV)
    TextView SysNameIV;
    @Bind(R.id.QieHuanZhangHaoRL)
    RelativeLayout QieHuanZhangHaoRL;
    @Bind(R.id.GuanYu_RL)
    RelativeLayout GuanYuRL;
    @Bind(R.id.textView)
    TextView textView;
    @Bind(R.id.BottomLL)
    LinearLayout BottomLL;

    @Override
    protected int getLayoutId() {
        return R.layout.a_activity_shezhi;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);


        GuanYuRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), A_Activity_GuanYu.class);
                startActivity(intent);
            }
        });

        BottomLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setTitle("提示").setMessage("确定退出当前登录账号吗").setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                }).setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        mPresenter.authTokenLogout(getContext());
                    }
                }).show();
            }
        });
    }


    @Override
    protected A_SheZhi_Present createPresenter() {
        return new A_SheZhi_Present();
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
    public void authTokenLogoutSuccess(String model) {
        showMessage("已退出当前登录账号");
        SpUtils.saveSettingNote(getContext(), DbKeyS.token, null);
        SpUtils.saveSettingNote(getContext(), DbKeyS.isLogin, null);
        Intent intent = new Intent(getContext(), A_LoginActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }

    @Override
    public void onFailure(int code, String msg) {
        showMessage(msg);
    }
}
