package com.solid.example.satisfied;
// dependence
public class  Book implements Issue{
    private String bookTitle;
    private boolean status = true;

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }


    public String getBookTitle() {
        return this.bookTitle;
    }


    public void setStatus(boolean status) {
        this.status=status;
    }

    public boolean getStatus() {
        return this.status;
    }

    @Override
    public void issueBook() {
        System.out.println("The Book is issued");
    }



}
