package com.solid.interfaceSegregation.bad;

abstract class Library {
    abstract void personDetails(String name,String designation);
    abstract void issueBook(Book book);
    abstract void requestBook(Book book);
}
