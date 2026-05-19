package com.sd.bll;




import java.util.List;

import com.sd.al.studentDAO;
import com.sd.dto.studentDTO;

public class studentBL {
    private final studentDAO studentDAO;

    // Dependency Injection via constructor
    public studentBL(studentDAO studentDAL) {
        this.studentDAO = studentDAL;
    }

    public int countStudents() {
        List<studentDTO> students = studentDAO.getAllStudents();
        return students.size();
    }

    public double calcAvgCGPA() {
        List<studentDTO> students = studentDAO.getAllStudents();
        if (students.isEmpty()) return 0.0;

        double total = 0.0;
        for (studentDTO s : students) {
            total += s.getCgpa();
        }
        return total / students.size();
    }
}

