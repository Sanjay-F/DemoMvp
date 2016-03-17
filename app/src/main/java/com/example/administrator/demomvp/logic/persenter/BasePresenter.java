package com.example.administrator.demomvp.logic.persenter;

/**
 * Created by Sanjay on 2016/3/17 on project DemoMvp.
 */
public interface BasePresenter {
    void onDestroy();

    void onCreate();

    void onResume();

    void onPause();

    void onStop();
}
