package com.solid.solidExample.bad;

import java.util.ArrayList;

public class Search_by_year implements Search_By{
    public Book is_match(ArrayList<Book> books, String search_by_year){
        String year = search_by_year;
        Book found = new Book();
        for(Book book : books){
            if(book.getYear().equals(year)) {
                found = book;
                break;
            }
        }
        return found;
    }
}
