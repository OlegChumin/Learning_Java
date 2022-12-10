package EKIDS.StudentsJava.Project;

import Java.Projects.SnakeGame.GameField;
import Java.Projects.SnakeGame.MainWindow;

import javax.swing.*;

/**Игра морской бой
 * Поле - два поля Игро1 Игрок 2 (при это игрок1 - человек, игрок2 - компьютер(бот))
 * гра для двух участников, в которой игроки по очереди называют координаты на неизвестной им карте соперника.
 * Если у соперника по этим координатам имеется корабль (координаты заняты), то корабль или его часть
 * «топится»,
 * а попавший получает право сделать ещё один ход. Цель игрока — первым потопить все корабли противника.
 * Разрешение поля придумает Марк (сколько элементов)
 * Элементы игры (корабли - какие корабли .. описать)
 *
 * */

public class SeaBattleGameOfMark extends JFrame{
    public SeaBattleGameOfMark() {
        setTitle("Игра морской бой"); // создаем заголовок окна игры
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // отработали закрытие окна
        setSize(1280, 665); // создаем окно размером 640 на 640 + 25 Mac пикселей
        setLocation(250, 250); // задаем начальное положение окна по левому верхнему углу
        //add(new GameField()); //здесь добавляется наша игра
        setVisible(true);
    }

    public static void main(String[] args) {

        SeaBattleGameOfMark sb = new SeaBattleGameOfMark();
    }
}
