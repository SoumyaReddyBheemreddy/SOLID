package com.solid.example.solved;

public class Main {
    public static void main(String[] args){
        BooksToBuy books = new BooksToBuy();
        books.addBooks("Python",200);
        books.addBooks("Java",300);
        Cost totalCost = new Cost();
        Print print =new Print();
        double totalPrice = totalCost.calculateCost(books);
        print.printDetails(totalPrice,books);
        //dependency
        Payment debitCard = new DebitCard();
        debitCard.makeTransaction(totalPrice);
        // or
        Payment phonePe = new PhonePe();
        phonePe.makeTransaction(totalPrice);

    }
}
