public class Calculator {
    public static void main(String[] args) {
        Calculate cal = new Calculate();   
        Gui gui = new Gui();               
        new Presenter(gui, cal);           
        gui.setVisible(true);
    }
}
