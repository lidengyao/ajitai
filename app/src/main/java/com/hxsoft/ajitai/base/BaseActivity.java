package com.hxsoft.ajitai.base;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.support.annotation.ColorInt;
import android.support.annotation.ColorRes;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.hxsoft.ajitai.AppContext;
import com.hxsoft.ajitai.R;
import com.hxsoft.ajitai.utils.DensityUtils;
import com.hxsoft.ajitai.utils.DialogFromCenter;
import com.hxsoft.ajitai.utils.DicUtils;
import com.hxsoft.ajitai.utils.FileUtils;
import com.hxsoft.ajitai.widget.LoadingDialog;
import com.jakewharton.rxbinding.view.RxView;
import com.readystatesoftware.systembartint.SystemBarTintManager;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.TimeUnit;

import butterknife.ButterKnife;
import rx.Subscription;
import rx.subscriptions.CompositeSubscription;

/**
 * Created by jinxh on 16/1/4.
 * QQ:123489504
 */
public abstract class BaseActivity extends AppCompatActivity {

    private SystemBarTintManager mTintManager;
    private LoadingDialog mLoadingDialog;
    private CompositeSubscription mCompositeSubscription;
    private boolean isShowCode = false;
    private Activity activity;
    private Context context;
    public String tipValue;

    public Activity getActivity() {
        return this;
    }


