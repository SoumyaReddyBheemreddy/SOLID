package com.solid;

import java.util.ArrayList;

public class AllBooks {
    static ArrayList<String> books= new ArrayList<>();
    public void addBook(String book){
        books.add(book);
    }
    public void deleteBook(String book){
        books.remove(book);
    }
    public ArrayList<String> getBooks(){
        return  books;
    }
}
