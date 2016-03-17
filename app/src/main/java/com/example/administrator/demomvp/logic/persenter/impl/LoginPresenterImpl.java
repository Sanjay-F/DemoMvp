package com.example.administrator.demomvp.logic.persenter.impl;

import android.support.annotation.NonNull;

import com.example.administrator.demomvp.logic.interactor.impl.LoginInteractorImpl;
import com.example.administrator.demomvp.logic.interactor.listener.OnLoginFinishListener;
import com.example.administrator.demomvp.logic.persenter.LoginPresenter;
import com.example.administrator.demomvp.logic.view.LoginView;

/**
 * Created by Sanjay on 2016/3/17 on project DemoMvp.
 */
public class LoginPresenterImpl extends BasePresenterImpl implements LoginPresenter, OnLoginFinishListener {
    private final LoginInteractorImpl loginInteractor;
    private LoginView loginView;

    public LoginPresenterImpl(@NonNull LoginView loginView) {
        this.loginView = loginView;
        this.loginInteractor = new LoginInteractorImpl();
    }

    @Override
    public void login(String account, String password) {
        loginView.showProgress();
        loginInteractor.login(account, password, this);
    }

    @Override
    public void onLoginResult(boolean result, String msg) {
        loginView.dismissProgress();
        loginView.loginResult(result, msg);
    }
}
