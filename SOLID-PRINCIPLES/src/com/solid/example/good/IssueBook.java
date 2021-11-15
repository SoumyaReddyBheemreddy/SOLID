package com.solid.example.good;

import java.time.LocalDate;

abstract class IssueBook extends Book {
    private LocalDate issueDate;
    public void setIssueDate(){
        this.issueDate = LocalDate.now();
    }
    public LocalDate getIssueDate(){
        return issueDate;
    }
    abstract public void issueBook(IssueBook book);
}
