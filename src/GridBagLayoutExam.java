import javax.swing.*;
import java.awt.*;

public class GridBagLayoutExam {

    private static GridBagConstraints createGbc(int x, int y, int w, int h, int fill) {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = x;
        gbc.gridy = y;
        gbc.gridwidth = w;
        gbc.gridheight = h;
        
        gbc.fill = fill;
        gbc.insets = new Insets(5, 5, 5, 5);
        return gbc;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("GridBagLayout");
        frame.setLayout(new GridBagLayout());
        
        // GridBagLayout에서는 GridBagConstraints 규칙을 만들어 적용해야함
        frame.add(new JButton("Button 1"), createGbc(0, 0, 1, 1, GridBagConstraints.NONE));
        frame.add(new JButton("Button 2"), createGbc(1, 0, 1, 1, GridBagConstraints.NONE));
        frame.add(new JButton("Button 3"), createGbc(0, 1, 2, 1, GridBagConstraints.HORIZONTAL));
        frame.add(new JButton("Button 4"), createGbc(2, 0, 1, 2, GridBagConstraints.VERTICAL));
        GridBagConstraints gbc5 = createGbc(0, 2, 3, 1, GridBagConstraints.HORIZONTAL);
        gbc5.weightx = 1.0;
        frame.add(new JButton("Button 5"), gbc5);
        
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}