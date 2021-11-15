package com.solid.example.satisfied;
//single responsibility
public class DisplayBook {
    public void printDetails(Book book){
        System.out.println("Book name : "+book.getBookTitle()+" availability "+book.getStatus());
    }
}
