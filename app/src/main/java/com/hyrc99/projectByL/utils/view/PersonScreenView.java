package com.hyrc99.projectByL.utils.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import com.hyrc99.projectByL.HYRCProject_Smaple.R;
import com.hyrc99.projectByL.utils.animation.HiddenAnimUtils;
import com.xuexiang.xui.widget.button.ButtonView;
import com.xuexiang.xui.widget.edittext.ValidatorEditText;
import com.xuexiang.xui.widget.spinner.materialspinner.MaterialSpinner;
import com.xuexiang.xui.widget.tabbar.TabControlView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/**
 * @description 作用: 人员查询筛选组件
 * @date: 2019/11/15
 * @author: 卢融霜
 */


public class PersonScreenView extends FrameLayout implements View.OnClickListener {
    private int selectType = 1;
    //回归高度
    private int viewHeight = 0;
    String[] items = {"综合查询", "分类查询"};
    String[] value = {"1", "2"};
    TabControlView tcv_select;
    LinearLayout llcompany;
    LinearLayout llpersonType;
    LinearLayout llpersonId;
    FontIconView ftvpackUp;
    LinearLayout llpackP;
    LinearLayout llpackup;
    ButtonView btsearch;
    ValidatorEditText vename;
    ValidatorEditText veId;
    ValidatorEditText vecom;
    MaterialSpinner mstext;
    onSearchButtonClickListener listener;

    public PersonScreenView(@NonNull Context context) {
        super(context);
        init();
    }

    public PersonScreenView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public PersonScreenView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    public PersonScreenView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }

    public void SetOnSearchListener(onSearchButtonClickListener listener1) {
        this.listener = listener1;
    }

    public interface onSearchButtonClickListener {
        void onSearch(int searchType, String name, String UID, String comName, String PerType);
    }

    private void init() {
        LayoutInflater.from(getContext()).inflate(R.layout.person_screen_layout, this);
        tcv_select = findViewById(R.id.tcv_select);
        llcompany = findViewById(R.id.llcompany);
        llpersonType = findViewById(R.id.llpersonType);
        llpersonId = findViewById(R.id.llpersonId);
        ftvpackUp = findViewById(R.id.ftvpackUp);
        llpackP = findViewById(R.id.llpackP);
        llpackup = findViewById(R.id.llpackup);
        btsearch = findViewById(R.id.btsearch);
        vename = findViewById(R.id.vename);
        veId = findViewById(R.id.veId);
        vecom = findViewById(R.id.vecom);
        mstext = findViewById(R.id.mstext);
        btsearch.setOnClickListener(this);
        llpackP.setOnClickListener(this);
        initData();
    }

    private void initData() {
        try {
            tcv_select.setItems(items, value);
        } catch (Exception e) {
            e.printStackTrace();
        }
        tcv_select.setOnTabSelectionChangedListener(new TabControlView.OnTabSelectionChangedListener() {
            @Override
            public void newSelection(String title, String value) {
                if (value.equals("1")) {
                    selectType = 1;
                    llpersonType.setVisibility(View.GONE);
                    llcompany.setVisibility(View.GONE);
                    llpersonId.setVisibility(View.VISIBLE);
                } else {
                    selectType = 2;
                    llpersonId.setVisibility(View.GONE);
                    llpersonType.setVisibility(View.VISIBLE);
                    llcompany.setVisibility(View.VISIBLE);
                }
            }
        });
    }

    public void autoShowSearch() {
        if (llpackup.getVisibility() == View.VISIBLE) {
            viewHeight = llpackup.getHeight();
        }
        HiddenAnimUtils.newInstance(getContext(), llpackup, ftvpackUp, viewHeight).toggle();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.llpackP:
                autoShowSearch();
                break;
            case R.id.btsearch:
                if (listener != null) {
                    listener.onSearch(selectType, vename.getText().toString(), veId.getText().toString(), vecom.getText().toString(), mstext.getText().toString());
                }
                break;
            default:
                break;
        }
    }
}
