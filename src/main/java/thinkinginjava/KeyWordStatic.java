package thinkinginjava;

import java.util.Date;

public class KeyWordStatic {
    public static void main(String[] args) {
        System.out.print("Привет, сегодня: ");
        System.out.print(new Date());
        System.out.println();

        StaticTest staticTest1 = new StaticTest();
        System.out.println(staticTest1.toString() + ", i = " + staticTest1.i);
        StaticTest staticTest2 = new StaticTest();
        System.out.println(staticTest2.toString() + ", i = " + staticTest2.i);
        StaticTest.i++;                   // прямое обращение к статической переменной по имени класса
        System.out.println(StaticTest.i);
    }
}

class StaticTest {
    static int i = 45;
}
