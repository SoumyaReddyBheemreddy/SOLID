package com.solid.example.violation;


class EBook  implements Book{
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
        System.out.println("The E-Book "+this.getBookTitle()+" is issued");
    }

    @Override
    public void returnBook() {
        //Violating Liskov Substitution principle
        throw new UnsupportedOperationException("E book dont need to return");
    }

    @Override
    //Violating single responsibility
    public void printDetails() {
        System.out.println("Book title : "+getBookTitle());
    }
}