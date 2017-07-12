package com.aesean.lib.wake;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * WakeBroadcastReceiver
 *
 * @author xl
 * @since 2017-07-12
 */
public class WakeBroadcastReceiver extends BroadcastReceiver {
    private static final String TAG = "WakeBroadcastReceiver";

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d(TAG, "onReceive: " + this.hashCode());
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof IWake.Callback) {
            ((IWake.Callback) applicationContext).wakeCallback(context);
        }
    }
}
