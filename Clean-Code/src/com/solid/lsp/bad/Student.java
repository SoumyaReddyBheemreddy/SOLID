package com.solid.interfaceSegregation.bad;

public class Student extends Library{
    private String name;
    private String destination;
    @Override
    void personDetails(String name, String destination) {
        this.name = name;
        this.destination = destination;
    }

    @Override
    void issueBook(Book book) {
        //not required
    }

    @Override
    void requestBook(Book book) {
        System.out.println("Requesting the book "+book.getName()+" by "+book.getAuthor());
    }
}
