package layered;

public class Student {
    private String rollNo;
    private double cgpa;
    private String details;

    public Student(String rollNo, double cgpa, String details) {
        this.rollNo = rollNo;
        this.cgpa = cgpa;
        this.details = details;
    }

    public String getRollNo() { return rollNo; }
    public double getCgpa() { return cgpa; }
    public String getDetails() { return details; }
}