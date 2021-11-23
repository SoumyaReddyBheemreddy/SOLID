package com.solid.example.solved;
// open closed
public class CreditCard implements Payment{
    @Override
    public void makeTransaction(double amount) {
        System.out.println("Amount "+amount+" is debited from credit card");
        addCreditScore();
    }
    public void addCreditScore(){
        System.out.println("credit points added");
    }
}
