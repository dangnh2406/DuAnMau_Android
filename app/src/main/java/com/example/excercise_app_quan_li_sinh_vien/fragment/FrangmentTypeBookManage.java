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
import com.example.excercise_app_quan_li_sinh_vien.adapter.TypeBookAdapter;
import com.example.excercise_app_quan_li_sinh_vien.allClass.Books;
import com.example.excercise_app_quan_li_sinh_vien.allClass.TypeBook;

import java.util.ArrayList;
import java.util.List;

public class FrangmentTypeBookManage extends Fragment {
    ListView listView ;
    List<TypeBook> list = new ArrayList<>();
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frangment_type_book_manage,container,false);
        getActivity().setTitle("Quản lí thể loại sách");
        listView = view.findViewById(R.id.lv_tm);
        for(int i=1;i<20;i++){
            TypeBook typeBook = new TypeBook();
            typeBook.setIdTypeBook(""+i);
            typeBook.setTypeNameBook("Thể loại sách :"+i);
            list.add(typeBook);
        }
        TypeBookAdapter typeBookAdapter = new TypeBookAdapter(list,getContext());
        listView.setAdapter(typeBookAdapter);
        return view;

    }
}
