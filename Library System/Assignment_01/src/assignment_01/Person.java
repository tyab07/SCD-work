package assignment_01;

public abstract class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void register();
    public abstract void requestItem(LibraryItem item);
}
