package com.hxsoft.ajitai.ui.activity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.hxsoft.ajitai.BuildConfig;
import com.hxsoft.ajitai.R;
import com.hxsoft.ajitai.base.BasePresent;
import com.hxsoft.ajitai.base.MvpActivity;
import com.hxsoft.ajitai.jpush.ExampleUtil;
import com.hxsoft.ajitai.jpush.LocalBroadcastManager;
import com.hxsoft.ajitai.present.A_WoDe_Present;
import com.hxsoft.ajitai.ui.fragment.A_FaXian_Fragment;
import com.hxsoft.ajitai.ui.fragment.A_GanWu_Fragment;
import com.hxsoft.ajitai.ui.fragment.A_WoDe_Fragment;
import com.hxsoft.ajitai.widget.ScrollViewPager;
import com.yanzhenjie.permission.Action;
import com.yanzhenjie.permission.AndPermission;
import com.yanzhenjie.permission.Permission;
import com.yanzhenjie.permission.Rationale;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import butterknife.Bind;
import butterknife.ButterKnife;

public class A_Main_Activity extends MvpActivity implements View.OnClickListener, ViewPager.OnPageChangeListener {

    ArrayList<Fragment> fragments = new ArrayList<>();
    @Bind(R.id.ContentSP)
    ScrollViewPager ContentSP;
    @Bind(R.id.FaXianIV)
    ImageView FaXianIV;
    @Bind(R.id.FaXianTV)
    TextView FaXianTV;
    @Bind(R.id.FaXianLL)
    LinearLayout FaXianLL;
    @Bind(R.id.GanWuIV)
    ImageView GanWuIV;
    @Bind(R.id.GanWuTV)
    TextView GanWuTV;
    @Bind(R.id.GanWuLL)
    LinearLayout GanWuLL;
    @Bind(R.id.WoDeIV)
    ImageView WoDeIV;
    @Bind(R.id.WoDeTV)
    TextView WoDeTV;
    @Bind(R.id.WoDeLL)
    LinearLayout WoDeLL;
    @Bind(R.id.ShouYeBottomLL)
    LinearLayout ShouYeBottomLL;
    private MyFragmentPagerAdapter mPagerAdapter;
    private final static int PAGE_FaXian = 0;
    private final static int PAGE_GanWu = 1;
    private final static int PAGE_WoDe = 2;
    private Rationale mRationale;
    public static boolean isForeground = false;
    public static final String MESSAGE_RECEIVED_ACTION = "com.example.jpushdemo.MESSAGE_RECEIVED_ACTION";
    public static final String KEY_MESSAGE = "message";
    public static final String KEY_EXTRAS = "extras";

    @Override
    protected int getLayoutId() {
        return R.layout.a_activity_main;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
        Init();

    }

    @Override
    protected BasePresent createPresenter() {
        return null;
    }


    private void Init() {
        String[] pers = new String[5];
        pers[0] = Permission.READ_EXTERNAL_STORAGE;
        pers[1] = Permission.WRITE_EXTERNAL_STORAGE;
        pers[2] = Permission.RECORD_AUDIO;
        pers[3] = Permission.CAMERA;
        pers[4] = Permission.READ_PHONE_STATE;
//        pers[5] = Permission.SEND_SMS;
        requestPermission(pers);
        mRationale = new DefaultRationale();
        FaXianLL.setOnClickListener(this);
        GanWuLL.setOnClickListener(this);
        WoDeLL.setOnClickListener(this);

        initPager();

        registerMessageReceiver();  // used for receive msg
    }

    private int getVersionCode(Context context) {
        int versionCode = 0;
        versionCode = BuildConfig.VERSION_CODE;
        return versionCode;
    }

    //读取文件权限
    private boolean IS_READ_EXTERNAL_STORAGE = true;

    //写文件权限
    private boolean IS_WRITE_EXTERNAL_STORAGE = true;

    //录音权限
    private boolean IS_RECORD_AUDIO = true;

    //相机权限
    private boolean IS_CAMERA = true;

    //
    private boolean IS_READ_PHONE_STATE = true;

    private boolean IS_SEND_SMS = true;

    private void requestPermission(String... permissions) {
        AndPermission.with(this)
                .permission(permissions)
                .rationale(mRationale)
                .onGranted(new Action() {
                    @Override
                    public void onAction(List<String> permissions) {
                        if (permissions.contains("android.permission.READ_EXTERNAL_STORAGE")) {
                            IS_READ_EXTERNAL_STORAGE = true;
                        }
                        if (permissions.contains("android.permission.WRITE_EXTERNAL_STORAGE")) {
                            IS_WRITE_EXTERNAL_STORAGE = true;
                        }
                        if (permissions.contains("android.permission.RECORD_AUDIO")) {
                            IS_RECORD_AUDIO = true;
                        }
                        if (permissions.contains("android.permission.CAMERA")) {
                            IS_CAMERA = true;
                        }
                        if (permissions.contains("android.permission.READ_PHONE_STATE")) {
                            IS_READ_PHONE_STATE = true;
                        }
//                        if (permissions.contains("android.permission.SEND_SMS")) {
//                            IS_SEND_SMS = true;
//                        }

//                        toast(R.string.successfully);
                    }
                })
                .onDenied(new Action() {
                    @Override
                    public void onAction(@NonNull List<String> permissions) {
                        //android.permission.READ_SMS
                        if (permissions.contains("android.permission.READ_EXTERNAL_STORAGE")) {
                            IS_READ_EXTERNAL_STORAGE = false;
                        }
                        if (permissions.contains("android.permission.WRITE_EXTERNAL_STORAGE")) {
                            IS_WRITE_EXTERNAL_STORAGE = false;
                        }
                        if (permissions.contains("android.permission.RECORD_AUDIO")) {
                            IS_RECORD_AUDIO = false;
                        }

                        if (permissions.contains("android.permission.CAMERA")) {
                            IS_CAMERA = false;
                        }
                        if (permissions.contains("android.permission.READ_PHONE_STATE")) {
                            IS_READ_PHONE_STATE = false;
                        }
//                        if (permissions.contains("android.permission.SEND_SMS")) {
//                            IS_SEND_SMS = false;
//                        }

                    }
                })
                .start();
    }

