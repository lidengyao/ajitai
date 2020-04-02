package com.hxsoft.ajitai.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.hxsoft.ajitai.R;
import com.hxsoft.ajitai.base.MvpActivity;
import com.hxsoft.ajitai.present.LoginPresent;
import com.hxsoft.ajitai.timepaker.ChangeDatePopwindow;
import com.hxsoft.ajitai.utils.CheckControl_Dialog_XingBie;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by jinxh on 16/2/1.
 */
public class A_Activity_GeRenXinXi extends MvpActivity {


    @Bind(R.id.SysNameIV)
    TextView SysNameIV;
    @Bind(R.id.QieHuanZhangHaoRL)
    RelativeLayout QieHuanZhangHaoRL;
    @Bind(R.id.textView)
    TextView textView;
    @Bind(R.id.BottomLL)
    LinearLayout BottomLL;
    @Bind(R.id.ChuShengRiQi_TV)
    TextView ChuShengRiQiTV;
    @Bind(R.id.XingBie_TV)
    TextView XingBieTV;
    @Bind(R.id.ShouHuoDiZhi_TV)
    TextView ShouHuoDiZhiTV;
    @Bind(R.id.ShouHuoDiZhi_RL)
    RelativeLayout ShouHuoDiZhiRL;
    @Bind(R.id.ZengPiaoZiZhi_TV)
    TextView ZengPiaoZiZhiTV;
    @Bind(R.id.ZengPiaoZiZhi_RL)
    RelativeLayout ZengPiaoZiZhiRL;

    @Override
    protected int getLayoutId() {
        return R.layout.a_activity_gerenxinxi;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);

        ZengPiaoZiZhiRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), A_Activity_ZengPiaoZiZhi.class);
                startActivity(intent);
            }
        });

        ZengPiaoZiZhiTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), A_Activity_ZengPiaoZiZhi.class);
                startActivity(intent);
            }
        });
        ShouHuoDiZhiTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), A_Activity_ShouHuoDiZhi.class);
                startActivity(intent);
            }
        });

        ShouHuoDiZhiRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), A_Activity_ShouHuoDiZhi.class);
                startActivity(intent);
            }
        });
        XingBieTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckControl_Dialog_XingBie.ShowDialog(getContext(), getActivity(), "", new CheckControl_Dialog_XingBie.OnCheckControl_dialogClickListener() {
                    @Override
                    public void OnClick(int type) {

                    }
                });
            }
        });
        ChuShengRiQiTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ChangeDatePopwindow mChangeBirthDialog = new ChangeDatePopwindow();
                mChangeBirthDialog.ShowDialog(getContext(), getActivity(), true, true, true, new ChangeDatePopwindow.OnBirthListener() {
                    @Override
                    public void onClick(String year, String month, String day) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(year.substring(0, year.length() - 1)).append("-").append(month.substring(0, month.length() - 1)).append("-").append(day.substring(0, day.length() - 1));
                        String showDate = sb.toString();

//                        birthdayTV.setText(showDate);
//                        UserIndexBean userIndexBean = new UserIndexBean();
//                        userIndexBean.setBirthday(showDate);
//                        mPresenter.userprofile(getContext(), userIndexBean);

                    }
                });
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
