package com.example.excercise_app_quan_li_sinh_vien.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.excercise_app_quan_li_sinh_vien.allClass.TypeBook;
import com.example.excercise_app_quan_li_sinh_vien.database_hp.MySQLiteHP;

import java.util.ArrayList;
import java.util.List;

public class TypeBookDAO {
    MySQLiteHP mySQLiteHP;
    SQLiteDatabase sqLiteDatabase;

    public TypeBookDAO(Context context) {
        mySQLiteHP = new MySQLiteHP(context);
        sqLiteDatabase = mySQLiteHP.getReadableDatabase();
    }

    // matheloai,tenloai,vitri;
    public static final String TABLE_NAME = "typebook";
    public static final String COL_ID_TYPE_BOOK = "idTypeBook";
    public static final String COL_TYPE_NAME = "typeName";
    public static final String COL_LOCATION = "location";

    public static final String SQL_TYPE_BOOK = "create table " + TABLE_NAME + "(" + COL_ID_TYPE_BOOK + " integer primary key autoincrement ," + COL_LOCATION + " text ," + COL_TYPE_NAME + " text)";

    // insert type books;
    public boolean insertTypeBooks(TypeBook typeBook) {
        ContentValues values = new ContentValues();
        values.put(COL_ID_TYPE_BOOK, typeBook.getIdTypeBook());
        values.put(COL_LOCATION, typeBook.getLocation());
        values.put(COL_TYPE_NAME, typeBook.getTypeNameBook());

        long result = sqLiteDatabase.insert(TABLE_NAME, null, values);
        if (result > 0) {
            return true;
        } else {
            return false;
        }

    }

    //get all type books;
    public List<TypeBook> getAllTypeBooks() {
        List<TypeBook> typeBookList = new ArrayList<>();
        String select = "select * from " + TABLE_NAME;
        Cursor cursor = sqLiteDatabase.rawQuery(select, null);
        if (cursor.getCount() > 0) {
            cursor.moveToFirst();
            while (!cursor.isAfterLast()) {
                TypeBook typeBook = new TypeBook();
                typeBook.setTypeNameBook(cursor.getString(cursor.getColumnIndex(COL_TYPE_NAME)));
                typeBook.setIdTypeBook(cursor.getString(cursor.getColumnIndex(COL_ID_TYPE_BOOK)));
                typeBook.setLocation(cursor.getString(cursor.getColumnIndex(COL_LOCATION)));
                cursor.moveToNext();
            }
            sqLiteDatabase.close();
        }

        return typeBookList;

    }

    // delete type books;
    public boolean deleteTypeBook(TypeBook typeBook) {
        long result = sqLiteDatabase.delete(TABLE_NAME, COL_ID_TYPE_BOOK + " =?", new String[]{typeBook.getIdTypeBook()});

        if (result > 0) {
            return true;
        } else {
            return false;
        }
    }

    // update type books;
    public boolean updateTypeBooks(TypeBook typeBook){
        ContentValues values = new ContentValues();
        values.put(COL_TYPE_NAME,typeBook.getTypeNameBook());
        values.put(COL_LOCATION,typeBook.getLocation());
        values.put(COL_ID_TYPE_BOOK,typeBook.getIdTypeBook());
        long result = sqLiteDatabase.update(TABLE_NAME,values,COL_ID_TYPE_BOOK+" =?",new String[]{typeBook.getIdTypeBook()});

        if(result > 0){
            return true;
        }else{
            return false;
        }
    }

}
