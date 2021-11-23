package com.solid.example.unsolved;
class PhonePe implements Payment{
    @Override
    public void makeTransaction(String upi) {
        System.out.println("paid through phonepe");
    }

    @Override
    public void getCashBack() {
        System.out.println("get cash back");
    }
}