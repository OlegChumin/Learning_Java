package org.mouse_cursor_v3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MouseCursorDemo {
    private static int redCircleX = 300;
    private static int redCircleY = 300;
    private static int blueCircleX = 600;
    private static int blueCircleY = 300;
    private static int circleRadius = 50;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Mouse Cursor Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.add(new DrawPanel());

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0); // Завершить программу при закрытии окна
            }
        });

        frame.setVisible(true);

        Timer timer = new Timer(3000, new ActionListener() {
            private boolean redToBlue = true;

            @Override
            public void actionPerformed(ActionEvent e) {
                if (redToBlue) {
                    redToBlue = false;
                    moveMouse(blueCircleX, blueCircleY);
                } else {
                    redToBlue = true;
                    moveMouse(redCircleX, redCircleY);
                }
            }
        });

        timer.start();
    }

    private static void moveMouse(int x, int y) {
        try {
            Robot robot = new Robot();
            robot.mouseMove(x, y);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    static class DrawPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            drawCircle(g, redCircleX, redCircleY, Color.RED);
            drawCircle(g, blueCircleX, blueCircleY, Color.BLUE);
        }

        private void drawCircle(Graphics g, int x, int y, Color color) {
            g.setColor(color);
            g.fillOval(x - circleRadius, y - circleRadius, 2 * circleRadius, 2 * circleRadius);
        }
    }
}
