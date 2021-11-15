package com.solid.example.good;

import java.time.LocalDate;

public class EBook extends IssueBook  {
    @Override
    public void issueBook(IssueBook book){
        book.setStatus(false);
        this.setIssueDate();
        System.out.println("The E-Book "+book.getBookTitle()+" is issues until "+book.getIssueDate().plusDays(28));
    }
}
