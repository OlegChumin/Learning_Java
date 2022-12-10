package SWING.Lessons407;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.EventHandler;

public class Lesson99 {
    public static final int WINDOW_WIDTH = 800; // pixels
    public static final int WINDOW_HEIGHT = 600; // pixels

    public static void main(String[] args) {
        JFrame jFrame = buildWindow(); // запускаем окно
        JPanel jPanel = new JPanel();
        jFrame.add(jPanel);
        JButton jButtonBlue = new JButton("BLUE");
        JButton jButtonWhite = new JButton("WHITE");
        JButton jButtonRed = new JButton("RED");
        JButton jButtonNoColor = new JButton("NO COLOR");
        jPanel.add(jButtonBlue);
        jPanel.add(jButtonWhite);
        jPanel.add(jButtonRed);
        jPanel.add(jButtonNoColor);

        jButtonBlue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jPanel.setBackground(Color.BLUE);
                jFrame.setTitle(((JButton) e.getSource()).getText()); // получаем текст с надписи кнопки и ставим его
                // в title окна
            }
        });

        jButtonWhite.addActionListener(e -> {
            jPanel.setBackground(Color.WHITE);
            jFrame.setTitle(((JButton) e.getSource()).getText());
        });

        jButtonRed.addActionListener(e -> {
            jPanel.setBackground(Color.RED);
            jFrame.setTitle(((JButton) e.getSource()).getText());
        });

        jButtonNoColor.addActionListener(EventHandler.create(ActionListener.class, jFrame, "title", "source.text" ));
    }

//    class MyListener implements ActionListener {
//
//        @Override
//        public void actionPerformed(ActionEvent e) {
//
//        }
//    }

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
}
