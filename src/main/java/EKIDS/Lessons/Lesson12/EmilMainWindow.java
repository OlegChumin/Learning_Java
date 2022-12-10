package EKIDS.Lessons.Lesson12;

import Java.Projects.SnakeGame.GameField;

import javax.swing.*;

/**
 SWING
 */
public class EmilMainWindow extends JFrame {
    public EmilMainWindow() {
        setTitle("Игра змейка"); // создаем заголовок окна игры
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // отработали закрытие окна
        setSize(320, 345); // создаем окно размером 320 на 345 пикселей
        setLocation(400, 400); // задаем начальное положение окна по левому верхнему углу
        add(new GameFieldEmil()); //здесь добавляется наша игра
        setVisible(true);
    }

    public static void main(String[] args) {

        EmilMainWindow mw = new EmilMainWindow();
    }
}

