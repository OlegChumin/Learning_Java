//package with_Chat_GPT.Version_01;
//
//import java.util.Random;
//
//public class BallRace implements Runnable {
//
//    private static final int DISTANCE = 100; // конечная точка дистанции
//
//    private final String name;
//    private final Random random;
//
//    private int position;
//
//    public BallRace(String name) {
//        this.name = name;
//        this.random = new Random();
//    }
//
//    @Override
//    public void run() {
//        System.out.println(name + " начал гонку!");
//
//        while (position < DISTANCE) {
//            // Генерируем случайное значение для перемещения шарика
//            int move = random.nextInt(10);
//            position += move;
//
//            // Печатаем текущую позицию шарика
//            System.out.println(name + " на позиции " + position + " из " + DISTANCE);
//
//            // Делаем паузу перед следующим шагом
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//
//        System.out.println(name + " финишировал!");
//    }
//
//    public static void main(String[] args) {
//        // Создаем два шарика и запускаем два потока
//        Thread ball1 = new Thread(new BallRace("Шарик 1"));
//        Thread ball2 = new Thread(new BallRace("Шарик 2"));
//
//        ball1.start();
//        ball2.start();
//    }
//}