package com.hxsoft.ajitai.ui.activity;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.annotation.NonNull;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.hxsoft.ajitai.R;
import com.hxsoft.ajitai.adapter.FmPagerAdapter;
import com.hxsoft.ajitai.base.MvpActivity;
import com.hxsoft.ajitai.music.MusicService;
import com.hxsoft.ajitai.present.LoginPresent;
import com.hxsoft.ajitai.ui.fragment.Y_Fragment_YinYue_AJiTai;
import com.hxsoft.ajitai.ui.fragment.Y_Fragment_YinYue_HanYu;
import com.hxsoft.ajitai.ui.fragment.Y_Fragment_YinYue_MengYu;
import com.hxsoft.ajitai.ui.fragment.Y_Fragment_YinYue_QuanBu;
import com.hxsoft.ajitai.ui.fragment.Y_Fragment_YinYue_ShiPin;
import com.hxsoft.ajitai.utils.CheckControl_Dialog_BoFangLieBiao;
import com.hxsoft.ajitai.utils.IndicatorLineUtil;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by jinxh on 16/2/1.
 */
public class A_Activity_YinYue extends MvpActivity {

    @Bind(R.id.SysNameIV)
    TextView SysNameIV;
    @Bind(R.id.SouSuoRL)
    RelativeLayout SouSuoRL;
    @Bind(R.id.MenuTablayout)
    TabLayout MenuTablayout;
    @Bind(R.id.viewPager)
    ViewPager viewPager;
    @Bind(R.id.ShaiXuanLL)
    LinearLayout ShaiXuanLL;
    @Bind(R.id.PlayIV)
    ImageView PlayIV;
    @Bind(R.id.CaoZuoLL)
    LinearLayout CaoZuoLL;
    @Bind(R.id.YinYueBottomRL)
    RelativeLayout YinYueBottomRL;
    @Bind(R.id.right)
    RelativeLayout right;
    @Bind(R.id.drawerlayout)
    DrawerLayout drawerlayout;
    @Bind(R.id.BoFangLieBiao_IV)
    ImageView BoFangLieBiaoIV;
    @Bind(R.id.RightBottom_LL)
    LinearLayout RightBottomLL;
    @Bind(R.id.BoFang_LL)
    LinearLayout BoFangLL;
    private FmPagerAdapter pagerAdapter;
    private ArrayList<Fragment> fragments = new ArrayList<>();
    private String[] titles = new String[]{"全部", "阿吉泰", "蒙语", "汉语", "视频"};
    private Y_Fragment_YinYue_QuanBu y_fragment_yinYue_quanBu;
    private Y_Fragment_YinYue_AJiTai y_fragment_yinYue_aJiTai;
    private Y_Fragment_YinYue_MengYu y_fragment_yinYue_mengYu;
    private Y_Fragment_YinYue_HanYu y_fragment_yinYue_hanYu;
    private Y_Fragment_YinYue_ShiPin y_fragment_yinYue_shiPin;


    public static final String EXTRA_START_FULLSCREEN =
            "com.hxsoft.ajitai.ui.activity.EXTRA_START_FULLSCREEN";
    public static final String EXTRA_CURRENT_MEDIA_DESCRIPTION =
            "com.hxsoft.ajitai.ui.activity.CURRENT_MEDIA_DESCRIPTION";


    private MediaBrowserCompat mMediaBrowser;
    private MediaControllerCompat mediaController;

    @Override
    protected int getLayoutId() {
        return R.layout.a_activity_yinyue;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);

