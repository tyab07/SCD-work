
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

// Author : M.Tayyab 
public class Calculator extends Frame implements ActionListener {
    private TextField txt1;
    private Button addBtn, subBtn, mulBtn, divBtn, powBtn, negBtn, factBtn, clearBtn;
    private Button equalsBtn;
    private Button[] digitBtns;
    private String number1;
    private String operation;

    public Calculator() {
        txt1 = new TextField(10);
        addBtn = new Button("+");
        subBtn = new Button("-");
        mulBtn = new Button("*");
        divBtn = new Button("/");
        powBtn = new Button("^");
        negBtn = new Button("+/-");
        factBtn = new Button("!");
        clearBtn = new Button("C");
        equalsBtn = new Button("=");
        digitBtns = new Button[10];
        for (int i = 0; i <= 9; i++) {
            digitBtns[i] = new Button(String.valueOf(i));
        }
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }
}
