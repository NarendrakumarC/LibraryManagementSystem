package org.ims.Ilendable;

public class Member extends User {

    private int borrowedBookCount ;
    private static int MAX_BORROW_LIMIT =5;

    public Member(String name,String contactInfo) {
        super(name,contactInfo);
        this.borrowedBookCount =0;
    }

    @Override
    public void displayDashboard() {
        System.out.println("::Member DashBoard::");
        System.out.println("Name :"+getName());
        System.out.println("Number of Book barrowed :"+this.borrowedBookCount);
    }

    @Override
    public boolean canBorrowBooks() {
        return borrowedBookCount < MAX_BORROW_LIMIT;
    }


    @Override
    public void returnBook() {
        borrowedBookCount--;
    }
}