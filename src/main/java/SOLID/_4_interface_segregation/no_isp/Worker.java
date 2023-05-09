package SOLID._4_interface_segregation.no_isp;
/**
 * I - Interface Segregation Principle (ISP) - Принцип разделения интерфейсов:
 * Классы не должны быть вынуждены реализовывать методы интерфейсов, которые им не нужны.
 * */
// Нарушение ISP
public interface Worker {
    void work();
    void eat();
}