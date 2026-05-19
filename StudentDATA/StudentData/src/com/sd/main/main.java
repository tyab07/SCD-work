package com.sd.main;

import com.sd.al.studentDAO;
import com.sd.bll.studentBL;

public class main {
    public static void main(String[] args) {
        // Dependency Injection
        studentDAO dal = new studentDAO();
        studentBL bl = new studentBL(dal);

        System.out.println("Total Students: " + bl.countStudents());
        System.out.println("Average CGPA: " + bl.calcAvgCGPA());
    }
}