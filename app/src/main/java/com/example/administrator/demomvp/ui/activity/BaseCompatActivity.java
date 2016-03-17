package com.example.administrator.demomvp.ui.activity;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.example.administrator.demomvp.R;
import com.example.administrator.demomvp.logic.persenter.BasePresenter;
import com.example.administrator.demomvp.ui.view.CustomDialog;

public class BaseCompatActivity extends AppCompatActivity {

    protected Context mContext = this;
    protected BasePresenter mPresenter;
    private CustomDialog customDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_compat);
        customDialog = CustomDialog.createStandardDialog(mContext, R.layout.dialog_hint_loading);


    }

    protected void showShortMsg(String msg) {

        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    protected void showLoadingDialog() {

        customDialog.unCancelShow();
    }

    protected void dismissLoadingDialog() {
        customDialog.cancelDismiss();
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (mPresenter != null) {
            mPresenter.onResume();
        }
    }

    @Override
    protected void onPause() {
        super.onPause();

        if (mPresenter != null) {
            mPresenter.onPause();
        }
    }

    @Override
    protected void onStop() {
        super.onStop();

        if (mPresenter != null) {
            mPresenter.onStop();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mPresenter != null) {
            mPresenter.onDestroy();
        }
    }
}
