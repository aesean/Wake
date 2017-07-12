package com.aesean.wake;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.aesean.lib.wake.WakeUtils;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void awakeByBroadcast(View view) {
        WakeUtils.wakeByBroadcast(this);
    }

    public void awakeByService(View view) {
        WakeUtils.wakeByService(this);
    }
}
