package com.example.administrator.demomvp.logic.view;

/**
 * Created by Sanjay on 2016/3/17 on project DemoMvp.
 */
public interface LoginView {

    void loginResult(boolean result, String msg);

    void showProgress();

    void dismissProgress();

}
