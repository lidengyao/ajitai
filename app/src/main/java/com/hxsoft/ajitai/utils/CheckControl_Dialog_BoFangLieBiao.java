package com.hxsoft.ajitai.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.PopupWindow;

import com.hxsoft.ajitai.R;
import com.hxsoft.ajitai.ui.activity.A_Activity_ShouYinTai;


public class CheckControl_Dialog_BoFangLieBiao {


    public static void ShowDialog(final Context context, final Activity activity, String content, final OnCheckControl_dialogClickListener onCheckControl_dialogClickListener) {


        View bottomView = View.inflate(context, R.layout.actionsheet_dialog_bofangliebiao, null);

        LinearLayout GuanBi_LL = (LinearLayout) bottomView.findViewById(R.id.GuanBi_LL);
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
        GuanBi_LL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pop.dismiss();
            }
        });
        pop.setAnimationStyle(R.style.main_menu_photo_anim);
        pop.showAtLocation(activity.getWindow().getDecorView(), Gravity.BOTTOM, 0, 0);
    }


    public interface OnCheckControl_dialogClickListener {
        void OnClick(int type);
    }

}
