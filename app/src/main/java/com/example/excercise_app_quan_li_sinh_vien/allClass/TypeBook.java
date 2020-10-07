package com.example.excercise_app_quan_li_sinh_vien.allClass;

public class TypeBook {
    String idTypeBook;
    String typeNameBook;
    String location;

    public TypeBook() {
    }

    public TypeBook(String idTypeBook, String typeNameBook, String location) {
        this.idTypeBook = idTypeBook;
        this.typeNameBook = typeNameBook;
        this.location = location;
    }

    public String getIdTypeBook() {
        return idTypeBook;
    }

    public void setIdTypeBook(String idTypeBook) {
        this.idTypeBook = idTypeBook;
    }

    public String getTypeNameBook() {
        return typeNameBook;
    }

    public void setTypeNameBook(String typeNameBook) {
        this.typeNameBook = typeNameBook;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
