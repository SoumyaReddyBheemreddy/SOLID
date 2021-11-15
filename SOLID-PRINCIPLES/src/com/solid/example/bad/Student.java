package com.solid.example.bad;

class Student{
    public void requestBook(String bookType,Book book){
        if(bookType.equals("E Book") && book.getStatus()) {
            book.setStatus(false);
            book.issueEBook(book);
        }
        else if(bookType.equals("Hand Cover") && book.getStatus()) {
            book.setStatus(false);
            book.issueHandCover(book);
        }
        else
            System.out.println("Book is unavailable");
    }
    public void returnBook(Book book){
        book.returnBook(book);
    }
}