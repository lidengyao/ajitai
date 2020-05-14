package com.hxsoft.ajitai.ui.activity;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.gson.Gson;
import com.hxsoft.ajitai.R;
import com.hxsoft.ajitai.base.MvpActivity;
import com.hxsoft.ajitai.model.Inf.OssUpLoadFileListener;
import com.hxsoft.ajitai.model.bean.A_UserUpdatecurrent_Bean;
import com.hxsoft.ajitai.model.bean.A_User_Info;
import com.hxsoft.ajitai.present.A_GeRenXinXi_Present;
import com.hxsoft.ajitai.timepaker.ChangeDatePopwindow;
import com.hxsoft.ajitai.ui.view.A_GeRenXinXi_View;
import com.hxsoft.ajitai.utils.CheckControl_Dialog_XingBie;
import com.hxsoft.ajitai.utils.DbKeyS;
import com.hxsoft.ajitai.utils.GlideControl;
import com.hxsoft.ajitai.utils.MStringUtils;
import com.hxsoft.ajitai.utils.OssUploadFileC;
import com.hxsoft.ajitai.utils.SpUtils;
import com.luck.picture.lib.PictureSelector;
import com.luck.picture.lib.config.PictureConfig;
import com.luck.picture.lib.config.PictureMimeType;
import com.luck.picture.lib.entity.LocalMedia;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by jinxh on 16/2/1.
 */
public class A_Activity_GeRenXinXi extends MvpActivity<A_GeRenXinXi_Present> implements A_GeRenXinXi_View {


    @Bind(R.id.SysNameIV)
    TextView SysNameIV;
    @Bind(R.id.QieHuanZhangHaoRL)
    RelativeLayout QieHuanZhangHaoRL;
    @Bind(R.id.textView)
    TextView textView;
    @Bind(R.id.BottomLL)
    LinearLayout BottomLL;
    @Bind(R.id.ChuShengRiQi_TV)
    TextView ChuShengRiQiTV;
    @Bind(R.id.XingBie_TV)
    TextView XingBieTV;
    @Bind(R.id.ShouHuoDiZhi_TV)
    TextView ShouHuoDiZhiTV;
    @Bind(R.id.ShouHuoDiZhi_RL)
    RelativeLayout ShouHuoDiZhiRL;
    @Bind(R.id.ZengPiaoZiZhi_TV)
    TextView ZengPiaoZiZhiTV;
    @Bind(R.id.ZengPiaoZiZhi_RL)
    RelativeLayout ZengPiaoZiZhiRL;
    @Bind(R.id.nickname_ET)
    EditText nicknameET;
    @Bind(R.id.avatar_IV)
    ImageView avatarIV;
    @Bind(R.id.ZhangHao_ET)
    EditText ZhangHaoET;
    @Bind(R.id.phone_ET)
    EditText phoneET;
    private String[] needPermissions = {Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.READ_EXTERNAL_STORAGE};
    private static final int REQUEST_STORAGE_PERMISSION = 104;
    private Boolean saveOp = false;

    @Override
    protected int getLayoutId() {
        return R.layout.a_activity_gerenxinxi;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);

        ZengPiaoZiZhiRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), A_Activity_ZengPiaoZiZhi.class);
                startActivity(intent);
            }
        });


        ShouHuoDiZhiRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), A_Activity_ShouHuoDiZhi.class);
                startActivity(intent);
            }
        });
        XingBieTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckControl_Dialog_XingBie.ShowDialog(getContext(), getActivity(), "", new CheckControl_Dialog_XingBie.OnCheckControl_dialogClickListener() {
                    @Override
                    public void OnClick(int type) {

                    }
                });
            }
        });
        ChuShengRiQiTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ChangeDatePopwindow mChangeBirthDialog = new ChangeDatePopwindow();
                mChangeBirthDialog.ShowDialog(getContext(), getActivity(), true, true, true, new ChangeDatePopwindow.OnBirthListener() {
                    @Override
                    public void onClick(String year, String month, String day) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(year.substring(0, year.length() - 1)).append("-").append(month.substring(0, month.length() - 1)).append("-").append(day.substring(0, day.length() - 1));
                        String showDate = sb.toString();

//                        birthdayTV.setText(showDate);
//                        UserIndexBean userIndexBean = new UserIndexBean();
//                        userIndexBean.setBirthday(showDate);
//                        mPresenter.userprofile(getContext(), userIndexBean);

                    }
                });
            }
        });


        BottomLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveOp = true;
                A_UserUpdatecurrent_Bean a_userUpdatecurrent_bean = new A_UserUpdatecurrent_Bean();
                a_userUpdatecurrent_bean.setNickname(nicknameET.getText().toString());

                mPresenter.adminUserUpdatecurrent(a_userUpdatecurrent_bean, getContext());
            }
        });

        avatarIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (IsHavWriteRead() == false) {
                    ActivityCompat.requestPermissions(getActivity(), needPermissions, REQUEST_STORAGE_PERMISSION);
                } else {
                    showPop();

                }

            }
        });

        Gson gson = new Gson();
        String gsonData = SpUtils.getSettingNote(getContext(), DbKeyS.A_User_Info);
        A_User_Info a_user_info = gson.fromJson(gsonData, A_User_Info.class);

        if (a_user_info != null) {
            GlideControl.SetCircleImage(getContext(), a_user_info.getSysUser().getAvatar(), avatarIV, R.mipmap.a_touxiang);
            nicknameET.setText(a_user_info.getSysUser().getNickname());
            ZhangHaoET.setText(a_user_info.getSysUser().getPhone());
            phoneET.setText(a_user_info.getSysUser().getPhone());
        }
    }


    private PopupWindow pop;

    private void showPop() {
        View bottomView = View.inflate(getContext(), R.layout.layout_bottom_dialog, null);
        TextView mAlbum = bottomView.findViewById(R.id.tv_album);
        TextView mCamera = bottomView.findViewById(R.id.tv_camera);
        TextView mCancel = bottomView.findViewById(R.id.tv_cancel);

        pop = new PopupWindow(bottomView, -1, -2);
        pop.setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        pop.setOutsideTouchable(true);
        pop.setFocusable(true);
        WindowManager.LayoutParams lp = getActivity().getWindow().getAttributes();
        lp.alpha = 0.5f;
        getActivity().getWindow().setAttributes(lp);
        pop.setOnDismissListener(new PopupWindow.OnDismissListener() {

            @Override
            public void onDismiss() {
                WindowManager.LayoutParams lp = getActivity().getWindow().getAttributes();
                lp.alpha = 1f;
                getActivity().getWindow().setAttributes(lp);
            }
        });
        pop.setAnimationStyle(R.style.bottom_dialog_anim);
        pop.showAtLocation(getActivity().getWindow().getDecorView(), Gravity.BOTTOM, 0, 0);

        View.OnClickListener clickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.tv_album:
                        //相册
                        PictureSelector.create(getActivity())
                                .openGallery(PictureMimeType.ofImage())
                                .maxSelectNum(1)
                                .minSelectNum(1)
                                .imageSpanCount(4)
                                .compress(true)
                                .selectionMode(PictureConfig.MULTIPLE)
                                .forResult(PictureConfig.CHOOSE_REQUEST);
                        break;
                    case R.id.tv_camera:
                        //拍照
                        PictureSelector.create(getActivity())
                                .openCamera(PictureMimeType.ofImage()).compress(true)
                                .forResult(PictureConfig.CHOOSE_REQUEST);
                        break;
                    case R.id.tv_cancel:
                        //取消
                        //closePopupWindow();
                        break;
                }
                closePopupWindow();
            }
        };

        mAlbum.setOnClickListener(clickListener);
        mCamera.setOnClickListener(clickListener);
        mCancel.setOnClickListener(clickListener);
    }

    public void closePopupWindow() {
        if (pop != null && pop.isShowing()) {
            pop.dismiss();
            pop = null;
        }
    }

    private boolean IsHavWriteRead() {
        boolean read = false;
        boolean write = false;
        if (ContextCompat.checkSelfPermission(
                getContext(), Manifest.permission.READ_EXTERNAL_STORAGE)
                != PackageManager.PERMISSION_GRANTED) {
            read = false;
        } else {
            read = true;
        }

        if (ContextCompat.checkSelfPermission(
                getContext(), Manifest.permission.WRITE_EXTERNAL_STORAGE)
                != PackageManager.PERMISSION_GRANTED) {
            write = false;
        } else {
            write = true;
        }

        if (read == true && write == true) {
            return true;
        } else
            return false;
    }

    @Override
    protected A_GeRenXinXi_Present createPresenter() {
        return new A_GeRenXinXi_Present();
    }

    @Override
    protected void initEvent() {
        super.initEvent();
    }

    @Override
    protected void initData() {
        super.initData();
    }

    @Override
    protected void initView() {
        super.initView();
    }


    @Override
    public void userUpdatecurrentSuccess(Boolean model) {
        if (model) {
            if (saveOp) {
                showMessage("保存成功");
                finish();
            } else {
                showMessage("头像更新成功");
            }

        } else {
            if (saveOp) {
                showMessage("保存失败");
            } else {
                showMessage("头像更新失败");
            }

        }


    }

    @Override
    public void pushUploadSuccess(String model) {
        if (model == null)
            return;
        showMessage(model);
    }

    @Override
    public void onFailure(int code, String msg) {
        showMessage(msg);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == RESULT_OK) {
            List<LocalMedia> selectList = new ArrayList<>();
            selectList = PictureSelector.obtainMultipleResult(data);
            if (selectList.size() > 0) {
                LocalMedia localMedia = selectList.get(0);
                GlideControl.SetCircleImage(getContext(), localMedia.getPath(), avatarIV, R.mipmap.a_touxiang);
                File upLoadImg = new File(localMedia.getCompressPath());
                String fileName = upLoadImg.getName();
                String filePath = upLoadImg.getPath();

                final Runnable payRunnable = new Runnable() {

                    @Override
                    public void run() {

                        OssUploadFileC.OssUpFile(getContext(), fileName, filePath, new OssUpLoadFileListener() {
                            @Override
                            public void OssUpLoadFile(Boolean IsSuccess, String fileName) {

                                Map<String, String> result = new HashMap<>();
                                result.put("avatar", fileName);
                                Message msg = new Message();
                                msg.what = UPLOADIMAGE;
                                msg.obj = result;
                                mHandler.sendMessage(msg);


                            }
                        });

                    }
                };

                // 必须异步调用
                Thread payThread = new Thread(payRunnable);
                payThread.start();


//                mPresenter.pushUpload(upLoadImg, getContext());
            }
        }
    }

    private static final int UPLOADIMAGE = 1;
    @SuppressLint("HandlerLeak")
    private Handler mHandler = new Handler() {
        @SuppressWarnings("unused")
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case UPLOADIMAGE: {
                    Map<String, String> result = (Map<String, String>) msg.obj;
                    A_UserUpdatecurrent_Bean a_userUpdatecurrent_bean = new A_UserUpdatecurrent_Bean();
                    if (!MStringUtils.IsNullOrEmpty(result.get("avatar"))) {
                        a_userUpdatecurrent_bean.setAvatar(result.get("avatar"));
                        mPresenter.adminUserUpdatecurrent(a_userUpdatecurrent_bean, getContext());
                    }
                    break;
                }

                default:
                    break;
            }
        }
    };

}
