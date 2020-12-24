package com.hyrc99.projectByL.activity.work.leave;

import android.content.DialogInterface;
import android.view.View;
import android.widget.TextView;

import com.hyrc99.projectByL.HYRCProject_Smaple.R;
import com.hyrc99.projectByL.baseAll.BaseActivity;
import com.xuexiang.xui.widget.alpha.XUIAlphaRelativeLayout;
import com.xuexiang.xui.widget.picker.widget.builder.TimePickerBuilder;
import com.xuexiang.xui.widget.picker.widget.configure.TimePickerType;
import com.xuexiang.xui.widget.picker.widget.listener.OnTimeSelectListener;

import java.util.Calendar;
import java.util.Date;

import androidx.appcompat.app.AlertDialog;
import butterknife.BindView;
import butterknife.OnClick;

public class LeaveActivity extends BaseActivity {
    @BindView(R.id.llaveType)
    XUIAlphaRelativeLayout llaveType;
    @BindView(R.id.llaveBgTime)
    XUIAlphaRelativeLayout llaveBgTime;
    @BindView(R.id.llevaEndTime)
    XUIAlphaRelativeLayout llevaEndTime;
    @BindView(R.id.tvavetyoe)
    TextView tvavetyoe;
    int leaveType = -1; //请假类型
    @BindView(R.id.tvbgTiem)
    TextView tvbgTiem;
    int leavebgTiem = -1; //请假开始时间
    @BindView(R.id.tvaveEndTime)
    TextView tvaveEndTime;
    int leaveEndTime = -1; //请假结束时间


    @Override
    protected int loadView() {
        return R.layout.activity_leave;
    }

    @Override
    protected void initData() {
        setTitle(true, "请假申请");
    }

    @Override
    protected void clearData() {

    }

    @OnClick({R.id.llaveType, R.id.llaveBgTime, R.id.llevaEndTime})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.llaveType:
                //请假类型
                String[] itmes = new String[]{"事假", "病假", "倒休", "年假", "婚假", "产假", "产前检查假", "陪产假", "丧假", "其他"};
                new AlertDialog.Builder(this).setTitle("请假类型").setItems(itmes, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        tvavetyoe.setText(itmes[i]);
                        tvavetyoe.setTextColor(getResources().getColor(R.color.fontColor));
                    }
                }).show();
                break;
            case R.id.llaveBgTime:
                //开始时间
                getTime("选择开始时间", tvbgTiem);
                break;
            case R.id.llevaEndTime:
                //结束时间
                getTime("选择结束时间", tvaveEndTime);
                break;
        }
    }

    public void getTime(String Title, TextView textView) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        new TimePickerBuilder(this, new OnTimeSelectListener() {
            @Override
            public void onTimeSelected(Date date, View v) {
                Calendar calendar1 = Calendar.getInstance();
                calendar1.setTime(date);
                textView.setText(calendar1.get(Calendar.YEAR) + "-" + (calendar1.get(Calendar.MONTH) + 1) + "-" + calendar1.get(Calendar.DAY_OF_MONTH) + " " + calendar1.get(Calendar.HOUR_OF_DAY) + ":" + (calendar1.get(Calendar.MINUTE)));
                textView.setTextColor(getResources().getColor(R.color.fontColor));
            }
        }).setType(TimePickerType.DATE).setTitleText(Title).isDialog(false).setOutSideCancelable(false).setDate(calendar).build().show();
    }
}
