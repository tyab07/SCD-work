package layered;
public class StudentService {
    private StudentDAO studentDAO;

    public StudentService() {
        this.studentDAO = new StudentDAO();
    }

    public Student findStudent(String rollNo) {
        return studentDAO.getStudentByRoll(rollNo);
    }
}
