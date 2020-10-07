package com.example.excercise_app_quan_li_sinh_vien.allClass;

public class Bill {
     String idBill;
     String dateBuy;

    public Bill() {
    }

    public Bill(String idBill, String dateBuy) {
        this.idBill = idBill;
        this.dateBuy = dateBuy;
    }

    public String getIdBill() {
        return idBill;
    }

    public void setIdBill(String idBill) {
        this.idBill = idBill;
    }

    public String getDateBuy() {
        return dateBuy;
    }

    public void setDateBuy(String dateBuy) {
        this.dateBuy = dateBuy;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "idBill='" + idBill + '\'' +
                ", dateBuy='" + dateBuy + '\'' +
                '}';
    }
}
