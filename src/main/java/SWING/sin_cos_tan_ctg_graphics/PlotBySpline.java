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

        PlotLabels plotLabels = new PlotLabels();
        getContentPane().add(plotLabels, BorderLayout.NORTH);

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

                // Устанавливаем цвет для осей координат
                g2.setColor(Color.LIGHT_GRAY);

                // Рисуем горизонтальную линию на половине высоты окна
                // Первая точка линии находится в (0, height / 2), а вторая в (width, height / 2)
                g2.draw(new Line2D.Double(0, height / 2, width, height / 2));

                // Рисуем вертикальную линию на половине ширины окна
                // Первая точка линии находится в (width / 2, 0), а вторая в (width / 2, height)
                g2.draw(new Line2D.Double(width / 2, 0, width / 2, height));

                // Устанавливаем шрифт и размер для надписей на осях координат
                g2.setFont(new Font("Arial", Font.PLAIN, 12));

                // Рисуем надпись "1" на правой стороне горизонтальной оси координат
                g2.drawString("1", width - 20, height / 2 - 10);

                // Рисуем надпись "-1" на левой стороне горизонтальной оси координат
                g2.drawString("-1", 10, height / 2 - 10);

                // Рисуем надпись "1" на верхней стороне вертикальной оси координат
                g2.drawString("1", width / 2 + 10, 20);

                // Рисуем надпись "-1" на нижней стороне вертикальной оси координат
                g2.drawString("-1", width / 2 + 10, height - 10);


                // Отрисовка графика sin(x) через класс SinGraph
                SinGraph sinGraph = new SinGraph(g2, width, height);
                sinGraph.draw(g2);

                // График функции sin
                g2.setColor(Color.RED); // Задаем цвет графика - красный
                Path2D.Double pathSin = new Path2D.Double(); // Создаем объект для хранения пути графика
                for (double x = -5; x <= 5; x += 0.01) { // Начинаем цикл по x-координате графика, от -5 до 5 с шагом 0.01
                    double y = Math.sin(x); // Вычисляем значение функции sin(x) в текущей точке
                    int x1 = (int) ((x + 5) * width / 10); // Вычисляем пиксельную координату x1 в окне от -5 до 5
                    int y1 = (int) ((1 - y) * height / 2); // Вычисляем пиксельную координату y1 в окне от -1 до 1
                    if (x == -5) { // Если текущая точка - крайняя левая точка графика
                        pathSin.moveTo(x1, y1); // Устанавливаем начальную точку пути графика
                    } else { // Иначе
                        pathSin.lineTo(x1, y1); // Добавляем линию в путь графика от предыдущей точки до текущей
                    }
                }
                g2.draw(pathSin); // Отображаем график функции sin(x) в окне с помощью пути pathSin



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


                // График функции ctg
                CtgGraph.draw(g2, width, height);

                g2.drawString("sin(x)", width / 4, height / 5);
                g2.drawString("cos(x)", width / 2, height / 5);
                g2.drawString("tan(x)", 3 * width / 4, height / 5);
                g2.drawString("ctg(x)", width / 4, 4 * height / 5);

            }
        };

        getContentPane().add(graphPanel);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
