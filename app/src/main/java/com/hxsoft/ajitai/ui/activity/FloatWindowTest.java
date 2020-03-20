package com.hxsoft.ajitai.ui.activity;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.provider.Settings;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.hxsoft.ajitai.R;
import com.yanzhenjie.permission.Action;
import com.yanzhenjie.permission.AndPermission;
import com.yanzhenjie.permission.Permission;
import com.yanzhenjie.permission.Rationale;

import java.io.File;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class FloatWindowTest extends Activity {
    @Bind(R.id.start)
    Button start;
    @Bind(R.id.stop)
    Button stop;
    @Bind(R.id.getfilesBtn)
    Button getfilesBtn;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //createFloatView();
        setContentView(R.layout.main);
        ButterKnife.bind(this);


        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (Build.VERSION.SDK_INT >= 23) {
                    if (Settings.canDrawOverlays(FloatWindowTest.this)) {
                        Toast.makeText(FloatWindowTest.this, "已开启Toucher", Toast.LENGTH_SHORT).show();

                        Intent intent = new Intent(FloatWindowTest.this, FloatingService.class);
                        startService(intent);
                        finish();
                    } else {
                        //若没有权限，提示获取.
                        Intent intent = new Intent(Settings.ACTION_MANAGE_OVERLAY_PERMISSION);
                        Toast.makeText(FloatWindowTest.this, "需要取得权限以使用悬浮窗", Toast.LENGTH_SHORT).show();
                        startActivity(intent);
                    }
                } else {
                    //SDK在23以下，不用管.
                    Intent intent = new Intent(FloatWindowTest.this, FloatingService.class);
                    startService(intent);
                    finish();
                }


            }
        });

        getfilesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkPermission();
                if (IS_READ_EXTERNAL_STORAGE && IS_WRITE_EXTERNAL_STORAGE && IS_CAMERA && IS_READ_PHONE_STATE) {
                    String filePath = "tess/tessdata/";
                    File appDir = new File(Environment.getExternalStorageDirectory(), filePath);
                    if (!appDir.exists()) {
                        appDir.mkdirs();
                    }
                    File[] files = appDir.listFiles();
                    Toast.makeText(getApplicationContext(), files.length + "", Toast.LENGTH_SHORT).show();
                } else {
                    getPermission();
                }

            }
        });
    }

    private void checkPermission() {
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            if (this.checkSelfPermission(Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED) {
                //如果没有写sd卡权限
                IS_READ_EXTERNAL_STORAGE = true;
            }

            if (this.checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED) {
                //如果没有写sd卡权限
                IS_WRITE_EXTERNAL_STORAGE = true;
            }


            if (this.checkSelfPermission(Manifest.permission.CAMERA) == PackageManager.PERMISSION_GRANTED) {
                //如果没有写sd卡权限
                IS_CAMERA = true;
            }

            if (this.checkSelfPermission(Manifest.permission.READ_PHONE_STATE) == PackageManager.PERMISSION_GRANTED) {
                //如果没有写sd卡权限
                IS_READ_PHONE_STATE = true;
            }

        }
    }

    private void getPermission() {
        String[] pers = new String[4];
        pers[0] = Permission.READ_EXTERNAL_STORAGE;
        pers[1] = Permission.WRITE_EXTERNAL_STORAGE;
        pers[2] = Permission.CAMERA;
        pers[3] = Permission.READ_PHONE_STATE;
        mRationale = new DefaultRationale();
        requestPermission(pers);
    }

    private Rationale mRationale;
    //读取文件权限
    private boolean IS_READ_EXTERNAL_STORAGE = false;

    //写文件权限
    private boolean IS_WRITE_EXTERNAL_STORAGE = false;

    //相机权限
    private boolean IS_CAMERA = false;

    //
    private boolean IS_READ_PHONE_STATE = false;

    private void requestPermission(String... permissions) {
        AndPermission.with(this)
                .permission(permissions)
                .rationale(mRationale)
                .onGranted(new Action() {
                    @Override
                    public void onAction(List<String> permissions) {
                        if (permissions.contains("android.permission.READ_EXTERNAL_STORAGE")) {
                            IS_READ_EXTERNAL_STORAGE = true;
                        }
                        if (permissions.contains("android.permission.WRITE_EXTERNAL_STORAGE")) {
                            IS_WRITE_EXTERNAL_STORAGE = true;
                        }

                        if (permissions.contains("android.permission.CAMERA")) {
                            IS_CAMERA = true;
                        }
                        if (permissions.contains("android.permission.READ_PHONE_STATE")) {
                            IS_READ_PHONE_STATE = true;
                        }

//                        toast(R.string.successfully);
                    }
                })
                .onDenied(new Action() {
                    @Override
                    public void onAction(@NonNull List<String> permissions) {
                        //android.permission.READ_SMS
                        if (permissions.contains("android.permission.READ_EXTERNAL_STORAGE")) {
                            IS_READ_EXTERNAL_STORAGE = false;
                        }
                        if (permissions.contains("android.permission.WRITE_EXTERNAL_STORAGE")) {
                            IS_WRITE_EXTERNAL_STORAGE = false;
                        }

                        if (permissions.contains("android.permission.CAMERA")) {
                            IS_CAMERA = false;
                        }
                        if (permissions.contains("android.permission.READ_PHONE_STATE")) {
                            IS_READ_PHONE_STATE = false;
                        }

                    }
                })
                .start();
    }
}