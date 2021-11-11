package com.solid.interfaceSegregation.good;

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
            System.out.println("Requeating Book "+book.getName()+" by "+ book.getAuthor());
    }
}
