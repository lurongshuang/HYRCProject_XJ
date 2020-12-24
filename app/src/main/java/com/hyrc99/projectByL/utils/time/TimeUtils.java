package com.hyrc99.projectByL.utils.time;

import java.util.Calendar;
import java.util.TimeZone;

/**
 * @description 作用:关于时间的工具类
 * @date: 2019/11/20
 * @author: 卢融霜
 */
public class TimeUtils {
    private static TimeUtils timeUtils;

    public static TimeUtils getInstance() {
        if (null == timeUtils) {
            timeUtils = new TimeUtils();
        }
        return timeUtils;
    }

    /**
     * @return //XXXX年XX月XX日 星期X
     */
    private String StringData() {
        final Calendar c = Calendar.getInstance();
        c.setTimeZone(TimeZone.getTimeZone("GMT+8:00"));
        String mYear;
        String mMonth;
        String mDay;
        String mWay;
        //获取当前年份
        mYear = String.valueOf(c.get(Calendar.YEAR));
        // 获取当前月份
        mMonth = String.valueOf(c.get(Calendar.MONTH) + 1);
        // 获取当前月份的日期号码
        mDay = String.valueOf(c.get(Calendar.DAY_OF_MONTH));
        mWay = String.valueOf(c.get(Calendar.DAY_OF_WEEK));

        return mYear + "年" + mMonth + "月" + mDay + "日" + "星期" + getWay(mWay);
    }

    private String getWay(String mWay) {
        String[] ways = {"日", "一", "二", "三", "四", "五", "六"};
        return ways[Integer.parseInt(mWay) - 1];
    }
}
