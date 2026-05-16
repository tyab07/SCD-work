package assignment_01;

public abstract class LibraryItem {
    private String title;
    private boolean borrowed;

    public LibraryItem(String title) {
        this.title = title;
        this.borrowed = false;
    }

    public String getTitle() {
        return title;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }

    public abstract void borrow();
    public abstract void returnItem();
}
