package with_Chat_GPT.Version_02;

import java.util.ArrayList;
import java.util.List;

public class BallRace {

    private static final int DISTANCE = 100; // Дистанция гонки

    private static final int NUM_BALLS = 6; // Количество шариков

    private static List<Ball> balls = new ArrayList<>(); // Список шариков

    private static List<Ball> winners = new ArrayList<>(); // Список победителей

    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i <= NUM_BALLS; i++) {
            Ball ball = new Ball(i);
            balls.add(ball);
            ball.start();
        }

        for (Ball ball : balls) {
            ball.join(); // Ждем, пока все шарики дойдут до конца
        }

        balls.sort((b1, b2) -> Integer.compare(b2.getDistance(), b1.getDistance())); // Сортируем шарики по дистанции

        for (int i = 0; i < 3; i++) {
            winners.add(balls.get(i)); // Добавляем первые 3 шарика в список победителей
        }

        System.out.println("Results:");
        System.out.println("Place\tBall\tDistance");
        for (int i = 0; i < balls.size(); i++) {
            Ball ball = balls.get(i);
            System.out.println((i + 1) + "\t" + ball.getId() + "\t" + ball.getDistance());
        }

        System.out.println("\nWinners:");
        for (int i = 0; i < winners.size(); i++) {
            Ball ball = winners.get(i);
            System.out.println((i + 1) + "\t" + ball.getId() + "\t" + ball.getDistance());
        }
    }

    private static class Ball extends Thread {

        private int id; // Идентификатор шарика

        private int distance; // Пройденная дистанция

        public Ball(int id) {
            this.id = id;
        }

        public long getId() {
            return id;
        }

        public int getDistance() {
            return distance;
        }

        @Override
        public void run() {
            while (distance < DISTANCE) {
                distance += (int) (Math.random() * 10); // Шарик проходит случайное расстояние от 0 до 9
            }
        }
    }
}
