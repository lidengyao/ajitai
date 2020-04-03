package com.hxsoft.ajitai.ui.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.hxsoft.ajitai.R;
import com.hxsoft.ajitai.base.MvpActivity;
import com.hxsoft.ajitai.present.LoginPresent;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by jinxh on 16/2/1.
 */
public class A_Activity_GouWuChe extends MvpActivity {


    @Bind(R.id.SysNameIV)
    TextView SysNameIV;
    @Bind(R.id.GuanLi_RL)
    RelativeLayout GuanLiRL;
    @Bind(R.id.textView)
    TextView textView;
    @Bind(R.id.JinE_LL)
    LinearLayout JinELL;
    @Bind(R.id.BottomLL)
    RelativeLayout BottomLL;
    @Bind(R.id.GuanLi_TV)
    TextView GuanLiTV;
    @Bind(R.id.JieSuan_Btn)
    Button JieSuanBtn;
    @Bind(R.id.GouWuCheOne_LL)
    LinearLayout GouWuCheOneLL;
    @Bind(R.id.GouWuCheTwo_LL)
    LinearLayout GouWuCheTwoLL;

    @Override
    protected int getLayoutId() {
        return R.layout.a_activity_gouwuche;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);

        ImageView checkOne_IV=GouWuCheOneLL.findViewById(R.id.Check_IV);
        ImageView checkTwo_IV=GouWuCheTwoLL.findViewById(R.id.Check_IV);
        GuanLiRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (GuanLiTV.getText().toString().equals("管理")) {
                    GuanLiTV.setText("完成");
                    JinELL.setVisibility(View.GONE);
                    JieSuanBtn.setText("删除");
                    checkOne_IV.setVisibility(View.VISIBLE);
                    checkTwo_IV.setVisibility(View.VISIBLE);
                    return;
                }
                if (GuanLiTV.getText().toString().equals("完成")) {
                    GuanLiTV.setText("管理");
                    JinELL.setVisibility(View.VISIBLE);
                    JieSuanBtn.setText("结算");
                    checkOne_IV.setVisibility(View.GONE);
                    checkTwo_IV.setVisibility(View.GONE);
                    return;
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


}
