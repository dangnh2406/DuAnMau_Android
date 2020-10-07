package com.example.excercise_app_quan_li_sinh_vien.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;


import com.example.excercise_app_quan_li_sinh_vien.R;
import com.example.excercise_app_quan_li_sinh_vien.fragment.FrangmentAccount;
import com.example.excercise_app_quan_li_sinh_vien.fragment.FrangmentBillManage;
import com.example.excercise_app_quan_li_sinh_vien.fragment.FrangmentBookManage;
import com.example.excercise_app_quan_li_sinh_vien.fragment.FrangmentInfo;
import com.example.excercise_app_quan_li_sinh_vien.fragment.FrangmentPay;
import com.example.excercise_app_quan_li_sinh_vien.fragment.FrangmentStatistical;
import com.example.excercise_app_quan_li_sinh_vien.fragment.FrangmentTypeBookManage;
import com.google.android.material.navigation.NavigationView;

public class HomeScreenActivity extends AppCompatActivity {
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle toggle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        drawerLayout = findViewById(R.id.drawer);
        toggle = new ActionBarDrawerToggle(this,drawerLayout,R.string.open,R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportFragmentManager().beginTransaction().add(R.id.fragmentsss,new FrangmentStatistical()).addToBackStack(null).commit();

        NavigationView navigationView = findViewById(R.id.navigationView);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                item.setCheckable(true);
                switch (item.getItemId()){
                    case R.id.itemStatistical:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentsss,new FrangmentStatistical()).addToBackStack(null).commit();
                        break;
                    case R.id.itemBookManage:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentsss,new FrangmentBookManage()).addToBackStack(null).commit();
                        break;
                    case R.id.itemPay:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentsss,new FrangmentPay()).addToBackStack(null).commit();
                        break;
                    case R.id.itemTypeBook:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentsss,new FrangmentTypeBookManage()).addToBackStack(null).commit();
                        break;
                    case R.id.itemBillManage:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentsss,new FrangmentBillManage()).addToBackStack(null).commit();
                        break;
                    case R.id.itemAccount:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentsss,new FrangmentAccount()).addToBackStack(null).commit();
                        break;
                    case R.id.itemInfo:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentsss,new FrangmentInfo()).addToBackStack(null).commit();
                        break;
                    case R.id.itemExit:
                        System.exit(0);
                        break;
                }
                return true;
            }
        });

    }



    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(toggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
