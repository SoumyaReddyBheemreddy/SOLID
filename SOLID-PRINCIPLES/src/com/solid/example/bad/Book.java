package com.solid.example.bad;

class Book{
    private String bookTitle;
    private boolean status = true;
    public void setBookTitle(String bookTitle){
        this.bookTitle = bookTitle;
    }
    public String getBookTitle(){
        return this.bookTitle;
    }
    public void setStatus(boolean status){
        this.status = status;
    }
    public boolean getStatus(){
        return status;
    }

    public void returnBook(Book book) {
        System.out.println("Thanks for returning book"+book.getBookTitle());

    }
    public void issueEBook(Book book){
        System.out.println("E-Book "+book.getBookTitle()+" is issued");

    }
    public void issueHandCover(Book book){
        System.out.println("Hand Cover Book "+book.getBookTitle()+" is issued");

    }
}