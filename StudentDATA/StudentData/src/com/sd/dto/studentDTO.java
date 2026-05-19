package com.sd.dto;

public class studentDTO {
    private int id;
    private String rollNo;
    private String name;
    private double cgpa;

    public studentDTO(int id, String rollNo, String name, double cgpa) {
        this.id = id;
        this.rollNo = rollNo;
        this.name = name;
        this.cgpa = cgpa;
    }

    public double getCgpa() { return cgpa; }
    public String getRollNo() { return rollNo; }
    public String getName() { return name; }
}