    private void initPager() {
        fragments = new ArrayList<>();
        fragments.add(new A_FaXian_Fragment());
        fragments.add(new A_GanWu_Fragment());
        fragments.add(new A_WoDe_Fragment());
        mPagerAdapter = new MyFragmentPagerAdapter(getSupportFragmentManager(), fragments);
        ContentSP.setAdapter(mPagerAdapter);
        ContentSP.addOnPageChangeListener(this);
        ContentSP.setOffscreenPageLimit(4);
        switchPage(0);
    }
//
//    @Override
//    protected void onNewIntent(Intent intent) {
//        super.onNewIntent(intent);
//        Init();
//    }

    private void switchPage(int position) {
        switch (position) {
            case PAGE_FaXian:
                FaXianIV.setImageResource(R.mipmap.faxian1);
                FaXianTV.setTextColor(getResources().getColor(R.color.color1));

                GanWuIV.setImageResource(R.mipmap.ganwu2);
                GanWuTV.setTextColor(getResources().getColor(R.color.color1));

                WoDeIV.setImageResource(R.mipmap.wode2);
                WoDeTV.setTextColor(getResources().getColor(R.color.color1));

                break;
            case PAGE_GanWu:
                FaXianIV.setImageResource(R.mipmap.faxian2);
                FaXianTV.setTextColor(getResources().getColor(R.color.color1));

                GanWuIV.setImageResource(R.mipmap.ganwu1);
                GanWuTV.setTextColor(getResources().getColor(R.color.color1));

                WoDeIV.setImageResource(R.mipmap.wode2);
                WoDeTV.setTextColor(getResources().getColor(R.color.color1));
                break;


            case PAGE_WoDe:
                FaXianIV.setImageResource(R.mipmap.faxian2);
                FaXianTV.setTextColor(getResources().getColor(R.color.color1));

                GanWuIV.setImageResource(R.mipmap.ganwu2);
                GanWuTV.setTextColor(getResources().getColor(R.color.color1));

                WoDeIV.setImageResource(R.mipmap.wode1);
                WoDeTV.setTextColor(getResources().getColor(R.color.color1));
                break;
        }

    }

    @Override
    public void onPageScrolled(int i, float v, int i1) {

    }

    @Override
    public void onPageSelected(int position) {
        switchPage(position);
    }

    @Override
    public void onPageScrollStateChanged(int i) {

    }

    @Override
    public void onClick(View v) {
        setOnClickThrottleFirst(v);
        switch (v.getId()) {
            case R.id.FaXianLL:
                ContentSP.setCurrentItem(PAGE_FaXian, false);
                break;
            case R.id.GanWuLL:
                ContentSP.setCurrentItem(PAGE_GanWu, false);
                break;
            case R.id.WoDeLL:
                ContentSP.setCurrentItem(PAGE_WoDe, false);
                break;
        }
    }



    public class MyFragmentPagerAdapter extends FragmentPagerAdapter {


        public MyFragmentPagerAdapter(FragmentManager fm, ArrayList<Fragment> fragments) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return fragments.get(position);
        }

        @Override
        public int getCount() {
            return fragments.size();
        }

    }

    public boolean onKeyDown(int keyCode, KeyEvent event) {

//        if (keyCode == KeyEvent.KEYCODE_BACK
//                && event.getRepeatCount() == 0) {
//            Intent i = new Intent(Intent.ACTION_MAIN);
//            i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//            i.addCategory(Intent.CATEGORY_HOME);
//            startActivity(i);
//            return true;
//        }
        return super.onKeyDown(keyCode, event);
    }


    /**
     * 获取输入的tags
     */
    private Set<String> getInPutTags() {

        Set<String> tagSet = new LinkedHashSet<String>();
        tagSet.add("15251435196");
        return tagSet;
    }

    @Override
    protected void onResume() {
        super.onResume();
        isForeground = true;
    }

    @Override
    protected void onPause() {
        super.onPause();
        isForeground = false;
    }

    public class MessageReceiver extends BroadcastReceiver {

        @Override
        public void onReceive(Context context, Intent intent) {
            try {
                if (MESSAGE_RECEIVED_ACTION.equals(intent.getAction())) {
                    String messge = intent.getStringExtra(KEY_MESSAGE);
                    String extras = intent.getStringExtra(KEY_EXTRAS);
                    StringBuilder showMsg = new StringBuilder();
                    showMsg.append(KEY_MESSAGE + " : " + messge + "\n");
                    if (!ExampleUtil.isEmpty(extras)) {
                        showMsg.append(KEY_EXTRAS + " : " + extras + "\n");
                    }
//                    setCostomMsg(showMsg.toString());
                }
            } catch (Exception e) {
            }
        }
    }

    private MessageReceiver mMessageReceiver;

    public void registerMessageReceiver() {
        mMessageReceiver = new MessageReceiver();
        IntentFilter filter = new IntentFilter();
        filter.setPriority(IntentFilter.SYSTEM_HIGH_PRIORITY);
        filter.addAction(MESSAGE_RECEIVED_ACTION);
        LocalBroadcastManager.getInstance(this).registerReceiver(mMessageReceiver, filter);
    }
}
