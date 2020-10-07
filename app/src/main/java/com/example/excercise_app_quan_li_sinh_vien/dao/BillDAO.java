package com.example.excercise_app_quan_li_sinh_vien.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.excercise_app_quan_li_sinh_vien.allClass.Bill;
import com.example.excercise_app_quan_li_sinh_vien.database_hp.MySQLiteHP;

import java.util.ArrayList;
import java.util.List;

public class BillDAO {
    MySQLiteHP mySQLiteHP;
    SQLiteDatabase sqLiteDatabase;

    public BillDAO(Context context) {
        mySQLiteHP = new MySQLiteHP(context);
        sqLiteDatabase = mySQLiteHP.getWritableDatabase();
    }


    public static final String TABLE_NAME = "bill";
    public static final String COL_ID_BILL = "id_bill";
    public static final String COL_DATE_BUY = "date_buy";

    // insert bill
    public boolean insertBill(Bill bill) {
        ContentValues values = new ContentValues();
        values.put(COL_DATE_BUY, bill.getDateBuy());
        values.put(COL_ID_BILL, bill.getIdBill());

        long result = sqLiteDatabase.insert(TABLE_NAME, null, values);
        if (result > 0) {
            return true;
        } else {
            return false;
        }
    }

    //getAll bill

    public List<Bill> getAllBill() {
        List<Bill> billList = new ArrayList<>();
        String SQL_BILL = "select * from " + TABLE_NAME;
        Cursor cursor = sqLiteDatabase.rawQuery(SQL_BILL, null);
        if (cursor.getCount() > 0) {
            cursor.moveToFirst();
            while (!cursor.isAfterLast()) {
                Bill bill = new Bill();
                bill.setDateBuy(cursor.getString(cursor.getColumnIndex(COL_DATE_BUY)));
                bill.setIdBill(cursor.getString(cursor.getColumnIndex(COL_ID_BILL)));
                billList.add(bill);
                cursor.moveToNext();
            }
            cursor.close();
        }


        return billList;
    }

    //update bill;
    public boolean updateBill(Bill bill) {
        sqLiteDatabase = mySQLiteHP.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COL_ID_BILL, bill.getIdBill());
        values.put(COL_DATE_BUY, bill.getDateBuy());

        long result = sqLiteDatabase.update(TABLE_NAME, values, COL_ID_BILL + " =?", new String[]{bill.getIdBill()});
        if (result > 0) {
            return true;
        } else {
            return false;
        }

    }

    // delete bill

    public boolean deleteBill(String COL_ID_BILL) {
        sqLiteDatabase = mySQLiteHP.getWritableDatabase();
        long result = sqLiteDatabase.delete(TABLE_NAME, COL_ID_BILL + " =?", new String[]{COL_ID_BILL});
        if (result > 0) {
            return true;
        } else {
            return false;
        }

    }

}
