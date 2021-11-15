package com.solid.good;

public class SearchByNameAndAuthor implements SearchBy{
    @Override
    public Book search(String title,String author) {
        AllBooks books = new AllBooks();
        for(Book book : books.getBooks()){
            if(book.getTitle().equals(title) && book.getAuthor().equals(author))
                return book;
        }
        throw new UnsupportedOperationException("Oops.. No Book Found");
    }
}
