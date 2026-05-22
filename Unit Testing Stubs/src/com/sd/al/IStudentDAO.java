package com.sd.al;

import com.sd.dto.studentDTO;
import java.util.List;


public interface IStudentDAO {
    
    
    List<studentDTO> getAllStudents();
}