package com.hxsoft.ajitai.Service;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.hxsoft.ajitai.R;
import com.hxsoft.ajitai.utils.DbKeyS;
import com.hxsoft.ajitai.utils.SpUtils;
import com.google.gson.Gson;


public class PineConeFloatBallView extends LinearLayout {

    private static final String TAG = "PineConeFloatBallView";
    private FloatBallManager mFBManager = null;

    private View mFB_button = null;
    private ImageView mFB_ImgBall = null;
    private ImageView mFB_ImgBigBall = null;
    private ImageView mFB_ImgBg = null;
    private TextView mFB_Switch = null;


    private int mIsShowD2DInFo = 0;

    private int mDownX;
    private int mDownY;

    private int mLastX;
    private int mLastY;

    public PineConeFloatBallView(Context context) {
        this(context, null);
    }

    public PineConeFloatBallView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public PineConeFloatBallView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(context, attrs);
    }

    private void initView(Context context, AttributeSet attrs) {
        mFBManager = FloatBallManager.getInstance(context);
        inflate(getContext(), R.layout.float_ball_layout, this);
        mFB_button = findViewById(R.id.fl_button);
        mFB_ImgBall = (ImageView) findViewById(R.id.img_ball);
        mFB_ImgBigBall = (ImageView) findViewById(R.id.img_big_ball);
        mFB_ImgBg = (ImageView) findViewById(R.id.img_bg);
        mFB_Switch = (TextView) findViewById(R.id.tv_switch);


        mFB_button.setOnTouchListener(new OnTouchListener() {
            @Override
            public boolean onTouch(View v, final MotionEvent event) {
                int x = (int) event.getRawX();
                int y = (int) event.getRawY();
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mFB_ImgBigBall.setVisibility(View.VISIBLE);
                        mFB_ImgBall.setVisibility(View.INVISIBLE);
                        Log.d(TAG, "float button ACTION_DOWN X = " + event.getRawX() + " Y = " + event.getRawY());

                        touchDown(x, y);
                        break;
                    case MotionEvent.ACTION_MOVE:
                        touchMove(x, y);
                        break;
                    case MotionEvent.ACTION_CANCEL:
                    case MotionEvent.ACTION_UP:
                        Log.d(TAG, "float button ACTION_UP X = " + event.getRawX() + " Y = " + event.getRawY());
                        touchUp(x, y);
                        break;
                }
                return true;
            }
        });


    }

    private void touchDown(int x, int y) {
        mDownX = x;
        mDownY = y;
        mLastX = mDownX;
        mLastY = mDownY;
    }

    private void touchMove(int x, int y) {
        int eachDeltaX = x - mLastX;
        int eachDeltaY = y - mLastY;
        mLastX = x;
        mLastY = y;
        mFBManager.updateBallView(eachDeltaX, eachDeltaY);

    }

    private void touchUp(int x, int y) {
        if (Math.abs(x - mDownX) < this.getWidth() / 10 && Math.abs(y - mDownY) < this.getHeight() / 10) {
            handleClickEvent();
        }
        mFB_ImgBigBall.setVisibility(View.INVISIBLE);
        mFB_ImgBall.setVisibility(View.VISIBLE);
        mFBManager.foldFloatball();
    }


    private void handleClickEvent() {
        Log.d(TAG, "mIsShowD2DInFo = " + mIsShowD2DInFo);
        if (0 == mIsShowD2DInFo) {//D2D info is not showed ,so need show
            mFB_Switch.setText(R.string.switch_on);
//            mFBManager.showD2DInFo();

            Gson gson = new Gson();
            String gsonData = SpUtils.getSettingNote(getContext(), DbKeyS.w_userinfo);
            Toast.makeText(getContext(),gsonData,Toast.LENGTH_LONG).show();
//            View view_dolog = LayoutInflater.from(getContext()).inflate(R.layout.w_dialog_help, null, false);
//
//            LinearLayout closeLL = (LinearLayout) view_dolog.findViewById(R.id.CloseLL);
//            TextView TitleTV = (TextView) view_dolog.findViewById(R.id.TitleTV);
//            TitleTV.setText("网络请求日志");
//            TextView ContentET = (TextView) view_dolog.findViewById(R.id.ContentET);
////            ContentET.setText(DicUtils.getHelpData(tag, context));
//            final DialogFromCenter dialogFromCenter_tip = new DialogFromCenter(getContext());
//            dialogFromCenter_tip.setContentView(view_dolog);
//            dialogFromCenter_tip.show();
        } else {//D2D info is showed ,so need close
            mFB_Switch.setText(R.string.switch_off);
            mFBManager.hideD2DInFo();
        }
        mIsShowD2DInFo = ~mIsShowD2DInFo;

    }


}
