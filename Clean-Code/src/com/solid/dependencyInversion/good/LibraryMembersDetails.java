package com.solid.dependencyInversion.bad;

public interface LibraryMembersDetails {
    public void setMember(String name,String designation);
    public String getMember();
    public void read(Reader reads);
}
