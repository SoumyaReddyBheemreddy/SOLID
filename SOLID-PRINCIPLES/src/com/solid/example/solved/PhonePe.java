package com.solid.example.solved;

public class PhonePe implements PaymentThroughUPI{
    @Override
    public void makeTransaction(double amount) {
        System.out.println("phonepe payment of "+amount+" done successfully");
    }

    @Override
    public void getCashBack() {

    }
}
