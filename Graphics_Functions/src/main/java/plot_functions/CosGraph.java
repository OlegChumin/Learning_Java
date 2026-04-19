package plot_functions;

/**
 * В CosGraph был добавлен конструктор для инициализации полей width и height, а также метод draw(), который рисует
 * график функции cos на переданном графическом контексте g2. В PlotBySpline необходимо создать экземпляр класса
 * CosGraph и вызвать метод draw() внутри метода paintComponent().
 * */

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Path2D;

public class CosGraph extends JPanel {

    private int width;
    private int height;

    public CosGraph(Graphics2D g2, int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void draw(Graphics2D g2) {
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
        g2.drawString("cos(x)", width / 3, 3 * height / 5);
    }
}
