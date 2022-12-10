package EKIDS.Mark;

import Progects.SnakeGame.GameField;
import Swing.Action;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Поле - два поля Игрок1 Игрок2 (бот)
 * Разрешение экрана (
 * Корабли ...... описание
 * <p>
 * игра для двух участников, в которой игроки по очереди называют координаты на неизвестной им карте соперника.
 * Если у соперника по этим координатам имеется корабль (координаты заняты), то корабль или его часть «топится»
 * , а попавший получает право сделать ещё один ход. Цель игрока — первым потопить все корабли противника.
 * <p>
 * <p>
 * *  *  1. Задание для Марка:
 * *  1.1. Проверить, что новый создаваемый корабль не пересекается с уже созданными (циклы for + массивы) "ГОТОВО"
 * *  2.1. Для ввода данных надо создать меню. Подумать какие элементы меню требуются. (Кнопки, поля ввода)
 * *  2.2. Нарисовать спрайты для кнопок. Подумать о размерах кнопок.  (212х95)    "ГОТОВО"
 * *  2.3. Написать два блока оператора switch для перевода координат по оси A, B ... J в координаты по X (0, 1, 2...9)
 * *  и координат по по оси Y 1,2...10  в Y(0,1...9)
 * *  2.4. Дописать сценарий. "ГОТОВО"
 */

public class SeaButtleGameMark extends JFrame implements ActionListener {
    public SeaButtleGameMark() {
        JFrame seaButtle = new JFrame();
        setTitle("Игра морской бой"); // создаём заголовок окна игры
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // отработали закрытие окна
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        add(new SeaButtleField()); // Здесь добавляется наша игра
        setSize(1352, 665);
        setLocation(250, 250);
        JPanel pnl = new JPanel();
        add(pnl);

        pnl.add(StartButton);
        StartButton.setEnabled(true);
        StartButton.addActionListener(this);
        setVisible(true);
    }


    // кнопка, которая начинает игру
    ImageIcon startButtonSprite = new ImageIcon("StartButtonSprite.png");
    JButton StartButton = new JButton(startButtonSprite);



    public static void main(String[] args) {SeaButtleGameMark seaButtleGameMark = new SeaButtleGameMark();}


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == StartButton) {

        }
    }
}


