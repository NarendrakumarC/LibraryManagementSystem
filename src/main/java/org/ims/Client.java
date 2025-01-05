package org.ims;

import org.ims.Ilendable.Librarian;
import org.ims.Ilendable.Member;
import org.ims.Ilendable.User;
import org.ims.Ilendable.impl.Book;
import org.ims.Ilendable.impl.NovelBook;
import org.ims.Ilendable.impl.TextBook;

public class Client {
    public static void main(String[] args) {
        User member = new Member("Karan", "Bengalure");
        member.canBorrowBooks();
        member.displayDashboard();
        System.out.println(member.generateUserId());
        User library =  new Librarian("E-123", "VasuDev", "Bengalure");
        library.canBorrowBooks();
        library.displayDashboard();
        System.out.println(member.generateUserId());
        //	Book book = new Book();
        Book text = new TextBook("Mathematics", 4, "M-990", "Arthematic Maths", "Euclid");
        text.displayBookDetails();
        Book novel = new NovelBook("Scific-Triller", "N-990", "Onbok", "Anglee");
        novel.displayBookDetails();
        text.lend(member);
        text.returnBook(member);
        text.toString();
        System.out.println("=================================================================");
        LibraryManagementSystem lms = new LibraryManagementSystem();
        lms.addBook(text);
        lms.addBook(novel);

        User member1 = new Member("Arun", "Hyderabad");
        User member2 = new Member("Akshay", "Bengaluru");

        lms.registerUser(member1);
        lms.registerUser(member2);

        lms.registerUser(library);

        if(text.lend(member1)) {
            System.out.println("Successfully lended the book");
        }else {
            System.out.println("Book is already lend");
        }
        text.returnBook(member1);

        System.out.println("===========Display Books Info ================");
        lms.displayAllBooks();
        System.out.println("=============Display Registered User Info ============");
        lms.displayRegiseteredUser();

    }
}
