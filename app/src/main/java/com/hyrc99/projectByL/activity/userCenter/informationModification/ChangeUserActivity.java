package com.hyrc99.projectByL.activity.userCenter.informationModification;

import butterknife.BindView;
import butterknife.OnCheckedChanged;
import butterknife.OnClick;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;

import com.hyrc99.projectByL.HYRCProject_Smaple.R;
import com.hyrc99.projectByL.baseAll.BaseActivity;

import org.greenrobot.eventbus.EventBus;

public class ChangeUserActivity extends BaseActivity {
    @BindView(R.id.ettext)
    EditText ettext;
    @BindView(R.id.llsex)
    LinearLayout llsex;
    @BindView(R.id.lluser)
    LinearLayout lluser;
    @BindView(R.id.rbgrill)
    RadioButton rbgrill;
    @BindView(R.id.rbBoy)
    RadioButton rbBoy;
    boolean isSex = true;//男 else 女

    @Override
    protected int loadView() {
        return R.layout.activity_change_user;
    }


    private void isBoy(boolean state) {
        if (state) {
            rbgrill.setChecked(false);
            rbBoy.setChecked(true);
            isSex = true;
        } else {
            rbBoy.setChecked(false);
            rbgrill.setChecked(true);
            isSex = false;
        }
    }

    @Override
    protected void initData() {
        Bundle bundle = getIntent().getExtras();
        int key = bundle.getInt("key");
        setTitle(true, bundle.getString("name"), null, null, "保存", new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadBaseDialog.show();
                if (key == 3) {
                    EventBus.getDefault().post(new InformationMActivity.UserMessage(key, isSex ? "男" : "女"));

                } else {
                    EventBus.getDefault().post(new InformationMActivity.UserMessage(key, ettext.getText().toString()));
                }
                loadBaseDialog.dismiss();
                showToast("保存成功");
                ChangeUserActivity.this.finish();
            }
        });
        if (key == 3) {
            lluser.setVisibility(View.GONE);
            llsex.setVisibility(View.VISIBLE);
            if (bundle.getString("name").equals("男")) {
                isBoy(true);
            } else {
                isBoy(false);
            }
        } else {
            ettext.setText(bundle.getString("name"));
            showKeyboard(ettext);
        }
        rbgrill.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    isBoy(false);
                } else {
                    isBoy(true);
                }
            }
        });
        rbBoy.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    isBoy(true);
                } else {
                    isBoy(false);
                }
            }
        });
    }

    @Override
    protected void clearData() {

    }
}
