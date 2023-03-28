package with_Chat_GPT.Version_03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BallRace {
    private static final int RACE_DISTANCE = 100;
    private static final int BALL_COUNT = 6;
    private static final int MAX_SPEED = 5;
    private static final int MAX_DELAY = 100;
    private static final char[] TRACK = {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-'};

    private static List<Ball> balls = new ArrayList<>();
    private static int[] results = new int[BALL_COUNT];

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < BALL_COUNT; i++) {
            balls.add(new Ball(i));
        }

        System.out.println("Race starts!");
        for (Ball ball : balls) {
            ball.start();
        }

        for (Ball ball : balls) {
            ball.join();
        }

        System.out.println("Race finished!");
        System.out.println("Results:");
        for (int i = 0; i < BALL_COUNT; i++) {
            int place = i + 1;
            int ballNumber = results[i];
            System.out.println(String.format("%d place: Ball %d", place, ballNumber));
        }
    }

    private static class Ball extends Thread {
        private int number;
        private int position;
        private int speed;
        private char symbol;

        Ball(int number) {
            this.number = number;
            this.position = 0;
            this.speed = (int) (Math.random() * MAX_SPEED) + 1;
            this.symbol = (char) ('0' + number);
        }

        @Override
        public void run() {
            System.out.println(String.format("Ball %d started", number));
            while (position < RACE_DISTANCE) {
                move();
                try {
                    Thread.sleep((int) (Math.random() * MAX_DELAY));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(String.format("Ball %d finished", number));
            int place = -1;
            synchronized (results) {
                for (int i = 0; i < BALL_COUNT; i++) {
                    if (results[i] == 0) {
                        results[i] = number;
                        place = i;
                        break;
                    }
                }
            }
            if (place >= 0 && place <= 2) {
                System.out.println(String.format("Ball %d got %d place!", number, place + 1));
            }
        }

        private void move() {
            synchronized (TRACK) {
                TRACK[position] = '-';
                position += speed;
                if (position >= RACE_DISTANCE) {
                    position = RACE_DISTANCE - 1;
                }
                TRACK[position] = symbol;
                printTrack();
            }
        }

        private void printTrack() {
            System.out.println(String.valueOf(TRACK));
            for (int i = 0; i < BALL_COUNT; i++) {
                if (balls.get(i).position >= RACE_DISTANCE) {
                    continue;
                }
                if (i == number) {
                    System.out.print(symbol);
                } else {
                    System.out.print('.');
                }
            }
            System.out.println();
            System.out.println();
        }
    }
}

