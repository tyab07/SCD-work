package assignment_01;

import java.util.ArrayList;

// the Library demonstrates composition because it creates and fully controls the Book,
// Magezine, Student, and Teacher objects inside its constructor. Their lifecycles are 
// tied to the Library if the Library is destroyed, these objects cannot exist independently.
public class Library {
    private ArrayList<LibraryItem> items;
    private ArrayList<Person> persons;
    public Library() {
        items = new ArrayList<>();
        items.add(new Book("Mathematics"));
        items.add(new Magezine("National Geography"));
        items.add(new Book("Calculus"));
        items.add(new Magezine("Forbes"));

        persons = new ArrayList<>();
        persons.add(new Student("Ahmad"));
        persons.add(new Teacher("Ali"));
    }
    public static void main(String[] args) {
        Library lib = new Library();

        Person student = lib.persons.get(0);
        Person teacher = lib.persons.get(1);
        student.register();
        teacher.register();

        student.requestItem(lib.items.get(0)); 
        teacher.requestItem(lib.items.get(0)); 
        lib.items.get(0).returnItem(); 
        lib.items.get(1).returnItem();
    }
}
