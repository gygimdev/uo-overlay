import javax.swing.*;

/**
 * main frame 담당
 */
public class OverlayFrame extends JFrame {

    private static final int DEFAULT_WIDTH = 400;
    private static final int DEFAULT_HEIGHT = 300;

    public OverlayFrame() {
        super("uo range overlay");
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void attackMenu(JPopupMenu menu) {
        getRootPane()
                .setComponentPopupMenu(menu);

    }
}
