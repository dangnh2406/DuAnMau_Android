package com.example.excercise_app_quan_li_sinh_vien.fragment;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextClock;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;

import com.example.excercise_app_quan_li_sinh_vien.R;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;

public class FrangmentPay extends Fragment {
    TextView textView;
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frangment_pay,container,false);
        getActivity().setTitle("Thanh toán");
        textView = view.findViewById(R.id.tv_dateBuy);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss");
        String currentDateandTime = sdf.format(new Date());
        textView.setText(currentDateandTime);
        return view;

    }
}
