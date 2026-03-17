import javax.swing.*;
import java.awt.*;

public class GridBagLayoutWeightExam {
    private static GridBagConstraints createGbc(int x, int y, int w, int h, int fill, double wx, double wy) {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = x;
        gbc.gridy = y;
        gbc.gridwidth = w;
        gbc.gridheight = h;
        gbc.fill = fill;
        gbc.weightx = wx;
        gbc.weighty = wy;
        gbc.insets = new Insets(5, 5, 5, 5);
        return gbc;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("GridBagLayout - weight");
        frame.setLayout(new GridBagLayout());

        frame.add(new JButton("wx=1"), createGbc(0, 0, 1, 1, GridBagConstraints.HORIZONTAL, 1.0, 0));
        frame.add(new JButton("wx=2"), createGbc(1, 0, 1, 1, GridBagConstraints.HORIZONTAL, 2.0, 0));
        frame.add(new JButton("wx=1"), createGbc(2, 0, 1, 1, GridBagConstraints.HORIZONTAL, 1.0, 0));

        frame.add(new JButton("wy=1"), createGbc(0, 1, 1, 1, GridBagConstraints.VERTICAL,   0, 1.0));
        frame.add(new JButton("wy=2"), createGbc(1, 1, 1, 1, GridBagConstraints.HORIZONTAL, 0, 2.0));
        frame.add(new JButton("wy=1"), createGbc(2, 1, 1, 1, GridBagConstraints.VERTICAL,   0, 1.0));

        frame.add(new JButton("wx=1, wy=1"), createGbc(0, 2, 3, 1, GridBagConstraints.BOTH, 1.0, 1.0));

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}