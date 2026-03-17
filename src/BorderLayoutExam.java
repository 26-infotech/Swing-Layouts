import javax.swing.*;
import java.awt.*;

public class BorderLayoutExam {
    public static void main(String[] args) {
        JFrame frame = new JFrame("BorderLayout");

        // BorderLayout
        frame.setLayout(new BorderLayout(5, 5)); // gap 적용

        // 5개 영역(NORTH, SOUTH, EAST, WEST, CENTER) 배치. 미지정 시 CENTER
        frame.add(new JButton("NORTH"),  BorderLayout.NORTH);
        frame.add(new JButton("SOUTH"),  BorderLayout.SOUTH);
        frame.add(new JButton("EAST"),   BorderLayout.EAST);
        frame.add(new JButton("WEST"),   BorderLayout.WEST);
        frame.add(new JButton("CENTER"), BorderLayout.CENTER);
        frame.add(new JButton("EMPTY"));

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}