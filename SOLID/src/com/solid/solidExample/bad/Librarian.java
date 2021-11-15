package com.solid.solidExample.bad;

public class Librarian extends Library{
    private String name;
    private String designation;
    @Override
    void personDetails(String name, String designation) {
            this.name = name;
            this.designation = designation;
    }

    @Override
    void issueBook(Book book) {
        System.out.println("Issuing the book "+book.getName()+" by "+book.getAuthor());
    }

    @Override
    void requestBook(Book book) {
        //He can't request the book
        // not required
    }
}
