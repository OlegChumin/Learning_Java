package EKIDS.GamesDevelopment;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class Miner extends JFrame { // основной класс Miner в котором мы вызываем старт программы в методе main
    // блок переменных и констант
    final String TITLE_OF_MINER = "Miner"; // константа - заголовок в верхнем меню программы

    final String SIGN_OG_FLAG = "f";

    final int BLOCK_SIZE = 30; // размер блока (квадратика 30 х 30 пикселей)

    final int FIELD_SIZE = 9; // 9 х 9 блоков = 81 блок игрового поля

    final int FIELD_DX = 6; // запас поля по оси Х (по горизонтали) на рамки справа и слева

    final int FIELD_DY = 28; // запас на размер верхнего меню 28 пикселей

    final int START_LOCATION = 200; // координаты окна

    final int[] COLOR_OF_NUMBERS = {0x000FF, 0x008000, 0xFF000, 0x800000, 0x0}; // массив цветов цифр для флагов

    Random random = new Random(); // генератор случайных чисел
    Cell[][] field = new Cell[FIELD_SIZE][FIELD_SIZE];

    final int NUMBER_OF_MINES = 10;

    final int MOUSE_BUTTON_LEFT = 1;

    final int MOUSE_BUTTON_RIGHT = 3;

    int bangX, bangY; // относительные координаты взрыва

    boolean youWon, bangMine; // переменные для отслеживания ситуации победа или взрыв/проиграл

    int countOpenCells; // счетчик открытых ячеек


    public static void main(String[] args) {
        new Miner(); // создаем объект класса Miner

    }

    Miner() { // конструктор класса Miner который определяет то как должен быть создан объект класса
        setTitle(TITLE_OF_MINER);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(START_LOCATION, START_LOCATION, FIELD_SIZE * BLOCK_SIZE + FIELD_DX,
                FIELD_SIZE * BLOCK_SIZE + FIELD_DY); // создаем габаритный прямоугольник левый верхний угол будет
        // расположен в точке x (по горизонтали) == 200 пикселей, по вертикали y == 200 пикселей, система координат
        // начинается в точке 0,0 пикселей в левом верхнем углу экрана
        setResizable(false); // это метод запрещает изменение размера рамки окна нашей игры
        final Canvas canvas = new Canvas();
        canvas.setBackground(Color.WHITE);

        //MouseListener - для отслеживания нажатий клавиш мыши
        canvas.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
                int x = e.getX() / BLOCK_SIZE; // получаем относительные координаты клика мышки в нашем окне
                int y = e.getY() / BLOCK_SIZE;

                if (e.getButton() == MOUSE_BUTTON_LEFT && !bangMine && !youWon) {
                    if (field[y][x].isNotOpen()) {
                        field[y][x].open();
                        youWon = countOpenCells == FIELD_SIZE * FIELD_SIZE - NUMBER_OF_MINES;
                        if (bangMine) {
                            bangX = x;
                            bangY = y;
                        }
                    }
                    if (e.getButton() == MOUSE_BUTTON_RIGHT) {
                        field[x][y].inverseFlag();
                    }
                    canvas.repaint(); // перерисовка нашего полотна
                }
            }
        });
        add(BorderLayout.CENTER, canvas);

        setVisible(true);
        initGame();
    }

    void initGame() {
        int x, y, countMines = 0;

        // рисуем ячейки
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
                            count += (field[nY][nX].isMined() ? 1 : 0);
                        }
                    }
                    field[y][x].setCountBomb(count);
                }
            }
        }
    }


    class Cell { // создает и обрабатывает ячейки
        private boolean isOpen, isMine, isFlag; // ячейка открыта, заминировано, значек флага
        private int countBombNear; // счетчик рядом расположенных бомб

        void open() {
            isOpen = true; // ставим метку, что ячейка открыта
            bangMine = isMine; // если попали на бомбу
            if (!isMine) {
                countOpenCells++; // если не заминировано, то увеличиваем счетчик открытых ячеек
            }
        }

        boolean isNotOpen() { // проверка, открыта ли ячейка
            return !isOpen;
        }

        void mine() {
            isMine = true; // минируем ячейку
        }

        boolean isMined() {
            return isMine;
        }

        void inverseFlag() {
            isFlag = !isFlag;
        }

        void setCountBomb(int count) {
            countBombNear = count;
        }

        // создание и расскраска бомбы/мины
        void paintBomb(Graphics g, int x, int y, Color color) {
            g.setColor(color);
            g.fillRect(x * BLOCK_SIZE + 7, y * BLOCK_SIZE + 10, 18, 10);
            g.fillRect(x * BLOCK_SIZE + 11, y * BLOCK_SIZE + 6, 10, 18);
            g.fillRect(x * BLOCK_SIZE + 9, y * BLOCK_SIZE + 8, 14, 14);
            g.setColor(Color.white);
            g.fillRect(x * BLOCK_SIZE + 11, y * BLOCK_SIZE + 10, 4, 4);
        }

        void paintString(Graphics g, String str, int x, int y, Color color) {
            g.setColor(color);
            g.setFont(new Font("", Font.BOLD, BLOCK_SIZE));
            g.drawString(str, x * BLOCK_SIZE + 8, y + BLOCK_SIZE + 26); // проверить отступы 8 и 26
        }

        void paint(Graphics g, int x, int y) { // метод виден только из другого подобъекта
            g.setColor(Color.lightGray);
            g.drawRect(x * BLOCK_SIZE, y * BLOCK_SIZE, BLOCK_SIZE, BLOCK_SIZE);
            // если ячейка открыта
            if (!isOpen) {
                if ((bangMine || youWon) && isMine) { // (мины взорвались или победа) и ячейка заминирована
                    paintBomb(g, x, y, Color.black); // рисуем черную бомбу
                } else {
                    g.setColor(Color.lightGray);
                    g.fill3DRect(x * BLOCK_SIZE, y * BLOCK_SIZE, BLOCK_SIZE, BLOCK_SIZE, true); // серый блок
                    if (isFlag)
                        paintString(g, SIGN_OG_FLAG, x, y, Color.black); // если ячейка не открыта и флаг установлен,
                    // то рисуется F
                }
            } else if (isMine) {
                paintBomb(g, x, y, bangMine ? Color.red : Color.black); // если ячейка заминирована и мы на нее наступили,
                // бомба взорвалась (окрасилась в красный цвет), иначе - бомба отрисуется черным цветом
            } else if (countBombNear > 0) { // если рядом бомбы, то вывести цифру количества бомб рядом
                paintString(g, Integer.toString(countBombNear), x, y, new Color(COLOR_OF_NUMBERS[countBombNear - 1]));
            }
        }
    }

    // класс Canvas - это полотно наследуемое от JPanel
    class Canvas extends JPanel {

        @Override // переопределили метод родительского класса paint
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



