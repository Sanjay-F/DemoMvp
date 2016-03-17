package com.example.administrator.demomvp.logic.interactor;

import com.example.administrator.demomvp.logic.interactor.listener.OnLoginFinishListener;

/**
 * Created by Sanjay on 2016/3/17 on project DemoMvp.
 */
public interface LoginInteractor {


    public void login(String account,String password,OnLoginFinishListener onLoginFinishListener);
}
