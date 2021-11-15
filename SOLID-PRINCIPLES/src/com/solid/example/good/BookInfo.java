package com.solid.example.good;
// this class follows single responsibility principle
public class BookInfo {
    String bookTitle;
    boolean status;
    public void setBookDetails(String bookTitle,boolean status){
        this.bookTitle = bookTitle;
        this.status = status;
    }
}
