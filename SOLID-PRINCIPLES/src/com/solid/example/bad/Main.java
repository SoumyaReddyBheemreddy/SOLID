package com.solid.example.bad;


public class Main {
    public static void main(String[] args){
        Book book1 = new Book();
        book1.setBookTitle("Java");
        Book book2  = new Book();
        book2.setBookTitle("Python");
        Student student = new Student();
        student.requestBook("E Book",book1);
        student.requestBook("Hand Cover",book2);
        student.returnBook(book2);
    }
}
