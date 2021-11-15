package com.solid.solidExample.good;

import java.time.LocalDate;

// Liskov substitution Principle derived class
public interface RequestBook {
    public void request(Book book);
    public LocalDate getDueDate();

}
