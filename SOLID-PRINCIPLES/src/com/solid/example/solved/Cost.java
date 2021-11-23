package com.solid.example.solved;

import java.util.HashMap;
//single responsibility
public class Cost {
        public double calculateCost(BooksToBuy books){
            double totalPrice = 0;
            HashMap<String,Double> checkOut = books.getAllBooksInfo();
            for(String bookTitle:checkOut.keySet())
            {
                double cost = checkOut.get(bookTitle);

                totalPrice +=cost;
            }
            return totalPrice;
        }
    }

