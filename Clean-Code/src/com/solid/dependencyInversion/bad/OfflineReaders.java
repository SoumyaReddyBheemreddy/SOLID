package com.solid.dependencyInversion;

public interface OfflineReaders extends Reader{
    public void hardCopyReader(Book book);
}
