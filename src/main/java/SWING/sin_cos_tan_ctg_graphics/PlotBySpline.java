package SWING.sin_cos_tan_ctg_graphics;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;
import java.awt.geom.Path2D;

public class PlotBySpline extends JFrame {

    private JPanel graphPanel;

    public PlotBySpline() {
        setTitle("Function Plot by Oleg Chumin");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        graphPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                Graphics2D g2 = (Graphics2D) g;
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                int width = getWidth();
                int height = getHeight();

                // Фон
                g2.setColor(Color.BLACK);
                g2.fillRect(0, 0, width, height);

                // Оси координат
                g2.setColor(Color.LIGHT_GRAY);
                g2.draw(new Line2D.Double(0, height / 2, width, height / 2));
                g2.draw(new Line2D.Double(width / 2, 0, width / 2, height));

                // Значения на осях координат
                g2.setFont(new Font("Arial", Font.PLAIN, 12));
                g2.drawString("1", width - 20, height / 2 - 10);
                g2.drawString("-1", 10, height / 2 - 10);
                g2.drawString("1", width / 2 + 10, 20);
                g2.drawString("-1", width / 2 + 10, height - 10);

                // График функции sin
                g2.setColor(Color.RED);
                Path2D.Double pathSin = new Path2D.Double();
                for (double x = -5; x <= 5; x += 0.01) {
                    double y = Math.sin(x);
                    int x1 = (int) ((x + 5) * width / 10);
                    int y1 = (int) ((1 - y) * height / 2);
                    if (x == -5) {
                        pathSin.moveTo(x1, y1);
                    } else {
                        pathSin.lineTo(x1, y1);
                    }
                }
                g2.draw(pathSin);

                // График функции cos
                g2.setColor(Color.GREEN);
                Path2D.Double pathCos = new Path2D.Double();
                for (double x = -5; x <= 5; x += 0.01) {
                    double y = Math.cos(x);
                    int x1 = (int) ((x + 5) * width / 10);
                    int y1 = (int) ((1 - y) * height / 2);
                    if (x == -5) {
                        pathCos.moveTo(x1, y1);
                    } else {
                        pathCos.lineTo(x1, y1);
                    }
                }
                g2.draw(pathCos);

                // График функции tan
                g2.setColor(Color.BLUE);
                Path2D.Double pathTan = new Path2D.Double();
                for (double x = -1.45; x <= 1.45; x += 0.01) {
                    double y = Math.tan(x);
                    int x1 = (int) ((x + 1.45) * width / 2.9);
                    int y1 = (int) ((1 - y) * height / 2);
                    if (x == -1.45) {
                        pathTan.moveTo(x1, y1);
                    } else {
                        pathTan.lineTo(x1, y1);
                    }
                }
                g2.draw(pathTan);

                // График функции ctg
                g2.setColor(Color.YELLOW);
                for (double x = 0.1; x <= Math.PI - 0.1; x += 0.001) {
                    double y = 1.0 / Math.tan(x);
                    int x1 = (int) (x * width / Math.PI);
                    int y1 = (int) ((1 - y) * height / 2);
                    g2.draw(new Line2D.Double(x1, y1, x1, y1));
                }
            }
        };

        getContentPane().add(graphPanel);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
