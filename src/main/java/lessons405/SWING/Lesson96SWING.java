package lessons405.SWING;

import javax.swing.*;
import java.awt.*;
import java.util.Calendar;
import java.util.Date;

public class Lesson96SWING {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame() {          // создаем ненативное окно
        };
        jFrame.setVisible(true);                // ставим флаг видимости
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // уловие закрытие при выходе
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();

        jFrame.setSize(400, 300);                   // задаем размер окна
//        jFrame.setLocation(500, 300);                     // задаем начальное положение левого верхнего угла
        jFrame.setBounds(dimension.width/2-200,dimension.height/2-150, 400, 300); //начальное положение по отсутупам от левой границы и от верха
        jFrame.setTitle(String.format("Oleg Chumin Title"));  // заголовок окна


    }
}
