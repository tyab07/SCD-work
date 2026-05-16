package assignment_01;

public class Magezine extends LibraryItem {
    private int loanDays = 7;

    public Magezine(String title) {
        super(title);
    }

    public void borrow() {
        if (!isBorrowed()) {
            setBorrowed(true);
            System.out.println("Magazine '" + getTitle() + "' borrowed for " + loanDays + " days.");
        } else {
            System.out.println("Magazine '" + getTitle() + "' is already borrowed.");
        }
    }

    public void returnItem() {
        if (isBorrowed()) {
            setBorrowed(false);
            System.out.println("Magazine '" + getTitle() + "' returned");
        } else {
            System.out.println("Magazine '" + getTitle() + "' was not borrowed.");
        }
    }

    
}
