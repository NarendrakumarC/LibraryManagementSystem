package org.ims.Ilendable.impl;

public class NovelBook extends Book {
    private String genre;

    public NovelBook(String genre, String isbn, String title,String author) {
        super(isbn,title, author);
        this.genre = genre;
    }

    public void displayBookDetails() {
        System.out.println("Override Book to Novel Book :"+this.toString());
    }

    @Override
    public String toString() {
        return "NovelBook [genre=" + genre + "]";
    }



}
