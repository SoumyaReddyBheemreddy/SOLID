package com.solid.dependencyInversion.bad;

public class Student implements LibraryMembersDetails{
    @Override
    public void setMember(String name, String designation) {
        //method
    }

    @Override
    public String getMember() {
        return null;
    }

    @Override
    public void read(Reader reads) {
        //tight coupling
        Book book = new Book();
        SoftCopyReaders want_to_read = new SoftCopyReaders();
        want_to_read.digitalReader(book);
        HardCopyReader want_to_read1 = new HardCopyReader();
        want_to_read1.hardCopyReader(book);
    }
}
