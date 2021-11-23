package com.solid.example.unsolved;
//Violation of interface segregation
interface Payment{
    public void makeTransaction(String attribute);
    public void getCashBack();
}
