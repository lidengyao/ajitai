package com.hxsoft.ajitai.utils;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.PopupWindow;

import com.hxsoft.ajitai.R;


public class CheckControl_Dialog_FaBuGanWu_YuYin {


    public static void ShowDialog(final Context context, final Activity activity, String content, final OnCheckControl_dialogClickListener onCheckControl_dialogClickListener) {


        View bottomView = View.inflate(context, R.layout.actionsheet_dialog_fabuganwu_yuyin, null);

        Button NoOkBtn = (Button) bottomView.findViewById(R.id.NoOkBtn);
        Button OkBtn = (Button) bottomView.findViewById(R.id.OkBtn);

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
        OkBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pop.dismiss();
                onCheckControl_dialogClickListener.OnClick(1);
            }
        });

        NoOkBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pop.dismiss();
                onCheckControl_dialogClickListener.OnClick(0);
            }
        });
        pop.setAnimationStyle(R.style.center_dialog_anim);
        pop.showAtLocation(activity.getWindow().getDecorView(), Gravity.CENTER, 0, 0);
    }


    public interface OnCheckControl_dialogClickListener {
        void OnClick(int type);
    }

}
