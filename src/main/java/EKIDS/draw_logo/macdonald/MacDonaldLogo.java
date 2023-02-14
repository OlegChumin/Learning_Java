package EKIDS.draw_logo.macdonald;

import javax.swing.*;
import java.awt.*;

public class MacDonaldLogo extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Set the background color
        g2d.setBackground(Color.white);
        g2d.clearRect(0, 0, getWidth(), getHeight());

        // Draw the red and yellow halves of the logo
        g2d.setColor(new Color(0xDD2027)); // McDonald's Red
        g2d.fillOval(getWidth() / 2 - 100, getHeight() / 2 - 100, 200, 200);
        g2d.setColor(new Color(0xFFC72C)); // McDonald's Yellow
        g2d.fillOval(getWidth() / 2 - 90, getHeight() / 2 - 90, 180, 180);

        // Draw the "M" letter in the center
        g2d.setColor(new Color(0xDD2027)); // McDonald's Red
        int[] xPoints = {getWidth() / 2 - 60, getWidth() / 2, getWidth() / 2 + 60};
        int[] yPoints = {getHeight() / 2 + 25, getHeight() / 2 - 25, getHeight() / 2 + 25};
        g2d.fillPolygon(xPoints, yPoints, xPoints.length);
        g2d.setColor(Color.white);
        g2d.fillRect(getWidth() / 2 - 20, getHeight() / 2 - 25, 40, 50);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("MacDonald Logo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new MacDonaldLogo());
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
}