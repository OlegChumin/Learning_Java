package lessons.lesson_04;

public class StaticNonStatic {
    public int someNumber = 90; // переменная или поле, порле класса ConsoleCalculator
    public static int newNumber = -50;


    public static void main(String[] args) {
        // Тип перменной  линк на объект
        StaticNonStatic calculator = new StaticNonStatic();
        System.out.println(calculator);
        System.out.println(calculator.someNumber); // вызов поля через объект
        calculator.someMethod();

        newMethod(); // вызывается без создания объекта ConsoleCalculator
        int number = newNumber; //вызов поля без объекта

    }

    public void someMethod() {
        System.out.println("Метод someMethod что-то делает");
    }

    public static void newMethod() {
        System.out.println("Метод newMethod что-то делает");
    }

    public static void newMethod2() {
        newMethod();
    }
}
