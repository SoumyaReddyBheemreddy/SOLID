package com.solid.example.unsolved;

public class Main {
    public static void main(String[] args){
        BooksToBuy booksToBuy = new BooksToBuy();
        booksToBuy.addBook("Python",200);
        booksToBuy.addBook("Java",300);
        booksToBuy.printDetails();
        // Violation of Dependency Inversion
        Card card = new Card();
        card.makeTransaction("Debit");
        PhonePe phonePe = new PhonePe();
        phonePe.makeTransaction("upi");
    }

}
