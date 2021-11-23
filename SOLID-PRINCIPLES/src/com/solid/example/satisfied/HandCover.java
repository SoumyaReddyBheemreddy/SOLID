package com.solid.example.satisfied;
//open close principles and interface
public class HandCover extends  Book implements ReturnPolicy {

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

}
