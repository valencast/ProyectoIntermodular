import javax.swing.JFrame;
import javax.swing.JButton;

public class Interfaz {
    public Interfaz() {
        JFrame frame = new JFrame("Interfaz");
        JButton button = new JButton("Haz Click");

        frame.add(button);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

