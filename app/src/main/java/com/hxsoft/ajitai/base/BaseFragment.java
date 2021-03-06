package com.hxsoft.ajitai.base;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.hxsoft.ajitai.AppContext;
import com.hxsoft.ajitai.utils.DensityUtils;
import com.hxsoft.ajitai.utils.DialogFromCenter;
import com.hxsoft.ajitai.utils.DicUtils;
import com.hxsoft.ajitai.utils.FileUtils;
import com.jakewharton.rxbinding.view.RxView;
import com.hxsoft.ajitai.R;
import com.readystatesoftware.systembartint.SystemBarTintManager;

import java.io.File;
import java.util.concurrent.TimeUnit;

import butterknife.ButterKnife;
import rx.Subscription;
import rx.subscriptions.CompositeSubscription;

/**
 * Fragment基类
 * <p/>
 * Created by jinxh on 15/11/19.
 */
public abstract class BaseFragment extends Fragment implements View.OnTouchListener {

    protected View mRootView;
    private CompositeSubscription mCompositeSubscription;
    public String tipValue;

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if (isHiddenStatusBar()) {
//            initTopBar(mRootView);

        }
        initData();
        initEvent();
        initView();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
        if (mCompositeSubscription != null && mCompositeSubscription.hasSubscriptions()) {
            mCompositeSubscription.unsubscribe();
        }
    }

    protected void addSubscription(Subscription subscription) {
        if (mCompositeSubscription == null) {
            mCompositeSubscription = new CompositeSubscription();
        }
        mCompositeSubscription.add(subscription);
    }

    public void showMessage(int res) {
        Toast.makeText(getContext(), res, Toast.LENGTH_SHORT).show();
    }

    public void showMessage(CharSequence text) {
        Toast.makeText(getContext(), text, Toast.LENGTH_SHORT).show();
    }


    public void showLoading() {
        ((BaseActivity) getActivity()).tipValue = this.tipValue;
        ((BaseActivity) getActivity()).showLoading();
    }

    public void dismissLoading() {
        ((BaseActivity) getActivity()).dismissLoading();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mRootView = inflater.inflate(getLayoutId(), container, false);
        mRootView.setOnTouchListener(this);
        ButterKnife.bind(this, mRootView);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            View decorView = getActivity().getWindow().getDecorView();

            int option = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN

                    | View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR;

            decorView.setSystemUiVisibility(option);
            getActivity().getWindow().setStatusBarColor(Color.TRANSPARENT);

        }
        return mRootView;
    }

    public void SetSysUiColor(Integer colorType) {
        View decorView = getActivity().getWindow().getDecorView();
        //白色
        if (colorType == 0) {
            int option = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN

                    | View.SYSTEM_UI_FLAG_LAYOUT_STABLE;

            decorView.setSystemUiVisibility(option);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                getActivity().getWindow().setStatusBarColor(Color.TRANSPARENT);
            }
        }

        //黑色
        if (colorType == 1) {
            int option = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN

                    | View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR;

            decorView.setSystemUiVisibility(option);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                getActivity().getWindow().setStatusBarColor(Color.TRANSPARENT);
            }
        }
    }

    protected abstract int getLayoutId();

    protected void initView() {
        if (AppContext.debug == true) {
            RelativeLayout RootView = (RelativeLayout) mRootView.findViewById(R.id.RootView);
            if (RootView != null) {

                View tipView = View.inflate(getContext(), R.layout.a_tip, null);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                layoutParams.rightMargin = DensityUtils.px2dp(getContext(), 25);
                layoutParams.bottomMargin = DensityUtils.px2dp(getContext(), 70);
                layoutParams.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
                layoutParams.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
                tipView.setLayoutParams(layoutParams);
                RootView.addView(tipView);

                tipView.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View v, MotionEvent motionEvent) {
                        switch (motionEvent.getAction()) {
                            case MotionEvent.ACTION_DOWN:
                                tipView.setScaleX((float) 0.85);
                                tipView.setScaleY((float) 0.85);
                                break;

                            case MotionEvent.ACTION_UP:
                                tipView.setScaleX(1);
                                tipView.setScaleY(1);
                                break;
                            default:
                        }

                        return false;
                    }
                });

                tipView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        try {
                            ;
                            String name = RootView.getTag().toString();

                            //0-0首页
                            //0-1购买许可证查询
                            //0-2购买许可详情
                            //0-3企业锁定


                            View view_dolog = View.inflate(getContext(), R.layout.w_dialog_help, null);
                            final TextView GongNeng_Menu_TV = (TextView) view_dolog.findViewById(R.id.GongNeng_Menu_TV);
                            final TextView Log_Menu_TV = (TextView) view_dolog.findViewById(R.id.Log_Menu_TV);
                            LinearLayout closeLL = (LinearLayout) view_dolog.findViewById(R.id.CloseLL);
                            final TextView GongNengContentET = (TextView) view_dolog.findViewById(R.id.GongNengContentET);
                            final TextView LogContentTV = (TextView) view_dolog.findViewById(R.id.LogContentTV);


                            GongNengContentET.setText(DicUtils.getHelpData(name, getContext()));

                            try {
                                String strFilePath = Environment.getExternalStorageDirectory() + "/ajitai/log.txt";
                                File file = new File(strFilePath);
                                String content = FileUtils.getFileContent(file);
                                LogContentTV.setText(content);
                            } catch (Exception e) {

                            }


                            GongNeng_Menu_TV.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    GongNengContentET.setVisibility(View.VISIBLE);
                                    LogContentTV.setVisibility(View.GONE);
                                    GongNeng_Menu_TV.setTextColor(getResources().getColor(R.color.color21));
                                    Log_Menu_TV.setTextColor(getResources().getColor(R.color.color1));
                                }
                            });

                            Log_Menu_TV.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    GongNengContentET.setVisibility(View.GONE);
                                    LogContentTV.setVisibility(View.VISIBLE);
                                    GongNeng_Menu_TV.setTextColor(getResources().getColor(R.color.color1));
                                    Log_Menu_TV.setTextColor(getResources().getColor(R.color.color21));
                                }
                            });
                            TextView TitleTV = (TextView) view_dolog.findViewById(R.id.TitleTV);
                            TitleTV.setText(name);

                            final DialogFromCenter dialogFromCenter_tip = new DialogFromCenter(getContext());
                            dialogFromCenter_tip.setContentView(view_dolog);
                            dialogFromCenter_tip.show();

                            closeLL.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    dialogFromCenter_tip.dismiss();
                                }
                            });
                        } catch (Exception e) {
                            showMessage("没有帮助信息");
                        }


                    }
                });
            }
        }

    }

    protected void initData() {
    }

    protected void initEvent() {
    }

    protected void setOnClickListener(View view, View.OnClickListener listener) {
        view.setOnClickListener(listener);
        // 快速点击
        RxView.clicks(view).throttleFirst(500, TimeUnit.MILLISECONDS);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }


    protected boolean isHiddenStatusBar() {
        return AppContext.HIDDEN_STATUS_BAR;
    }

    private void initTopBar(View view) {
        // 4.4以上设置头部导航高度
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            View topBar = view.findViewById(R.id.fragment_top_bar);
            if (topBar == null) {
                return;
            }
            SystemBarTintManager.SystemBarConfig config = new SystemBarTintManager(getActivity()).getConfig();
            int statusBarHeight = config.getStatusBarHeight();
            topBar.setPadding(0, statusBarHeight, 0, 0);

            int height = topBar.getLayoutParams().height;
            topBar.getLayoutParams().height = statusBarHeight + height;
        }
    }

    protected void setOnClickThrottleFirst(View view) {
        // 快速点击
        RxView.clicks(view).throttleFirst(500, TimeUnit.MILLISECONDS);
    }


    @Override
    public void onViewStateRestored(Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        return true;
    }
}