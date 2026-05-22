package com.sd.dto;


public class studentDTO {
    private final int id;
    private final String rollNo;
    private final String name;
    private final double cgpa;

   
    public studentDTO(int id, String rollNo, String name, double cgpa) {
        this.id = id;
        this.rollNo = rollNo;
        this.name = name;
        this.cgpa = cgpa;
    }

  
    public int getId() {
        return id;
    }

    public String getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }

    
    @Override
    public String toString() {
        return "studentDTO{" +
                "id=" + id +
                ", rollNo='" + rollNo + '\'' +
                ", name='" + name + '\'' +
                ", cgpa=" + cgpa +
                '}';
    }
}