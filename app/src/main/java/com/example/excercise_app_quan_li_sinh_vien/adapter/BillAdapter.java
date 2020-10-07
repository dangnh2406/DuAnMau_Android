package com.example.excercise_app_quan_li_sinh_vien.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.excercise_app_quan_li_sinh_vien.R;
import com.example.excercise_app_quan_li_sinh_vien.allClass.Bill;

import java.util.List;

public class BillAdapter extends BaseAdapter {
    List<Bill>billList ;
    Context context;

    public BillAdapter(List<Bill> billList, Context context) {
        this.billList = billList;
        this.context = context;
    }

    @Override
    public int getCount() {
        return billList.size();
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
        view = LayoutInflater.from(context).inflate(R.layout.row_bill,viewGroup,false);
        TextView idBill,dateBuy;
        idBill = view.findViewById(R.id.tvIdBill);
        dateBuy = view.findViewById(R.id.tvDateBuy);

        idBill.setText(billList.get(i).getIdBill());
        dateBuy.setText(billList.get(i).getDateBuy());
        return view;
    }
}
