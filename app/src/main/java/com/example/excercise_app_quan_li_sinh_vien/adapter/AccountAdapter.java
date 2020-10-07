package com.example.excercise_app_quan_li_sinh_vien.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.excercise_app_quan_li_sinh_vien.R;
import com.example.excercise_app_quan_li_sinh_vien.allClass.Account;

import java.util.List;

public class AccountAdapter extends BaseAdapter {
    List<Account> list;
    Context context;

    public AccountAdapter(List<Account> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = LayoutInflater.from(context).inflate(R.layout.row_account,viewGroup,false);

        TextView name,username,password;

        name = view.findViewById(R.id.tv_aName);
        password = view.findViewById(R.id.tv_aPassword);
        username = view.findViewById(R.id.tv_aUsername);

        name.setText(list.get(i).getName());
        password.setText(list.get(i).getPassword());
        username.setText(list.get(i).getUsername());

        return view;
    }
}
