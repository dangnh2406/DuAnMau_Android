package com.example.excercise_app_quan_li_sinh_vien.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.excercise_app_quan_li_sinh_vien.R;
import com.example.excercise_app_quan_li_sinh_vien.allClass.Books;

import java.util.List;

public class BookManageAdapter extends BaseAdapter {
    Context context;
    List<Books>list;

    public BookManageAdapter(Context context, List<Books> list) {
        this.context = context;
        this.list = list;
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
        view = LayoutInflater.from(context).inflate(R.layout.row,viewGroup,false);
        TextView id,bookName,typeName,inventoryNumber,quantytiSold,tvImportPrices,tvPrices,tvRevenue,tvDateAdded;
        id = view.findViewById(R.id.tv_idBook);
        bookName = view.findViewById(R.id.tvBookName);
        typeName = view.findViewById(R.id.tvTypeName);
        inventoryNumber = view.findViewById(R.id.tvInventoryNumber);
        quantytiSold = view.findViewById(R.id.tvQuantytiSold);
        tvImportPrices = view.findViewById(R.id.tvImportPrices);
        tvPrices = view.findViewById(R.id.tvPrices);
        tvRevenue = view.findViewById(R.id.tvRevenue);
        tvDateAdded = view.findViewById(R.id.tvDateAdded);

      


        return view;
    }
}
