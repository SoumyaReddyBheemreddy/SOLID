package com.solid.example.violation;
/*
* interface book issue return printDetails
* EBook implements book
* HandCover implements book
* */
//Violating Interface segregation
interface Book {
    public void setBookTitle(String bookTitle);
    public String getBookTitle();
    public void setStatus(boolean status);
    public boolean getStatus();
    public void issueBook();
    public  void returnBook();
    public void printDetails();
}


