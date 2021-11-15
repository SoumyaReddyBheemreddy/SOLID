package com.solid.example.satisfied;

public class EBook implements Issue{
    private String bookTitle;
    private boolean status = true;

    @Override
    public void setBookTitle(String bookTitle) {
            this.bookTitle = bookTitle;
    }

    @Override
    public String getBookTitle() {
        return this.bookTitle;
    }

    @Override
    public void setStatus(boolean status) {
            this.status=status;
    }

    @Override
    public boolean getStatus() {
        return this.status;
    }

    @Override
    public void issueBook() {
        setStatus(false);
        System.out.println("The E-Book "+this.getBookTitle()+" is issued");
    }
}
