package com.example.administrator.demomvp.ui.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.administrator.demomvp.R;
import com.example.administrator.demomvp.logic.persenter.LoginPresenter;
import com.example.administrator.demomvp.logic.persenter.impl.LoginPresenterImpl;
import com.example.administrator.demomvp.logic.view.LoginView;

public class LoginActivity extends BaseCompatActivity implements LoginView {

    private EditText amAccountEt;
    private EditText amPasswordEt;

    private LoginPresenter mLoginPresenter;

    private void assignViews() {
        amAccountEt = (EditText) findViewById(R.id.am_account_et);
        amPasswordEt = (EditText) findViewById(R.id.am_password_et);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        assignViews();
        mLoginPresenter = new LoginPresenterImpl(this);
    }

    public void onLoginClick(View view) {
        mLoginPresenter.login(amAccountEt.getText().toString().trim(), amPasswordEt.getText().toString().trim());
    }

    @Override
    public void loginResult(boolean isSuccess, String msg) {
        if (isSuccess) {
            startActivity(MainActivity.makeIntent(this));
        } else {
            showShortMsg(msg);
        }
    }

    @Override
    public void showProgress() {
        showLoadingDialog();
    }

    @Override
    public void dismissProgress() {
        dismissLoadingDialog();
    }

}
