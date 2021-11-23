package com.solid.example.satisfied;
//open closed and overcomes violation of Liskov Substitution principle
public class EBook extends Book{

    @Override
    public void issueBook() {
        setStatus(false);
        System.out.println("The E-Book "+this.getBookTitle()+" is issued");
    }
}
