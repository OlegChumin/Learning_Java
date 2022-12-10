package lessons405.SWING;

import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageProducer;

public class LessonSWING01 { // в AWT было нативное, через операционную систему создание оболочек и элементов
    public static void main(String[] args) {
        JFrame window = new JFrame(); // создаем объект JFrame
        window.setVisible(true); // ставим флаг видимости
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // условие выхода при закрытии
        window.setSize(800, 600); // задаем размер окна
        window.setLocation(400, 200); // задаем местоположение по верхнему левому углу
//        window.setBounds(); // создает по прямоугольнику или с казание верхнего левого угла и длины, ширины
//        window.setIconImage(iconImage);  можно бобавить свою иконку через Image class
        window.setTitle("First Oleg's window");
        window.setResizable(false); // нельзя изменить размер
    }
}
