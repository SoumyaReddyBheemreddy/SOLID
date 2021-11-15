package com.solid.good;

public class SearchByTitle implements SearchBy{
    @Override
    public Book search(String str) {
           AllBooks books = new AllBooks();
           for(Book book : books){
               if(book.getTitle())
           }
    }
}
