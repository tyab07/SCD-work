package assignment_01;

public class Book extends LibraryItem {
    private int loanDays = 10; 

    public Book(String title) {
        super(title);
    }

    public void borrow() {
        if (!isBorrowed()) {
            setBorrowed(true);
            System.out.println("Book '" + getTitle() + "' borrowed for " + loanDays + " days.");
        }
        else {
            System.out.println("Book '" + getTitle() + "' is already borrowed.");
        }
    }

    public void returnItem() {
        if (isBorrowed()) {
            setBorrowed(false);
            System.out.println("Book '" + getTitle() + "' returned.");
        }
        else {
            System.out.println("Book '" + getTitle() + "' was not borrowed.");
        }
    }

   
}
