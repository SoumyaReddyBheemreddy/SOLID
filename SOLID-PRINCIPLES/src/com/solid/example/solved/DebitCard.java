package com.solid.example.solved;
//Liskov Substitution principle
public class DebitCard implements Payment{
    @Override
    public void makeTransaction(double amount) {
        System.out.println("Amount "+amount+" is debited from debit card");
    }
}
