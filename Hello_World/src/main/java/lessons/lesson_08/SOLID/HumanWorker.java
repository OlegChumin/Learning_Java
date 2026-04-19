package lessons.lesson_08.SOLID;

public class HumanWorker implements Worker, Eater{

    @Override
    public void work() {
        System.out.println(" Человек работает ");
    }

    @Override
    public void eat() {
        System.out.println(" Человек ест ");
    }
}
