package com.solid.dependencyInversion.bad;

public class SoftCopyReaders implements OnlineReaders{
    @Override
    public void digitalReader(Book book) {
        //method
    }

    @Override
    public void setReader(String name, String Designation) {
            //method
    }

    @Override
    public void makeNotes() {
            //method
    }
}
