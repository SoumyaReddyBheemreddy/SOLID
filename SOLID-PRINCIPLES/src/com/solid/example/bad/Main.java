package com.solid.example.bad;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


class Book{
    private String bookTitle;
    private LocalDate issueDate;
    public void setBookTitle(String bookTitle){
        this.bookTitle = bookTitle;
    }
    public String getBookTitle(){
        return this.bookTitle;
    }
    public void setIssueDate(){
        this.issueDate = LocalDate.now();
    }
    public LocalDate getIssueDate(){
        return issueDate;
    }
    public void issueBook(int numberOfDays){
        this.setIssueDate();
        System.out.println("The Book "+this.getBookTitle()+" is issues until "+this.getIssueDate().plusDays(numberOfDays));
    }
    public void returnBook() {
        Fine fine = new Fine();
        double fineCost = fine.getFine(this.getIssueDate(),LocalDate.now());
        if(fineCost>0){
            System.out.println("You need to pay fine for not returning on time "+fineCost);
        }
        else{
            System.out.println("Thanks for returning book");
        }
    }
    public void getEBook(){
        System.out.println("E-Book is assigned");
        this.issueBook(28);
    }
    public void getHandCover(){
        System.out.println("Hand Cover Book is assigned");
        this.issueBook(30);
    }
}
class Fine {
    double price;

    public double getFine(LocalDate issueDate, LocalDate returnDate) {
        long numberOfDays = ChronoUnit.DAYS.between(issueDate, returnDate);
        if (numberOfDays > 28) {
            this.price = numberOfDays * 5.0;
            return price;
        }
        return 0.0;
    }
}

class Student{
    public void requestBook(String bookType,Book book){
        if(bookType.equals("E Book"))
            book.getEBook();
        if(bookType.equals("Hand Cover"))
            book.getHandCover();
    }
    public void returnBook(Book book){
        book.returnBook();
    }
}
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
