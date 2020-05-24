package com.hxsoft.ajitai.ui.activity;

import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.format.DateUtils;
import android.view.View;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;

import com.hxsoft.ajitai.R;
import com.hxsoft.ajitai.adapter.A_Carticlecomment_Adapter;
import com.hxsoft.ajitai.base.MvpActivity;
import com.hxsoft.ajitai.model.info.A_Carticlecomment_Info;
import com.hxsoft.ajitai.model.info.A_Carticlecomment_Total_Info;
import com.hxsoft.ajitai.model.info.A_carticlecomment_Bean;
import com.hxsoft.ajitai.model.info.Carticle_Info;
import com.hxsoft.ajitai.music.bean.MusicInfo;
import com.hxsoft.ajitai.music.widget.MediaSeekBar;
import com.hxsoft.ajitai.present.A_WenZhangYueDu_XiangQing_Present;
import com.hxsoft.ajitai.ui.view.A_WenZhangYueDu_XiangQing_View;
import com.hxsoft.ajitai.utils.CheckControl_Dialog_GanWu_FenXiang;
import com.hxsoft.ajitai.utils.DownLoadFileManager;
import com.hxsoft.ajitai.utils.ListData_Control_Normal;
import com.hxsoft.ajitai.widget.PullLoadMoreListView;
import com.hxsoft.ajitai.wxapi.WXAPI;
import com.mediabrowser.xiaxl.client.MusicManager;
import com.mediabrowser.xiaxl.client.listener.OnSaveRecordListener;
import com.mediabrowser.xiaxl.setting.SettingConfig;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by jinxh on 16/2/1.
 */
public class A_Activity_WenZhangYueDu_XiangQing extends MvpActivity<A_WenZhangYueDu_XiangQing_Present> implements A_WenZhangYueDu_XiangQing_View {


    @Bind(R.id.SysNameIV)
    TextView SysNameIV;
    @Bind(R.id.QieHuanZhangHaoRL)
    RelativeLayout QieHuanZhangHaoRL;
    @Bind(R.id.DataListView)
    PullLoadMoreListView DataListView;
    @Bind(R.id.ContentET)
    EditText ContentET;
    @Bind(R.id.SendBtn)
    Button SendBtn;
    @Bind(R.id.CaoZuoLL)
    LinearLayout CaoZuoLL;
    @Bind(R.id.BottomRL)
    RelativeLayout BottomRL;
    @Bind(R.id.AdesWebView)
    WebView AdesWebView;
    @Bind(R.id.RootView)
    RelativeLayout RootView;
    private String aid;
    private int page = 1;
    private int size = 10;
    private A_Carticlecomment_Adapter adapter;
    private ArrayList<A_Carticlecomment_Info> infoArrayList = new ArrayList<>();
    private Carticle_Info carticle_info;
    private WebView desWebView;
    private TextView clicknumTV;
    private TextView supportnumTV;
    private ImageView DianZanIV;

    private ImageView BgIV;
    private TextView anameTV;
    private TextView ZuoZheTV;
    private ImageView PlayIV;
    private Boolean isNewMusic = false;

    // seekbar
    private MediaSeekBar mSeekBarAudio;

    /**
     * 数据
     */
    // 是否正在播放的标识
    private boolean mIsPlaying;
    // 音频数据
    List<MusicInfo> mMusicInfos = new ArrayList<MusicInfo>();

    /**
     *
     */
    MusicManager mMusicManager = null;

    @Override
    protected int getLayoutId() {
        return R.layout.a_activity_xinlingganlu_xiangqing;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);

        aid = getIntent().getStringExtra("aid");


        adapter = new A_Carticlecomment_Adapter(getContext(), infoArrayList, R.layout.a_item_wenzhangpinglun, 0);

        DataListView.setAdapter(adapter);
        DataListView.setOnPullLoadMoreListener(new PullLoadMoreListView.PullLoadMoreListener() {
            @Override
            public void onRefresh() {

                page = 1;
                getCarticlecomment();

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                    }
                }, 500);

            }

            @Override
            public void onLoadMore() {
                page += 1;
                getCarticlecomment();

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                    }
                }, 500);
            }
        });

        DataListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Intent intent = new Intent(getContext(), A_Activity_XinJianShouHuoDiZhi.class);
