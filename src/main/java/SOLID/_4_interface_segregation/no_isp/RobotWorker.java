package SOLID._4_interface_segregation.no_isp;

public class RobotWorker implements Worker {
    public void work() { /*...*/ }
    
    // Не нужно для робота, но приходится реализовать из-за интерфейса
    public void eat() { throw new UnsupportedOperationException(); }
}