package com.aesean.lib.wake;

import android.app.Application;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

/**
 * WakeService
 *
 * @author xl
 * @since 2017-07-12
 */
public class WakeService extends Service {
    private static final String TAG = "WakeService";

    @Override
    public void onCreate() {
        Log.d(TAG, "onCreate: " + this.hashCode());
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d(TAG, "onStartCommand: " + this.hashCode());
        notifyCallback();
        return START_STICKY;
    }

    private void notifyCallback() {
        Application application = getApplication();
        if (application instanceof IWake.Callback) {
            ((IWake.Callback) application).wakeCallback(this);
        }
    }

    @Override
    public void onDestroy() {
        Log.d(TAG, "onDestroy: " + this.hashCode());
        super.onDestroy();
    }

    @Override
    public IBinder onBind(Intent intent) {
        // 这里根据你实际需要修改
        return null;
    }
}
