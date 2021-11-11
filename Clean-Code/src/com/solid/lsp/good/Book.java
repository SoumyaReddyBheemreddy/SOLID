package com.solid.interfaceSegregation.good;

public class Book {
    private String author;
    private String name;
    private String text;
    private String year;
    public void setAuthor(String author){
        this.author = author;
    }
    public String getAuthor(){
        return  author;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setContent(String text){
        this.text = text;
    }
    public String getContent(){
        return text;
    }
    public void setYear(String year){
        this.year = year;
    }
    public String getYear(){
        return year;
    }
}
