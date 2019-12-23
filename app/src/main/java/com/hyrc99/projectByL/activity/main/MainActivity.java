package com.hyrc99.projectByL.activity.main;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.hyrc99.projectByL.HYRCProject_Smaple.R;
import com.hyrc99.projectByL.activity.main.fragMent.FragmentItem1;
import com.hyrc99.projectByL.activity.main.fragMent.FragmentItem2;
import com.hyrc99.projectByL.activity.main.fragMent.FragmentItem3;
import com.hyrc99.projectByL.activity.main.fragMent.FragmentItem4;
import com.hyrc99.projectByL.activity.main.fragMent.FragmentItem5;
import com.hyrc99.projectByL.baseAll.BaseActivity;
import com.hyrc99.projectByL.baseAll.MyFragmentPagerAdapter;
import com.hyrc99.projectByL.utils.view.NoScrollViewPager;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.IdRes;
import androidx.fragment.app.Fragment;
import butterknife.BindView;


public class MainActivity extends BaseActivity {
    @BindView(R.id.main_viewPager)
    NoScrollViewPager viewPager;
    @BindView(R.id.mRadioGroupId)
    RadioGroup radioGroup;
    @BindView(R.id.radio0)
    RadioButton radioButton0;
    @BindView(R.id.radio1)
    RadioButton radioButton1;
    @BindView(R.id.radio2)
    RadioButton radioButton2;
    @BindView(R.id.radio3)
    RadioButton radioButton3;
    @BindView(R.id.radio4)
    RadioButton radioButton4;


    @Override
    protected int loadView() {
        return R.layout.activity_main;
    }

    @Override
    protected void initData() {
        initPage();
        initButton();
    }

    @Override
    protected void clearData() {

    }


    /**
     * 初始化page
     */
    private void initPage() {
        FragmentItem1 fragment_Item_1 = FragmentItem1.newInstance();
        FragmentItem2 fragment_Item_2 = FragmentItem2.newInstance();
        FragmentItem3 fragment_Item_3 = FragmentItem3.newInstance();
        FragmentItem4 fragment_Item_4 = FragmentItem4.newInstance();
        FragmentItem5 fragment_Item_5 = FragmentItem5.newInstance();
        List<Fragment> allFragment = new ArrayList<>();
        allFragment.add(fragment_Item_1);
        allFragment.add(fragment_Item_2);
        allFragment.add(fragment_Item_3);
        allFragment.add(fragment_Item_4);
        allFragment.add(fragment_Item_5);
        viewPager.setAdapter(new MyFragmentPagerAdapter(getSupportFragmentManager(), allFragment));
        viewPager.setCurrentItem(0);
    }
    /**
     * 初始化按钮
     */
    private void initButton() {
        RadioButton rab[] = {radioButton0, radioButton1, radioButton4, radioButton3};
        for (RadioButton radioButton : rab) {
            Drawable drs[] = radioButton.getCompoundDrawables();
            int w = (int) (drs[1].getMinimumWidth() * 2 / 4.2);
            int h = (int) (drs[1].getMinimumHeight() * 2 / 4.2);
            Rect r = new Rect(0, 0, w, h);
            drs[1].setBounds(r);
            radioButton.setCompoundDrawables(null, drs[1], null, null);
        }
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {

                switch (checkedId) {
                    case R.id.radio0:
                        viewPager.setCurrentItem(0, false);
                        break;
                    case R.id.radio1:
                        viewPager.setCurrentItem(1, false);
                        break;
                    case R.id.radio2:
                        viewPager.setCurrentItem(2, false);
                        break;
                    case R.id.radio3:
                        viewPager.setCurrentItem(3, false);
                        break;
                    case R.id.radio4:
                        viewPager.setCurrentItem(4, false);
                        break;
                }
            }
        });
    }
}
