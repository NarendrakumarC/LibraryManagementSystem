package org.ims.Ilendable.impl;

import org.ims.Ilendable.Lendable;
import org.ims.Ilendable.User;

public abstract class Book implements Lendable {
    private String isbn;
    private String title;
    private String author;
    private boolean isAvailable;

    public enum BookType{
        NOVELBOOK("NovelBook"), TEXTBOOK("TextBook");
        private final String bookType;

        BookType(String type ) {
            this.bookType = type;
        }

        public String getBookType() {
            return bookType;
        }

    }

    public Book() {
        this.isAvailable = true;
    }

    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    public Book(Book other) {
        this.isbn = other.isbn;
        this.author = other.author;
        this.title = other.title;
        this.isAvailable = other.isAvailable;
    }

    @Override
    public boolean lend(User user) {
        // TODO Auto-generated method stub
        System.out.println("Books are lended to the User -"+user.getName());
        if(isAvaliable()  && user.canBorrowBooks()) {
            System.out.println("Dispatched Book ::"+this.toString());
            isAvailable=false;
            return true;
        }
        return false;
    }

    @Override
    public void returnBook(User user) {
        // TODO Auto-generated method stub
        isAvailable = true;
        user.returnBook();
        System.out.println("Returning the book to library by User- "+user.getName());

    }

    @Override
    public boolean isAvaliable() {
        // TODO Auto-generated method stub
        System.out.println("");
        return true;
    }

    public void displayBookDetails() {
        System.out.println("Current Book ::"+this.toString());
    }

    @Override
    public String toString() {
        return "Book [isbn=" + isbn + ", title=" + title + ", author=" + author + ", isAvailable=" + isAvailable + "]";
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

}

