package ball_race_v_001;

import java.awt.*;
import javax.swing.*;

/**
 Программа создает гонку из 6 шаров - 6 потоков и выводит результат в консоль --> таблицу победителей
 * */
public class BallRace extends JFrame {
    private static final long serialVersionUID = 1L;
    private static final int TRACK_LENGTH = 400;
    private static final int FINISH_LINE = TRACK_LENGTH - Ball.RADIUS;
    private static final int NUM_BALLS = 6;
    private static final int WINDOW_WIDTH = TRACK_LENGTH + 50;
    private static final int WINDOW_HEIGHT = Ball.DIAMETER * NUM_BALLS + 50;
    private static final Ball[] balls = new Ball[NUM_BALLS];
    private static boolean finished = false;

    public BallRace() {
        setTitle("Ball Race");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Ball.setTrackLength(TRACK_LENGTH);

        JPanel panel = new JPanel() {
            private static final long serialVersionUID = 1L;

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Ball.drawTrack(g);
                for (Ball ball : balls) {
                    ball.draw(g);
                }
            }
        };


        add(panel); // добавляем созданную панель
        setLocationRelativeTo(null); // центрируем окно по экрану
        setVisible(true); // делаем окно видимым

        for (int i = 0; i < NUM_BALLS; i++) {
            balls[i] = new Ball((int) (Math.random() * (Ball.MAX_SPEED - Ball.MIN_SPEED + 1) + Ball.MIN_SPEED),
                    Ball.COLORS[i], TRACK_LENGTH, FINISH_LINE);
        }

        while (!finished) {
            panel.repaint();
            finished = true;
            for (Ball ball : balls) {
                if (!ball.isFinished()) {
                    finished = false;
                    break;
                }
            }
        }

        Ball.showResults();
    }
}


