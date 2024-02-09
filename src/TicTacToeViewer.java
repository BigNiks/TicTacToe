import javax.swing.*;
import java.awt.*;

public class TicTacToeViewer extends JFrame {
    public static final int WINDOW_WIDTH = 600,
                            WINDOW_HEIGHT = 600;
    private TicTacToe t;

    private Image[] images;
    public TicTacToeViewer(TicTacToe a) {
        t = a;
        images = new Image[2];
        images[0] = new ImageIcon("Resources/O.png").getImage();
        images[1] = new ImageIcon("Resources/X.png").getImage();
        this.setTitle("TIC TAC TOE");
        this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public Image getImage(int num) {
        return images[num];
    }

    public void paint(Graphics g) {
        g.setColor(Color.white);
        g.fillRect(0, 0, WINDOW_WIDTH, WINDOW_HEIGHT);

        for (int i = 0; i < t.getBoard().length; i++) {
            for (int j = 0; j < t.getBoard().length; j++) {
                t.getBoard()[i][j].draw(g);
            }
        }
    }
}
