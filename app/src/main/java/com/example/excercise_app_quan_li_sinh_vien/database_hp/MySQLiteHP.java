package com.example.excercise_app_quan_li_sinh_vien.database_hp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.example.excercise_app_quan_li_sinh_vien.allClass.Bill;
import com.example.excercise_app_quan_li_sinh_vien.allClass.Books;
import com.example.excercise_app_quan_li_sinh_vien.dao.AccountDAO;
import com.example.excercise_app_quan_li_sinh_vien.dao.BookDAO;

public class MySQLiteHP extends SQLiteOpenHelper {
    public static final String DATA_NAME = "duanmau.db";
    public static final int VERSION = 1;



    public MySQLiteHP(@Nullable Context context) {
        super(context, DATA_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(AccountDAO.SQL_ACCOUNT);
        sqLiteDatabase.execSQL(BookDAO.SQL_BOOK);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

}
