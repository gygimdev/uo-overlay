import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {

            OverlayFrame frame = new OverlayFrame();
            frame.setVisible(true);
        });
    }
}