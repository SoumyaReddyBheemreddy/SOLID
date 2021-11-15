package com.solid.example.good;

import java.util.ArrayList;
import java.util.List;

public class Student {
    final int MAX_BOOKS_PER_STUDENT = 5;
    List<Book>  totalBooksIssued = new ArrayList<>();
    public void requestBook(Book book){
        if(totalBooksIssued.size()>MAX_BOOKS_PER_STUDENT){
            System.out.println("Sorry you have exceeded maximum number of book allocated");
        }
        else if (book.status){
            totalBooksIssued.add(book);
            book.issueBook(book);
        }
        else {
            System.out.println("Sorry,"+ book.bookTitle+" is already issued to other student");
        }
    }
    public void returnBook(HandCover book){
        totalBooksIssued.remove(book);
        book.returnBook(book);
    }
}
