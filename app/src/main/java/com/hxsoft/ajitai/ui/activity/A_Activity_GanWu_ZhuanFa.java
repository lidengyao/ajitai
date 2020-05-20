package com.hxsoft.ajitai.ui.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClient;
import com.amap.api.location.AMapLocationClientOption;
import com.amap.api.location.AMapLocationListener;
import com.hxsoft.ajitai.R;
import com.hxsoft.ajitai.base.MvpActivity;
import com.hxsoft.ajitai.model.bean.A_Conscious_Info;
import com.hxsoft.ajitai.model.bean.ExtralsBean;
import com.hxsoft.ajitai.model.info.CreateCconscious_Bean;
import com.hxsoft.ajitai.present.A_ZhuanFaGanWu_Present;
import com.hxsoft.ajitai.ui.view.A_ZhuanFaGanWu_View;
import com.hxsoft.ajitai.utils.GlideControl;
import com.hxsoft.ajitai.utils.SoftKeyboardUtil;

import java.util.Timer;
import java.util.TimerTask;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by jinxh on 16/2/1.
 */
public class A_Activity_GanWu_ZhuanFa extends MvpActivity<A_ZhuanFaGanWu_Present> implements A_ZhuanFaGanWu_View, AMapLocationListener {


    @Bind(R.id.SysNameIV)
    TextView SysNameIV;
    @Bind(R.id.JianJieRL)
    RelativeLayout JianJieRL;
    @Bind(R.id.ZhuanFaIV)
    ImageView ZhuanFaIV;
    @Bind(R.id.ZuoZheTV)
    TextView ZuoZheTV;
    @Bind(R.id.ContentTV)
    TextView ContentTV;
    @Bind(R.id.GuanBiLuYin_IV)
    ImageView GuanBiLuYinIV;
    @Bind(R.id.WanCheng_TV)
    TextView WanChengTV;
    @Bind(R.id.LuYinIngRL)
    RelativeLayout LuYinIngRL;
    @Bind(R.id.ShiJian_TV)
    TextView ShiJianTV;
    @Bind(R.id.WanChengLuYin_RL)
    RelativeLayout WanChengLuYinRL;
    @Bind(R.id.BottomLL)
    LinearLayout BottomLL;
    @Bind(R.id.ZhuanFaContentET)
    EditText ZhuanFaContentET;
    @Bind(R.id.DingWeiLL)
    LinearLayout DingWeiLL;
    @Bind(R.id.CityTV)
    TextView CityTV;
    @Bind(R.id.BoFangVedioIV)
    ImageView BoFangVedioIV;
    @Bind(R.id.BoFang_IV)
    ImageView BoFangIV;


    private A_Conscious_Info a_conscious_info;
    private String Longitude;
    private String Latitude;
    public AMapLocationClient mlocationClient = null;
    public AMapLocationClientOption mLocationOption = null;
    private String cityName;
    private String oldContent = "";


    @Override
    protected int getLayoutId() {
        return R.layout.a_activity_ganwu_zhuanfa;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);

        a_conscious_info = (A_Conscious_Info) getIntent().getSerializableExtra("A_Conscious_Info");


