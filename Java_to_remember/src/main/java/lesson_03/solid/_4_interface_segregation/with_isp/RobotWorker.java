package lesson_03.solid._4_interface_segregation.with_isp;

public class RobotWorker implements Worker {
    @Override
    public void work() {
        System.out.println("Robot works");
    }
}
