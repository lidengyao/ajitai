package com.hxsoft.ajitai.utils;

import android.content.Context;

import com.google.gson.Gson;
import com.hxsoft.ajitai.jpush.TagAliasOperatorHelper;
import com.hxsoft.ajitai.model.info.UserIndexInfo;

import cn.jpush.android.api.JPushInterface;

public class JPushControl {
    public static void SetJPush(Context context) {

        Gson gsonZU = new Gson();
        String userinfo = SpUtils.getSettingNote(context, DbKeyS.userindex);
        UserIndexInfo.UserinfoBean userinfoBean = gsonZU.fromJson(userinfo, UserIndexInfo.UserinfoBean.class);

        if (JPushInterface.isPushStopped(context)) {
            JPushInterface.resumePush(context);
        }
        Object localObject = new TagAliasOperatorHelper.TagAliasBean();
        ((TagAliasOperatorHelper.TagAliasBean) localObject).action = 2;
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append(userinfoBean.getMobile());
        ((TagAliasOperatorHelper.TagAliasBean) localObject).alias = localStringBuilder.toString();
        ((TagAliasOperatorHelper.TagAliasBean) localObject).isAliasAction = true;
        TagAliasOperatorHelper.getInstance().handleAction(context, 1, (TagAliasOperatorHelper.TagAliasBean) localObject);
    }
}
