package com.example.excercise_app_quan_li_sinh_vien.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.excercise_app_quan_li_sinh_vien.R;
import com.example.excercise_app_quan_li_sinh_vien.adapter.AccountAdapter;
import com.example.excercise_app_quan_li_sinh_vien.adapter.BookManageAdapter;
import com.example.excercise_app_quan_li_sinh_vien.allClass.Account;
import com.example.excercise_app_quan_li_sinh_vien.allClass.Books;

import java.util.ArrayList;
import java.util.List;

public class FrangmentAccount extends Fragment {
    ListView listView ;
    List<Account>list=new ArrayList<>();
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frangment_account_manage,container,false);
        listView = view.findViewById(R.id.lv_acc);
        getActivity().setTitle("Quản lí tài khoản");

        for(int i=0;i<20;i++){
            Account account = new Account();
            account.setName("Tên người dùng :"+i);
            account.setPassword("Mật khẩu :"+i);
            account.setUsername("Tên tài khoản :"+i);
            list.add(account);
        }
        AccountAdapter accountAdapter = new AccountAdapter(list,getContext());
        listView.setAdapter(accountAdapter);
       

        return view;

    }
}
