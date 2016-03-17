package com.example.administrator.demomvp.ui.adapter;

import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sanjay on 2016/3/17 on project DemoMvp.
 */

public abstract class BaseAdapter<T, A extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<A> {

    private List<T> mList = new ArrayList<>();

    @Override
    public A onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(getLayoutId(), parent, false);
        return getViewHolder(view);
    }

    @Override
    public void onBindViewHolder(A holder, int position) {
        bindViewWithData(holder, mList.get(position));
    }

    @Override
    public int getItemCount() {
        return mList == null ? 0 : mList.size();
    }

    public void appentToList(@NonNull List<T> list) {

        if (mList == null) {
            mList = list;
        } else {
            mList.addAll(list);
        }
        notifyDataSetChanged();
    }

    public void appentToList(@NonNull T t) {

        if (mList == null) {
            mList = new ArrayList<T>();
        }
        mList.add(t);
        notifyDataSetChanged();
    }

    public void changeList(@NonNull List<T> list) {
        mList = list;
        notifyDataSetChanged();
    }

    /**
     * 清空列表
     */
    public void clearList() {
        if (mList != null) {
            mList.clear();
        }
        notifyDataSetChanged();
    }

    @LayoutRes
    protected abstract int getLayoutId();

    protected abstract A getViewHolder(View view);

    protected abstract void bindViewWithData(A holder, T data);
}
