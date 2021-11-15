package com.solid.solidExample.bad;

import java.util.ArrayList;

public class AllBooks {
    private static ArrayList<Book> books = new ArrayList<>();
    public void addBook(Book book){
        books.add(book);
    }
    public ArrayList<Book> getBooks(){
        return books;
    }
}
