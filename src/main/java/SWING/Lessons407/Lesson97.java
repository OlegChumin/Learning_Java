package SWING.Lessons407;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lesson97 {
    public static final int WINDOW_WIDTH = 800; // pixels
    public static final int WINDOW_HEIGHT = 600; // pixels

    public static void main(String[] args) {
        getSystemFonts(); // выводим список все системных шрифтов в консоль
        JFrame newWindow = buildWindow(); // запускаем окно
        newWindow.add(new MyComponent()); // добавляем JComponent  в наше окно
    }

    private static JFrame buildWindow() {
        JFrame jFrame = new JFrame(); // создаем экземпляр (новый объект) типа класса JFrame
        jFrame.setTitle("This is new Title"); // переписываем текст в заголовке окна, можно при создании объекта
        // передать в конструкторе тоже
        jFrame.setVisible(true); // включаем видимость окна
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize(); // получение размера окна
        jFrame.setBounds(dimension.width / 2 - WINDOW_WIDTH / 2, dimension.height / 2 - WINDOW_HEIGHT / 2,
                WINDOW_WIDTH, WINDOW_HEIGHT); // задаем границы окна строго по центру
        jFrame.setResizable(false); // запрещаем изменять размер окна
//        jFrame.setIconImage(new Image(""));  // добавить новую иконку вместо иконки Дюка
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // устанавливаем default операция при закрытии окна
        return jFrame;
    }

    // добавляем текст в окно
    private static class MyComponent extends JComponent {
        @Override
        public void paint(Graphics g) {
            Font font = new Font("Tahoma", Font.BOLD, 25);
            Graphics2D g2 = (Graphics2D) g;
            g2.setFont(font);
            String str = "Hello World";
            g2.drawString(str, 20, 30); // поменять на
            // пикселы размеров текста

            // рисования линий
            Line2D newLine1 = new Line2D.Double(70, 70, 90, 90);
            Line2D newLine2 = new Line2D.Double(90, 90, 110, 70);
            Line2D newLine3 = new Line2D.Double(110, 70, 130, 90);
            Line2D newLine4 = new Line2D.Double(130, 90, 150, 70);
            Line2D newLine5 = new Line2D.Double(150, 70, 170, 90);
            Line2D newLine6 = new Line2D.Double(170, 90, 190, 70);
            g2.draw(newLine1);
            g2.draw(newLine2);
            g2.draw(newLine3);
            g2.draw(newLine4);
            g2.draw(newLine5);
            g2.draw(newLine6);

            // создание линий по точкам
            Point2D p1 = new Point2D.Double(100, 100);
            Point2D p2 = new Point2D.Double(200, 200);
            Line2D line2D = new Line2D.Double(p1, p2);
            g2.draw(line2D);

            // рисование эллипсов
            Ellipse2D ellipse2D = new Ellipse2D.Double(70, 70, 170, 170);
            g2.draw(ellipse2D);

            // рисование эллипса и закрашивание его зеленым цветом
            Ellipse2D filledEllipse2D = new Ellipse2D.Double(170, 70, 170, 120);
            g2.draw(filledEllipse2D);
            g2.setColor(Color.GREEN);
            g2.fill(filledEllipse2D);

            //рисование прямоугольника
            g2.setColor(Color.RED);
            Rectangle2D r2 = new Rectangle2D.Double(70, 70, 170, 170);
            g2.draw(r2);

            //вывод изображения из файла
            String path = "src/main/java/Java/SWING/Lessons407/MyIcon.png";
            Image imageFromFile = new ImageIcon(path).getImage();
            g2.drawImage(imageFromFile, 20, 50, null);

            //вывод изображения по URL ссылке
            try {
                URL url = new URL("https://www.oracle.com/a/ocom/img/cb71-java-logo.png");
                Image image = new ImageIcon(url).getImage();
                g2.drawImage(image, 200, 200, null);
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private static void getSystemFonts() {
        List<String> arrayList = new ArrayList<>();
        arrayList.addAll(Arrays.asList(GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames())); // получить
        // список всех шрифтов в системе и вывести его на экран
        arrayList.forEach(element -> System.out.println(element));
    }
}
