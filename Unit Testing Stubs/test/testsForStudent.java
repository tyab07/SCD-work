import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.sd.al.StudentDAOStub; // We are now using the dedicated Stub class
import com.sd.bll.studentBL;
import com.sd.dto.studentDTO;


public class testsForStudent {

    private static StudentDAOStub student_database_stub; // The dedicated stub instance
    private static studentBL bl;

    @BeforeAll
    static void setupDatabase() {
        
        student_database_stub = new StudentDAOStub();
        bl = new studentBL(student_database_stub);
    }

    @Test
    void testCountStudents() {
        int result = bl.countStudents();
        
       
        assertEquals(5, result, "Should return the count of students from the StudentDAOStub");
    }

    @Test
    void testCalcAvgCGPA() {
        double avg = bl.calcAvgCGPA();

        double expectedAverage = 3.55;
        
        assertEquals(expectedAverage, avg, 0.001, "Average CGPA should match the average of the stub data (3.55)");
    }

    @Test
    void testCalcAvgCGPA_EmptyList() {
       
        StudentDAOStub emptyDBStub = new StudentDAOStub() {
            @Override
            public List<studentDTO> getAllStudents() {
                return new ArrayList<>();
            }
        };

        // Create a new BL instance with the empty data stub
        studentBL emptyBL = new studentBL(emptyDBStub);
        double avg = emptyBL.calcAvgCGPA();

        assertEquals(0.0, avg, "If the stub returns no students, the average should be 0.0");
    }
}