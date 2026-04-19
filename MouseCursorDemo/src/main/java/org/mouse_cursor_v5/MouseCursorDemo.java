package org.mouse_cursor_v5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MouseCursorDemo {
    private static int circleRadius = 100;
    private static int circleY = 300;
    private static int circleX1 = 200;
    private static int circleX2 = 600;
    private static boolean moveToRed = true;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Mouse Cursor Demo - Oleg Chumin");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.add(new DrawPanel());

        frame.setLocationRelativeTo(null);

        frame.setVisible(true);

        Timer timer = new Timer(3000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (moveToRed) {
                    moveMouse(frame, circleX1, circleY);
                    moveToRed = false;
                } else {
                    moveMouse(frame, circleX2, circleY);
                    moveToRed = true;
                }

                frame.repaint();
            }
        });

        timer.setInitialDelay(0);
        timer.start();
    }

    private static void moveMouse(JFrame frame, int x, int y) {
        Point windowLocation = frame.getLocationOnScreen();
        try {
            Robot robot = new Robot();
            robot.mouseMove(windowLocation.x + x, windowLocation.y + y);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    static class DrawPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            drawCircle(g, circleX1, circleY, Color.RED);
            drawCircle(g, circleX2, circleY, Color.BLUE);
        }

        private void drawCircle(Graphics g, int x, int y, Color color) {
            g.setColor(color);
            g.fillOval(x - circleRadius, y - circleRadius, 2 * circleRadius, 2 * circleRadius);
        }
    }
}
