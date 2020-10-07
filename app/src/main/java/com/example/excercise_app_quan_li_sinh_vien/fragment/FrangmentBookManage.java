package com.example.excercise_app_quan_li_sinh_vien.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.excercise_app_quan_li_sinh_vien.R;
import com.example.excercise_app_quan_li_sinh_vien.adapter.BookManageAdapter;
import com.example.excercise_app_quan_li_sinh_vien.allClass.Books;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class FrangmentBookManage extends Fragment {
    ListView listView;
    FloatingActionButton button;
    List<Books> list = new ArrayList<>();
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frangment_book_manage,container,false);
        getActivity().setTitle("Quản lí sách");
        listView = view.findViewById(R.id.lv_bm);
        button = view.findViewById(R.id.test);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().setTitle("Them sach");
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragmentsss,new FrangmentAddbook()).addToBackStack(null).commit();
            }
        });
      
        
        return view;
    }
}