    public Context getContext() {
        return this;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        ButterKnife.bind(this);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);
        this.activity = getActivity();
        this.context = getContext();
        if (isHiddenStatusBar()) {
//            initBarTint();
//            initTopBar();

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                View decorView = getWindow().getDecorView();


                int option = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN

                        | View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR;

                decorView.setSystemUiVisibility(option);
                getWindow().setStatusBarColor(Color.TRANSPARENT);
            }

        }
        initData();
        initEvent();
        initView();
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

    protected boolean isHiddenStatusBar() {
        return AppContext.HIDDEN_STATUS_BAR;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ButterKnife.unbind(this);
        if (mCompositeSubscription != null && mCompositeSubscription.hasSubscriptions()) {
            mCompositeSubscription.unsubscribe();
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    public void backButtonPressed(View view) {
        finish();

    }


    protected abstract int getLayoutId();

    protected void initView() {

        if (AppContext.debug == true) {
            RelativeLayout RootView = (RelativeLayout) findViewById(R.id.RootView);
            if (RootView != null) {
                View tipView = View.inflate(getContext(), R.layout.a_tip, null);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                layoutParams.rightMargin = (int) DensityUtils.px2dp(getContext(), 25);
                layoutParams.bottomMargin = (int) DensityUtils.px2dp(getContext(), 400);
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


                            GongNengContentET.setText(DicUtils.getHelpData(name, context));

                            try {
                                String strFilePath = Environment.getExternalStorageDirectory() + "/wgga/log.txt";
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

    protected void setOnClickThrottleFirst(View view) {
        // 快速点击
        RxView.clicks(view).throttleFirst(500, TimeUnit.MILLISECONDS);
    }

    public void showLoading() {
        if (mLoadingDialog == null) {
            mLoadingDialog = new LoadingDialog(this);
        }
        if (!mLoadingDialog.isShowing()) {
            mLoadingDialog.show(tipValue);
        }
    }

    public void dismissLoading() {
        if (mLoadingDialog != null && mLoadingDialog.isShowing()) {
            mLoadingDialog.dismiss();
        }
    }

    private void initBarTint() {
        mTintManager = new SystemBarTintManager(this);
        mTintManager.setStatusBarTintEnabled(true);
        mTintManager.setNavigationBarTintEnabled(true);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            Window window = getWindow();
            // 全透明
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
                window.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN | View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
                window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
                window.setStatusBarColor(getResources().getColor(R.color.color21));
            } else {
                setTranslucentStatus(window);
            }
        }
        setTintResource(getTintResourceId());
    }

    private static int calculateStatusColor(@ColorInt int color, int alpha) {
        if (alpha == 0) {
            return color;
        }
        float a = 1 - alpha / 255f;
        int red = color >> 16 & 0xff;
        int green = color >> 8 & 0xff;
        int blue = color & 0xff;
        red = (int) (red * a + 0.5);
        green = (int) (green * a + 0.5);
        blue = (int) (blue * a + 0.5);
        return 0xff << 24 | red << 16 | green << 8 | blue;
    }

    private void initTopBar() {
        // 4.4以上设置头部导航高度
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            View topBar = findViewById(R.id.activity_top_bar);
            if (topBar == null) {
                return;
            }
            SystemBarTintManager.SystemBarConfig config = new SystemBarTintManager(this).getConfig();
            int statusBarHeight = config.getStatusBarHeight();
            topBar.setPadding(0, statusBarHeight, 0, 0);

            int height = topBar.getLayoutParams().height;
            topBar.getLayoutParams().height = statusBarHeight + height;
        }
    }

    protected void addSubscription(Subscription subscription) {
        if (mCompositeSubscription == null) {
            mCompositeSubscription = new CompositeSubscription();
        }
        mCompositeSubscription.add(subscription);
    }

    @TargetApi(19)
    private void setTranslucentStatus(Window window) {
        WindowManager.LayoutParams winParams = window.getAttributes();
        final int bits = WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS;
        winParams.flags |= bits;
        window.setAttributes(winParams);
    }

    public void showMessage(int res) {
        Toast.makeText(this, res, Toast.LENGTH_SHORT).show();
    }

    public void showMessage(CharSequence text) {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }

    public void showMessage(int code, CharSequence text) {
        if (isShowCode == true) {
            Toast.makeText(this, code + "" + text, Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
        }

    }

    protected void setTintResource(int res) {
        mTintManager.setTintResource(res);
    }

    protected int getTintResourceId() {
        return R.color.transparent;
    }

    /***
     * 设置沉浸式状态栏  大多数时可能跟随toolbar的背景色
     *
     * @param bgColor 背景颜色
     */
    public void setSystemBar(@ColorRes int bgColor, boolean statusTxtColorIsDark) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            if (getSystemProperty("ro.miui.ui.version.name").equals("V6")
                    || getSystemProperty("ro.miui.ui.version.name").equals("V7")
                    || getSystemProperty("ro.miui.ui.version.name").equals("V8")) {

                getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
                getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);

                SystemBarTintManager tintManager = new SystemBarTintManager(this);
                // 激活状态栏设置
                tintManager.setStatusBarTintEnabled(true);
                // 激活导航栏设置
                tintManager.setNavigationBarTintEnabled(false);
                // 设置一个颜色给系统栏
                tintManager.setStatusBarTintResource(bgColor);

                setMiuiStatusBarDarkMode(this, statusTxtColorIsDark);
            }

        }
    }

    private static String getSystemProperty(String propName) {
        String line;
        BufferedReader input = null;
        try {
            Process p = Runtime.getRuntime().exec("getprop " + propName);
            input = new BufferedReader(new InputStreamReader(p.getInputStream()), 1024);
            line = input.readLine();
            input.close();
        } catch (IOException ex) {
            // Log.e(TAG, "Unable to read sysprop " + propName, ex);
            return null;
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    // Log.e(TAG, "Exception while closing InputStream", e);
                }
            }
        }
        return line;
    }


    public static boolean setMiuiStatusBarDarkMode(Activity activity, boolean darkmode) {
        Class<? extends Window> clazz = activity.getWindow().getClass();
        try {
            int darkModeFlag = 0;
            Class<?> layoutParams = Class.forName("android.view.MiuiWindowManager$LayoutParams");
            java.lang.reflect.Field field = layoutParams.getField("EXTRA_FLAG_STATUS_BAR_DARK_MODE");
            darkModeFlag = field.getInt(layoutParams);
            java.lang.reflect.Method extraFlagField = clazz.getMethod("setExtraFlags", int.class, int.class);
            extraFlagField.invoke(activity.getWindow(), darkmode ? darkModeFlag : 0, darkModeFlag);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }


}
