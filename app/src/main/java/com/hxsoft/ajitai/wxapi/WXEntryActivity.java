package com.hxsoft.ajitai.wxapi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

import com.hxsoft.ajitai.Constants;
import com.hxsoft.ajitai.R;
import com.hxsoft.ajitai.uikit.NetworkUtil;
import com.hxsoft.ajitai.utils.DbKeyS;
import com.hxsoft.ajitai.utils.SpUtils;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import com.tencent.mm.opensdk.modelmsg.SendAuth;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.IWXAPIEventHandler;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;


import org.json.JSONException;
import org.json.JSONObject;

import java.lang.ref.WeakReference;

public class WXEntryActivity extends Activity implements IWXAPIEventHandler {
    private static String TAG = "MicroMsg.WXEntryActivity";

    private IWXAPI api;
    private MyHandler handler;

    private static class MyHandler extends Handler {
        private final WeakReference<WXEntryActivity> wxEntryActivityWeakReference;

        public MyHandler(WXEntryActivity wxEntryActivity) {
            wxEntryActivityWeakReference = new WeakReference<WXEntryActivity>(wxEntryActivity);
        }

        @Override
        public void handleMessage(Message msg) {
            int tag = msg.what;
            switch (tag) {
                case NetworkUtil.GET_TOKEN: {
                    Bundle data = msg.getData();
                    JSONObject json = null;
                    try {
                        json = new JSONObject(data.getString("result"));
                        String openId, accessToken, refreshToken, scope;
                        openId = json.getString("openid");
                        accessToken = json.getString("access_token");
                        refreshToken = json.getString("refresh_token");
                        scope = json.getString("scope");
//						Intent intent = new Intent(wxEntryActivityWeakReference.get(), SendToWXActivity.class);
//						intent.putExtra("openId", openId);
//						intent.putExtra("accessToken", accessToken);
//						intent.putExtra("refreshToken", refreshToken);
//						intent.putExtra("scope", scope);
//						wxEntryActivityWeakReference.get().startActivity(intent);
                    } catch (JSONException e) {
                        Log.e(TAG, e.getMessage());
                    }
                }
            }
        }
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        api = WXAPIFactory.createWXAPI(this, Constants.APP_ID, false);
        handler = new MyHandler(this);

        try {
            Intent intent = getIntent();
            api.handleIntent(intent, this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);

        setIntent(intent);
        api.handleIntent(intent, this);
    }

    @Override
    public void onReq(BaseReq req) {
        switch (req.getType()) {
            case ConstantsAPI.COMMAND_GETMESSAGE_FROM_WX:
//			goToGetMsg();
                break;
            case ConstantsAPI.COMMAND_SHOWMESSAGE_FROM_WX:
//			goToShowMsg((ShowMessageFromWX.Req) req);
                break;
            default:
                break;
        }
        finish();
    }

    @Override
    public void onResp(BaseResp resp) {
        int result = 0;

        switch (resp.errCode) {
            case BaseResp.ErrCode.ERR_OK:
                if (WXAPI.Type == 1) {

                }
                if (WXAPI.Type == 2) {
                }

                //微信登陆
                if (WXAPI.Type == 3) {
                    SendAuth.Resp authResp = (SendAuth.Resp) resp;
                    SpUtils.saveSettingNote(this, DbKeyS.weixindenglu, "1");
                    SpUtils.saveSettingNote(this, DbKeyS.wx_code, authResp.code);
                }
                //分享微信好友
                if (WXAPI.Type == 4) {
//                    SendAuth.Resp authResp = (SendAuth.Resp) resp;
//                    SpUtils.saveSettingNote(this, DbKeyS.weixindenglu, "1");
//                    SpUtils.saveSettingNote(this, DbKeyS.wx_code, authResp.code);
                }
                //分享微信朋友圈
                if (WXAPI.Type == 5) {
//                    SendAuth.Resp authResp = (SendAuth.Resp) resp;
//                    SpUtils.saveSettingNote(this, DbKeyS.weixindenglu, "1");
//                    SpUtils.saveSettingNote(this, DbKeyS.wx_code, authResp.code);
                }
                break;
            case BaseResp.ErrCode.ERR_USER_CANCEL:
                result = R.string.errcode_cancel;
                break;
            case BaseResp.ErrCode.ERR_AUTH_DENIED:
                result = R.string.errcode_deny;
                break;
            case BaseResp.ErrCode.ERR_UNSUPPORT:
                result = R.string.errcode_unsupported;
                break;
            default:
                result = R.string.errcode_unknown;
                break;
        }


//        Toast.makeText(this, getString(result) + ", type=" + resp.getType(), Toast.LENGTH_SHORT).show();


//        if (resp.getType() == ConstantsAPI.COMMAND_SUBSCRIBE_MESSAGE) {
//            SubscribeMessage.Resp subscribeMsgResp = (SubscribeMessage.Resp) resp;
//            String text = String.format("openid=%s\ntemplate_id=%s\nscene=%d\naction=%s\nreserved=%s",
//                    subscribeMsgResp.openId, subscribeMsgResp.templateID, subscribeMsgResp.scene, subscribeMsgResp.action, subscribeMsgResp.reserved);
//
//            Toast.makeText(this, text, Toast.LENGTH_LONG).show();
//        }
//
//        if (resp.getType() == ConstantsAPI.COMMAND_LAUNCH_WX_MINIPROGRAM) {
//            WXLaunchMiniProgram.Resp launchMiniProgramResp = (WXLaunchMiniProgram.Resp) resp;
//            String text = String.format("openid=%s\nextMsg=%s\nerrStr=%s",
//                    launchMiniProgramResp.openId, launchMiniProgramResp.extMsg, launchMiniProgramResp.errStr);
//
//            Toast.makeText(this, text, Toast.LENGTH_LONG).show();
//        }
//
//        if (resp.getType() == ConstantsAPI.COMMAND_OPEN_BUSINESS_VIEW) {
//            WXOpenBusinessView.Resp launchMiniProgramResp = (WXOpenBusinessView.Resp) resp;
//            String text = String.format("openid=%s\nextMsg=%s\nerrStr=%s\nbusinessType=%s",
//                    launchMiniProgramResp.openId, launchMiniProgramResp.extMsg, launchMiniProgramResp.errStr, launchMiniProgramResp.businessType);
//
//            Toast.makeText(this, text, Toast.LENGTH_LONG).show();
//        }
//
//        if (resp.getType() == ConstantsAPI.COMMAND_OPEN_BUSINESS_WEBVIEW) {
//            WXOpenBusinessWebview.Resp response = (WXOpenBusinessWebview.Resp) resp;
//            String text = String.format("businessType=%d\nresultInfo=%s\nret=%d", response.businessType, response.resultInfo, response.errCode);
//
//            Toast.makeText(this, text, Toast.LENGTH_LONG).show();
//        }
//
//        if (resp.getType() == ConstantsAPI.COMMAND_SENDAUTH) {
//            SendAuth.Resp authResp = (SendAuth.Resp) resp;
//            final String code = authResp.code;
//            NetworkUtil.sendWxAPI(handler, String.format("https://api.weixin.qq.com/sns/oauth2/access_token?" +
//                            "appid=%s&secret=%s&code=%s&grant_type=authorization_code", Constants.APP_ID,
//                    Constants.AppSecret, code), NetworkUtil.GET_TOKEN);
//        }
        finish();
    }


}