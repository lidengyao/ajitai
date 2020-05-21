package com.hxsoft.ajitai.utils;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.CountDownTimer;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.PopupWindow;

import com.hxsoft.ajitai.R;


public class CheckControl_Dialog_Tip {


    public static void ShowDialog(final Context context, final Activity activity, String content) {


        View bottomView = View.inflate(context, R.layout.actionsheet_dialog_tip, null);
        Button TipBtn = (Button) bottomView.findViewById(R.id.TipBtn);
        TipBtn.setText(content);
        PopupWindow pop = new PopupWindow(bottomView, -1, -2);
        pop.setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        pop.setOutsideTouchable(true);
        pop.setFocusable(true);
        WindowManager.LayoutParams lp = activity.getWindow().getAttributes();
        lp.alpha = 0.5f;
        activity.getWindow().setAttributes(lp);
        pop.setOnDismissListener(new PopupWindow.OnDismissListener() {

            @Override
            public void onDismiss() {
                WindowManager.LayoutParams lp = activity.getWindow().getAttributes();
                lp.alpha = 1f;
                activity.getWindow().setAttributes(lp);
            }
        });

        new CountDownTimer(2000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {

            }

            @Override
            public void onFinish() {
                pop.dismiss();
            }
        }.start();


        pop.setAnimationStyle(R.style.center_dialog_anim);
        pop.showAtLocation(activity.getWindow().getDecorView(), Gravity.CENTER, 0, 0);
    }


    public interface OnCheckControl_dialogClickListener {
        void OnClick(int type);
    }

}
