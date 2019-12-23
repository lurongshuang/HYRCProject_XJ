package com.hyrc99.projectByL.activity.login;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.hyrc99.projectByL.HYRCProject_Smaple.R;
import com.hyrc99.projectByL.activity.main.MainActivity;
import com.hyrc99.projectByL.baseAll.BaseActivity;
import com.xuexiang.xui.widget.edittext.ClearEditText;

import butterknife.BindView;
import butterknife.OnClick;

public class LoginActivity extends BaseActivity {
    @BindView(R.id.et_login_idnum)
    ClearEditText etLoginIdnum;
    @BindView(R.id.et_login_pwd)
    EditText etLoginPwd;
    @BindView(R.id.btn_login)
    Button btnLogin;

    @Override
    protected int loadView() {
        return R.layout.activity_login;
    }

    @Override
    protected void initData() {
        setTitle(false, "", null, null, "注册", new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    @Override
    protected void clearData() {

    }

    @OnClick(R.id.btn_login)
    public void onViewClicked() {
        showToast("登录成功");
        openAcitivty(MainActivity.class);
        this.finish();
    }
}
