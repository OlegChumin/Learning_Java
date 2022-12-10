package EKIDS.Lessons.Lesson12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

/**
 * * JPanel — это элемент управления, представляющий собой прямоугольное пространство,
 * * на котором можно размещать другие  * элементы. Элементы добавляются и удаляются
 * * методами, унаследованными от класса Container.
 */

public class GameFieldEmil extends JPanel implements ActionListener {
    private final int SIZE = 320;
    private final int DOT_SIZE = 16;
    private final int ALL_DOTS = 400;
    private Image dot;
    //    private Image head;
    private Image apple;
    private int appleX;
    private int appleY;
    private int[] x = new int[ALL_DOTS];
    private int[] y = new int[ALL_DOTS];
    private int dots;
    private Timer timer;
    private boolean left = false; // переменная отвечает за направление движения змейки
    private boolean right = false;
    private boolean up = false;
    private boolean down = true;
    private boolean inGame = true;

    public GameFieldEmil() {
        setBackground(Color.black);
        loadImages();
        initGame();
        addKeyListener(new FieldKeyListener());
        setFocusable(true);

    }

    public void moveSnake() {
        for (int i = dots; i > 0; i--) {

            x[i] = x[i - 1];
            y[i] = y[i - 1];

            if (left) {
                x[0] -= DOT_SIZE; // x[0] = DOT_SIZE-1
            }

            if (right) {
                x[0] += DOT_SIZE;
            }

            if (up) {
                y[0] -= DOT_SIZE;
            }

            if (down) {
                y[0] += DOT_SIZE;
            }
        }
    }

    // столкновение с границами
    public void checkBorder() {
        for (int i = dots; i > 0; i--) {
            if (i > 4 && x[0] == x[i] && y[0] == y[i]) {
                inGame = false;
            }

            if (x[0] > SIZE) {
                inGame = false;
            }

            if (x[0] < 0) {
                inGame = false;
            }

            if (y[0] > SIZE) {
                inGame = false;
            }

            if (y[0] < 0) {
                inGame = false;
            }
        }
    }


    // столкновение с яблоком
    public void checkApple() {
        if (x[0] == appleX && y[0] == appleY) {
            // ее положения
            dots++;
            createApple();
        }
    }

    public void createApple() {
        appleX = new Random().nextInt(20) * DOT_SIZE;
        appleY = new Random().nextInt(20) * DOT_SIZE;
    }

    // данный метод загружает изображение яблока и части змейки в окно игры
    public void loadImages() {
        ImageIcon iia = new ImageIcon("apple.png"); // загрузка изображения яблока в среду программы
        apple = iia.getImage();

        ImageIcon iid = new ImageIcon("dot.png"); // загрузка изображения змейки в среду программы
        dot = iid.getImage();
    }

    public void initGame() {
        dots = 3;
        for (int i = 0; i < dots; i++) {
            x[i] = 48 - i * DOT_SIZE;
            y[i] = 48;
        }
        timer = new Timer(400, this);
        timer.start();
        createApple();
    }

    @Override
    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics); // перерисовка всего
        if (inGame) {
            graphics.drawImage(apple, appleX, appleY, this);
            for (int i = 0; i < dots; i++) {
                graphics.drawImage(dot, x[i], y[i], this);
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (inGame) {
            checkApple();
            checkBorder();
            moveSnake();

        }
        repaint();
    }

    class FieldKeyListener extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            super.keyPressed(e);
            int key = e.getKeyCode();

            if (key == KeyEvent.VK_LEFT && !right) {
                left = true;
                up = false;
                down = false;
            }
            if (key == KeyEvent.VK_RIGHT && !left) {
                right = true;
                up = false;
                down = false;
            }
            if (key == KeyEvent.VK_UP && !down) {
                up = true;
                right = false;
                left = false;
            }

            if (key == KeyEvent.VK_DOWN && !up) {
                down = true;
                right = false;
                left = false;
            }
        }
    }
}


