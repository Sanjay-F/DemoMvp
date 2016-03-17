package com.example.administrator.demomvp.logic.view;

import java.util.List;

/**
 * Created by Sanjay on 2016/3/17 on project DemoMvp.
 */
public interface MainView<T> {

    void showProgress();

    void hideProgress();

    void setData(List<T> items);

}
