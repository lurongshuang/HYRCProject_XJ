package com.hyrc99.projectByL.activity.userCenter.informationModification;

import butterknife.BindView;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;

import com.hyrc99.projectByL.HYRCProject_Smaple.R;
import com.hyrc99.projectByL.baseAll.BaseActivity;

public class ChangeUserActivity extends BaseActivity {
    @BindView(R.id.ettext)
    EditText ettext;
    @BindView(R.id.llsex)
    LinearLayout llsex;
    @BindView(R.id.lluser)
    LinearLayout lluser;

    @Override
    protected int loadView() {
        return R.layout.activity_change_user;
    }

    @Override
    protected void initData() {
        Bundle bundle = getIntent().getExtras();
        int key = bundle.getInt("key");
        setTitle(true, bundle.getString("name"), null, null, "保存", new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadBaseDialog.show();
                //修改
                switch (key) {
                    case 1:
                        //昵称
                        break;
                }
                loadBaseDialog.dismiss();
                showToast("保存成功");
                ChangeUserActivity.this.finish();
            }
        });

        switch (key) {
            case 1:
                //昵称
                ettext.setText("昵称");
                break;
            case 2:
                //姓名
                ettext.setText("姓名");
                break;
            case 3:
                //性别
                lluser.setVisibility(View.GONE);
                llsex.setVisibility(View.VISIBLE);
                break;
            case 4:
                //联系方式
                ettext.setText("联系方式");
                break;
            case 5:
                //公司
                ettext.setText("公司");
                break;
        }
        if (key != 3) {
            showKeyboard(ettext);
        }
    }

    @Override
    protected void clearData() {

    }
}
