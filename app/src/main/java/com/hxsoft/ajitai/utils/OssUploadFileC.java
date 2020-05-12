package com.hxsoft.ajitai.utils;

import android.content.Context;

import com.hxsoft.ajitai.Constants;
import com.hxsoft.ajitai.model.Inf.OssUpLoadFileListener;
import com.hxsoft.ajitai.model.bean.UserIndexBean;

public class OssUploadFileC {
    public static void OssUpFile(Context context, String fileName, String filePath, OssUpLoadFileListener ossUpLoadFileListener) {

        OssService ossService = new OssService(context);
        ossService.initOSSClient();
        ossService.beginupload(context, fileName, filePath, null, new OssService.UpLoadListener() {
            @Override
            public void UpLoad(Boolean IsSuccess) {
                ossUpLoadFileListener.OssUpLoadFile(IsSuccess);
            }
        });

    }
}
