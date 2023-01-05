package Java_405_lessons.MemoryAndGarbageCollector;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GCII {
    public static void main(String[] args) throws InterruptedException {
        method();
    }

    private static void method() throws InterruptedException {
        Runtime runtime = Runtime.getRuntime(); // создаем объект Runtime
        System.out.println("Total memory before MB" + runtime.totalMemory()/1024/1024); // выводим на экран общее количество памяти до ..
        System.out.println("Free memory before MB" + runtime.freeMemory()/1024/1024); //выводим объем свободной памяти до..
        System.out.println();
        System.out.println("Создаем " + Integer.MAX_VALUE/10 + " объектов.");
        List<Date> dateList = new ArrayList<>();
        for (int i = 0; i < Integer.MAX_VALUE/10; i++) {
            Date date = new Date();
            dateList.add(date);
            //date = null; //удаляем ссылку на объект
        }
        dateList = null;
        System.out.println();
        System.out.println("Total memory after MB" + runtime.totalMemory()/1024/1024); // выводим на экран общее количество памяти после ..
        System.out.println("Free memory after MB" + runtime.freeMemory()/1024/1024); //выводим объем свободной памяти после..

        System.out.println("запускаем GC");
        System.gc(); // запускаем GC
        System.out.println("Total memory after MB" + runtime.totalMemory()/1024/1024); // выводим на экран общее количество памяти после ..
        System.out.println("Free memory after MB" + runtime.freeMemory()/1024/1024); //выводим объем свободной памяти после..
        System.out.println();
        System.out.println("запускаем GC еще раз");
        System.gc(); // запускаем GC
        System.out.println("Total memory after MB" + runtime.totalMemory()/1024/1024); // выводим на экран общее количество памяти после ..
        System.out.println("Free memory after MB" + runtime.freeMemory()/1024/1024); //выводим объем свободной памяти после..
        System.out.println();
        Thread.sleep(5500);
        System.out.println("запускаем GC 3 раз");
        System.gc(); // запускаем GC
        System.out.println("Total memory after MB" + runtime.totalMemory()/1024/1024); // выводим на экран общее количество памяти после ..
        System.out.println("Free memory after MB" + runtime.freeMemory()/1024/1024); //выводим объем свободной памяти после..
        for (int i = 0; i < 50; i++) {
            System.out.println();
            Thread.sleep(500);
            System.out.println("запускаем GC "+ i +" раз");
            System.gc(); // запускаем GC
            System.out.println("Total memory after MB" + runtime.totalMemory()/1024/1024); // выводим на экран общее количество памяти после ..
            System.out.println("Free memory after MB" + runtime.freeMemory()/1024/1024); //выводим объем свободной памяти после..
        }
        Thread.sleep(10000);
        System.out.println("Total memory after MB" + runtime.totalMemory()/1024/1024); // выводим на экран общее количество памяти после ..
        System.out.println("Free memory after MB" + runtime.freeMemory()/1024/1024); //выводим объем свободной памяти после..
    }
}
