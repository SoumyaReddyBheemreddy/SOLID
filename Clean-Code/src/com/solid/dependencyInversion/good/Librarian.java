package com.solid.dependencyInversion.bad;

public class Librarian implements LibraryMembersDetails{
    @Override
    public void setMember(String name, String designation) {
        //method
    }

    @Override
    public String getMember() {
        //method
        return null;
    }

    @Override
    public void read(Reader reads) {

    }
}
