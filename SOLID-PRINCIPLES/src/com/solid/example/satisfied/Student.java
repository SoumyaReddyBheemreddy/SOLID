package com.solid.example.satisfied;

import java.util.ArrayList;
import java.util.List;

public class Student {
    final int MAX_BOOKS_PER_STUDENT = 5;
    List<Book> totalBooksIssued = new ArrayList<>();
    public void requestBook(Book book){
        // Bookbook = new EBook();
        //Book book = new HandCover();
        if(totalBooksIssued.size()>MAX_BOOKS_PER_STUDENT){
            System.out.println("Sorry you have exceeded maximum number of book allocated");
        }
        else if (book.getStatus()){
            totalBooksIssued.add(book);
            book.issueBook();
        }
        else {
            System.out.println("Sorry,"+ book.getBookTitle()+" is already issued to other student");
        }
    }
    public void returnBook(HandCover book){
        totalBooksIssued.remove(book);
        book.returnBook();
    }
}
