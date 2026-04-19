package lessons.lesson_08.SOLID;

public class Test {
    public static void main(String[] args) {
        Robot robot = new Robot();
        HumanWorker humanWorker = new HumanWorker();

        robot.work();

        humanWorker.eat();
        humanWorker.work();
    }
}
