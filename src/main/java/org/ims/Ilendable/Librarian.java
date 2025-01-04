package org.ims.Ilendable;

import org.ims.Ilendable.impl.Book;

public class Librarian extends User {

    private String employeeNumber;

    public Librarian(String employeeNumber, String name, String contactInfo) {
        super(name, contactInfo);
        this.employeeNumber =employeeNumber;
    }

    @Override
    public void displayDashboard() {
        // TODO Auto-generated method stub
        System.out.println("::Librarian Dashboard::");
        System.out.println("Librarian No "+this.employeeNumber+"\tName :"+getName());
    }

    @Override
    public boolean canBorrowBooks() {
        return true;
    }

    void addNewBook(Book book) {

    }

    void removeBook(Book book) {

    }

    @Override
    public void returnBook() {
        // TODO Auto-generated method stub

    }
}
