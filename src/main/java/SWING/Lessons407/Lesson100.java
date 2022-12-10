package SWING.Lessons407;

import javax.swing.*;
import java.awt.*;

// look-and-feel
public class Lesson100 {
    public static final int WINDOW_WIDTH = 800; // pixels
    public static final int WINDOW_HEIGHT = 600; // pixels

    public static void main(String[] args) {
        UIManager.LookAndFeelInfo[] lookAndFeelInfos = UIManager.getInstalledLookAndFeels(); // получаем темы
        for (UIManager.LookAndFeelInfo element : lookAndFeelInfos) {
            System.out.println(element);
        }

        JFrame window = buildWindow();
        JPanel jPanel = buildJPanel();
        window.add(jPanel);

        JButton jButton1 = new JButton("Metal");
        JButton jButton2 = new JButton("Nimbus");
        JButton jButton3 = new JButton("Motif");
        JButton jButton4 = new JButton("Windows");
        JButton jButton5 = new JButton("Windows Classic");

        jPanel.add(jButton1);
        jPanel.add(jButton2);
        jPanel.add(jButton3);
        jPanel.add(jButton4);
        jPanel.add(jButton5);

        jButton1.addActionListener(e -> {
            try {
                UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
            } catch (ClassNotFoundException ex) {
                throw new RuntimeException(ex);
            } catch (InstantiationException ex) {
                throw new RuntimeException(ex);
            } catch (IllegalAccessException ex) {
                throw new RuntimeException(ex);
            } catch (UnsupportedLookAndFeelException ex) {
                throw new RuntimeException(ex);
            }
        });

        jButton2.addActionListener(e -> {
            try {
                UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
            } catch (ClassNotFoundException ex) {
                throw new RuntimeException(ex);
            } catch (InstantiationException ex) {
                throw new RuntimeException(ex);
            } catch (IllegalAccessException ex) {
                throw new RuntimeException(ex);
            } catch (UnsupportedLookAndFeelException ex) {
                throw new RuntimeException(ex);
            }
        });

        jButton3.addActionListener(e -> {
            try {
                UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
            } catch (ClassNotFoundException ex) {
                throw new RuntimeException(ex);
            } catch (InstantiationException ex) {
                throw new RuntimeException(ex);
            } catch (IllegalAccessException ex) {
                throw new RuntimeException(ex);
            } catch (UnsupportedLookAndFeelException ex) {
                throw new RuntimeException(ex);
            }
        });

        jButton4.addActionListener(e -> {
            try {
                UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            } catch (ClassNotFoundException ex) {
                throw new RuntimeException(ex);
            } catch (InstantiationException ex) {
                throw new RuntimeException(ex);
            } catch (IllegalAccessException ex) {
                throw new RuntimeException(ex);
            } catch (UnsupportedLookAndFeelException ex) {
                throw new RuntimeException(ex);
            }
        });

        jButton5.addActionListener(e -> {
            try {
                UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel");
            } catch (ClassNotFoundException ex) {
                throw new RuntimeException(ex);
            } catch (InstantiationException ex) {
                throw new RuntimeException(ex);
            } catch (IllegalAccessException ex) {
                throw new RuntimeException(ex);
            } catch (UnsupportedLookAndFeelException ex) {
                throw new RuntimeException(ex);
            }
        });

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

    private static JPanel buildJPanel() {
        JPanel jPanel = new JPanel();
        return jPanel;
    }
}