        init();
        BoFangLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), A_Activity_YinYue_XiangQing.class);
                startActivity(intent);
            }
        });
        ShaiXuanLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerlayout.openDrawer(Gravity.RIGHT);
            }
        });


        drawerlayout.setDrawerListener(new DrawerLayout.DrawerListener() {
            @Override
            public void onDrawerSlide(@NonNull View view, float v) {

            }

            @Override
            public void onDrawerOpened(@NonNull View view) {
                right.setClickable(true);
            }

            @Override
            public void onDrawerClosed(@NonNull View view) {

            }

            @Override
            public void onDrawerStateChanged(int i) {

            }
        });
        mMediaBrowser = new MediaBrowserCompat(this,
                new ComponentName(this, MusicService.class), mConnectionCallback, null);
        mMediaBrowser.connect();
        PlayIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaControllerCompat controller = MediaControllerCompat.getMediaController(getActivity());
                PlaybackStateCompat stateObj = controller.getPlaybackState();
                final int state = stateObj == null ?
                        PlaybackStateCompat.STATE_NONE : stateObj.getState();
                if (state == PlaybackStateCompat.STATE_PAUSED ||
                        state == PlaybackStateCompat.STATE_STOPPED ||
                        state == PlaybackStateCompat.STATE_NONE) {
                    playMedia();
                } else if (state == PlaybackStateCompat.STATE_PLAYING ||
                        state == PlaybackStateCompat.STATE_BUFFERING ||
                        state == PlaybackStateCompat.STATE_CONNECTING) {
                    pauseMedia();
                }
            }
        });

        BoFangLieBiaoIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckControl_Dialog_BoFangLieBiao.ShowDialog(getContext(), getActivity(), "", new CheckControl_Dialog_BoFangLieBiao.OnCheckControl_dialogClickListener() {
                    @Override
                    public void OnClick(int type) {

                    }
                });
            }
        });
        SouSuoRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), A_Activity_YinYue_SouSuo.class);
                startActivity(intent);
            }
        });

    }

    private final MediaBrowserCompat.ConnectionCallback mConnectionCallback =
            new MediaBrowserCompat.ConnectionCallback() {
                @Override
                public void onConnected() {
                    //说明已经连接上了
                    try {
                        connectToSession(mMediaBrowser.getSessionToken());
                    } catch (RemoteException e) {
                        e.printStackTrace();
                    }
                }
            };

    private void connectToSession(MediaSessionCompat.Token token) throws RemoteException {
        mediaController = new MediaControllerCompat(this, token);
        MediaControllerCompat.setMediaController(this, mediaController);
//        onMediaBrowserConnected();
//        onMediaControllerConnected(mediaController.getSessionToken());
    }

    private void init() {

        y_fragment_yinYue_quanBu = new Y_Fragment_YinYue_QuanBu();
        y_fragment_yinYue_aJiTai = new Y_Fragment_YinYue_AJiTai();
        y_fragment_yinYue_mengYu = new Y_Fragment_YinYue_MengYu();
        y_fragment_yinYue_hanYu = new Y_Fragment_YinYue_HanYu();
        y_fragment_yinYue_shiPin = new Y_Fragment_YinYue_ShiPin();
        fragments.add(y_fragment_yinYue_quanBu);
        fragments.add(y_fragment_yinYue_aJiTai);
        fragments.add(y_fragment_yinYue_mengYu);
        fragments.add(y_fragment_yinYue_hanYu);
        fragments.add(y_fragment_yinYue_shiPin);

        for (int i = 0; i < titles.length; i++) {
            MenuTablayout.addTab(MenuTablayout.newTab());
        }

        MenuTablayout.setupWithViewPager(viewPager, false);
        pagerAdapter = new FmPagerAdapter(fragments, getSupportFragmentManager());
        viewPager.setAdapter(pagerAdapter);

        for (int i = 0; i < titles.length; i++) {
            MenuTablayout.getTabAt(i).setText(titles[i]);
        }

        MenuTablayout.post(new Runnable() {
            @Override
            public void run() {
                IndicatorLineUtil.setIndicator(MenuTablayout, 0, 0);
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

    private void playMedia() {
        MediaControllerCompat controller = MediaControllerCompat.getMediaController(getActivity());
        if (controller != null) {
            controller.getTransportControls().play();
        }

        PlayIV.setImageResource(R.mipmap.a_yinyue_zanting);
    }

    private void pauseMedia() {
        MediaControllerCompat controller = MediaControllerCompat.getMediaController(getActivity());
        if (controller != null) {
            controller.getTransportControls().pause();
        }
        PlayIV.setImageResource(R.mipmap.a_kaishi);
    }
}
