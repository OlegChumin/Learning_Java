//package javarush.interfaces;
//
//public class AboutInterfaces {
//    public static void main(String[] args) {
//
//    }
//}
//
//interface Movable {
//
//}
//
//interface Resizable {
//
//}
//
//interface StartMethods { // демонстрация того, что можно впихнуть в интерфейс
//    // в интерфейсе нельзя применить абстрактный клас с реализацией
//    // нельзя применять private/protected final константу, она может быть default, public,
//    // метод должен быть private или default оба обязаны иметь реализацию
//    // метод может быть private static, но он обязан иметь реализацию
//
//    public final int CONSTANTA = 100;
//    final double PI = 3.14;
//
//    // все три метода ниже обязаны быть overrride в классе
//    int walk(); // метод walk() без реализации? возвращающий значение int (ghb переопределении в классе)
//
//    void go();
//
//    public void fly();  // public метод должен быть без реализации
//
//
//    default void work() { // default метод с реализацией
//        System.out.println("Work..");
//    }
//
//    default int getId(int id) {  // default метод с параметрами с реализацией и с возвращаемым значением
//        return id;
//    }
//
//    private void printInfo(String details) {  // приватный метод с параметром типа String
//        System.out.println("Printing information" + details);
//    }
//
//    private static void write() {
//
//    }
//
//}
//
//class A implements StartMethods, Resizable {
//
//    @Override
//    public int walk() {
//        return 0;
//    }
//
//    @Override
//    public void go() {
//
//    }
//
//    @Override
//    public void fly() {
//
//    }
//}
