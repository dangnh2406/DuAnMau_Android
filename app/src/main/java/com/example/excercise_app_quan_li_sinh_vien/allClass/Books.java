package com.example.excercise_app_quan_li_sinh_vien.allClass;

public class Books {
    String id;
    String bookName;
    String author;
    double importPrices;
    double prices;
    String inventoryNumber;
    int quantytiSold;
    String dateAdded;
    double revenue;
    String typeBook;


    public Books() {
    }

    public Books(String id, String bookName, String author, double importPrices, double prices, String inventoryNumber, int quantytiSold, String dateAdded, double revenue, String typeBook) {
        this.id = id;
        this.bookName = bookName;
        this.author = author;
        this.importPrices = importPrices;
        this.prices = prices;
        this.inventoryNumber = inventoryNumber;
        this.quantytiSold = quantytiSold;
        this.dateAdded = dateAdded;
        this.revenue = revenue;
        this.typeBook = typeBook;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getImportPrices() {
        return importPrices;
    }

    public void setImportPrices(double importPrices) {
        this.importPrices = importPrices;
    }

    public double getPrices() {
        return prices;
    }

    public void setPrices(double prices) {
        this.prices = prices;
    }

    public String getInventoryNumber() {
        return inventoryNumber;
    }

    public void setInventoryNumber(String inventoryNumber) {
        this.inventoryNumber = inventoryNumber;
    }

    public int getQuantytiSold() {
        return quantytiSold;
    }

    public void setQuantytiSold(int quantytiSold) {
        this.quantytiSold = quantytiSold;
    }

    public String getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(String dateAdded) {
        this.dateAdded = dateAdded;
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    public String getTypeBook() {
        return typeBook;
    }

    public void setTypeBook(String typeBook) {
        this.typeBook = typeBook;
    }

    @Override
    public String toString() {
        return "Books{" +
                "id='" + id + '\'' +
                ", bookName='" + bookName + '\'' +
                '}';
    }
}
