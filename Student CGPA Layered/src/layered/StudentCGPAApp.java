package layered;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class StudentCGPAApp extends JFrame {
    private JTextField rollInput;
    private JTextArea outputArea;
    private JButton searchButton;
    private StudentService studentService;

    public StudentCGPAApp() {
        studentService = new StudentService();

        setTitle("Student CGPA Calculator");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel topPanel = new JPanel(new FlowLayout());
        topPanel.add(new JLabel("Roll Number:"));
        rollInput = new JTextField(15);
        topPanel.add(rollInput);
        searchButton = new JButton("Search");
        topPanel.add(searchButton);

        outputArea = new JTextArea();
        outputArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(outputArea);

        add(topPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        searchButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String rollNo = rollInput.getText().trim();
                if (!rollNo.isEmpty()) {
                    displayStudentData(rollNo);
                }
            }
        });
    }

    private void displayStudentData(String rollNo) {
        Student student = studentService.findStudent(rollNo);
        if (student == null) {
            outputArea.setText("No data found for roll number: " + rollNo);
        } else {
            outputArea.setText(student.getDetails());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new StudentCGPAApp().setVisible(true);
        });
    }
}
