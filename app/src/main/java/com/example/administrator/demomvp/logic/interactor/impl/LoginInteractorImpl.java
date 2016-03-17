package com.example.administrator.demomvp.logic.interactor.impl;

import android.os.Handler;
import android.text.TextUtils;

import com.example.administrator.demomvp.logic.interactor.LoginInteractor;
import com.example.administrator.demomvp.logic.interactor.listener.OnLoginFinishListener;

/**
 * Created by Sanjay on 2016/3/17 on project DemoMvp.
 */
public class LoginInteractorImpl implements LoginInteractor {


    @Override
    public void login(final String account, final String password, final OnLoginFinishListener onLoginFinishListener) {


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (TextUtils.isEmpty(account) || TextUtils.isEmpty(password)) {
                    onLoginFinishListener.onLoginResult(false, "账号或名字错误");
                } else {
                    onLoginFinishListener.onLoginResult(true, null);
                }
            }
        }, 2000);
    }


}
