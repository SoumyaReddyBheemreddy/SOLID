package com.solid.example.unsolved;
//Violation of Open Closed Principle
class Card implements Payment{
    @Override
    public void makeTransaction(String card){
        if(card.equals("Debit"))
            System.out.println("Paid through debit card");
        if(card.equals("Credit"))
            System.out.println("Paid through credit card");
    }
    //Violation of Liskov Substitution principle
    @Override
    public void getCashBack() {
        throw new UnsupportedOperationException("not applicable");
    }
}