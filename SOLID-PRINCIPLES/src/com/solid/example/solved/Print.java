package com.solid.example.solved;

import java.util.HashMap;

//SRP
public class Print {
    public void printDetails(double totalPrice, BooksToBuy books){
        HashMap<String,Double> checkOut = books.getAllBooksInfo();
        for(String bookTitle:checkOut.keySet())
        {
            System.out.println("Item is : "+bookTitle+" price is "+checkOut.get(bookTitle));
        }

        System.out.println("total amount : "+totalPrice);
    }
}
