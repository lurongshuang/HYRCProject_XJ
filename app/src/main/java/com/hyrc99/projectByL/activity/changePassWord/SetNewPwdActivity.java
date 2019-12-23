package com.hyrc99.projectByL.activity.changePassWord;

import android.widget.EditText;

import com.hyrc99.projectByL.HYRCProject_Smaple.R;
import com.hyrc99.projectByL.activity.login.LoginActivity;
import com.hyrc99.projectByL.baseAll.BaseActivity;
import com.xuexiang.xui.widget.alpha.XUIAlphaButton;

import butterknife.BindView;
import butterknife.OnClick;

public class SetNewPwdActivity extends BaseActivity {

    @BindView(R.id.et_login_pwd)
    EditText et_login_pwd;
    @BindView(R.id.et1_login_pwd)
    EditText et1LoginPwd;
    @BindView(R.id.btn_login)
    XUIAlphaButton btnLogin;

    @Override
    protected int loadView() {
        return R.layout.activity_set_new_pwd;
    }

    @Override
    protected void initData() {
        setTitle(true, "设置密码");
        showKeyboard(et_login_pwd);
    }

    @Override
    protected void clearData() {

    }

    @OnClick(R.id.btn_login)
    public void onViewClicked() {
        showToast("设置成功");
        exitApp();
        openAcitivty(LoginActivity.class);
    }
}
