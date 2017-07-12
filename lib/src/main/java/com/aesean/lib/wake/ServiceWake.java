package com.aesean.lib.wake;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;

import java.util.List;

/**
 * ServiceWake
 *
 * @author xl
 * @since 2017-07-12
 */
class ServiceWake implements IWake {
    private static final String ACTION = "com.aesean.lib.WAKE_SERVICE";

    @Override
    public void wake(Context context) {
        List<ResolveInfo> resolveInfoList = context.getPackageManager().queryIntentServices(new Intent(ACTION), 0);
        for (ResolveInfo resolveInfo : resolveInfoList) {
            try {
                Intent serviceIntent = new Intent();
                serviceIntent.setAction(ACTION);
                serviceIntent.setPackage(resolveInfo.serviceInfo.packageName);
                context.startService(serviceIntent);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
