package com.solid.example.unsolved;

import java.util.ArrayList;
import java.util.HashMap;


public class BooksToBuy {
    private HashMap<String,Double> allBooksInfo = new HashMap<>();
    private double totalPrice;
    public void addBook(String name,double price)
    {
        totalPrice+=price;
        allBooksInfo.put(name,price);
    }
    // Violation of single responsibility
    public void printDetails(){
        for(String bookTitle:allBooksInfo.keySet())
        {
            System.out.println("Item is : "+bookTitle+" price is "+allBooksInfo.get(bookTitle));
        }
        System.out.println("total amount : "+totalPrice);
    }
}
