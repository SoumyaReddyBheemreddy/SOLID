package com.solid.example.satisfied;
//Dependency Inversion
public interface Book {
    public void setBookTitle(String bookTitle);
    public String getBookTitle();
    public void setStatus(boolean status);
    public boolean getStatus();
}
