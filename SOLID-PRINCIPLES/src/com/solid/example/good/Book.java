package com.solid.example.good;


//this class follows dependency inversion principle
class Book extends BookInfo implements Issue{
    @Override
    public void issueBook(Book book){
        book.status = false;
        System.out.println("The E-Book "+book.bookTitle+" is issued");
    }
}

