package com.aesean.lib.wake;

import android.content.Context;
import android.content.Intent;

/**
 * BroadcastWake
 *
 * @author xl
 * @since 2017-07-12
 */
class BroadcastWake implements IWake {

    private static final String ACTION = "com.aesean.lib.WAKE_BROADCAST";

    @Override
    public void wake(Context context) {
        try {
            Intent intent = new Intent();
            intent.setAction(ACTION);
            context.sendBroadcast(intent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
