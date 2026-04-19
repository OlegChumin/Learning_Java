package org.mouse_cursor_v4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MouseCursorDemo {
    private static int windowWidth = 800;
    private static int windowHeight = 600;
    private static int circleRadius = 100;
    private static int circleY = windowHeight / 2;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Mouse Cursor Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(windowWidth, windowHeight);
        frame.add(new DrawPanel());

        frame.setLocationRelativeTo(null);

        frame.setVisible(true);

        Timer timer = new Timer(3000, new ActionListener() {
            private boolean redToBlue = true;
            private boolean moveToCenter = false;

            @Override
            public void actionPerformed(ActionEvent e) {
                int circleX1 = windowWidth / 4;
                int circleX2 = 3 * windowWidth / 4;

                if (redToBlue) {
                    if (moveToCenter) {
                        moveMouse(circleX1, circleY);
                        moveToCenter = false;
                    } else {
                        moveMouse(circleX2, circleY);
                        moveToCenter = true;
                        redToBlue = false;
                    }
                } else {
                    if (moveToCenter) {
                        moveMouse(circleX2, circleY);
                        moveToCenter = false;
                    } else {
                        moveMouse(circleX1, circleY);
                        moveToCenter = true;
                        redToBlue = true;
                    }
                }

                frame.repaint();
            }
        });

        timer.setInitialDelay(0);
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

            int circleX1 = windowWidth / 4;
            int circleX2 = 3 * windowWidth / 4;

            drawCircle(g, circleX1, circleY, Color.RED);
            drawCircle(g, circleX2, circleY, Color.BLUE);
        }

        private void drawCircle(Graphics g, int x, int y, Color color) {
            g.setColor(color);
            g.fillOval(x - circleRadius, y - circleRadius, 2 * circleRadius, 2 * circleRadius);
        }
    }
}
