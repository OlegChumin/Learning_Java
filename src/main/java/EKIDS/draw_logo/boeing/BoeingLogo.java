package EKIDS.draw_logo.boeing;

import javax.swing.*;
import java.awt.*;

public class BoeingLogo extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Set the background color
        g2d.setBackground(Color.white);
        g2d.clearRect(0, 0, getWidth(), getHeight());

        // Draw the blue and white halves of the logo
        g2d.setColor(new Color(11, 61, 130)); // Boeing Blue
        g2d.fillRect(0, 0, getWidth() / 2, getHeight());
        g2d.setColor(Color.white);
        g2d.fillRect(getWidth() / 2, 0, getWidth() / 2, getHeight());

        // Draw the Boeing text in the center
        g2d.setColor(new Color(11, 61, 130)); // Boeing Blue
        g2d.setFont(new Font("Arial", Font.BOLD, 80));
        g2d.drawString("Boeing", getWidth() / 4 - 25, getHeight() / 2 + 25);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Boeing Logo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new BoeingLogo());
        frame.setSize(600, 400);
        frame.setVisible(true);
    }
}
