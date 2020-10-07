package com.example.excercise_app_quan_li_sinh_vien.LoginActivity;

import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.excercise_app_quan_li_sinh_vien.FragmentLayout.FragmentForgot;
import com.example.excercise_app_quan_li_sinh_vien.R;
import com.google.android.material.textfield.TextInputLayout;

import static com.example.excercise_app_quan_li_sinh_vien.R.color.colorAccent;

public class MainLogin extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_login);
        getSupportFragmentManager().beginTransaction().add(R.id.framelayout_mainlogin,new Fragment_Login()).addToBackStack(null).commit();


}

}