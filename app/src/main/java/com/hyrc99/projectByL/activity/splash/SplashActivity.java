package com.hyrc99.projectByL.activity.splash;

import android.content.Intent;

import com.hyrc99.projectByL.activity.splash.countdown.CountDownActivity;
import com.xuexiang.xui.widget.activity.BaseSplashActivity;

public class SplashActivity extends BaseSplashActivity {
//    @Override
//    protected int getSplashImgResId() {
//        return R.drawable.imag_splash;
//    }

    @Override
    protected void onCreateActivity() {
        startSplash(    false);
    }

    @Override
    protected void onSplashFinished() {
        Intent intent = new Intent(this, CountDownActivity.class);
        startActivity(intent);
        this.finish();
    }

    @Override
    protected long getSplashDurationMillis() {
        return 200L;
    }
}
