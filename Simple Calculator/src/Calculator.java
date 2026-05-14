
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

    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        if (cmd.length() == 1 && Character.isDigit(cmd.charAt(0))) {
            txt1.setText(txt1.getText() + cmd);
        }
    }
}
