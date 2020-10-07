package com.example.excercise_app_quan_li_sinh_vien.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.excercise_app_quan_li_sinh_vien.allClass.Books;
import com.example.excercise_app_quan_li_sinh_vien.database_hp.MySQLiteHP;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {
    MySQLiteHP mySQLiteHP;
    SQLiteDatabase sqLiteDatabase;

    public BookDAO(Context context) {
        mySQLiteHP = new MySQLiteHP(context);
        sqLiteDatabase = mySQLiteHP.getReadableDatabase();
    }

    public static final String TABLE_NAME = "BOOKS";
    public static final String COL_ID_BOOK = "id_book";
    public static final String COL_BOOK_NAME = "bookName";
    public static final String COL_AUTHOR = "author";
    public static final String COL_IMPORT_PRICES = "importPrices";
    public static final String COL_PRICES = "prices";
    public static final String COL_INVENTORY_NUMBER = "inventoryNumber";
    public static final String COL_TYPE_BOOK = "type_book";

    public static final String SQL_BOOK = "create table " + TABLE_NAME + "(" + COL_ID_BOOK + " integer primary key autoincrement" +
            " ," + COL_AUTHOR + " text not null ,"
            + COL_BOOK_NAME + " text not null ,"
            + COL_IMPORT_PRICES + " double not null ,"
            + COL_INVENTORY_NUMBER + " integer not null ,"
            + COL_PRICES + " double not null ,"
            + COL_TYPE_BOOK + " text not nul";

    //insert books
    public boolean insertBooks(Books books) {
        ContentValues values = new ContentValues();
        values.put(COL_ID_BOOK, books.getId());
        values.put(COL_BOOK_NAME, books.getBookName());
        values.put(COL_AUTHOR, books.getAuthor());
        values.put(COL_IMPORT_PRICES, books.getImportPrices());
        values.put(COL_INVENTORY_NUMBER, books.getInventoryNumber());
        values.put(COL_PRICES, books.getPrices());
        values.put(COL_TYPE_BOOK, books.getTypeBook());

        long result = sqLiteDatabase.insert(TABLE_NAME, null, values);
        if (result > 0) {
            return true;
        } else {
            return false;
        }

    }

    //get all books
    public List<Books> getAllBooks() {
        List<Books> booksList = new ArrayList<>();
        String SQL_GET_ALL = "select * from " + TABLE_NAME;
        Cursor cursor = sqLiteDatabase.rawQuery(SQL_GET_ALL, null);
        if (cursor.getCount() > 0) {
            cursor.moveToFirst();
            while (!cursor.isAfterLast()) {
                Books books = new Books();
                books.setId(cursor.getString(cursor.getColumnIndex(COL_ID_BOOK)));
                books.setInventoryNumber(cursor.getString(cursor.getColumnIndex(COL_INVENTORY_NUMBER)));
                books.setTypeBook(cursor.getString(cursor.getColumnIndex(COL_TYPE_BOOK)));
                books.setAuthor(cursor.getString(cursor.getColumnIndex(COL_AUTHOR)));
                books.setPrices(cursor.getDouble(cursor.getColumnIndex(COL_PRICES)));
                books.setImportPrices(cursor.getDouble(cursor.getColumnIndex(COL_IMPORT_PRICES)));
                books.setBookName(cursor.getString(cursor.getColumnIndex(COL_BOOK_NAME)));
                booksList.add(books);
                cursor.moveToNext();
            }
            sqLiteDatabase.close();
        }
        return booksList;
    }

    //delete books
    public boolean deleteBooks(Books books) {
        long result = sqLiteDatabase.delete(TABLE_NAME, COL_ID_BOOK + " =?", new String[]{COL_ID_BOOK});
        if (result > 0) {
            return true;
        } else {
            return false;
        }
    }

    // update books
    public boolean updateBooks(Books books) {
        sqLiteDatabase = mySQLiteHP.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COL_ID_BOOK, books.getId());
        values.put(COL_TYPE_BOOK, books.getTypeBook());
        values.put(COL_PRICES, books.getPrices());
        values.put(COL_INVENTORY_NUMBER, books.getInventoryNumber());
        values.put(COL_AUTHOR, books.getAuthor());
        values.put(COL_BOOK_NAME, books.getBookName());
        values.put(COL_IMPORT_PRICES, books.getImportPrices());

        long result = sqLiteDatabase.update(TABLE_NAME, values, COL_ID_BOOK + " =?", new String[]{books.getId()});
        if (result > 0) {
            return true;
        } else {
            return false;
        }
    }


}
