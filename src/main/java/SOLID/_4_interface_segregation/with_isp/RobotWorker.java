package SOLID._4_interface_segregation.with_isp;

public class RobotWorker implements Worker {
    public void work() { /*...*/ }
    // Теперь не нужно реализовывать метод eat()
}