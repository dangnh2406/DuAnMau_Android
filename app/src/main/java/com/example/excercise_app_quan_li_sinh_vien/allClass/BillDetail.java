package com.example.excercise_app_quan_li_sinh_vien.allClass;

public class BillDetail {
    String idBillDetail;
    Bill bill;
    Books books;
    int quantytiBuy;

    public BillDetail() {
    }

    public BillDetail(String idBillDetail, Bill bill, Books books, int quantytiBuy) {
        this.idBillDetail = idBillDetail;
        this.bill = bill;
        this.books = books;
        this.quantytiBuy = quantytiBuy;
    }

    public String getIdBillDetail() {
        return idBillDetail;
    }

    public void setIdBillDetail(String idBillDetail) {
        this.idBillDetail = idBillDetail;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public Books getBooks() {
        return books;
    }

    public void setBooks(Books books) {
        this.books = books;
    }

    public int getQuantytiBuy() {
        return quantytiBuy;
    }

    public void setQuantytiBuy(int quantytiBuy) {
        this.quantytiBuy = quantytiBuy;
    }
}
