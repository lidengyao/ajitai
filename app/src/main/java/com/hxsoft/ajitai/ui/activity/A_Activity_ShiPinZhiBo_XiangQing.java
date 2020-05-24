package com.hxsoft.ajitai.ui.activity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.hxsoft.ajitai.R;
import com.hxsoft.ajitai.adapter.FmPagerAdapter;
import com.hxsoft.ajitai.base.MvpActivity;
import com.hxsoft.ajitai.model.info.A_Cvideostream_Info;
import com.hxsoft.ajitai.present.A_ShiPinZhiBo_XiangQing_Present;
import com.hxsoft.ajitai.ui.fragment.Y_Fragment_ShiPinZhiBo_XiangQing_HuDong;
import com.hxsoft.ajitai.ui.fragment.Y_Fragment_ShiPinZhiBo_XiangQing_ZhuBan;
import com.hxsoft.ajitai.ui.view.A_ShiPinZhiBo_XiangQing_View;
import com.hxsoft.ajitai.utils.CheckControl_Dialog_ShiPinZhiBoFenXiang;
import com.hxsoft.ajitai.utils.GlideControl;
import com.hxsoft.ajitai.utils.TimeUtils;
import com.hxsoft.ajitai.utils.VideoControl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import butterknife.Bind;
import butterknife.ButterKnife;
import cn.jzvd.JzvdStd;

/**
 * Created by jinxh on 16/2/1.
 */
public class A_Activity_ShiPinZhiBo_XiangQing extends MvpActivity<A_ShiPinZhiBo_XiangQing_Present> implements A_ShiPinZhiBo_XiangQing_View {

    @Bind(R.id.SysNameIV)
    TextView SysNameIV;
    @Bind(R.id.QieHuanZhangHaoRL)
    RelativeLayout QieHuanZhangHaoRL;
    @Bind(R.id.MenuTablayout)
    TabLayout MenuTablayout;
    @Bind(R.id.viewPager)
    ViewPager viewPager;
    @Bind(R.id.BackIV)
    ImageView BackIV;
    @Bind(R.id.HeadToolbar)
    Toolbar HeadToolbar;
    @Bind(R.id.BaoMingBtn)
    Button BaoMingBtn;
    @Bind(R.id.ContentET)
    EditText ContentET;
    @Bind(R.id.Img_ShareLL)
    LinearLayout ImgShareLL;
    @Bind(R.id.SendBtn)
    Button SendBtn;
    @Bind(R.id.CaoZuoLL)
    LinearLayout CaoZuoLL;
    @Bind(R.id.BottomRL)
    RelativeLayout BottomRL;
    @Bind(R.id.FenXinagIV)
    ImageView FenXinagIV;
    @Bind(R.id.faceIV)
    ImageView faceIV;
    @Bind(R.id.DaoJiShiTV)
    TextView DaoJiShiTV;
    @Bind(R.id.StartTimeTV)
    TextView StartTimeTV;
    @Bind(R.id.ShiPin_Video)
    JzvdStd ShiPinVideo;
    private FmPagerAdapter pagerAdapter;
    private ArrayList<Fragment> fragments = new ArrayList<>();
    private String[] titles = new String[]{"主办", "互动"};
    private Y_Fragment_ShiPinZhiBo_XiangQing_ZhuBan y_fragment_shiPinZhiBo_xiangQing_zhuBan;
    private Y_Fragment_ShiPinZhiBo_XiangQing_HuDong y_fragment_shiPinZhiBo_xiangQing_huDong;
    private String vid;
    private A_Cvideostream_Info a_cvideostream_info;

    @Override
    protected int getLayoutId() {
        return R.layout.a_activity_shipinzhibo_xiangqing;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);

        vid = getIntent().getStringExtra("vid");


        BaoMingBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (a_cvideostream_info.getIsattend() == 0) {
                    mPresenter.cvideostreamAttend(Integer.parseInt(vid), getContext());
                }
                if (a_cvideostream_info.getIsattend() == 1) {
                    mPresenter.cvideostreamCancle(Integer.parseInt(vid), getContext());
                }
            }
        });

        ContentET.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

