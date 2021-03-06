package com.hxsoft.ajitai.ui.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.hxsoft.ajitai.R;
import com.hxsoft.ajitai.base.MvpActivity;
import com.hxsoft.ajitai.model.bean.UserInfo;
import com.hxsoft.ajitai.present.GetWebDataBodyPresent;
import com.hxsoft.ajitai.ui.view.GetWebDataBodyView;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by lidengyao on 2016-09-17 0017.
 */
public class GetWebDataBodyAvtivity extends MvpActivity<GetWebDataBodyPresent> implements GetWebDataBodyView {
    @Bind(R.id.BtnBody)
    Button BtnBody;

    @Override
    protected GetWebDataBodyPresent createPresenter() {
        return new GetWebDataBodyPresent();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_getwebdatabody;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);

        BtnBody.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPresenter.login("15251435195", "123456");
            }
        });
    }

    @Override
    public void loginSuccess(UserInfo model) {

    }
}
