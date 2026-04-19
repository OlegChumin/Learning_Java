package ball_race_v_002;

import java.awt.*; // Импортируем все классы из пакета java.awt для работы с графикой
import javax.swing.*; // Импортируем все классы из пакета javax.swing для работы с графическим пользовательским интерфейсом

// Определение класса BallRace, который наследует от JFrame
public class BallRace extends JFrame {
    // Определение необходимых статических полей для работы программы
// Константа, определяющая длину трассы (400 пикселей)
    private static final int TRACK_LENGTH = 400;

    // Константа, определяющая координату финишной линии (длина трассы минус радиус мяча)
    private static final int FINISH_LINE = TRACK_LENGTH - Ball.RADIUS;

    // Константа, определяющая количество мячей в гонке (6 штук)
    private static final int NUM_BALLS = 6;

    // Константа, определяющая ширину окна (ширина трассы + 50 пикселей)
    private static final int WINDOW_WIDTH = TRACK_LENGTH + 50;

    // Константа, определяющая высоту окна (диаметр мяча * количество мячей + 50 пикселей)
    private static final int WINDOW_HEIGHT = Ball.DIAMETER * NUM_BALLS + 50;

    // Массив объектов типа Ball (мячей), размерность массива равна количеству мячей в гонке
    private static final Ball[] balls = new Ball[NUM_BALLS];

    // Флаг, определяющий завершилась ли гонка (по умолчанию - false)
    private static boolean finished = false;


    // Конструктор класса BallRace
    public BallRace() {
        setTitle("Ball Race"); // Устанавливаем заголовок окна
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT); // Устанавливаем размер окна
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Устанавливаем операцию закрытия окна

        Ball.setTrackLength(TRACK_LENGTH); // Устанавливаем длину трека для мячей

        // Создаем панель для рисования
        JPanel panel = new JPanel() {
            // Метод paintComponent вызывается при перерисовке панели
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g); // Вызываем реализацию метода в суперклассе
                Ball.drawTrack(g); // Рисуем треки для мячей
                for (Ball ball : balls) {
                    ball.draw(g); // Рисуем каждый мяч
                }
            }
        };

        add(panel); // добавляем созданную панель
        setLocationRelativeTo(null); // центрируем окно по экрану
        setVisible(true); // делаем окно видимым


        // Создаем мячи и инициализируем их случайными скоростями
        for (int i = 0; i < NUM_BALLS; i++) {
            balls[i] = new Ball((int) (Math.random() * (Ball.MAX_SPEED - Ball.MIN_SPEED + 1) + Ball.MIN_SPEED),
                    Ball.COLORS[i], TRACK_LENGTH, FINISH_LINE);
        }

        // Цикл продолжается, пока все мячи не закончат гонку
        while (!finished) {
            panel.repaint(); // Перерисовываем панель с мячами
            finished = true;
            for (Ball ball : balls) {
                if (!ball.isFinished()) {
                    finished = false;
                    break;
                }
            }
        }

        Ball.showResults(); // Выводим результаты гонки
    }
}