package com.sd.al;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.sd.dto.studentDTO;


public class studentDAO {
    private String url = "jdbc:mysql://localhost:3306/student_database";
    private String user = "root"; 
    private String password = ""; 

    public List<studentDTO> getAllStudents() {
        List<studentDTO> students = new ArrayList<>();
        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM student")) {

            while (rs.next()) {
            	studentDTO s = new studentDTO(
                    rs.getInt("id"),
                    rs.getString("roll_no"),
                    rs.getString("name"),
                    rs.getDouble("cgpa")
                );
                students.add(s);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return students;
    }
}
