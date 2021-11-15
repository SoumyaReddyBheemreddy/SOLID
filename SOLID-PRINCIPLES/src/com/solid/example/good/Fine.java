package com.solid.example.good;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Fine {
    private double price;
    public void setPrice(int numberOfDays){
        this.price = numberOfDays*5.0;
    }
    public double getFine(){
        return this.price;
    }
    public boolean isFineApplicable(LocalDate issueDate,LocalDate returnDate){
        long numberOfDays = ChronoUnit.DAYS.between(issueDate,returnDate);
        if(numberOfDays>28){
           return true;
        }
        return false;
    }

}
