package com.hyrc99.projectByL.activity.changePassWord;

import android.widget.Button;
import android.widget.EditText;

import com.hyrc99.projectByL.HYRCProject_Smaple.R;
import com.hyrc99.projectByL.baseAll.BaseActivity;

import butterknife.BindView;
import butterknife.OnClick;

public class ChangePwdActivity extends BaseActivity {
    @BindView(R.id.et_login_pwd)
    EditText etLoginPwd;
    @BindView(R.id.btn_login)
    Button btnLogin;

    @Override
    protected int loadView() {
        return R.layout.activity_change_pwd;
    }

    @Override
    protected void initData() {
        setTitle(true, "修改密码");
        showKeyboard(etLoginPwd);
    }

    @Override
    protected void clearData() {

    }

    @OnClick(R.id.btn_login)
    public void onViewClicked() {
        openAcitivty(SetNewPwdActivity.class);
    }
}
