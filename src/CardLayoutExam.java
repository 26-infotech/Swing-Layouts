import javax.swing.*;
import java.awt.*;

public class CardLayoutExam {
    public static void main(String[] args) {
        JFrame frame = new JFrame("CardLayout");
        frame.setLayout(new BorderLayout());

        // CardLayout
        CardLayout cardLayout = new CardLayout();
        JPanel cardPanel = new JPanel(cardLayout);

        // 각 카드(패널)에 이름 붙여서 추가
        JPanel card1 = new JPanel();
        card1.add(new JButton("Card 1 - Button A"));
        card1.add(new JButton("Card 1 - Button B"));

        JPanel card2 = new JPanel();
        card2.add(new JButton("Card 2 - Button C"));
        card2.add(new JButton("Card 2 - Button D"));

        JPanel card3 = new JPanel();
        card3.add(new JButton("Card 3 - Button E"));

        cardPanel.add(card1, "CARD1"); // 추후 설정한 이름으로 전환 가능
        cardPanel.add(card2, "CARD2");
        cardPanel.add(card3, "CARD3");

        // 카드 전환 버튼
        JPanel controlPanel = new JPanel();
        JButton prevBtn = new JButton("◀ Prev");
        JButton resetBtn = new JButton("CARD1");
        JButton nextBtn = new JButton("Next ▶");

        prevBtn.addActionListener(e -> cardLayout.previous(cardPanel));
        resetBtn.addActionListener(e -> cardLayout.show(cardPanel, "CARD1"));
        nextBtn.addActionListener(e -> cardLayout.next(cardPanel));

        controlPanel.add(prevBtn);
        controlPanel.add(resetBtn);
        controlPanel.add(nextBtn);

        frame.add(cardPanel, BorderLayout.CENTER);
        frame.add(controlPanel, BorderLayout.SOUTH);

        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}