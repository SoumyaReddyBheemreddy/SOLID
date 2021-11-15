package com.solid.solidExample.good;
//Single Responsibility
public class Printer {
    public void print(Book book){
        System.out.println("Name of the Book : "+book.getName()
                +", Author of the book is : "+book.getAuthor()+" year of release : "+book.getYear()
                +" \n content of the book is : "+book.getContent());
    }
}
