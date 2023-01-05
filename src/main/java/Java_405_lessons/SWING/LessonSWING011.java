package Java_405_lessons.SWING;

import javax.swing.*;
import java.awt.*;

public class LessonSWING011 {
    public static void main(String[] args) {
        int width, height;

        Toolkit toolkit = Toolkit.getDefaultToolkit(); // набор инструментов для работы с экранами
        Dimension dimension = toolkit.getScreenSize(); // получаем размер экрана

        JFrame window = new JFrame();
        window.setTitle("Oleg's second window");
        width = dimension.width;
        height = dimension.height;
        window.setBounds(width/4, height/4, width/2, height/2);
        window.setVisible(true);
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
