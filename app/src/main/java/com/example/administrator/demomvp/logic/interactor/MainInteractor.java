package com.example.administrator.demomvp.logic.interactor;

import com.example.administrator.demomvp.logic.interactor.listener.OnLoadDataListener;

/**
 * Created by Sanjay on 2016/3/17 on project DemoMvp.
 */
public interface MainInteractor<T> {


    void loadData(OnLoadDataListener<T> loadDataListener);
}
