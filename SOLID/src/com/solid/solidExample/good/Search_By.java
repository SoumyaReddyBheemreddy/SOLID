package com.solid.solidExample.good;

import java.util.ArrayList;
// Open Closed principle
public interface Search_By {
    public Book is_match(ArrayList<Book> book, String search_by);
}
