package BallThreadsRace.ball_race_v_001;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

/**
 * Окно гонки шаров.
 * <p>
 * Программа создает гонку из 6 шаров, каждый шар работает в отдельном потоке,
 * а результаты выводятся в консоль в виде таблицы победителей.
 */
public class BallRace extends JFrame {
    private static final long serialVersionUID = 1L;
    private static final int TRACK_LENGTH = 400;
    private static final int FINISH_LINE = TRACK_LENGTH - Ball.RADIUS;
    private static final int NUM_BALLS = 6;
    private static final int WINDOW_WIDTH = TRACK_LENGTH + 50;
    private static final int WINDOW_HEIGHT = Ball.DIAMETER * NUM_BALLS + 50;
    private static final int REPAINT_DELAY_MS = 30;

    private static final Ball[] balls = new Ball[NUM_BALLS];

    private final JPanel panel;
    private Timer raceTimer;

    public BallRace() {
        setTitle("Ball Race");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Ball.setTrackLength(TRACK_LENGTH);
        createBalls();

        panel = new JPanel() {
            private static final long serialVersionUID = 1L;

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Ball.drawTrack(g);
                for (Ball ball : balls) {
                    if (ball != null) {
                        ball.draw(g);
                    }
                }
            }
        };

        add(panel);
        setLocationRelativeTo(null);
        startRaceMonitoring();
        setVisible(true);
    }

    private void createBalls() {
        for (int i = 0; i < NUM_BALLS; i++) {
            balls[i] = new Ball(
                    (int) (Math.random() * (Ball.MAX_SPEED - Ball.MIN_SPEED + 1) + Ball.MIN_SPEED),
                    Ball.COLORS[i],
                    TRACK_LENGTH,
                    FINISH_LINE
            );
        }
    }

    private void startRaceMonitoring() {
        raceTimer = new Timer(REPAINT_DELAY_MS, event -> {
            panel.repaint();
            if (areAllBallsFinished()) {
                raceTimer.stop();
                Ball.showResults();
            }
        });
        raceTimer.start();
    }

    private boolean areAllBallsFinished() {
        for (Ball ball : balls) {
            if (ball != null && !ball.isFinished()) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(BallRace::new);
    }
}
