import java.awt.*;
import java.awt.event.*;

public class Gui extends Frame {
    private TextField txt1;
    private Button addBtn, subBtn, mulBtn, divBtn, powBtn, negBtn, factBtn, clearBtn, equalsBtn;
    private Button[] digitBtns;

    public Gui() {
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
        }

        this.setSize(300, 300);
        this.setLayout(new FlowLayout());
        this.add(txt1);
        for (int i = 0; i <= 9; i++) this.add(digitBtns[i]);
        this.add(addBtn); this.add(subBtn); this.add(mulBtn);
        this.add(divBtn); this.add(powBtn); this.add(negBtn);
        this.add(factBtn); this.add(clearBtn); this.add(equalsBtn);
    }
}
