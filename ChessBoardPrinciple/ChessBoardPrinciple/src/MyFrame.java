import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    public static final int SCREEN_WIDTH = 800;
    public static final int SCREEN_HEIGHT = 800;

    public MyFrame(){

        this.setTitle("Chessboard");
        this.setSize(SCREEN_WIDTH, SCREEN_HEIGHT);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.setLayout(new GridLayout(8, 8));

        for (int line = 0; line < 8; line++) {
            for (int coll = 0; coll < 8; coll++) {

                JPanel tile = new JPanel();

                if ((line + coll) % 2 == 0){

                    tile.setBackground(Color.WHITE);
                }
                else {
                    tile.setBackground(Color.BLACK);
                }
                this.add(tile);
            }
        }


        this.setVisible(true);
    }

}
