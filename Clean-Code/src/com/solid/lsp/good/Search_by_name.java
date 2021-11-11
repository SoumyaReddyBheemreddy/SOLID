package com.solid.interfaceSegregation.good;

import java.util.ArrayList;

public class Search_by_name implements Search_By {
    public Book is_match(ArrayList<Book> books, String search_by_name){
        String name = search_by_name;
        Book found = new Book();
        for(Book book : books){
            if(book.getName().equals(name)) {
                found = book;
                break;
            }
        }
        return found;
    }
}
