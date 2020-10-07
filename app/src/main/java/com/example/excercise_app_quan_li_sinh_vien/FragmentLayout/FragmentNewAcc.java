package com.example.excercise_app_quan_li_sinh_vien.FragmentLayout;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.excercise_app_quan_li_sinh_vien.R;
import com.example.excercise_app_quan_li_sinh_vien.allClass.Account;
import com.example.excercise_app_quan_li_sinh_vien.dao.AccountDAO;
import com.example.excercise_app_quan_li_sinh_vien.database_hp.MySQLiteHP;
import com.google.android.material.textfield.TextInputLayout;

public class FragmentNewAcc extends Fragment {
    TextInputLayout username,password,name;
    Button newAcc;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.fragment_newacc,container,false);
        username = view.findViewById(R.id.til_user_create_acc);
        password = view.findViewById(R.id.til_pass_create_acc);
        name = view.findViewById(R.id.til_name);
        newAcc = view.findViewById(R.id.btn_create_newacc);

        newAcc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AccountDAO accountDAO = new AccountDAO(getContext());
                Account account = new Account();
                account.setUsername(username.getEditText().getText().toString());
                account.setPassword(password.getEditText().getText().toString());
                account.setName(name.getEditText().getText().toString());
                accountDAO.insertAccount(account);
            }
        });


        return view;
    }
}
