package assignment_01;

public class Student extends Person {
    private int maxItems = 3;

    public Student(String name) {
        super(name);
    }

    public void register() {
        System.out.println("Student " + getName() + " registered");
    }

    public void requestItem(LibraryItem item) {
        System.out.println("Student " + getName() + " is requesting item: " + item.getTitle());
        if (item instanceof Book || item instanceof Magezine) {
            item.borrow();
        }
    }
}
