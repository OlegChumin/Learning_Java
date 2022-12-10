package EKIDS.Mark;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * Сценарий: Обычный морской бой,
 * вы сможете сами вводить координаты ваших кораблей.
 *
 * Графика:
 * корабли 32х32 пикселей (одна ячейка), анимация взрыва и воды, фоновая музыка.
 **/


 public class SeaButtleField extends JPanel implements ActionListener {
    // элементы игры - и их переменные
    private final int SIZE = 640;
    private final int DOT_SIZE = 32;
    private final int ALL_DOTS = 430;
    public boolean inGame = true;





    // loadImages()
    public void loadImages() {

    }



    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (inGame) {

        }
    }



    @Override
    public void actionPerformed(ActionEvent event) {
        if (inGame) {

        }
        repaint();
    }

    public static void main(String[] args) {
        SeaButtleGameMark sB = new SeaButtleGameMark();
    }
}
