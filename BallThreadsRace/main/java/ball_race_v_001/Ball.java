package ball_race_v_001;

import java.awt.*;
import java.util.*;

public class Ball implements Runnable, Comparable<Ball> {
    static final int MAX_SPEED = 10;
    static final int MIN_SPEED = 1;
    static final int RADIUS = 10;
    static final int DIAMETER = RADIUS * 2;
    static final Color[] COLORS = { Color.RED, Color.BLUE, Color.GREEN, Color.YELLOW, Color.ORANGE, Color.PINK };
    static final Random random = new Random();
    static int nextId = 1;
    static int trackLength;
    static Map<Integer, Point[]> tracks;
    static Map<Integer, Color> colors;
    static Set<Integer> winners;
    private int id;
    private int speed;
    private int distanceCovered;
    private Point position;
    private boolean finished;
    private Thread thread;

    public Ball(int speed, Color ballColor, int trackLength, int finishLine) {
        this.id = nextId++;
        this.speed = speed;
        this.distanceCovered = 0;
        this.position = new Point(RADIUS, id * DIAMETER);
        this.finished = false;
        this.thread = new Thread(this);
        this.thread.start();
    }


    public static void setTrackLength(int length) {
        trackLength = length;
        tracks = new HashMap<>();
        colors = new HashMap<>();
        winners = new TreeSet<>();
        for (int i = 1; i <= 6; i++) {
            Point[] track = new Point[trackLength];
            for (int j = 0; j < trackLength; j++) {
                track[j] = new Point(j + RADIUS, i * DIAMETER);
            }
            tracks.put(i, track);
            colors.put(i, COLORS[i - 1]);
        }
    }

    public static void drawTrack(Graphics g) {
        for (int i = 1; i <= 6; i++) {
            g.setColor(colors.get(i));
            for (int j = 0; j < trackLength - 1; j++) {
                g.drawLine(tracks.get(i)[j].x, tracks.get(i)[j].y, tracks.get(i)[j + 1].x, tracks.get(i)[j + 1].y);
            }
        }
    }

    public static void showResults() {
        System.out.println("Results:");
        System.out.println("Place\tBall ID");
        int place = 1;
        for (int winner : winners) {
            System.out.println(place + "\t\t" + winner);
            place++;
            if (place > 3) {
                break;
            }
        }
    }

    public int getDistanceCovered() {
        return distanceCovered;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isFinished() {
        return finished;
    }

    public void run() {
        while (distanceCovered < trackLength) {
            try {
                Thread.sleep(100 - (speed * 9)); // slower speed = faster update
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            distanceCovered += speed;
            position.setLocation(distanceCovered + RADIUS, position.getY());
        }
        finished = true;
        winners.add(id);
    }

    public void draw(Graphics g) {
        g.setColor(colors.get(id));
        g.fillOval(position.x - RADIUS, position.y - RADIUS, DIAMETER, DIAMETER);
    }

    public int compareTo(Ball other) {
        return Integer.compare(other.distanceCovered, distanceCovered);
    }

    public Color getColor() {
        return colors.get(id);
    }
}