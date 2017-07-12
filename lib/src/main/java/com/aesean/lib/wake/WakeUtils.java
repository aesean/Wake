package com.aesean.lib.wake;

import android.content.Context;

/**
 * WakeUtils
 *
 * @author xl
 * @since 2017-07-12
 */
public class WakeUtils {
    private WakeUtils() {
    }

    /**
     * 唤醒其他App。
     * 如果Application实现了{@link IWake.Callback}接口，每次唤醒时候会收到唤醒回调。
     *
     * @param context 上下文
     */
    public static void wake(Context context) {
        wakeByBroadcast(context);
        wakeByService(context);
    }

    /**
     * 通过广播方式唤醒其他App，强制停止状态无法唤醒。
     * 如果Application实现了{@link IWake.Callback}接口，每次唤醒时候会收到唤醒回调。
     *
     * @param context 上下文
     */
    public static void wakeByBroadcast(Context context) {
        IWake awake = new BroadcastWake();
        awake.wake(context.getApplicationContext());
    }

    /**
     * 通过服务方式唤醒其他App，强制停止后可以唤醒。
     * 如果Application实现了{@link IWake.Callback}接口，每次唤醒时候会收到唤醒回调。
     *
     * @param context 上下文l
     */
    public static void wakeByService(Context context) {
        IWake wake = new ServiceWake();
        wake.wake(context.getApplicationContext());
    }
}
