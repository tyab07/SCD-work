package com.sd.al;

import com.sd.dto.studentDTO;
import java.util.ArrayList;
import java.util.List;


public class StudentDAOStub implements IStudentDAO {

    @Override
    public List<studentDTO> getAllStudents() {
        List<studentDTO> students = new ArrayList<>();

        // --- DUMMY DATA ---
        students.add(new studentDTO(101, "R001", "Alice Johnson", 3.5));
        students.add(new studentDTO(102, "R002", "Bob Smith", 4.0));
        students.add(new studentDTO(103, "R003", "Charlie Brown", 3.0));
        students.add(new studentDTO(104, "R004", "Diana Prince", 3.5));
        students.add(new studentDTO(105, "R005", "Eve Adams", 3.75));
       

        return students;
    }
}