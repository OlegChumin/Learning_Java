package materials.lesson_02_05.java_memory;

/**
 * https://proselyte.net/jvm-basics/
 */

public class MemoryDemo {

    // Примитивная переменная типа int
    private int primitiveVariable;

    // Объект типа String
    private String stringObject;

    // Конструктор класса
    public MemoryDemo(int value, String str) {
        this.primitiveVariable = value;
        this.stringObject = str;
    }

    // Метод для вывода информации о переменных
    public void printMemoryInfo() {
        System.out.println("Значение примитивной переменной: " + primitiveVariable);
        System.out.println("Значение объекта String: " + stringObject);
    }

    public static void main(String[] args) {
        // Создаем экземпляр класса MemoryDemo
        MemoryDemo demoObject = new MemoryDemo(42, "Hello, Memory!");

        // Выводим информацию о переменных
        demoObject.printMemoryInfo();
    }
}
