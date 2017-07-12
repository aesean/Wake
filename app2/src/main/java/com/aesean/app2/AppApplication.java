package com.aesean.app2;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.aesean.lib.wake.IWake;
import com.aesean.lib.wake.WakeUtils;

/**
 * AppApplication
 *
 * @author xl
 * @since 2017-07-12
 */
public class AppApplication extends Application implements IWake.Callback {
    private static final String TAG = "AppApplication";

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "onCreate: " + this.hashCode());
        WakeUtils.wake(this);
    }

    @Override
    public void wakeCallback(Context context) {
        String msg = "收到唤醒消息：" + getPackageName();
        Log.d(TAG, msg);
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
    }
}
