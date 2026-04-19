package lesson_03.solid._4_interface_segregation.with_isp;

public class HumanWorker implements Worker, Eater {

    @Override
    public void work() {
        System.out.println("Human works");
    }

    @Override
    public void eat() {
        System.out.println("Human eats");
    }
}
