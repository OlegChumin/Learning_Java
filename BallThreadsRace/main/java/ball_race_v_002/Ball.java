package ball_race_v_002;

import java.awt.*; // Импортируем все классы из пакета java.awt для работы с графикой
import java.util.*; // Импортируем все классы из пакета java.util для работы с коллекциями и другими утилитами

// Определение класса Ball, который реализует интерфейсы Runnable и Comparable<Ball>
public class Ball implements Runnable, Comparable<Ball> {
    // Определение статических констант для максимальной и минимальной скорости, радиуса и диаметра мяча, а также массива цветов
    static final int MAX_SPEED = 10;
    static final int MIN_SPEED = 1;
    static final int RADIUS = 10;
    static final int DIAMETER = RADIUS * 2;
    static final Color[] COLORS = { Color.RED, Color.BLUE, Color.GREEN, Color.YELLOW, Color.ORANGE, Color.PINK };

    // Определение статических полей для случайных чисел и следующего идентификатора мяча
    static final Random random = new Random();
    static int nextId = 1;

    // Определение статических полей для длины трека, треков, цветов и победителей
    static int trackLength;
    static Map<Integer, Point[]> tracks;
    static Map<Integer, Color> colors;
    static Set<Integer> winners;

    // Определение полей экземпляра для идентификатора, скорости, пройденного расстояния, позиции, завершенности и потока мяча
    private int id;
    private int speed;
    private int distanceCovered;
    private Point position;
    private boolean finished;
    private Thread thread;

    // Конструктор класса Ball, который инициализирует поля экземпляра и запускает поток мяча
    public Ball(int speed, Color ballColor, int trackLength, int finishLine) {
        this.id = nextId++;
        this.speed = speed;
        this.distanceCovered = 0;
        this.position = new Point(RADIUS, id * DIAMETER);
        this.finished = false;
        this.thread = new Thread(this);
        this.thread.start();
    }

    // Статический метод для установки длины трека и инициализации треков, цветов и победителей
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

    // Статический метод для рисования треков
    public static void drawTrack(Graphics g) {
        for (int i = 1; i <= 6; i++) {
            g.setColor(colors.get(i)); // Устанавливаем цвет для текущего трека
            for (int j = 0; j < trackLength - 1; j++) {
                g.drawLine(tracks.get(i)[j].x, tracks.get(i)[j].y, tracks.get(i)[j + 1].x, tracks.get(i)[j + 1].y); // Рисуем линии трека
            }
        }
    }

    // Статический метод для вывода результатов
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

    // Методы доступа к полям экземпляра
    public int getDistanceCovered() {
        return distanceCovered;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isFinished() {
        return finished;
    }

    // Метод run() из интерфейса Runnable для выполнения логики движения мяча
    public void run() {
        while (distanceCovered < trackLength) {
            try {
                Thread.sleep(100 - (speed * 9)); // Управление скоростью мяча с помощью задержки
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            distanceCovered += speed;
            position.setLocation(distanceCovered + RADIUS, position.getY());
        }
        finished = true;
        winners.add(id);
    }

    // Метод для рисования мяча
    public void draw(Graphics g) {
        g.setColor(colors.get(id)); // Устанавливаем цвет мяча
        g.fillOval(position.x - RADIUS, position.y - RADIUS, DIAMETER, DIAMETER); // Рисуем мяч с текущей позицией
    }

    // Метод compareTo() из интерфейса Comparable<Ball> для сравнения мячей по пройденному расстоянию
    public int compareTo(Ball other) {
        return Integer.compare(other.distanceCovered, distanceCovered);
    }

    // Метод для получения цвета мяча
    public Color getColor() {
        return colors.get(id);
    }
}

