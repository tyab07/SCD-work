
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
        // ... (UI Setup code)
        txt1 = new TextField(10);
        addBtn = new Button("+"); addBtn.setActionCommand("add");
        subBtn = new Button("-"); subBtn.setActionCommand("subtract");
        mulBtn = new Button("*"); mulBtn.setActionCommand("multiply");
        divBtn = new Button("/"); divBtn.setActionCommand("divide");
        powBtn = new Button("^"); powBtn.setActionCommand("power");
        negBtn = new Button("+/-"); negBtn.setActionCommand("negate");
        factBtn = new Button("!"); factBtn.setActionCommand("factorial");
        clearBtn = new Button("C"); clearBtn.setActionCommand("clear");
        equalsBtn = new Button("="); equalsBtn.setActionCommand("equals");
        digitBtns = new Button[10];
        for (int i = 0; i <= 9; i++) {
            digitBtns[i] = new Button(String.valueOf(i));
            digitBtns[i].setActionCommand(String.valueOf(i));
            digitBtns[i].addActionListener(this);
        }
        this.setSize(300, 300);
        this.setLayout(new FlowLayout());
        this.add(txt1);
        for (int i = 0; i <= 9; i++) this.add(digitBtns[i]);
        this.add(addBtn); this.add(subBtn); this.add(mulBtn); this.add(divBtn);
        this.add(powBtn); this.add(negBtn); this.add(factBtn); this.add(clearBtn);
        this.add(equalsBtn);
        addBtn.addActionListener(this); subBtn.addActionListener(this);
        mulBtn.addActionListener(this); divBtn.addActionListener(this);
        powBtn.addActionListener(this); negBtn.addActionListener(this);
        factBtn.addActionListener(this); clearBtn.addActionListener(this);
        equalsBtn.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        if (Character.isDigit(cmd.charAt(0)) && cmd.length() == 1) {
            txt1.setText(txt1.getText() + cmd);
        } else {
            switch (cmd) {
                case "add": case "subtract": case "multiply": case "divide": case "power":
                    operation = cmd;
                    number1 = txt1.getText();
                    txt1.setText("");
                    break;
                case "equals":
                    double n1 = Double.parseDouble(number1);
                    double n2 = Double.parseDouble(txt1.getText());
                    double res = 0;
                    if (operation.equals("add")) res = n1 + n2;
                    else if (operation.equals("subtract")) res = n1 - n2;
                    else if (operation.equals("multiply")) res = n1 * n2;
                    else if (operation.equals("divide")) res = n1 / n2;
                    else if (operation.equals("power")) res = Math.pow(n1, n2);
                    txt1.setText(String.valueOf(res));
                    break;
                case "clear": txt1.setText(""); break;
            }
        }
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.setVisible(true);
    }
}
