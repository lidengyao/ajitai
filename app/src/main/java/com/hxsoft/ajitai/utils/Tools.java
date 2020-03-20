package com.hxsoft.ajitai.utils;

import android.content.Context;
import android.os.Environment;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.hxsoft.ajitai.AppContext;
import com.hxsoft.ajitai.R;

/**
 * Created by lidengyao on 2016-10-11 0011.
 */
public class Tools {

    public static boolean hasSdcard() {
        String state = Environment.getExternalStorageState();
        if (state.equals(Environment.MEDIA_MOUNTED)) {
            return true;
        } else {
            return false;
        }
    }

    public static void EditTextFouseToEnd(EditText editText) {
        editText.setSelection(editText.getText().length());
    }

    public static void SetData(TextView textView, String value, Context context) {
        if (value.equals("")) {
            textView.setText("无");
            textView.setTextColor(context.getResources().getColor(R.color.color15));
        } else {
            textView.setText(value);
        }
    }

    /**
     * 身份证号校验
     *
     * @param idCard
     * @return
     */
    public static boolean isIdCardNum(String idCard) {
        String reg = "^\\d{15}$|^\\d{17}[0-9Xx]$";
        if (!idCard.matches(reg)) {
            System.out.println("Format Error!");
            return false;
        }
        return true;
    }

    public static void SetVisible(View view) {
        if (AppContext.debug) {
            view.setVisibility(View.VISIBLE);
        }
    }

    public static String getImgurl(String imgShortUrl) {
        String imgUrl = AppContext.API_BASE_URL + "/file/img/" + imgShortUrl.replace("\\", "/");
        return imgUrl;
    }

    public static String getFileurl(String fileUrl) {
        String imgUrl = AppContext.API_BASE_URL + "/file/download/" + fileUrl.replace("\\", "/");
        return imgUrl;
    }
}