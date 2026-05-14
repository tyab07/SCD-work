
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
        addBtn.setActionCommand("add");

        subBtn = new Button("-");
        subBtn.setActionCommand("subtract");

        mulBtn = new Button("*");
        mulBtn.setActionCommand("multiply");

        divBtn = new Button("/");
        divBtn.setActionCommand("divide");

        powBtn = new Button("^");
        powBtn.setActionCommand("power");

        negBtn = new Button("+/-");
        negBtn.setActionCommand("negate");

        factBtn = new Button("!");
        factBtn.setActionCommand("factorial");

        clearBtn = new Button("C");
        clearBtn.setActionCommand("clear");

        equalsBtn = new Button("=");
        equalsBtn.setActionCommand("equals");

        digitBtns = new Button[10];
        for (int i = 0; i <= 9; i++) {
            digitBtns[i] = new Button(String.valueOf(i));
            digitBtns[i].setActionCommand(String.valueOf(i));
        }

        this.setSize(300, 300);
        this.setLocation(300, 300);
        this.setLayout(new FlowLayout());

        this.add(txt1);
        for (int i = 0; i <= 9; i++) {
            this.add(digitBtns[i]);
            digitBtns[i].addActionListener(this);
        }

        this.add(addBtn);
        this.add(subBtn);
        this.add(mulBtn);
        this.add(divBtn);
        this.add(powBtn);
        this.add(negBtn);
        this.add(factBtn);
        this.add(clearBtn);
        this.add(equalsBtn);

        addBtn.addActionListener(this);
        subBtn.addActionListener(this);
        mulBtn.addActionListener(this);
        divBtn.addActionListener(this);
        powBtn.addActionListener(this);
        negBtn.addActionListener(this);
        factBtn.addActionListener(this);
        clearBtn.addActionListener(this);
        equalsBtn.addActionListener(this);

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "0":
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
                txt1.setText(txt1.getText() + e.getActionCommand());
                break;
            case "add":
            case "subtract":
            case "multiply":
            case "divide":
            case "power":
                operation = e.getActionCommand();
                number1 = txt1.getText();
                txt1.setText("");
                break;
            case "negate":
                if (!txt1.getText().isEmpty()) {
                    double val = Double.parseDouble(txt1.getText());
                    txt1.setText(String.valueOf(-val));
                }
                break;
            case "factorial":
                if (!txt1.getText().isEmpty()) {
                    int num = Integer.parseInt(txt1.getText());
                    int fact = 1;
                    for (int i = 2; i <= num; i++) {
                        fact *= i;
                    }
                    txt1.setText(String.valueOf(fact));
                }
                break;
            case "clear":
                txt1.setText("");
                break;
            case "equals":
                double num1 = Double.parseDouble(number1);
                double num2 = Double.parseDouble(txt1.getText());
                double result = 0;
                if (operation.equals("add"))
                    result = num1 + num2;
                else if (operation.equals("subtract"))
                    result = num1 - num2;
                else if (operation.equals("multiply"))
                    result = num1 * num2;
                else if (operation.equals("divide"))
                    result = num1 / num2;
                else if (operation.equals("power"))
                    result = Math.pow(num1, num2);
                txt1.setText(String.valueOf(result));
                break;
        }
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.setVisible(true);
    }
}


