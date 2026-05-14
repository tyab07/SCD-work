import java.awt.event.*;

public class Presenter implements ActionListener {
    private final Gui gui;
    private final Calculate calc;

    public Presenter(Gui gui, Calculate calc) {
        this.gui = gui;
        this.calc = calc;
        this.gui.addActionListener(this); 
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Placeholder
    }
}
