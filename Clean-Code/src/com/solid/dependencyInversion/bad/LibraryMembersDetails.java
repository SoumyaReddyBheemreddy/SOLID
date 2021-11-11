package com.solid.dependencyInversion;

public interface LibraryMembersDetails {
    public void setMember(String name,String designation);
    public String getMember();
    public void read(Reader reads);
}
