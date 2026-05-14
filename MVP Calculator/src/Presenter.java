import java.awt.event.*;

public class Presenter implements ActionListener {
    private final Gui gui;
    private final Calculate calc;
    private String number1;
    private String operation;

    public Presenter(Gui gui, Calculate calc) {
        this.gui = gui;
        this.calc = calc;
        this.gui.addActionListener(this); 
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        if (cmd.length() == 1 && Character.isDigit(cmd.charAt(0))) {
            gui.setText(gui.getText() + cmd);
        } else if (cmd.equals("add") || cmd.equals("subtract") || cmd.equals("multiply") || cmd.equals("divide") || cmd.equals("power")) {
            operation = cmd;
            number1 = gui.getText();
            gui.setText("");
        }
    }
}
