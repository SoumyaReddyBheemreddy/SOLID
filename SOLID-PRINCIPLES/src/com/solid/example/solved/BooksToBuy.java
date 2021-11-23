package com.solid.example.solved;

import java.util.HashMap;

public class BooksToBuy {
    private HashMap<String,Double> allBooksInfo = new HashMap<>();
    private double totalPrice;
    public void addBooks(String bookTitle,double price){
        allBooksInfo.put(bookTitle,price);

    }
    public HashMap<String,Double> getAllBooksInfo(){
        return allBooksInfo;
    }

}
