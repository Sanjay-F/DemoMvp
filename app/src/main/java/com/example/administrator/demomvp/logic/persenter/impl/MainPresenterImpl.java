package com.example.administrator.demomvp.logic.persenter.impl;

import android.support.annotation.NonNull;

import com.example.administrator.demomvp.logic.interactor.impl.MainInteractorImpl;
import com.example.administrator.demomvp.logic.interactor.listener.OnLoadDataListener;
import com.example.administrator.demomvp.logic.persenter.MainPresenter;
import com.example.administrator.demomvp.logic.view.MainView;
import com.example.administrator.demomvp.model.User;

import java.util.List;

/**
 * Created by Sanjay on 2016/3/17 on project DemoMvp.
 */
public class MainPresenterImpl extends BasePresenterImpl implements MainPresenter, OnLoadDataListener<User> {

    private MainView<User> mainView;
    private MainInteractorImpl mainInteractor;

    public MainPresenterImpl(@NonNull MainView<User> mainView) {
        this.mainView = mainView;
        this.mainInteractor = new MainInteractorImpl();
    }

    @Override
    public void loadData() {
        mainView.showProgress();
        mainInteractor.loadData(this);
    }

    @Override
    public void loadFinis(List<User> data) {
        mainView.hideProgress();
        mainView.setData(data);
    }
}
