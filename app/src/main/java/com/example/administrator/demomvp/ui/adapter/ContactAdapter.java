package com.example.administrator.demomvp.ui.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.administrator.demomvp.R;
import com.example.administrator.demomvp.model.User;

/**
 * Created by Sanjay on 2016/3/17 on project DemoMvp.
 */
public class ContactAdapter extends BaseAdapter<User, ContactAdapter.ContactViewHolder> {

    @Override
    protected int getLayoutId() {
        return R.layout.listitem_contact;
    }

    @Override
    protected ContactViewHolder getViewHolder(View view) {
        return new ContactViewHolder(view);
    }


    @Override
    protected void bindViewWithData(ContactViewHolder holder, User data) {
        holder.bindData(data);
    }

    protected class ContactViewHolder extends RecyclerView.ViewHolder {


        private TextView tvName;
        private TextView tvGender;

        public ContactViewHolder(View itemView) {
            super(itemView);
            tvName = (TextView) itemView.findViewById(R.id.li_contact_name_tv);
            tvGender = (TextView) itemView.findViewById(R.id.li_contact_gender_tv);
        }

        void bindData(User data) {
            tvName.setText(data.getName());
            tvGender.setText(String.valueOf(data.getGender()));
        }
    }
}
