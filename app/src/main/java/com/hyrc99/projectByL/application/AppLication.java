package com.hyrc99.projectByL.application;

import android.app.Application;

import com.xuexiang.xui.XUI;

public class AppLication extends Application {
    public interface searchType {
        String searchType = "searchType";
        //不良行为
        int BadBehavior = 0;
        //项目查询
        int progectName = 1;
        //评价查询
        int evaluateSearch = 2;
        //单位查询
        int companySearch = 3;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        XUI.init(this); //初始化UI框架
        XUI.debug(true);  //开启UI框架调试日志
    }
}
