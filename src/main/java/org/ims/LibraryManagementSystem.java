package org.ims;

import org.ims.Ilendable.User;
import org.ims.Ilendable.impl.Book;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class LibraryManagementSystem {
    public List<Book> bookInventory ;
    public List<User> registeredUsers;

    public LibraryManagementSystem() {
        bookInventory = new ArrayList<>();
        registeredUsers = new ArrayList<>();
    }

    public void addBook(Book book) {
        bookInventory.add(book);
    }

    public void registerUser(User user) {
        registeredUsers.add(user);
    }

    public Book searchBook(String criteria) {
        for (Book book : bookInventory) {
            if(book.getAuthor().equalsIgnoreCase(criteria) || book.getTitle().equalsIgnoreCase(criteria)) {
                return book;
            }
        }
        return null;
    }

    public Book searchBook(String criteria, String type){
        for (Book book : bookInventory) {
            if((book.getAuthor().equalsIgnoreCase(criteria) || book.getTitle().equalsIgnoreCase(criteria))
                    && (Book.BookType.NOVELBOOK.getBookType().equalsIgnoreCase(type))) {
                return book;
            }
        }
        return null;
    }

    public void displayAllBooks() {
        for (Book book : bookInventory) {
            System.out.println(book);
        }
    }

    public void displayRegiseteredUser() {
        for (User user : registeredUsers) {
            System.out.println(user);
        }
    }
}