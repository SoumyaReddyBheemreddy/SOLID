package com.solid.example.good;

public class Main {
    public static void main(String[] args){
        EBook eBook = new EBook();
        eBook.setBookDetails("The Journey",true);
        HandCover handCover = new HandCover();
        handCover.setBookDetails("Java",true);
        Student student = new Student();
        student.requestBook(eBook);
        student.requestBook(handCover);
        student.returnBook(handCover);
        Student student1 = new Student();
        student1.requestBook(eBook);
        student1.requestBook(handCover);
    }
}
