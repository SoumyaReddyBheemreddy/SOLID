package com.solid.solidExample.good;

import java.time.LocalDate;
import java.time.ZoneId;

// Liskov substitution Principle
public class Student implements LibraryMembersDetail,RequestBook{
    private String name;
    private String designation;

    @Override
    public void setMember(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    @Override
    public String getMember() {
        return "Member name is : "+name+" designation "+designation;
    }

    @Override
    public void request(Book book) {
            System.out.println("Requesting Book "+book.getName()+" by "+ book.getAuthor());
    }

    @Override
    public LocalDate getDueDate() {
        return LocalDate.now(ZoneId.of("India")).plusDays(30);
    }
}
