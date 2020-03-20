package com.hxsoft.ajitai.Service;

import android.content.Context;
import android.graphics.PixelFormat;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;

import com.hxsoft.ajitai.R;


public class FloatBallManager {
    private static final String TAG = "FloatBallManager";
    private PineConeFloatBallView mFloatBallView;

    private WindowManager mWindowManager;
    private LayoutParams mFBParams = null;
    private int mScreenWidth = 0;
    private int mScreenHeight = 0;
    private static Context  mCtx = null;
    private View mFBWindow = null;
    private LayoutParams mD2dInfoLayoutParams = null;
    private View mD2dInfoLayout = null;
    private volatile static FloatBallManager instance = null;




    private FloatBallManager(Context ctx){
        mCtx = ctx;
        mWindowManager = (WindowManager) mCtx.getSystemService(Context.WINDOW_SERVICE);
    }

    public static  FloatBallManager getInstance(Context ctx){
        if(instance == null){
            synchronized(FloatBallManager.class){
                if(instance == null){
                    instance = new FloatBallManager(ctx);
                }
            }
        }
        return instance;
    }

    public void addBallView() {
        if (mFloatBallView == null) {
            DisplayMetrics dm = new DisplayMetrics();

            mWindowManager.getDefaultDisplay().getMetrics(dm);
            mScreenWidth = dm.widthPixels;
            mScreenHeight = dm.heightPixels;
            mFBWindow = LayoutInflater.from(mCtx).inflate(R.layout.float_ball, null);
            mFloatBallView = mFBWindow.findViewById(R.id.float_ball);
            mFBParams = new LayoutParams();
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                mFBParams.type = WindowManager.LayoutParams.TYPE_APPLICATION_OVERLAY;
            } else {
                mFBParams.type = WindowManager.LayoutParams.TYPE_PHONE;
            }
            mFBParams.format = PixelFormat.RGBA_8888;

            mFBParams.x = mScreenWidth-mFloatBallView.getWidth();
            mFBParams.y = mScreenHeight / 2;
            mFBParams.width = LayoutParams.WRAP_CONTENT;
            mFBParams.height = LayoutParams.WRAP_CONTENT;
            mFBParams.gravity = Gravity.LEFT | Gravity.TOP;
//            mFBParams.type = LayoutParams.TYPE_SYSTEM_ALERT | LayoutParams.TYPE_SYSTEM_OVERLAY;
            mFBParams.format = PixelFormat.TRANSLUCENT;
            mFBParams.flags = LayoutParams.FLAG_NOT_TOUCH_MODAL | LayoutParams.FLAG_NOT_FOCUSABLE;
            mWindowManager.addView(mFBWindow, mFBParams);
            setUpD2dInfoView();

        }
    }


    public void removeBallView() {
        if (mFloatBallView != null) {
            mWindowManager.removeView(mFBWindow);
            mFloatBallView = null;
        }
    }


    public void updateBallView(int deltaX,int deltaY) {
        mFBParams.x += deltaX;
        mFBParams.y += deltaY;
        if (mWindowManager != null) {
//            Log.d(TAG,"updateBallView mParams.x = "+mFBParams.x+" mParams.y = "+mFBParams.y);
            mWindowManager.updateViewLayout(mFBWindow, mFBParams);
        }
    }


    private void setUpD2dInfoView() {
        mD2dInfoLayout = LayoutInflater.from(mCtx).inflate(R.layout.fload_d2d_info_layout, null);
        mD2dInfoLayoutParams = new LayoutParams();
        mD2dInfoLayoutParams.width = mScreenWidth/3;
        mD2dInfoLayoutParams.height = mScreenHeight*4/5;
        mD2dInfoLayoutParams.gravity = Gravity.CENTER;
        mD2dInfoLayoutParams.type = LayoutParams.TYPE_PHONE;
        mD2dInfoLayoutParams.format = PixelFormat.TRANSLUCENT;
        mD2dInfoLayoutParams.flags = LayoutParams.FLAG_NOT_TOUCH_MODAL | LayoutParams.FLAG_NOT_FOCUSABLE;




    }

    public void showD2DInFo() {
        mWindowManager.addView(mD2dInfoLayout, mD2dInfoLayoutParams);


    }

    public void hideD2DInFo() {
        mWindowManager.removeView(mD2dInfoLayout);
    }

    public void updateD2DInFo() {

    }

    public void foldFloatball() {
        int fb_width = mFloatBallView.getWidth();
        int fb_height = mFloatBallView.getHeight();
        int centerX = (mScreenWidth-fb_width)/2;
        int destX = (mFBParams.x<centerX)? 0:mScreenWidth-fb_width;
//        Log.d(TAG,"fb_width = "+fb_width+" fb_height = "+fb_height+" destX = "+destX);
        mFBParams.x = destX;
        updateBallView(0,0);
    }


}
