package com.hxsoft.ajitai.wxapi;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.os.Environment;
import android.widget.ImageView;

import com.hxsoft.ajitai.Constants;
import com.hxsoft.ajitai.R;
import com.hxsoft.ajitai.utils.GlideControl;
import com.tencent.mm.opensdk.modelmsg.SendAuth;
import com.tencent.mm.opensdk.modelmsg.SendMessageToWX;
import com.tencent.mm.opensdk.modelmsg.WXImageObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.modelmsg.WXWebpageObject;
import com.tencent.mm.opensdk.modelpay.PayReq;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class WXAPI {
    public static IWXAPI api;
    public static Activity instance;
    public static int Type;

    public static void Init(Activity context) {
        WXAPI.instance = context;
        // 通过WXAPIFactory工厂，获取IWXAPI的实例
        api = WXAPIFactory.createWXAPI(context, Constants.APP_ID, true);
        api.registerApp(Constants.APP_ID);
    }

    /**
     * 微信官方支付
     *
     * @param appId
     * @param partnerId
     * @param prepayId
     * @param nonceStr
     * @param timeStamp
     * @param packageValue
     * @param sign
     */
    public static void WXPay(String appId, String partnerId, String prepayId,
                             String nonceStr, String timeStamp, String packageValue, String sign) {
        Type = 1;
        PayReq req = new PayReq();
        req.appId = appId;
        req.partnerId = partnerId;
        req.prepayId = prepayId;
        req.nonceStr = nonceStr;
        req.timeStamp = timeStamp;
        req.packageValue = packageValue;
        req.sign = sign;

        api.sendReq(req);
    }

    public static void WXsharePic(Bitmap bitmap) {
        Type = 2;
//初始化 WXImageObject 和 WXMediaMessage 对象
        WXImageObject imgObj = new WXImageObject(bitmap);
        WXMediaMessage msg = new WXMediaMessage();
        msg.mediaObject = imgObj;

//设置缩略图
//        Bitmap thumbBmp = Bitmap.createScaledBitmap(bitmap, 100, 100, true);
//        bitmap.recycle();
//        msg.thumbData = bmpToByteArray(thumbBmp, true);

//构造一个Req
        SendMessageToWX.Req req = new SendMessageToWX.Req();
        req.transaction = buildTransaction("img");
        req.message = msg;
        req.scene = SendMessageToWX.Req.WXSceneSession;
//        req.userOpenId = getOpenId();
//调用api接口，发送数据到微信
        api.sendReq(req);
    }

    public static void Login() {
        // Toast.makeText(instance, "ceshi", Toast.LENGTH_LONG).show();
        Type = 3;
        final SendAuth.Req req = new SendAuth.Req();
        req.scope = "snsapi_userinfo";
        req.state = "none";
        api.sendReq(req);
        // instance.finish();
    }

    /**
     * 分享微信好友
     *
     * @param url
     * @param title
     * @param desc
     */
    public static void Share(String url, String title, String desc, String fileName, Boolean IsHavIcon) {
        try {
            // Toast.makeText(instance, "战绩分享", Toast.LENGTH_LONG).show();
            Type = 4;

            WXWebpageObject webpage = new WXWebpageObject();
            webpage.webpageUrl = url;
            WXMediaMessage msg = new WXMediaMessage(webpage);
            msg.title = title;
            msg.description = desc;

            if (IsHavIcon == true) {
                FileInputStream fis = null;
                try {
                    String filePath = Environment.getExternalStorageDirectory() + "/download/" + fileName + "";
                    fis = new FileInputStream(filePath);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                Bitmap bitmap = BitmapFactory.decodeStream(fis);
                msg.thumbData = bmpToByteArrayMax(bitmap, 30);
            } else {
                Bitmap bitmap = ((BitmapDrawable) instance.getResources().getDrawable(R.mipmap.icon)).getBitmap();
                msg.thumbData = bmpToByteArrayMax(bitmap, 30);
            }


            SendMessageToWX.Req req = new SendMessageToWX.Req();
            req.transaction = buildTransaction("webpage");
            req.message = msg;
            req.scene = SendMessageToWX.Req.WXSceneSession;
            api.sendReq(req);
            // instance.finish();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 分享微信朋友圈
     *
     * @param url
     * @param title
     * @param desc
     */
    public static void ShareCOF(String url, String title, String desc,String fileName, Boolean IsHavIcon) {
        try {
            // Toast.makeText(instance, "战绩分享", Toast.LENGTH_LONG).show();
            Type = 5;
            WXWebpageObject webpage = new WXWebpageObject();
            webpage.webpageUrl = url;
            WXMediaMessage msg = new WXMediaMessage(webpage);
            msg.title = title;
            msg.description = desc;

            if (IsHavIcon == true) {
                FileInputStream fis = null;
                try {
                    String filePath = Environment.getExternalStorageDirectory() + "/download/"+fileName+"";
                    fis = new FileInputStream(filePath);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                Bitmap bitmap = BitmapFactory.decodeStream(fis);
                msg.thumbData = bmpToByteArrayMax(bitmap, 30);
            } else {
                Bitmap bitmap = ((BitmapDrawable) instance.getResources().getDrawable(R.mipmap.icon)).getBitmap();
                msg.thumbData = bmpToByteArrayMax(bitmap, 30);
            }

            SendMessageToWX.Req req = new SendMessageToWX.Req();
            req.transaction = buildTransaction("webpage");
            req.message = msg;
            req.scene = SendMessageToWX.Req.WXSceneTimeline;

            api.sendReq(req);
            // instance.finish();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Bitmap转换成byte[]并且进行压缩,压缩到不大于maxkb
     *
     * @param bitmap
     * @param maxKb
     * @return
     */
    public static byte[] bmpToByteArrayMax(Bitmap bitmap, int maxKb) {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 50, output);
        int options = 100;
        while (output.toByteArray().length > maxKb && options != 10) {
            output.reset(); //清空output
            bitmap.compress(Bitmap.CompressFormat.JPEG, options, output);//这里压缩options%，把压缩后的数据存放到output中
            options -= 10;
        }
        return output.toByteArray();
    }

    private static String buildTransaction(final String type) {
        return (type == null) ? String.valueOf(System.currentTimeMillis())
                : type + System.currentTimeMillis();
    }


    private static void copy(InputStream in, OutputStream out)
            throws IOException {
        byte[] b = new byte[1024];
        int read;
        while ((read = in.read(b)) != -1) {
            out.write(b, 0, read);
        }
    }

}
