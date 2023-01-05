package Java_405_lessons.SWING;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.EventHandler;

public class LessonSWING04 {
    public static void main(String[] args) {
        JFrame window = buildJFrameWindow(); // создаем окно в пропорциях от текущего разрешения, по центру
        JPanel jPanel = new JPanel(); //создаем контейнер JPanel для добавления в него элементов
        window.add(jPanel); // добавляем контейнер JPanel к созданному окну
        JButton jButton = new JButton("Testing..."); // новая кнопка с надписью "Testing..."
        jPanel.add(jButton); // добавили кнопкув контейнер JPanel
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                window.setTitle(((JButton)e.getSource()).getText());
            }
        });

        JButton secondButton = new JButton("Submit");
        jPanel.add(secondButton);
        secondButton.addActionListener(EventHandler.create(ActionListener.class, window, "title", "source.text"));
        //Контейнер JPanel (или панель) по умолчанию использует менеджер
        //шаблона FlowLayout, который располагает компоненты в колонках сле-
        //ва направо, привязываясь к правой границе окна.

    }


    static JFrame buildJFrameWindow() {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int width = dimension.width;
        int height = dimension.height;

        JFrame window = new JFrame();
        window.setVisible(true);
        window.setBounds(width / 4, height / 4, width / 2, height / 2);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        return window;
    }
}
