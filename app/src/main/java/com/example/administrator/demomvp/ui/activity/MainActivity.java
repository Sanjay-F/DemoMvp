package com.example.administrator.demomvp.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.administrator.demomvp.R;
import com.example.administrator.demomvp.logic.persenter.MainPresenter;
import com.example.administrator.demomvp.logic.persenter.impl.MainPresenterImpl;
import com.example.administrator.demomvp.logic.view.MainView;
import com.example.administrator.demomvp.model.User;
import com.example.administrator.demomvp.ui.adapter.ContactAdapter;

import java.util.List;

public class MainActivity extends BaseCompatActivity implements MainView<User> {


    ContactAdapter contactAdapter = new ContactAdapter();

    public static Intent makeIntent(Context mContext) {
        return new Intent(mContext, MainActivity.class);
    }


    private RecyclerView recyclerView;

    private void assignViews() {
        recyclerView = (RecyclerView) findViewById(R.id.am_data_rv);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MainPresenter mainPresenter = new MainPresenterImpl(this);

        assignViews();

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(contactAdapter);
        mainPresenter.loadData();
    }

    @Override
    public void showProgress() {
        showLoadingDialog();
    }

    @Override
    public void hideProgress() {
        dismissLoadingDialog();
    }

    @Override
    public void setData(List<User> items) {
        contactAdapter.changeList(items);
    }

}
