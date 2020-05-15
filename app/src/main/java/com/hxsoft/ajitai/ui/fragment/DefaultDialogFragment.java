package com.hxsoft.ajitai.ui.fragment;


import android.annotation.SuppressLint;
import android.app.DialogFragment;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;


import com.hxsoft.ajitai.R;
import com.hxsoft.ajitai.utils.SoftKeyboardUtil;

import java.util.Timer;
import java.util.TimerTask;


@SuppressLint("ValidFragment")
public class DefaultDialogFragment extends DialogFragment {


    private View view;
    private RelativeLayout llRL;
    private TextView close;
    private EditText editText;
    private Button send;
    private OnSendMsgListener _OnSendMsgListener;

    public DefaultDialogFragment(OnSendMsgListener onSendMsgListener) {
        // Required empty public constructor
        _OnSendMsgListener = onSendMsgListener;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        getDialog().requestWindowFeature(Window.FEATURE_NO_TITLE);//必须放在setContextView之前调用, 去掉Dialog中的蓝线
        view = inflater.inflate(R.layout.fragment_default_dialog, container);
        setLayout();
        initData();

        return view;
    }

    private void initData() {
//        final Window window = getDialog().getWindow();
//        window.getDecorView().setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() {
//            @Override
//            public void onSystemUiVisibilityChange(int visibility) {
//                setHideVirtualKey(window);
//            }
//        });
        llRL = (RelativeLayout) view.findViewById(R.id.BottomLL);
        close = (TextView) view.findViewById(R.id.close);
        editText = (EditText) view.findViewById(R.id.edit_send_message);
        send = (Button) view.findViewById(R.id.FaBu_Btn);
        LinearLayout RootLL = (LinearLayout) view.findViewById(R.id.RootLL);
//        setListenerFotEditText(RootLL);
        editText.setFocusable(true);
        editText.setFocusableInTouchMode(true);
        editText.requestFocus();
//        showSoftInputFromWindow(editText);
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
                           public void run() {

                               SoftKeyboardUtil.showKeyboard(editText.getContext(), editText);
                           }
                       },
                150);//这里键盘没有自动弹起可以把时间值设大一点
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _OnSendMsgListener.SendMsg(editText.getText().toString());
                editText.setText("");
//                dismiss();
            }
        });
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });
    }

    public void showSoftInputFromWindow(EditText editText) {
        editText.setFocusable(true);
        editText.setFocusableInTouchMode(true);
        editText.requestFocus();
        this.getActivity().getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE);

        InputMethodManager imm = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.toggleSoftInput(0, InputMethodManager.HIDE_NOT_ALWAYS);    //InputMethodManager.SHOW_FORCED

    }

    public void setHideVirtualKey(Window window) {
        int systemUiVisibility =
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
//              | View.SYSTEM_UI_FLAG_LOW_PROFILE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_FULLSCREEN;
        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
            systemUiVisibility |= View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY;
        }
        window.getDecorView().setSystemUiVisibility(systemUiVisibility);
    }

    private void setLayout() {
        Window window = getDialog().getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);//设置全屏，即没有系统状态栏
//        window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);//透明状态栏
        window.getDecorView().setPadding(0, 0, 0, 0);
        window.setBackgroundDrawable(new ColorDrawable(0));//背景透明
        WindowManager.LayoutParams lp = window.getAttributes();
        lp.width = ViewGroup.LayoutParams.MATCH_PARENT;
        lp.height = ViewGroup.LayoutParams.MATCH_PARENT;
        lp.dimAmount = 0;
        window.setAttributes(lp);
    }


    public interface OnSendMsgListener {
        void SendMsg(String msg);
    }

}
