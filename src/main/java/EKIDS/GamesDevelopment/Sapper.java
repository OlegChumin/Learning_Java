package EKIDS.GamesDevelopment;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class Sapper extends JFrame {
    final String TITLE_OF_PROGRAM = "Mines";
    final String SIGN_OF_FLAG = "f";
    final int BLOCK_SIZE = 30; // размер блока в пикселах
    final int FIELD_SIZE = 9; // количество блоков 9х9
    final int FIELD_DX = 6; // размер поля по Х - ширина рамок
    final int FIELD_DY = 28; // размер поля по Y - высота заголовка
    final int START_LOCATION = 200; // координаты окна
    final int MOUSE_BUTTON_LEFT = 1;
    final int MOUSE_BUTTON_RIGHT = 3; // для обработчика нажатий клавиш мыши
    final int NUMBER_OF_MINES = 10; // количество мин
    final int[] COLOR_OF_NUMBERS = {0x0000FF, 0x008000, 0xFF0000, 0x800000, 0x0};
    Cell[][] field = new Cell[FIELD_SIZE][FIELD_SIZE]; // класс Cell - массив ячеек
    Random random = new Random();
    int countOpenedCells; // суммируем сюда количество открытых ячеек.
    boolean youWon, bangMine;
    int bangX, bangY; // координаты взрыва

    public static void main(String[] args) {
        new Sapper();
    }

    Sapper() {
        setTitle(TITLE_OF_PROGRAM);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(START_LOCATION, START_LOCATION, FIELD_SIZE * BLOCK_SIZE + FIELD_DX,
                FIELD_SIZE * BLOCK_SIZE + FIELD_DY);
        setResizable(false);
        final Canvas canvas = new Canvas(); // полотно
        canvas.setBackground(Color.white);
        canvas.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
                int x = e.getX() / BLOCK_SIZE; //получаем относительные координаты клика мыши в окне по оси x
                int y = e.getY() / BLOCK_SIZE; //получаем относительные координаты клика мыши в окне по оси y
                if (e.getButton() == MOUSE_BUTTON_LEFT && !bangMine && !youWon) {// если была отжата левая кнопка мыши
                    // и мина еще не взорвалась и еще нет победы игра продолжается
                    if (field[y][x].isNotOpen()) {
                        field[y][x].open();
                        youWon = countOpenedCells == FIELD_SIZE * FIELD_SIZE - NUMBER_OF_MINES; // если открыты все ячейки
                        if (bangMine) {
                            bangX = x;
                            bangY = y;
                        }
                    }
                    if (e.getButton() == MOUSE_BUTTON_RIGHT) {
                        field[y][x].inverseFlag();
                    }
                    canvas.repaint(); // перерисовка полотна
                }
            }
        });// прослушиватель нажатий на мышь
        add(BorderLayout.CENTER, canvas);
//        add(BorderLayout.SOUTH, timeLabel);
        setVisible(true);
        initField();
    }


    void initField() {

        int x, y, countMines = 0;
        // создаем ячейки поля
        for (x = 0; x < FIELD_SIZE; x++) {
            for (y = 0; y < FIELD_SIZE; y++) {
                field[y][x] = new Cell();
            }
        }

        // поле с минами
        while (countMines < NUMBER_OF_MINES) {
            do {
                x = random.nextInt(FIELD_SIZE);
                y = random.nextInt(FIELD_SIZE);
            } while (field[y][x].isMined());
            field[y][x].mine();
            countMines++;
        }
        // расчет соседних опасных ячеек
        for (x = 0; x < FIELD_SIZE; x++) {
            for (y = 0; y < FIELD_SIZE; y++) {
                if (!field[y][x].isMined()) {
                    int count = 0;
                    for (int dx = 0; dx < 2; dx++) {
                        for (int dy = 0; dy < 2; dy++) {
                            int nX = x + dx;
                            int nY = y + dy;
                            if (nX < 0 || nY < 0 || nX > FIELD_SIZE - 1 || nY > FIELD_SIZE - 1) {
                                nX = x;
                                nY = y;
                            }
                            count += (field[nY][nX].isMined()) ? 1 : 0;
                        }
                        field[y][x].setCountBomb(count);
                    }
                }
            }
        }

    }

    class Cell {
        private boolean isOpen, isMine, isFlag;
        private int countBombNear;

        void open() {
            isOpen = true; // устанавливаем флаг на открытую ячейку
            bangMine = isMine; // если попали на бомбу
            if (!isMine) {
                countOpenedCells++;
            } // если не заминировано

        }

        boolean isNotOpen() {
            return !isOpen;
        } // проверка открыта или нет ячейка

        void mine() {
            isMine = true;  // минируем ячейку
        }

        boolean isMined() {
            return isMine;
        }

        void inverseFlag() {
            isFlag = !isFlag;
        }

        void setCountBomb(int count) { // метод, который устанавливает количество бомб
            countBombNear = count;
        }

        int getCountBomb() {
            return countBombNear;
        }

        void paintBomb(Graphics g, int x, int y, Color color) { //отрисовка бомбы
            g.setColor(color);
            g.fillRect(x * BLOCK_SIZE + 7, y * BLOCK_SIZE + 10, 18, 10);
            g.fillRect(x * BLOCK_SIZE + 11, y * BLOCK_SIZE + 6, 10, 18);
            g.fillRect(x * BLOCK_SIZE + 9, y * BLOCK_SIZE + 8, 14, 14);
            g.setColor(Color.WHITE);
            g.fillRect(x * BLOCK_SIZE + 11, y * BLOCK_SIZE + 10, 4, 4);
        }

        void paintString(Graphics g, String str, int x, int y, Color color) { //отображение количества цифр в ячейке
            g.setColor(color);
            g.setFont(new Font("", Font.BOLD, BLOCK_SIZE));
            g.drawString(str, x * BLOCK_SIZE + 8, y * BLOCK_SIZE + 26);
        }

        void paint(Graphics g, int x, int y) {
            g.setColor(Color.lightGray);
            g.drawRect(x * BLOCK_SIZE, y * BLOCK_SIZE, BLOCK_SIZE, BLOCK_SIZE); // рисует квадратики игрового поля
            if (!isOpen) { // если ячейка не открыта
                if ((bangMine || youWon) && isMine) { // (мины взорвались или я победил) и ячейка минирована, то рисуем бомбу
                    paintBomb(g, x, y, Color.black);
                } else {
                    g.setColor(Color.lightGray);
                    g.fill3DRect(x * BLOCK_SIZE, y * BLOCK_SIZE, BLOCK_SIZE, BLOCK_SIZE, true);
                    if (isFlag) paintString(g, SIGN_OF_FLAG, x, y, Color.red);
                    // если ячейка не открыта и флаг установлен, то рисуется F
                }
            } else if (isMine) { // если ячейка открыта
                paintBomb(g, x, y, bangMine ? Color.red : Color.black); // если ячейка заминирована, то рисуется бомба
            } else if (countBombNear > 0) { //если рядом бомбы, то выводится цифра
                paintString(g, Integer.toString(countBombNear), x, y,
                        new Color(COLOR_OF_NUMBERS[countBombNear - 1]));
            }
        }
    }

    class Canvas extends JPanel {
        @Override
        public void paint(Graphics g) {
            super.paint(g); // вызываем родительский метод отрисовки
            for (int x = 0; x < FIELD_SIZE; x++) {
                for (int y = 0; y < FIELD_SIZE; y++) {
                    field[y][x].paint(g, x, y);
                }
            }
        }
    }
}
