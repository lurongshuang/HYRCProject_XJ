package com.hyrc99.projectByL.activity.userCenter.aboutUs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.hyrc99.projectByL.HYRCProject_Smaple.R;
import com.hyrc99.projectByL.baseAll.BaseActivity;

public class AboutUsActivity extends BaseActivity {


    @Override
    protected int loadView() {
        return R.layout.activity_about_us;
    }

    @Override
    protected void initData() {
        setTitle(true, "关于我们");
    }

    @Override
    protected void clearData() {

    }
}
