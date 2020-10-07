package com.example.excercise_app_quan_li_sinh_vien.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.widget.Toast;

import com.example.excercise_app_quan_li_sinh_vien.allClass.Account;
import com.example.excercise_app_quan_li_sinh_vien.database_hp.MySQLiteHP;

import java.util.ArrayList;
import java.util.List;

public class AccountDAO {
    MySQLiteHP mySQLiteHP;
    SQLiteDatabase sqLiteOpenHelper;
    Context context;


    public static final String TABLE_NAME = "Account";
    public static final String COL_USERNAME = "username";
    public static final String COL_PASSWORD = "password";
    public static final String COL_NAME = "name";
    public static final String SQL_ACCOUNT = "CREATE TABLE " + TABLE_NAME + "(" + COL_USERNAME + " text primary key not null ," + COL_PASSWORD + " text not null ," + COL_NAME + " text not null)";

    public AccountDAO(Context context) {
        mySQLiteHP = new MySQLiteHP(context);
        sqLiteOpenHelper = mySQLiteHP.getWritableDatabase();
    }


    //insert
    public boolean insertAccount(Account account) {

        // Tạo ra cặp tên cột với dữ liệu qua đối tượng ContentValues
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_NAME, account.getName());
        contentValues.put(COL_USERNAME, account.getUsername());
        contentValues.put(COL_PASSWORD, account.getPassword());

        // Thêm hàng mới vào trong bảng , kết quả trả về là ID của hàng (nếu thêm thành công trả về 1 số > 0)
        long result = sqLiteOpenHelper.insert(TABLE_NAME, null, contentValues);
        if (result > 0) {
            return true;
        } else {
            return false;
        }
    }

    //getALl account
    public List<Account> getAllAcc() {
        List<Account> accountList = new ArrayList<>();
        String SQL_Acc = "select * from " + TABLE_NAME;
        Cursor cursor = mySQLiteHP.getReadableDatabase().rawQuery(SQL_Acc, null);
        if (cursor.getCount() > 0) {
            cursor.moveToFirst();
            while (!cursor.isAfterLast()) {
                Account account = new Account();
                account.setName(cursor.getString(cursor.getColumnIndex(COL_NAME)));
                account.setPassword(cursor.getString(cursor.getColumnIndex(COL_PASSWORD)));
                account.setUsername(cursor.getString(cursor.getColumnIndex(COL_USERNAME)));
                accountList.add(account);

                cursor.moveToNext();
            }
            cursor.close();
        }

        return accountList;
    }

    // Update Account
    public boolean updateAcc(Account account) {
        sqLiteOpenHelper = mySQLiteHP.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COL_USERNAME, account.getUsername());
        values.put(COL_PASSWORD, account.getPassword());
        values.put(COL_NAME, account.getName());

        long result = sqLiteOpenHelper.update(TABLE_NAME, values, COL_USERNAME + " =?", new String[]{account.getUsername()});

        if (result > 0) {
            return true;
        } else {
            return false;
        }

    }

    // Delete Account
    public boolean deleteAcc(String COL_USERNAME) {
        sqLiteOpenHelper = mySQLiteHP.getWritableDatabase();

        long result = sqLiteOpenHelper.delete(TABLE_NAME, COL_USERNAME + " =?", new String[]{COL_USERNAME});
        if (result > 0) {
            return true;
        } else {
            return false;
        }
    }
}
