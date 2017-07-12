package com.aesean.lib.wake;

import android.content.Context;

/**
 * IWake
 *
 * @author xl
 * @since 2017-07-12
 */
public interface IWake {
    void wake(Context context);

    interface Callback {
        void wakeCallback(Context context);
    }
}
