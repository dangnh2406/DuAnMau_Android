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
import com.example.excercise_app_quan_li_sinh_vien.adapter.BillAdapter;
import com.example.excercise_app_quan_li_sinh_vien.allClass.Bill;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class FrangmentBillManage extends Fragment {
    ListView listView;
    FloatingActionButton addTypeBook;
    List<Bill>list = new ArrayList<>();
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frangment_bill_manage,container,false);
        listView = view.findViewById(R.id.lv_tm);

        getActivity().setTitle("Quản lí hóa đơn");

        for(int i=0;i<20;i++){
            Bill bill = new Bill();
            bill.setIdBill(""+i);
            bill.setDateBuy("Ngày mua :"+i);
            list.add(bill);
        }


        BillAdapter billAdapter =new BillAdapter(list,getContext());
        listView.setAdapter(billAdapter);
        return view;
    }
}
