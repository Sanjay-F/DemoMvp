package com.example.administrator.demomvp.logic.interactor.impl;

import android.os.Handler;

import com.example.administrator.demomvp.logic.interactor.MainInteractor;
import com.example.administrator.demomvp.logic.interactor.listener.OnLoadDataListener;
import com.example.administrator.demomvp.model.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sanjay on 2016/3/17 on project DemoMvp.
 */
public class MainInteractorImpl implements MainInteractor<User> {


    public MainInteractorImpl() {
    }

    @Override
    public void loadData(final OnLoadDataListener<User> loadDataListener) {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                List<User> userList = new ArrayList<User>(20);
                for (int i = 0; i < 20; i++) {
                    User user = new User();
                    user.setName("a" + i);
                    user.setGender(User.GENDER_FEMALE);
                    userList.add(user);
                }
                loadDataListener.loadFinis(userList);
            }
        }, 2000);

    }
}
