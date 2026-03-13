import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        //Llamar a la interfaz gráfica
        SwingUtilities.invokeLater(() -> {
            new Interfaz();
        });
    }
}