        //开始定位
        showLocation();
        if (a_conscious_info.getExtrals() != null) {
            if (a_conscious_info.getExtrals().size() > 0) {
                ZhuanFaIV.setVisibility(View.VISIBLE);
                GlideControl.SetImage(getContext(), a_conscious_info.getExtrals().get(0).getUri(), ZhuanFaIV, R.mipmap.jiazaiing);

                ExtralsBean extralsBean = a_conscious_info.getExtrals().get(0);
                if (extralsBean.getType() == 1) {
                    BoFangVedioIV.setVisibility(View.VISIBLE);
                } else {
                    BoFangVedioIV.setVisibility(View.GONE);
                }


                ContentTV.setText(a_conscious_info.getContent());
                ZuoZheTV.setText("@" + a_conscious_info.getNickname());

            } else {
                if (a_conscious_info.getRelayObject().getExtrals().size() > 0) {
                    ZhuanFaIV.setVisibility(View.VISIBLE);
                    GlideControl.SetImage(getContext(), a_conscious_info.getRelayObject().getExtrals().get(0).getUri(), ZhuanFaIV, R.mipmap.jiazaiing);

                    ExtralsBean extralsBean = a_conscious_info.getRelayObject().getExtrals().get(0);
                    if (extralsBean.getType() == 1) {
                        BoFangVedioIV.setVisibility(View.VISIBLE);
                    } else {
                        BoFangVedioIV.setVisibility(View.GONE);
                    }


                    ContentTV.setText(a_conscious_info.getRelayObject().getContent());
                    ZuoZheTV.setText("@" + a_conscious_info.getNickname());

                    String replayTxt = "//";

                    for (int i = 0; i < a_conscious_info.getRelayObject().getReplylist().size(); i++) {
                        if (i != a_conscious_info.getRelayObject().getReplylist().size() - 1) {
                            A_Conscious_Info.relayObjectBean.ReplylistBean replylistBean = a_conscious_info.getRelayObject().getReplylist().get(i);
                            replayTxt += "@" + replylistBean.getNickname() + ":" + replylistBean.getContent();
                        }
                    }
                    oldContent = replayTxt;
                    ZhuanFaContentET.setText(replayTxt);


                    ZhuanFaContentET.setFocusable(true);
                    ZhuanFaContentET.setFocusableInTouchMode(true);
                    ZhuanFaContentET.requestFocus();
                    Timer timer = new Timer();
                    timer.schedule(new TimerTask() {
                                       public void run() {
                                           ZhuanFaContentET.setSelection(0);
                                           SoftKeyboardUtil.showKeyboard(ZhuanFaContentET.getContext(), ZhuanFaContentET);
                                       }
                                   },
                            150);//这里键盘没有自动弹起可以把时间值设大一点

                } else {
                    ZhuanFaIV.setVisibility(View.GONE);
                }
            }
        } else {
        }


        BottomLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ZhuanFaContentET.getText().toString().trim().equals("")) {
                    showMessage("你还没有填写感悟的内容哦");
                    return;
                }

                String sendMsg = ZhuanFaContentET.getText().toString().replace(oldContent, "");

                CreateCconscious_Bean createCconscious_bean = new CreateCconscious_Bean();

                createCconscious_bean.setContent(sendMsg);
                createCconscious_bean.setPosition(cityName);
                createCconscious_bean.setRelaycid(a_conscious_info.getCid());
                mPresenter.postConscious(createCconscious_bean, getContext());
            }
        });
    }

    private void showLocation() {
        try {
            mlocationClient = new AMapLocationClient(this);
            mLocationOption = new AMapLocationClientOption();
            mlocationClient.setLocationListener(this);
            //设置定位模式为高精度模式，Battery_Saving为低功耗模式，Device_Sensors是仅设备模式
            mLocationOption.setLocationMode(AMapLocationClientOption.AMapLocationMode.Hight_Accuracy);
            mLocationOption.setInterval(5000);
            //设置定位参数
            mlocationClient.setLocationOption(mLocationOption);
            //启动定位
            mlocationClient.startLocation();
        } catch (Exception e) {

        }
    }

    @Override
    protected A_ZhuanFaGanWu_Present createPresenter() {
        return new A_ZhuanFaGanWu_Present();
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
    public void postConsciousSuccess(Boolean model) {
        showMessage("转发成功");
        finish();
    }

    @Override
    public void onFailure(int code, String msg) {
        showMessage(msg);
    }

    @Override
    public void onLocationChanged(AMapLocation amapLocation) {
        try {
            if (amapLocation != null) {
                DingWeiLL.setVisibility(View.VISIBLE);
                if (amapLocation.getErrorCode() == 0) {
                    Longitude = amapLocation.getLongitude() + "";
                    Latitude = amapLocation.getLatitude() + "";
                    //定位成功回调信息，设置相关消息
                    cityName = amapLocation.getProvince() + amapLocation.getCity() + amapLocation.getDistrict();
                    CityTV.setTextColor(getResources().getColor(R.color.C242424));
                    CityTV.setText(cityName);
                } else {
                    CityTV.setText("定位失败");
                    CityTV.setTextColor(getResources().getColor(R.color.sysorange));
                    //定位失败时，可通过ErrCode（错误码）信息来确定失败的原因，errInfo是错误信息，详见错误码表。
                }

                // 停止定位
                mlocationClient.stopLocation();
            }
        } catch (Exception e) {
        }
    }
}
