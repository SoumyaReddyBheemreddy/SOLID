package com.solid.example.good;
// this class follows open closed principle
public class EBook extends Book {
    @Override
    public void issueBook(Book book){
        book.status = false;
        System.out.println("The E-Book "+book.bookTitle+" is issued");
    }
}
