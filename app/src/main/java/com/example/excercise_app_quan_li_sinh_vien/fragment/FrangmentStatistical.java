package com.example.excercise_app_quan_li_sinh_vien.fragment;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.excercise_app_quan_li_sinh_vien.R;
import com.example.excercise_app_quan_li_sinh_vien.adapter.BookManageAdapter;
import com.example.excercise_app_quan_li_sinh_vien.allClass.Books;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class FrangmentStatistical extends Fragment {
    @Nullable
    EditText dateStart,dateEnd;
    Button btn_filter;
    TextView tv_dateStart,tv_dateEnd;
    ListView listView;
    List<Books>list ;
    @Override

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_statistical,container,false);
        getActivity().setTitle("Thống kê");
         dateEnd = view.findViewById(R.id.ed_sDateEnd);
         dateStart = view.findViewById(R.id.ed_sDateStart);
         btn_filter = view.findViewById(R.id.btn_sFilter);
         tv_dateEnd = view.findViewById(R.id.tv_sDateEnd);
         tv_dateStart = view.findViewById(R.id.tv_sDateStart);
         listView = view.findViewById(R.id.lv_s);
        list = new ArrayList<>();
        
         dateStart.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                final Calendar hour = Calendar.getInstance();
                 int day = Calendar.HOUR_OF_DAY;
                 int month = Calendar.DAY_OF_MONTH;
                 int year = Calendar.YEAR;

               DatePickerDialog datePickerDialog = new DatePickerDialog(getActivity(), new DatePickerDialog.OnDateSetListener() {
                   @Override
                   public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {

                   }
               },day,month,year);
               datePickerDialog.show();
             }
         });
        return view;
    }
}
