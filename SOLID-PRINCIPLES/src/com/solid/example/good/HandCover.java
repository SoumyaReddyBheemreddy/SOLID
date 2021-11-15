package com.solid.example.good;

// this class follows Liskov substitution problem
public class HandCover extends Book implements Returns {
    @Override
    public void issueBook(Book book){
        book.status = false;
        System.out.println("The hand cover book "+book.bookTitle+" is issued");
    }

    @Override
    public void returnBook(Book book) {
        book.status = true;
        System.out.println("Thanks for returning book "+book.bookTitle);

    }
}