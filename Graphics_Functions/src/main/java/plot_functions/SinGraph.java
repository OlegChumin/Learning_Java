package plot_functions;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Path2D;

public class SinGraph extends JPanel {
    // Поля класса: ширина и высота
    private int width;
    private int height;

    // Конструктор класса, принимающий объект Graphics2D, ширину и высоту окна для отрисовки графика
    public SinGraph(Graphics2D g2, int width, int height) {
        this.width = width;
        this.height = height;
    }

    // Метод draw, который отвечает за отрисовку графика функции sin(x) с помощью переданного объекта Graphics
    public void draw(Graphics g) {
        // Приводим объект Graphics к объекту Graphics2D
        Graphics2D g2 = (Graphics2D) g;
        // Задаем цвет графика - красный
        g2.setColor(Color.RED);
        // Создаем объект для хранения пути графика
        Path2D.Double pathSin = new Path2D.Double();
        // Начинаем цикл по x-координате графика, от -5 до 5 с шагом 0.01
        for (double x = -5; x <= 5; x += 0.01) {
            // Вычисляем значение функции sin(x) в текущей точке
            double y = Math.sin(x);
            // Вычисляем пиксельную координату x1 в окне от -5 до 5
            int x1 = (int) ((x + 5) * width / 10);
            // Вычисляем пиксельную координату y1 в окне от -1 до 1
            int y1 = (int) ((1 - y) * height / 2);
            // Если текущая точка - крайняя левая точка графика, устанавливаем начальную точку пути графика
            if (x == -5) {
                pathSin.moveTo(x1, y1);
            } else { // Иначе добавляем линию в путь графика от предыдущей точки до текущей
                pathSin.lineTo(x1, y1);
            }
        }
        // Отображаем график функции sin(x) в окне с помощью пути pathSin
        g2.drawString("sin(x)", width / 7, height / 5);
        g2.draw(pathSin);
    }
}
