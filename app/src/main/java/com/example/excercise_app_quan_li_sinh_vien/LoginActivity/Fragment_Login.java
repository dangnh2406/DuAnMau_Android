package com.example.excercise_app_quan_li_sinh_vien.LoginActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.excercise_app_quan_li_sinh_vien.activity.HomeScreenActivity;
import com.example.excercise_app_quan_li_sinh_vien.FragmentLayout.FragmentForgot;
import com.example.excercise_app_quan_li_sinh_vien.FragmentLayout.FragmentNewAcc;
import com.example.excercise_app_quan_li_sinh_vien.R;
import com.google.android.material.textfield.TextInputLayout;

public class Fragment_Login extends Fragment {
    Button button;
    TextInputLayout user,pass;
    TextView forgot,newacc;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_login,container,false);
        button = view.findViewById(R.id.btn_login_main);
        user = view.findViewById(R.id.til_user);
        pass = view.findViewById(R.id.til_pass);
        forgot = view.findViewById(R.id.txt_forgot);
        newacc = view.findViewById(R.id.txt_newacc);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(user.getEditText().getText().toString().isEmpty()){
                    user.setError("Please enter your username");
                    return;
                }else{
                    user.setError("");
                }

                if (pass.getEditText().getText().toString().isEmpty()){

                    pass.setError("Please enter your password");
                    return;
                }else{
                    pass.setError("");

                }
                startActivity(new Intent(getActivity(), HomeScreenActivity.class));
            }
        });

        forgot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.framelayout_mainlogin,new FragmentForgot()).addToBackStack(null).commit();
            }
        });
        newacc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.framelayout_mainlogin,new FragmentNewAcc()).addToBackStack(null).commit();
            }
        });

        return view;

    }

}
