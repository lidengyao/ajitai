package com.hxsoft.ajitai.ui.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.hxsoft.ajitai.R;
import com.hxsoft.ajitai.base.BasePresent;
import com.hxsoft.ajitai.base.MvpActivity;
import com.hxsoft.ajitai.utils.CheckControl_Dialog_ChongZhi_QueRen;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by jinxh on 16/2/1.
 */
public class A_Activity_ChongZhi_HaoYou_KeChengJine extends MvpActivity {


    @Bind(R.id.SysNameIV)
    TextView SysNameIV;
    @Bind(R.id.JianJieRL)
    RelativeLayout JianJieRL;
    @Bind(R.id.KeCheng_TV)
    TextView KeChengTV;
    @Bind(R.id.JinE_TV)
    TextView JinETV;
    @Bind(R.id.KeCheng_RL)
    RelativeLayout KeChengRL;
    @Bind(R.id.QingKong_IV)
    ImageView QingKongIV;
    @Bind(R.id.JinE_RL)
    RelativeLayout JinERL;
    @Bind(R.id.BottomLL)
    LinearLayout BottomLL;
    @Bind(R.id.Qi_Btn)
    Button QiBtn;
    @Bind(R.id.ErYi_Btn)
    Button ErYiBtn;
    @Bind(R.id.SanWu_Btn)
    Button SanWuBtn;

    @Override
    protected int getLayoutId() {
        return R.layout.a_activity_chongzhi_haoyou_kechengjine;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);

        BottomLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckControl_Dialog_ChongZhi_QueRen.ShowDialog(getContext(), getActivity(), "", new CheckControl_Dialog_ChongZhi_QueRen.OnCheckControl_dialogClickListener() {
                    @Override
                    public void OnClick(int type) {

                    }
                });
            }
        });
        KeChengTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                KeChengTV.setTextColor(getResources().getColor(R.color.C242424));
                JinETV.setTextColor(getResources().getColor(R.color.C808080));

                KeChengRL.setVisibility(View.VISIBLE);
                JinERL.setVisibility(View.GONE);
            }
        });

        JinETV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                KeChengTV.setTextColor(getResources().getColor(R.color.C808080));
                JinETV.setTextColor(getResources().getColor(R.color.C242424));

                KeChengRL.setVisibility(View.GONE);
                JinERL.setVisibility(View.VISIBLE);
            }
        });

        QiBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                QiBtn.setBackground(getResources().getDrawable(R.drawable.sysbtn_ffe248_4_shape));
                ErYiBtn.setBackground(getResources().getDrawable(R.drawable.sysbtn_f3f3f3_4_shape));
                SanWuBtn.setBackground(getResources().getDrawable(R.drawable.sysbtn_f3f3f3_4_shape));

                QiBtn.setTextColor(getResources().getColor(R.color.C242424));
                ErYiBtn.setTextColor(getResources().getColor(R.color.C808080));
                SanWuBtn.setTextColor(getResources().getColor(R.color.C808080));

            }
        });
        ErYiBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                QiBtn.setBackground(getResources().getDrawable(R.drawable.sysbtn_f3f3f3_4_shape));
                ErYiBtn.setBackground(getResources().getDrawable(R.drawable.sysbtn_ffe248_4_shape));
                SanWuBtn.setBackground(getResources().getDrawable(R.drawable.sysbtn_f3f3f3_4_shape));

                QiBtn.setTextColor(getResources().getColor(R.color.C808080));
                ErYiBtn.setTextColor(getResources().getColor(R.color.C242424));
                SanWuBtn.setTextColor(getResources().getColor(R.color.C808080));
            }
        });
        SanWuBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                QiBtn.setBackground(getResources().getDrawable(R.drawable.sysbtn_f3f3f3_4_shape));
                ErYiBtn.setBackground(getResources().getDrawable(R.drawable.sysbtn_f3f3f3_4_shape));
                SanWuBtn.setBackground(getResources().getDrawable(R.drawable.sysbtn_ffe248_4_shape));

                QiBtn.setTextColor(getResources().getColor(R.color.C808080));
                ErYiBtn.setTextColor(getResources().getColor(R.color.C808080));
                SanWuBtn.setTextColor(getResources().getColor(R.color.C242424));
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
