import javax.swing.*;
import java.awt.*;

public class BoxLayoutExam {
    public static void main(String[] args) {
        JFrame frame = new JFrame("BoxLayout");

        // BoxLayout
        // Frame에 직접 적용 불가. panel 등을 만들어 contentPane에 적용해야 함
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        panel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

        panel.add(new JButton("Button 1"));
        panel.add(Box.createVerticalStrut(10));
        panel.add(new JButton("Button 2"));
        panel.add(Box.createVerticalStrut(10));
        panel.add(new JButton("Button 3"));
        panel.add(Box.createVerticalGlue());
        panel.add(new JButton("Button 4 (bottom)"));

        frame.add(panel);
        frame.setSize(200, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}