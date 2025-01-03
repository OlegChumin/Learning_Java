package SWING.sin_cos_tan_ctg_graphics.plot_functions;

/**
 * Данный код строит график функции ctg (котангенс) на основе последовательного рисования точек.
 * Основные комментарии:
 * <p>
 * g2.setColor(Color.YELLOW); - установка цвета для отрисовки графика
 * for (double x = 0.1; x <= Math.PI - 0.1; x += 0.001) { - цикл для перебора значений x.
 * Для каждого значения x вычисляется значение функции и рисуется соответствующая точка на графике.
 * double y = 1.0 / Math.tan(x); - вычисление значения функции для текущего x.
 * int x1 = (int) (x * width / Math.PI); - перевод координаты x в пиксели. Координата x на графике
 * принимает значения от 0 до π.
 * int y1 = (int) ((1 - y) * height / 2); - перевод координаты y в пиксели. Координата y на графике
 * принимает значения от - бесконечности до бесконечности.
 * g2.draw(new Line2D.Double(x1, y1, x1, y1)); - отрисовка точки на графике. Точка рисуется с помощью
 * линии длиной 0 пикселей.
 */

import java.awt.*;
import java.awt.geom.Line2D;
import java.awt.geom.Path2D;

public class CtgGraph {

    public static void draw(Graphics2D g2, int width, int height) {
        // Установка цвета для отрисовки графика
        g2.setColor(Color.YELLOW);

        // Цикл для перебора значений x
        for (double x = 0.1; x <= Math.PI - 0.1; x += 0.001) {
            // Вычисление значения функции ctg(x) для текущего x
            double y = 1.0 / Math.tan(x);

            // Перевод координаты x в пиксели
            int x1 = (int) (x * width / Math.PI);

            // Перевод координаты y в пиксели
            int y1 = (int) ((1 - y) * height / 2);

            // Отрисовка точки на графике с помощью линии длиной 0 пикселей
            g2.draw(new Line2D.Double(x1, y1, x1, y1));
            g2.drawString("ctg(x)", width / 2 + width / 8, 4 * height / 5);
        }
    }
}
