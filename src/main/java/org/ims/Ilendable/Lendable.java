package org.ims.Ilendable;

public interface Lendable {
    boolean lend(User user);
    void returnBook(User user);
    boolean isAvaliable();
}
