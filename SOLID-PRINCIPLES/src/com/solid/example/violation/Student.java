package com.solid.example.violation;

class Student{
    public void requestBook(String bookType,Book book){
        if(bookType.equals("E Book") && book.getStatus()) {

            book.issueBook();
        }
        else if(bookType.equals("Hand Cover") && book.getStatus()) {

            book.issueBook();
        }
        else
            System.out.println("Book is unavailable");
    }
    public void returnBook(Book book){
        book.returnBook();
    }
}