package com.hxsoft.ajitai.ui.activity;


import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PixelFormat;
import android.os.Build;
import android.os.IBinder;
import android.provider.Settings;
import android.support.annotation.RequiresApi;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.hxsoft.ajitai.R;


@SuppressLint({"ShowToast", "ClickableViewAccessibility"})
public class FloatingService extends Service {


    @Override
    public IBinder onBind(Intent intent) {
        // TODO Auto-generated method stub
        return null;
    }

    @SuppressLint("NewApi")
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        jipaiqi();
        return super.onStartCommand(intent, flags, startId);
    }


    @RequiresApi(api = Build.VERSION_CODES.M)
    private void showFloatingWindow() {

        if (Settings.canDrawOverlays(this)) {
            // 获取WindowManager服务
            final WindowManager windowManager = (WindowManager) getSystemService(WINDOW_SERVICE);

            // 新建悬浮窗控件
            final Button button = new Button(getApplicationContext());
            button.setText("Floating Window");
            button.setBackgroundColor(Color.BLUE);

            // 设置LayoutParam
            final WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                layoutParams.type = WindowManager.LayoutParams.TYPE_APPLICATION_OVERLAY;
            } else {
                layoutParams.type = WindowManager.LayoutParams.TYPE_APPLICATION_OVERLAY;
            }
            layoutParams.format = PixelFormat.RGBA_8888;


            layoutParams.width = 500;
            layoutParams.height = 100;
            layoutParams.x = 100;
            layoutParams.y = 300;
            layoutParams.flags = WindowManager.LayoutParams.FLAG_NOT_TOUCH_MODAL | WindowManager.LayoutParams.FLAG_WATCH_OUTSIDE_TOUCH;

            // 将悬浮窗控件添加到WindowManager
            windowManager.addView(button, layoutParams);
            button.setOnTouchListener(new View.OnTouchListener() {
                private int x;
                private int y;

                @Override
                public boolean onTouch(View view, MotionEvent event) {
                    switch (event.getAction()) {
                        case MotionEvent.ACTION_DOWN:
                            x = (int) event.getRawX();
                            y = (int) event.getRawY();
                            break;
                        case MotionEvent.ACTION_MOVE:
                            int nowX = (int) event.getRawX();
                            int nowY = (int) event.getRawY();
                            int movedX = nowX - x;
                            int movedY = nowY - y;
                            x = nowX;
                            y = nowY;
                            layoutParams.x = layoutParams.x + movedX;
                            layoutParams.y = layoutParams.y + movedY;

                            // 更新悬浮窗控件布局
                            windowManager.updateViewLayout(view, layoutParams);
                            break;
                        default:
                            break;
                    }
                    return false;
                }
            });
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    private void jipaiqi() {
//        View view = LayoutInflater.from(context).inflate(R.layout.dicdata_actionsheet, null, false);
        if (Settings.canDrawOverlays(this)) {
            // 获取WindowManager服务
            final WindowManager windowManager = (WindowManager) getSystemService(WINDOW_SERVICE);

            // 新建悬浮窗控件
            View view = LayoutInflater.from(getApplicationContext()).inflate(R.layout.result, null, false);
            // 设置LayoutParam
            final WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                layoutParams.type = WindowManager.LayoutParams.TYPE_APPLICATION_OVERLAY;
            } else {
                layoutParams.type = WindowManager.LayoutParams.TYPE_APPLICATION_OVERLAY;
            }
            layoutParams.format = PixelFormat.RGBA_8888;


            layoutParams.width = 1280;
            layoutParams.height = 200;
            layoutParams.x = 100;
            layoutParams.y = 300;
            layoutParams.flags = WindowManager.LayoutParams.FLAG_NOT_TOUCH_MODAL | WindowManager.LayoutParams.FLAG_WATCH_OUTSIDE_TOUCH;

            // 将悬浮窗控件添加到WindowManager
            windowManager.addView(view, layoutParams);
            view.setOnTouchListener(new View.OnTouchListener() {
                private int x;
                private int y;

                @Override
                public boolean onTouch(View view, MotionEvent event) {
                    switch (event.getAction()) {
                        case MotionEvent.ACTION_DOWN:
                            x = (int) event.getRawX();
                            y = (int) event.getRawY();
                            break;
                        case MotionEvent.ACTION_MOVE:
                            int nowX = (int) event.getRawX();
                            int nowY = (int) event.getRawY();
                            int movedX = nowX - x;
                            int movedY = nowY - y;
                            x = nowX;
                            y = nowY;
                            layoutParams.x = layoutParams.x + movedX;
                            layoutParams.y = layoutParams.y + movedY;

                            // 更新悬浮窗控件布局
                            windowManager.updateViewLayout(view, layoutParams);
                            break;
                        default:
                            break;
                    }
                    return false;
                }
            });
        }
    }

}