package com.solid.example.good;


import java.time.LocalDate;
class Book{
    private String bookTitle;
    private boolean status = true;
    public void setBookTitle(String bookTitle){
        this.bookTitle = bookTitle;
    }
    public String getBookTitle(){
        return this.bookTitle;
    }
    public void setStatus(boolean status){
        this.status = status;
    }
    public  boolean getStatus(){
        return status;
    }


}

