package com.solid.example.good;

import java.time.LocalDate;


public class HandCover extends IssueBook implements ReturnBook{
    @Override
    public void issueBook(IssueBook book){
        book.setStatus(false);
        this.setIssueDate();
        System.out.println("The hand cover book "+book.getBookTitle()+" is issues until "+book.getIssueDate().plusDays(30));
    }

    @Override
    public void returnBook(IssueBook book) {
        book.setStatus(true);
        Fine fine = new Fine();
        if(fine.isFineApplicable(book.getIssueDate(),LocalDate.now())){
            System.out.println("You need to pay fine for not returning on time "+fine.getFine());
        }
       else{
            System.out.println("Thanks for returning book "+book.getBookTitle());
        }
    }
}