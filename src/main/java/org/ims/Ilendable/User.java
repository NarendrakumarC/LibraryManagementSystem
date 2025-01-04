package org.ims.Ilendable;

public abstract class User {
    private static String userId;
    private String name;
    private String contactInfo;
    private static int totalUsers=0;

    public abstract void returnBook() ;

    public User() {
        this.userId = generateUserId();
    }

    private static int getTotalUsers() {
        return User.totalUsers;
    }
    public final String generateUserId() {
        totalUsers++;
        return "User -"+totalUsers ;
    }

    public abstract void displayDashboard();
    public abstract boolean canBorrowBooks();

    public User(String name, String contactInfo) {
        this.name= name;
        this.contactInfo = contactInfo;
    }

    public User(User other) {
        this.contactInfo = other.contactInfo;
        this.name = other.name;
        this.userId = generateUserId(); // calling generate UserId
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getContactInfo() {
        return contactInfo;
    }
    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    @Override
    public String toString() {
        return "User [name=" + name + ", contactInfo=" + contactInfo + "]";
    }
}

