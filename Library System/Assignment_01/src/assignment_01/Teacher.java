package assignment_01;

public class Teacher extends Person {
    private int maxItems = 10;

    public Teacher(String name) {
        super(name);
    }

    public void register() {
        System.out.println("Teacher " + getName() + " registered ");
    }

    public void requestItem(LibraryItem item) {
        System.out.println("Teacher "+ getName() + " is requesting item: " + item.getTitle());
        item.borrow();
       
    }
}
