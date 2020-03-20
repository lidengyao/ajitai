package com.hxsoft.ajitai.utils;

import android.content.Context;
import android.widget.EditText;
import android.widget.TextView;

import com.hxsoft.ajitai.R;

public class DataSetColor {
    public static void setEditTextColor(Context context, EditText editText, Integer ColorID) {
        if (ColorID != null) {
            if (ColorID == 0) {
                editText.setTextColor(context.getResources().getColor(R.color.valuecolor));
            }
            if (ColorID == 1) {
                editText.setTextColor(context.getResources().getColor(R.color.color14));
            }
            if (ColorID == 2) {
                editText.setTextColor(context.getResources().getColor(R.color.color26));
            }
            if (ColorID == 3) {
                editText.setTextColor(context.getResources().getColor(R.color.color21));
            }
            if (ColorID == 4) {
                editText.setTextColor(context.getResources().getColor(R.color.color15));
            }
        }

    }

    public static void setTextViewColor(Context context, TextView textView, Integer ColorID) {
        if (ColorID != null) {
            if (ColorID == 0) {
                textView.setTextColor(context.getResources().getColor(R.color.valuecolor));
            }
            if (ColorID == 1) {
                textView.setTextColor(context.getResources().getColor(R.color.color14));
            }
            if (ColorID == 2) {
                textView.setTextColor(context.getResources().getColor(R.color.color26));
            }
            if (ColorID == 3) {
                textView.setTextColor(context.getResources().getColor(R.color.color21));
            }
            if (ColorID == 4) {
                textView.setTextColor(context.getResources().getColor(R.color.color15));
            }
        }

    }
}
