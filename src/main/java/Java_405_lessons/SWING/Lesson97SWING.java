package Java_405_lessons.SWING;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.util.Arrays;
import javax.swing.JFrame;

public class Lesson97SWING {
    public static void main(String[] args) {
        JFrame jFrameInMain = getFrame();
        Font font = new Font("", Font.BOLD, 20);
        String[] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        System.out.println(Arrays.toString(fonts));
    }

    static JFrame getFrame() {
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
        return jFrame;
    }
}
