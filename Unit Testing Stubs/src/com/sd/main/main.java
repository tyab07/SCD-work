package com.sd.main;

import com.sd.al.StudentDAOStub;
import com.sd.bll.studentBL;

public class main {
    public static void main(String[] args) {
        // Dependency Injection
        StudentDAOStub dal = new StudentDAOStub();
        studentBL bl = new studentBL(dal);

        System.out.println("Total Students: " + bl.countStudents());
        System.out.println("Average CGPA: " + bl.calcAvgCGPA());
    }
}