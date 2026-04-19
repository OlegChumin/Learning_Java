package plot_functions;

/**
 * Класс для построения графика функции tan(x).
 * Основные комментарии:
 * private int width; - поле для хранения ширины панели
 * private int height; - поле для хранения высоты панели
 * public TanGraph(Graphics2D g2, int width, int height) - конструктор, который инициализирует ширину и высоту панели.
 * Graphics2D g2 не используется в данном классе, но передается в конструктор для дальнейшей работы с графиком.
 * this.width = width; и this.height = height; - инициализация ширины и высоты панели.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Path2D;

public class TanGraph extends JPanel {

    private int width;
    private int height;

    public TanGraph(Graphics2D g2, int width, int height) {
        this.width = width;
        this.height = height;
    }

    public static void draw(Graphics g, int width, int height) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.BLUE); // устанавливаем цвет линии графика в синий
        Path2D.Double pathTan = new Path2D.Double(); // создаем объект pathTan для рисования графика функции
        for (double x = -1.45; x <= 1.45; x += 0.01) { // цикл для прохода по значениям аргумента x функции tan
            double y = Math.tan(x); // вычисляем значение функции для данного x
            int x1 = (int) ((x + 1.45) * width / 2.9); // вычисляем координату x точки на графике
            int y1 = (int) ((1 - y) * height / 2); // вычисляем координату y точки на графике
            if (x == -1.45) { // если это первая точка на графике
                pathTan.moveTo(x1, y1); // перемещаем перо в эту точку
            } else { // иначе
                pathTan.lineTo(x1, y1); // проводим линию из предыдущей точки в текущую
            }
        }
        g2.draw(pathTan); // рисуем график функции на панели с помощью объекта pathTan
        g2.drawString("tag(x)", width / 2 + width / 8, height / 5);
    }
}