//                if (s.length() > 0) {
//                    ImgShareLL.setVisibility(View.GONE);
//                    SendBtn.setVisibility(View.VISIBLE);
//                } else {
//
//                    ImgShareLL.setVisibility(View.VISIBLE);
//                    SendBtn.setVisibility(View.GONE);
//                }
            }
        });

        FenXinagIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckControl_Dialog_ShiPinZhiBoFenXiang.ShowDialog(getContext(), getActivity(), "", new CheckControl_Dialog_ShiPinZhiBoFenXiang.OnCheckControl_dialogClickListener() {
                    @Override
                    public void OnClick(int type) {

                    }
                });
            }
        });

        SendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String content = ContentET.getText().toString();
                if (content.equals("")) {
                    showMessage("请输入评论内容");
                    return;
                }
                y_fragment_shiPinZhiBo_xiangQing_huDong.SenMsg(Integer.parseInt(vid), ContentET.getText().toString());
                viewPager.setCurrentItem(1);
                ContentET.setText("");
            }
        });
        getData();

        //进入直播间
        mPresenter.cvideostreamEnter(Integer.parseInt(vid), getContext());
    }


    private void getData() {
        mPresenter.courseCvideostreamView(Integer.parseInt(vid), getContext());
    }

    private void init() {

        y_fragment_shiPinZhiBo_xiangQing_zhuBan = new Y_Fragment_ShiPinZhiBo_XiangQing_ZhuBan();
        y_fragment_shiPinZhiBo_xiangQing_huDong = new Y_Fragment_ShiPinZhiBo_XiangQing_HuDong();
        fragments.add(y_fragment_shiPinZhiBo_xiangQing_zhuBan);
        fragments.add(y_fragment_shiPinZhiBo_xiangQing_huDong);


        for (int i = 0; i < titles.length; i++) {
            MenuTablayout.addTab(MenuTablayout.newTab());
        }

        MenuTablayout.setupWithViewPager(viewPager, false);
        pagerAdapter = new FmPagerAdapter(fragments, getSupportFragmentManager());
        viewPager.setAdapter(pagerAdapter);

        for (int i = 0; i < titles.length; i++) {
            MenuTablayout.getTabAt(i).setText(titles[i]);
        }
        y_fragment_shiPinZhiBo_xiangQing_zhuBan.SetData(a_cvideostream_info);
        y_fragment_shiPinZhiBo_xiangQing_huDong.SetData(a_cvideostream_info);

        y_fragment_shiPinZhiBo_xiangQing_huDong.getData();
    }

    @Override
    protected A_ShiPinZhiBo_XiangQing_Present createPresenter() {
        return new A_ShiPinZhiBo_XiangQing_Present();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //离开直播间
        mPresenter.cvideostreamLeave(Integer.parseInt(vid), getContext());
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
    public void cvideostreamViewSuccess(A_Cvideostream_Info model) {
        if (model == null)
            return;


        a_cvideostream_info = model;
        init();
        SysNameIV.setText(model.getSname());
        GlideControl.SetImage(getContext(), model.getFaceurl(), faceIV, R.mipmap.jiazaiing);

        //播放器
        ShiPinVideo.setUp(model.getVideourl(), model.getSname());

        GlideControl.SetImage(getContext(), model.getFaceurl(), ShiPinVideo.thumbImageView, R.mipmap.jiazaiing);

        Date startDate = TimeUtils.parseTimeString2Date(model.getStarttime());
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(startDate);
//        Log.i("cp", "year=" + calendar.get(Calendar.YEAR) + " month=" + (calendar.get(Calendar.MONTH) + 1) +
//                " day=" + calendar.get(Calendar.DAY_OF_MONTH) + "hour= " + calendar.get(Calendar.HOUR) + " minute= " + calendar.get(Calendar.MINUTE));
//        Log.i("cp", "year=" + calendar.get(Calendar.YEAR) + " month=" + (calendar.get(Calendar.MONTH) + 1) +
//                " day=" + calendar.get(Calendar.DAY_OF_MONTH) + "hour= " + calendar.get(Calendar.HOUR_OF_DAY) + " minute= " + calendar.get(Calendar.MINUTE));
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int hour = calendar.get(Calendar.HOUR);
        int minute = calendar.get(Calendar.MINUTE);
        StartTimeTV.setText("（" + day + "号" + hour + "点" + minute + "分）");
        if (model.getIsattend() == 1) {
            BaoMingBtn.setBackground(getResources().getDrawable(R.drawable.sysbtn_gray_f6f6f6_4_shape));
            BaoMingBtn.setText("已报名");
            BaoMingBtn.setTextColor(getResources().getColor(R.color.C808080));
        }
        if (model.getIsattend() == 0) {
            BaoMingBtn.setBackground(getResources().getDrawable(R.drawable.sysbtn_ffe248_4_shape));
            BaoMingBtn.setText("免费报名");
            BaoMingBtn.setTextColor(getResources().getColor(R.color.C242424));
        }


        Calendar c = Calendar.getInstance();//
        int mYear = c.get(Calendar.YEAR); // 获取当前年份
        int mMonth = c.get(Calendar.MONTH) + 1;// 获取当前月份
        int mDay = c.get(Calendar.DAY_OF_MONTH);// 获取当日期
        int mHour = c.get(Calendar.HOUR_OF_DAY);//时
        int mMinute = c.get(Calendar.MINUTE);//分
        int mSec = c.get(Calendar.SECOND);//秒
        String nowDateStr = mYear + "-" + mMonth + "-" + mDay + " " + mHour + ":" + mMinute + ":" + mSec;
        formatLongToTimeStr(model.getStarttime(), nowDateStr);

        mTimer = new Timer();
        startRun();

    }

    @Override
    public void cvideostreamAttendSuccess(Boolean model) {
        BaoMingBtn.setBackground(getResources().getDrawable(R.drawable.sysbtn_gray_f6f6f6_4_shape));
        BaoMingBtn.setText("已报名");
        BaoMingBtn.setTextColor(getResources().getColor(R.color.C808080));
        a_cvideostream_info.setIsattend(1);
    }

    @Override
    public void cvideostreamCancleSuccess(Boolean model) {
        BaoMingBtn.setBackground(getResources().getDrawable(R.drawable.sysbtn_ffe248_4_shape));
        BaoMingBtn.setText("免费报名");
        BaoMingBtn.setTextColor(getResources().getColor(R.color.C242424));
        a_cvideostream_info.setIsattend(0);
    }

    @Override
    public void cvideostreamEnterSuccess(Boolean model) {

    }

    @Override
    public void cvideostreamLeaveSuccess(Boolean model) {

    }

    @Override
    public void onFailure(int code, String msg) {
        showMessage(msg);
    }


    public void formatLongToTimeStr(String targetDateStr, String nowDateStr) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date targateDate = null;
        Date nowDate = null;
        try {
            targateDate = df.parse(targetDateStr);
            nowDate = df.parse(nowDateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        long l = targateDate.getTime() - nowDate.getTime();
        mDay = l / (24 * 60 * 60 * 1000);
        mHour = (l / (60 * 60 * 1000) - mDay * 24);
        mMin = ((l / (60 * 1000)) - mDay * 24 * 60 - mHour * 60);
        mSecond = (l / 1000 - mDay * 24 * 60 * 60 - mHour * 60 * 60 - mMin * 60);
//        DaoJiShiTV.setText("" + mDay + "天" + mHour + "小时" + mMin + "分" + s + "秒");

    }

    private long mDay = 0;// 天
    private long mHour = 0;//小时,
    private long mMin = 0;//分钟,
    private long mSecond = 0;//秒

    private Timer mTimer;


    private Handler timeHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if (msg.what == 1) {
                computeTime();

                DaoJiShiTV.setText("距离直播开始：" + mDay + "天" + mHour + "时" + mMin + "分" + mSecond + "秒");
                if (mSecond == 0 && mDay == 0 && mHour == 0 && mMin == 0) {
                    mTimer.cancel();
                }
            }
        }
    };

    private String getTv(long l) {
        if (l >= 10) {
            return l + "";
        } else {
            return "0" + l;//小于10,,前面补位一个"0"
        }
    }

    /**
     * 开启倒计时
     * //time为Date类型：在指定时间执行一次。
     * timer.schedule(task, time);
     * //firstTime为Date类型,period为long，表示从firstTime时刻开始，每隔period毫秒执行一次。
     * timer.schedule(task, firstTime,period);
     * //delay 为long类型：从现在起过delay毫秒执行一次。
     * timer.schedule(task, delay);
     * //delay为long,period为long：从现在起过delay毫秒以后，每隔period毫秒执行一次。
     * timer.schedule(task, delay,period);
     */
    private void startRun() {
        TimerTask mTimerTask = new TimerTask() {
            @Override
            public void run() {
                Message message = Message.obtain();
                message.what = 1;
                timeHandler.sendMessage(message);
            }
        };
        mTimer.schedule(mTimerTask, 0, 1000);
    }

    /**
     * 倒计时计算
     */
    private void computeTime() {
        mSecond--;
        if (mSecond < 0) {
            mMin--;
            mSecond = 59;
            if (mMin < 0) {
                mMin = 59;
                mHour--;
                if (mHour < 0) {
                    // 倒计时结束
                    mHour = 23;
                    mDay--;
                    if (mDay < 0) {
                        // 倒计时结束
                        mDay = 0;
                        mHour = 0;
                        mMin = 0;
                        mSecond = 0;
                    }
                }
            }
        }
    }
}
