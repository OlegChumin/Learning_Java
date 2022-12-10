package Alishev.BaseJava;

public class Lesson15 {
    public static void main(String[] args) {
        Computer computer1 = new Computer();
        Computer computer2 = new Computer();

        computer1.type = "Desktop";
        computer2.type = "Laptop";
        computer1.costs = 3000;
        computer2.costs = 5000;

        computer1.printInfo();
        computer2.printInfo();
        computer1.sayHello();
    }
}

class Computer {
    String type;
    int costs;

    void printInfo() {  // создали метод, котрый осуществляет печать (пока без параметров)
        System.out.println("Computer type: " + type + " " + costs);
    }

    void sayHello() {
        System.out.println("Привет!");
    }

}
