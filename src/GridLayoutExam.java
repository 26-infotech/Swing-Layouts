import javax.swing.*;
import java.awt.*;

public class GridLayoutExam {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GridLayout");

        // GridLayout
        frame.setLayout(new GridLayout(3, 3, 5, 5)); // 3행 3열, hgap=5, vgap=5

        for (int i = 1; i <= 9; i++) {
            frame.add(new JButton("Button " + i));
        }

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}