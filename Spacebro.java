import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Window extends JFrame {
    public static final int WIDTH = 800, HEIGHT = 600;

    public Window() {
        setTitle("el juego de los pibardos en el espacio");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Window());
    }
}
