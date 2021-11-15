package com.solid.example.violation;


public class Main {
    public static void main(String[] args){
        EBook book1 = new EBook();
        book1.setBookTitle("Java");
        HandCover book2  = new HandCover();
        book2.setBookTitle("Python");
        Student student = new Student();
        student.requestBook("E Book",book1);
        student.requestBook("Hand Cover",book2);
        student.returnBook(book2);
    }
}
