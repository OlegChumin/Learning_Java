package EKIDS.StudentsJava.Mark.SnakeGameWithHead;

import javax.swing.*;

/**
 * SWING
 */

public class MainWindow extends JFrame {
    public MainWindow() {
        setTitle("Игра змейка растение"); // создаём заголовок окна игры
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // отработали закрытие окна
        setSize(320, 345); // создаём окно размером 320 на 345 пикселей
        add(new GameField());// Здесь добавляется наша игра
        setLocation(400, 400); // задаём начальное положение окна по левому верхнему углу
        setVisible(true);
    }

    public static void main(String[] args) {
        MainWindow nw = new MainWindow();
    }
}
