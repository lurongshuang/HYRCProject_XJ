package com.hyrc99.projectByL.activity.main.fragMent;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextClock;
import android.widget.TextView;

import com.hyrc99.projectByL.HYRCProject_Smaple.R;
import com.hyrc99.projectByL.activity.work.WorkRecordActivity;
import com.hyrc99.projectByL.baseAll.BaseActivity;
import com.hyrc99.projectByL.baseAll.LazyLoadingFragment;
import com.hyrc99.projectByL.utils.time.TimeUtils;
import com.hyrc99.projectByL.utils.vibrator.VibratorUtils;

import butterknife.BindView;
import butterknife.OnClick;

public class FragmentItem3 extends LazyLoadingFragment implements View.OnClickListener {
    @BindView(R.id.tvDateTime)
    TextView tvDateTime;
    @BindView(R.id.llWorkRec)
    LinearLayout llWorkRec;
    //上班按钮
    @BindView(R.id.llsignInMo)
    LinearLayout llsignInMo;
    @BindView(R.id.ivsignInMo)
    ImageView ivsignInMo;
    //上班打卡范围
    @BindView(R.id.tvRangeToWork)
    TextView tvRangeToWork;
    //上班打卡时间父级
    @BindView(R.id.lltoWorkTime)
    LinearLayout lltoWorkTime;
    //上班打卡时间
    @BindView(R.id.tvtoWorktime)
    TextView tvtoWorktime;
    //规定上班时间
    @BindView(R.id.tvToWorkSetTime)
    TextView tvToWorkSetTime;
    //本地时间
    @BindView(R.id.tcTime)
    TextClock tcTime;
    public FragmentItem3() {
    }
    public static FragmentItem3 newInstance() {
        Bundle args = new Bundle();
        FragmentItem3 fragment = new FragmentItem3();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    protected boolean onFirstVisibleToUser() {
        return true;
    }

    @Override
    protected void onVisibleToUser() {
//        ((BaseActivity) getActivity()).setTitle(false,getString(R.string.tab3));
        ((BaseActivity) getActivity()).setTitle(false, "国道拓宽水利配套建筑物工程");
    }

    @Override
    protected void onInvisibleToUser() {

    }

    @Override
    protected int getLayRes() {
        return R.layout.fragment_3_layout;
    }

    @Override
    protected void init(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        initData();
    }

    private void initData() {
        //获取时间   年月日 星期
        tvDateTime.setText(TimeUtils.StringData());
        llsignInMo.setOnClickListener(this);
    }


    @OnClick(R.id.llWorkRec)
    public void initWorkRec() {
        openActivity(WorkRecordActivity.class);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.llsignInMo:
                String state = (String) v.getTag();
                if ("1".equals(state)) {
                    ToWorkSignIn();
                } else {
                    showToast("已经完成上班打卡");
                }
                break;
        }
    }

    /**
     * 翻牌动画
     */
    Animation back_scale_animation = null;
    Animation front_scale_animation = null;

    /**
     * 签到成功 进行更新界面
     */
    public void cardTurnover() {
        if (back_scale_animation == null) {
            back_scale_animation = AnimationUtils.loadAnimation(getContext(), R.anim.back_scale);
        }
        back_scale_animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                //按钮翻转回正面
                ToWorkSuccess();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        //按钮开始翻转
        LinearInterpolator lir = new LinearInterpolator();
        back_scale_animation.setInterpolator(lir);
        llsignInMo.startAnimation(back_scale_animation);
    }

    /**
     * 更新视图
     */
    private void ToWorkSuccess() {
        //更新按钮
        llsignInMo.setBackground(getResources().getDrawable(R.drawable.sign_in_button_bg_yes));
        ivsignInMo.setImageDrawable(getResources().getDrawable(R.drawable.js_images_yes));
        llsignInMo.setTag("0");
        //开始动画
        if (front_scale_animation == null) {
            front_scale_animation = AnimationUtils.loadAnimation(getContext(), R.anim.front_scale);
        }
        LinearInterpolator lir = new LinearInterpolator();
        front_scale_animation.setInterpolator(lir);
        llsignInMo.startAnimation(front_scale_animation);
        //设置 打卡时间
        lltoWorkTime.setVisibility(View.VISIBLE);
        //暂时设置为 本地时间
        tvtoWorktime.setText(tcTime.getText());
        //隐藏打卡范围
        tvRangeToWork.setVisibility(View.GONE);
        VibratorUtils.getVibrator().setVibratorOnly(getContext(), 500);
    }

    /**
     * 上班打卡
     */
    private void ToWorkSignIn() {
        //走请求

        //签到成功之后
        cardTurnover();
    }
}
