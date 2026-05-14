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
        try {
            String cmd = e.getActionCommand();
            switch (cmd) {
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
                    gui.setText(gui.getText() + cmd);
                    break;

                case "add":
                case "subtract":
                case "multiply":
                case "divide":
                case "power":
                    operation = cmd;
                    number1 = gui.getText();
                    gui.setText("");
                    break;

                case "negate":
                    if (!gui.getText().isEmpty()) {
                        double val = Double.parseDouble(gui.getText());
                        gui.setText(String.valueOf(calc.negate(val)));
                    }
                    break;

                case "factorial":
                    if (!gui.getText().isEmpty()) {
                        int num = Integer.parseInt(gui.getText());
                        gui.setText(String.valueOf(calc.factorial(num)));
                    }
                    break;

                case "clear":
                    gui.setText("");
                    break;

                case "equals":
                    double num1 = Double.parseDouble(number1);
                    double num2 = Double.parseDouble(gui.getText());
                    double result = 0;

                    if (operation.equals("add")) result = calc.add(num1, num2);
                    else if (operation.equals("subtract")) result = calc.subtract(num1, num2);
                    else if (operation.equals("multiply")) result = calc.multiply(num1, num2);
                    else if (operation.equals("divide")) result = calc.divide(num1, num2);
                    else if (operation.equals("power")) result = calc.power(num1, num2);

                    gui.setText(String.valueOf(result));
                    break;
            }
        } catch (Exception ex) {
            gui.setText("Error");
        }
    }
}
