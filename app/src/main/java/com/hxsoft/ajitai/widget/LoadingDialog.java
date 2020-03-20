package com.hxsoft.ajitai.widget;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.hxsoft.ajitai.R;


public class LoadingDialog {
    private Dialog loadingDialog;
    //    private String tipValue;
    private TextView textView;

    public LoadingDialog(Context context) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View v = inflater.inflate(R.layout.view_progress, null);// 得到加载view
        LinearLayout layout = (LinearLayout) v.findViewById(R.id.dialog_view);// 加载布局
        loadingDialog = new Dialog(context, R.style.loadingDialog);// 创建自定义样式dialog
        textView = (TextView) v.findViewById(R.id.loadingTipTV);
        loadingDialog.setCancelable(false);// 不可以用“返回键”取消
        loadingDialog.setContentView(layout, new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT));// 设置布局

//        loadingDialog.setOnKeyListener(new DialogInterface.OnKeyListener() {
//            @Override
//            public boolean onKey(DialogInterface dialog, int keyCode, KeyEvent event) {
//                if (keyCode == KeyEvent.KEYCODE_SEARCH) {
//                    return true;
//                } else {
//                    return false; //默认返回 false
//                }
//            }
//        });
    }

    public void show(String tipValue) {
        loadingDialog.show();
        if (tipValue != null && !tipValue.equals("")) {
            textView.setText(tipValue + "...");
        } else {
            textView.setText("数据加载中...");
        }


    }

    public void dismiss() {
        if (loadingDialog.isShowing()) {
            loadingDialog.dismiss();
        }
    }

    public boolean isShowing() {
        return loadingDialog.isShowing();
    }


}