//                intent.putExtra("type", "1");
//                intent.putExtra("RecordsBean", infoArrayList.get(position));
//                startActivity(intent);
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
                A_carticlecomment_Bean a_carticlecomment_bean = new A_carticlecomment_Bean();
                a_carticlecomment_bean.setAid(Integer.parseInt(aid));
                a_carticlecomment_bean.setComment(content);
                mPresenter.carticlecommentAddcomment(a_carticlecomment_bean, getContext());
            }
        });

        //region 播放器
        View view_bofangqi = View.inflate(getContext(), R.layout.a_activity_xinlingganlu_xiangqing_header_bofangqi, null);
        BgIV = (ImageView) view_bofangqi.findViewById(R.id.BgIV);
        anameTV = (TextView) view_bofangqi.findViewById(R.id.anameTV);
        ZuoZheTV = (TextView) view_bofangqi.findViewById(R.id.ZuoZheTV);
        PlayIV = (ImageView) view_bofangqi.findViewById(R.id.PlayIV);
        mSeekBarAudio = (MediaSeekBar) view_bofangqi.findViewById(R.id.seekbar_audio);
        TextView startText = (TextView) view_bofangqi.findViewById(R.id.startText);
        TextView endText = (TextView) view_bofangqi.findViewById(R.id.endText);

        mSeekBarAudio.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                startText.setText(DateUtils.formatElapsedTime(progress / 1000));
                int duration = (int) mMusicManager.getMediaMetadata().getLong(MediaMetadataCompat.METADATA_KEY_DURATION);
                endText.setText(DateUtils.formatElapsedTime(duration / 1000));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                //
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // seek
                if (mMusicManager != null) {
                    mMusicManager.seekTo(seekBar.getProgress());
                }
            }
        });

        PlayIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mIsPlaying) {
                    if (mMusicManager != null) {
                        mMusicManager.pause();
                    }
                } else {
                    if (mMusicManager != null) {
                        isNewMusic = true;
                        mMusicManager.playMusicList(mMusicInfos, 0);
                    }
                }
            }
        });

        QieHuanZhangHaoRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckControl_Dialog_GanWu_FenXiang.ShowDialog(getContext(), getActivity(), "", new CheckControl_Dialog_GanWu_FenXiang.OnCheckControl_dialogClickListener() {
                    @Override
                    public void OnClick(int type) {

                        //微信好友
                        if (type == 0) {

                            WXAPI.Share("www.baidu.com", carticle_info.getAname(), carticle_info.getAname(), "", false);

                        }

                        //朋友圈
                        if (type == 1) {
                            WXAPI.ShareCOF("www.baidu.com", carticle_info.getAname(), carticle_info.getAname(), "", false);
                        }
                    }
                });
            }
        });

        DataListView.addHeaderView(view_bofangqi);

        //endregion

        //region  网页数据
        View view_webview = View.inflate(getContext(), R.layout.a_activity_xinlingganlu_xiangqing_header, null);
        desWebView = (WebView) view_webview.findViewById(R.id.desWebView);
        DataListView.addHeaderView(view_webview);
        //endregion


        //region 阅读点攒
        View view_yuedu_dianzan = View.inflate(getContext(), R.layout.a_activity_xinlingganlu_xiangqing_header_dianzan, null);
        clicknumTV = (TextView) view_yuedu_dianzan.findViewById(R.id.clicknumTV);
        supportnumTV = (TextView) view_yuedu_dianzan.findViewById(R.id.supportnumTV);
        DianZanIV = (ImageView) view_yuedu_dianzan.findViewById(R.id.DianZanIV);
        LinearLayout supportLL = (LinearLayout) view_yuedu_dianzan.findViewById(R.id.supportLL);
        supportLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (carticle_info.getIsthumb() == 1) {
                    mPresenter.heartnectarCancleThumb(Integer.parseInt(aid), getContext());
                } else {
                    mPresenter.heartnectarThumb(Integer.parseInt(aid), getContext());
                }
            }
        });

        DataListView.addHeaderView(view_yuedu_dianzan);
        //endregion


        getData();

        //进入代表已阅读
        mPresenter.heartnectarClick(Integer.parseInt(aid), getContext());
        initMusicAgent();


    }


    /**
     * 初始化音乐引擎
     */
    private void initMusicAgent() {
        // 初始化
        if (mMusicManager == null) {
            mMusicManager = MusicManager.getInstance();
        }
        mMusicManager.init(this);
        // 音频变化的监听类
        mMusicManager.addOnAudioStatusListener(mAudioStatusChangeListener);
        // 记录播放记录的监听
        mMusicManager.addOnRecorListener(mOnRecordListener);
    }

    /**
     * 音频变化回调
     */
    MusicManager.OnAudioStatusChangeListener mAudioStatusChangeListener = new MusicManager.OnAudioStatusChangeListener() {
        @Override
        public void onPlaybackStateChanged(@NonNull PlaybackStateCompat state) {
            // 播放音频 状态变化
            onMediaPlaybackStateChanged(state);
        }

        @Override
        public void onMetadataChanged(MediaMetadataCompat metadata) {
            // 播放音频变化的回调
            onMediaMetadataChanged(metadata);
        }

        @Override
        public void onQueueChanged(List<MediaSessionCompat.QueueItem> queue) {
            // TODO 播放队列发生变化
        }
    };

    /**
     * 记录播放位置的回调
     */
    OnSaveRecordListener mOnRecordListener = new OnSaveRecordListener() {
        @Override
        public void onSaveRecord(MediaMetadataCompat mediaMetadataCompat, long postion) {
            // TODO 保存播放记录用
        }
    };

    /**
     * 音频播放状态变化的回调
     *
     * @param playbackState
     */
    private void onMediaPlaybackStateChanged(PlaybackStateCompat playbackState) {
        if (playbackState == null) {
            return;
        }
        // 正在播放
        mIsPlaying =
                playbackState.getState() == PlaybackStateCompat.STATE_PLAYING;

//        if (isNewMusic == false) {
//            mMusicManager.stop();
//            return;
//        }
        // 更新UI
        setControlBg(mIsPlaying);

        /**
         * 设置播放进度
         */
        final int progress = (int) playbackState.getPosition();
        mSeekBarAudio.setProgress(progress);
        switch (playbackState.getState()) {
            case PlaybackStateCompat.STATE_PLAYING:
                final int timeToEnd = (int) ((mSeekBarAudio.getMax() - progress) / playbackState.getPlaybackSpeed());
                mSeekBarAudio.startProgressAnima(progress, mSeekBarAudio.getMax(), timeToEnd);
                break;
            case PlaybackStateCompat.STATE_PAUSED:
                mSeekBarAudio.stopProgressAnima();
                break;

        }

    }

    /**
     * 更改播放按钮背景状态
     *
     * @param isPlaying
     */
    private void setControlBg(boolean isPlaying) {
        if (isPlaying) {
            PlayIV.setImageResource(R.mipmap.a_yinpin_zanting);
        } else {
            PlayIV.setImageResource(R.mipmap.a_yinpin_bofang);
        }
    }

    /**
     * 播放音频数据 发生变化的回调
     *
     * @param mediaMetadata
     */
    private void onMediaMetadataChanged(MediaMetadataCompat mediaMetadata) {
        if (mediaMetadata == null) {
            return;
        }
        // 音频的标题
//        mTitleTv.setText(
//                mediaMetadata.getString(MediaMetadataCompat.METADATA_KEY_TITLE));
//        // 音频作者
//        mArtistTv.setText(
//                mediaMetadata.getString(MediaMetadataCompat.METADATA_KEY_ARTIST));
        // 音频图片
//        mAlbumArtImg.setImageBitmap(MusicLibrary.getAlbumBitmap(
//                MainActivity.this,
//                mediaMetadata.getString(MediaMetadataCompat.METADATA_KEY_MEDIA_ID)));

        // 进度条
        final int max = mediaMetadata != null
                ? (int) mediaMetadata.getLong(MediaMetadataCompat.METADATA_KEY_DURATION)
                : 0;
        mSeekBarAudio.setProgress(0);
        mSeekBarAudio.setMax(max);
    }

    private void getData() {
        mPresenter.carticleDetail(Integer.parseInt(aid), getContext());
    }

    private void getCarticlecomment() {
        mPresenter.carticlecommentPage(Integer.parseInt(aid), page, size, getContext());
    }

    @Override
    protected A_WenZhangYueDu_XiangQing_Present createPresenter() {
        return new A_WenZhangYueDu_XiangQing_Present();
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
    public void carticleDetailSuccess(Carticle_Info model) {

        if (model == null)
            return;
        carticle_info = model;

        anameTV.setText(model.getAname());
        // 允许GPRS播放
        SettingConfig.setGPRSPlayAllowed(this, true);
        // 添加音频数据
        MusicInfo musicInfo = new MusicInfo();
        musicInfo.setSource("http://47.92.221.41/music/zypf.mp3");
        musicInfo.setUrl("http://d040779c2cd49.scdn.itc.cn/s_w_z/pic/20161213/184474627999795968.jpg");
        musicInfo.setTitle(model.getAname());
        musicInfo.setMediaID(model.getAid() + "");
        mMusicInfos.add(musicInfo);


        desWebView.loadData(carticle_info.getDescription(), "text/html", "UTF-8");
        clicknumTV.setText(model.getClicknum() + "");
        if (model.getSupportnum() > 0) {
            supportnumTV.setText(model.getSupportnum() + "");
        }

        if (carticle_info.getIsthumb() == 1) {
            DianZanIV.setImageResource(R.mipmap.ganwu_dianzianhou);
        } else {
            DianZanIV.setImageResource(R.mipmap.a_ganwu_dianzan);
        }

        getCarticlecomment();
    }

    @Override
    public void carticlecommentPageSuccess(A_Carticlecomment_Total_Info model) {

        SetData(model.getRecords());
    }

    @Override
    public void carticlecommentAddcommentSuccess(Boolean model) {
        ContentET.setText("");
        getCarticlecomment();
    }

    @Override
    public void heartnectarThumbSuccess(Boolean model) {
        DianZanIV.setImageResource(R.mipmap.ganwu_dianzianhou);
        carticle_info.setIsthumb(1);
        getData();
    }

    @Override
    public void heartnectarCancleThumbSuccess(Boolean model) {
        getData();
        DianZanIV.setImageResource(R.mipmap.a_ganwu_dianzan);
        carticle_info.setIsthumb(0);
    }

    @Override
    public void heartnectarClickSuccess(Boolean model) {
        getData();
    }

    private void SetData(final ArrayList<A_Carticlecomment_Info> model) {
        infoArrayList = new ListData_Control_Normal().BandData(infoArrayList, model, this.page, this.size, adapter, DataListView, getActivity(), getContext());
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        mMusicManager.stop();
    }

    @Override
    public void onFailure(int code, String msg) {
        showMessage(msg);
    }
}
