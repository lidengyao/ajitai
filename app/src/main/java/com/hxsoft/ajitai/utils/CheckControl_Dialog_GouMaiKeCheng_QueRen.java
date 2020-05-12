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
import android.widget.PopupWindow;
import android.widget.TextView;

import com.hxsoft.ajitai.R;
import com.hxsoft.ajitai.ui.activity.A_Activity_ShouYinTai;


public class CheckControl_Dialog_GouMaiKeCheng_QueRen {


    public static void ShowDialog(final Context context, final Activity activity, String price, String title, final OnCheckControl_dialogClickListener onCheckControl_dialogClickListener) {


        View bottomView = View.inflate(context, R.layout.actionsheet_dialog_goumaikecheng_queren, null);
        TextView TitleTV = (TextView) bottomView.findViewById(R.id.TitleTV);
        TextView price_TV = (TextView) bottomView.findViewById(R.id.price_TV);
        TitleTV.setText("是否确认购买【" + title + "】");
        price_TV.setText("¥ " + price);

        Button QuXiaoBtn = (Button) bottomView.findViewById(R.id.QuXiaoBtn);
        Button OK_Btn = (Button) bottomView.findViewById(R.id.OK_Btn);
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
        OK_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pop.dismiss();
                Intent intent = new Intent(context, A_Activity_ShouYinTai.class);
                context.startActivity(intent);
            }
        });
        QuXiaoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pop.dismiss();
            }
        });
        pop.setAnimationStyle(R.style.center_dialog_anim);
        pop.showAtLocation(activity.getWindow().getDecorView(), Gravity.CENTER, 0, 0);
    }


    public interface OnCheckControl_dialogClickListener {
        void OnClick(int type);
    }

}
