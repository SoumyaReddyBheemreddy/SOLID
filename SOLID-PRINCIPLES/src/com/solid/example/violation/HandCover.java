package com.solid.example.violation;

public class HandCover implements Book{
    private String bookTitle;
    private boolean status = true;
    @Override
    public void setBookTitle(String bookTitle){
        this.bookTitle = bookTitle;
    }
    @Override
    public String getBookTitle(){
        return this.bookTitle;
    }
    @Override
    public void setStatus(boolean status){
        this.status = status;
    }
    @Override
    public boolean getStatus(){
        return status;
    }

    @Override
    public void issueBook() {
        setStatus(false);
        System.out.println("The Hand Cover Book "+this.getBookTitle()+" is issued");
    }

    @Override
    public void returnBook() {
        setStatus(true);
        System.out.println("The Hand Cover Book "+this.getBookTitle()+" is returned");
    }
    //Violating single responsibility
    @Override
    public void printDetails() {
        System.out.println("Book title : "+getBookTitle());
    }
}
