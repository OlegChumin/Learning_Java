package Java_Oleg.SWING.Lessons407;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lesson98 {
    public static final int WINDOW_WIDTH = 800; // pixels
    public static final int WINDOW_HEIGHT = 600; // pixels

    public static void main(String[] args) {
        JFrame newWindow = buildWindow(); // запускаем окно
        JPanel jPanel = new JPanel();
        newWindow.add(jPanel);
        JButton jButtonBlue = new JButton("BLUE");
        JButton jButtonWhite = new JButton("WHITE");
        jPanel.add(jButtonBlue);
        jPanel.add(jButtonWhite);

        jButtonBlue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jPanel.setBackground(Color.BLUE);
            }
        });

        jButtonWhite.addActionListener(e -> jPanel.setBackground(Color.WHITE));
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
