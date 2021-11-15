package com.solid;


import java.util.Scanner;

class Library {
    AllBooks books = new AllBooks();
    public void displayAllBooks(){
       for(String book : books.getBooks()){
           System.out.println(book);
       }
    }
    public void lendBook(String book){
        if(books.getBooks().contains(book)) {
            System.out.println("The book you requested has now been borrowed");
            books.deleteBook(book);
        }
        else
            System.out.println("Sorry the book you have requested is currently not in the library");
    }
    public void addReturnBook(String book){
        books.addBook(book);
    }
}
class Student{
    private String bookTitle;
    Scanner sc = new Scanner(System.in);
    public String  requestBook(){
        System.out.println("Please Enter the name of the book you would like to borrow");
        this.bookTitle = sc.nextLine();
        return bookTitle;
    }
    public String returnBook(){
        System.out.println("Please Enter the name of the book you would like to return");
        this.bookTitle = sc.nextLine();
        return bookTitle;
    }
}
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        AllBooks books = new AllBooks();
        books.addBook("Java");
        books.addBook("Python");
        books.addBook("C++");
        while(true){
            System.out.println("Press 1 to Display all available books");
            System.out.println("Press 2 to Request a book");
            System.out.println("Press 3 to Return  a book");
            System.out.println("Enter 4 to exit");
            int choice = sc.nextInt();
            Library library = new Library();
            if(choice == 1){

                library.displayAllBooks();
            }
            else if (choice == 2){
                Student student = new Student();
                library.lendBook(student.requestBook());
            }
            else if(choice == 3){
                Student student = new Student();
                library.addReturnBook(student.returnBook());
            }
            else
                break;
        }
    }
}
