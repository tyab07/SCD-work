package layered;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class StudentDAO {
    public Student getStudentByRoll(String rollNo) {
    	File file = new File(rollNo + ".txt"); // this is not working if i put the file in the package i put the file parallel to bin and src folder now it is working
        System.out.println("Looking for file: " + file.getAbsolutePath());  
        if (!file.exists()) {
            System.out.println("File not found!");
            return null;
        
        }

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            double totalGPA = 0.0;
            int count = 0;
            StringBuilder sb = new StringBuilder();

            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    String course = parts[0].trim();
                    double gpa = Double.parseDouble(parts[1].trim());
                    sb.append(course).append(": ").append(gpa).append("\n");
                    totalGPA += gpa;
                    count++;
                }
            }

            if (count > 0) {
                double cgpa = totalGPA / count;
                sb.append("\nCGPA: ").append(String.format("%.2f", cgpa));
                return new Student(rollNo, cgpa, sb.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
