package Java_405_lessons.SWING;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

public class LessonSWING02 {
    public static void main(String[] args) {
        JFrame newWindow = getWindow();
        newWindow.add(new MyComponent());

    }

    private static JFrame getWindow() {
        int width, height;
        Toolkit toolkit = Toolkit.getDefaultToolkit(); // набор инструментов для работы с экранами
        Dimension dimension = toolkit.getScreenSize(); // получаем размер экрана
        JFrame window = new JFrame();
        window.setTitle("Oleg's window");
        width = dimension.width;
        height = dimension.height;
        window.setBounds(width / 4, height / 4, width / 2, height / 2);
        window.setVisible(true);
        window.setResizable(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        return window;
    }

    static class MyComponent extends JComponent {
        @Override
        protected void paintComponent(Graphics graphicsObect) {
            Font font = new Font("Arial Black", Font.BOLD, 77); // устанавливаем шрифт
            Graphics2D graphics2D = (Graphics2D) graphicsObect; // откастили до Graphics2D поскольку Graphics2D это абстрактный класс,
            // то объекты напрямую от него создать невозможно
            graphics2D.setFont(font);
            graphics2D.drawString("DarkNetXakep", 20, 77);

            for (int i = 0; i < 7; i++) {
                int j = 5 * i;
                Line2D line2D = new Line2D.Double(20, 95 + j, 725, 95 + j);
                graphics2D.draw(line2D);
            }
            Ellipse2D el = new Ellipse2D.Double(50, 150, 150, 150);
            graphics2D.draw(el);
            graphics2D.setPaint(new Color(255, 0, 0)); //сделали цвет красный
            graphics2D.fill(el);

            Ellipse2D el2 = new Ellipse2D.Double(250, 150, 50, 150);
            graphics2D.draw(el2);
            graphics2D.setPaint(new Color(0, 255, 0)); //сделали цвет зеленый
            graphics2D.fill(el2);

            Ellipse2D el3 = new Ellipse2D.Double(350, 150, 150, 50);
            graphics2D.draw(el);
            graphics2D.setPaint(Color.BLUE); //сделали синий цвет
            graphics2D.fill(el3);

            Rectangle2D rec4 = new Rectangle2D.Double(550, 150, 150, 150);
            graphics2D.draw(rec4);
            graphics2D.setPaint(Color.YELLOW); //сделали желтый цвет
            graphics2D.fill(rec4);

        }
    }

    private static void getAvailableFonts() {
        String[] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        for (String element : fonts) {
            System.out.println(element);
        }
    }
}
