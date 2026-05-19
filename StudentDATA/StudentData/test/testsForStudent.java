import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.sd.al.studentDAO;
import com.sd.bll.studentBL;
import com.sd.dto.studentDTO;

public class testsForStudent {

    private static studentDAO student_database;   // acts as our data source
    private static studentBL bl;

    @BeforeAll
    static void setupDatabase() {
        // Initialize sample data (simulate real database)
        student_database = new studentDAO() {
            private List<studentDTO> students = new ArrayList<>();

            {
                // Sample dataset = "student_database"
                students.add(new studentDTO(1, "20F-001", "Ali", 3.6));
                students.add(new studentDTO(2, "20F-002", "Anas", 3.8));
                students.add(new studentDTO(3, "20F-003", "Tayyab", 3.0));
                students.add(new studentDTO(4, "20F-004", "Usman", 2.9));
            }

            @Override
            public List<studentDTO> getAllStudents() {
                return students;
            }
        };

        // Inject dependency manually (Dependency Injection)
        bl = new studentBL(student_database);
    }

    @Test
    void testCountStudents() {
        int result = bl.countStudents();
        assertEquals(4, result, "Should return total number of students in database");
    }

    @Test
    void testCalcAvgCGPA() {
        double avg = bl.calcAvgCGPA();

        // Manually compute: (3.6 + 3.8 + 3.0 + 2.9) / 4 = 3.325
        assertEquals(3.325, avg, 0.001, "Average CGPA should be 3.325");
    }

    @Test
    void testCalcAvgCGPA_EmptyList() {
        // Create a temporary BLL with empty data
        studentDAO emptyDB = new studentDAO() {
            @Override
            public List<studentDTO> getAllStudents() {
                return new ArrayList<>();
            }
        };

        studentBL emptyBL = new studentBL(emptyDB);
        double avg = emptyBL.calcAvgCGPA();

        assertEquals(0.0, avg, "If no students, average should be 0.0");
    }
}