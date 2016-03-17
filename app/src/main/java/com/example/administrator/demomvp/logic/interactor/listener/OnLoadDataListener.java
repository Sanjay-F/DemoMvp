package com.example.administrator.demomvp.logic.interactor.listener;

import java.util.List;

/**
 * Created by Sanjay on 2016/3/17 on project DemoMvp.
 */
public interface OnLoadDataListener<T> {

    void loadFinis(List<T> data);
}
