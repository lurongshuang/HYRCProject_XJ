package com.hyrc99.projectByL.activity.userCenter.help;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.hyrc99.projectByL.HYRCProject_Smaple.R;
import com.hyrc99.projectByL.baseAll.BaseActivity;

public class HelpActivity extends BaseActivity {


    @Override
    protected int loadView() {
        return R.layout.activity_help;
    }

    @Override
    protected void initData() {
        setTitle(true, "帮助中心");
    }

    @Override
    protected void clearData() {

    }
}
