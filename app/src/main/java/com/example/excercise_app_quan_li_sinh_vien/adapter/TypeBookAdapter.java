package com.example.excercise_app_quan_li_sinh_vien.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.excercise_app_quan_li_sinh_vien.R;
import com.example.excercise_app_quan_li_sinh_vien.allClass.TypeBook;

import java.util.List;

public class TypeBookAdapter extends BaseAdapter {
    List<TypeBook>list;
    Context context;

    public TypeBookAdapter(List<TypeBook> list, Context context) {
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
        view = LayoutInflater.from(context).inflate(R.layout.type_book_row,viewGroup,false);
        TextView id,typeName;

        id = view.findViewById(R.id.tv_IdTypeBook);
        typeName = view.findViewById(R.id.tv_tTypeName);

        id.setText(list.get(i).getIdTypeBook());
        typeName.setText(list.get(i).getTypeNameBook());

        return view;
    }
}
