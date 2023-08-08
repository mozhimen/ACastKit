package com.mozhimen.pushk_lebo_cast

import android.content.Context
import com.hpplay.sdk.source.api.LelinkSourceSDK
import com.mozhimen.basick.lintk.optin.OptInApiInit_InApplication
import com.mozhimen.basick.utilk.android.content.UtilKRes

/**
 * @ClassName PushKLeboCast
 * @Description TODO
 * @Author Mozhimen / Kolin Zhao
 * @Date 2023/8/8 23:42
 * @Version 1.0
 */
class PushKLeboCast {

    companion object {
        val instance = INSTANCE.holder
    }

    /////////////////////////////////////////////////////////////////

    @OptInApiInit_InApplication
    fun init(context: Context) {
        LelinkSourceSDK.getInstance()
            //FIXME WARN: 这里替换为您申请的AppID & AppSecret，build.gradle替换为您的应用包名
            .setSdkInitInfo(context, UtilKRes.getString(R.string.app_id), getString(R.string.app_secret))
            .easyPush(mBrowseContainer);

    }

    /////////////////////////////////////////////////////////////////

    private object INSTANCE {
        val holder = PushKLeboCast()
    }
}