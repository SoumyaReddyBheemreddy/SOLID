package com.solid.solidExample.good;
// Liskov substitution Principle
public class Librarian implements LibraryMembersDetail,IssueBook{
    private String name;
    private String designation;
    @Override
    public void issueBook(Book book) {
            System.out.println("Issuing the book "+book.getName()+" by "+book.getAuthor());
    }



    @Override
    public void setMember(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    @Override
    public String  getMember() {
            return "Member name is : "+name+" designation "+designation;
    }
}
