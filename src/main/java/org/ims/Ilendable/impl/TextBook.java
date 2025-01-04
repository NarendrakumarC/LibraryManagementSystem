package org.ims.Ilendable.impl;

public class TextBook extends Book{

    private String subject;
    private int edition;

    public TextBook(String subject, int edition,String isbn, String title, String author) {
        super(isbn,title,author);
        this.subject = subject;
        this.edition = edition;
    }

    public void displayBookDetails() {
        System.out.println("Override Book to text Book :"+this.toString());
    }

    public String toString() {
        return "TextBook edition :"+this.edition+"Subject :"+this.subject;
    }

}
