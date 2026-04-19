package lessons.lesson_02;

// Это комментарий
// Ctrl + A - выделить текст - весь
// Ctrl + / -  закомментировать повторно то раскомментировать
// Ctrl + Alt + L -  для форматирования кода
// Ctrl + S - сохранить
public class PrimitiveTypesInJava {
    public static void main(String[] args) {
        System.out.println("Какое-то сообщение");
        // 8 примитивных типов в Java

        // 1 byte = 8 bit = 00 01 11 11 = 31 - двоичная или бинарная система исчисления 8 =
        byte byteVariable = 100; // Byte
        byte byteMinValue = Byte.MIN_VALUE; // -128
        System.out.println(byteMinValue);
        byte byteMaxValue = Byte.MAX_VALUE; // 127
        System.out.println(byteMaxValue);
        //byte: -128, - 127, -126 ... -1, 0, 1, 2, ...127  т.е. 0 занимает 1 bit


        // 2byte = 16bit = 00 00 00 00 00 00 00 00
        short shortVariable = 350; // Short
        short shortMinValue = Short.MIN_VALUE; // -32768
        short shorMaxValue = Short.MAX_VALUE; // 32767
        // short -32768...0...32767
//        short shortVar = 100_000;

        //4 byte
        int integerVariable = 100; // Integer
        int integerVariable2 = 200;
        int integerMinValue = Integer.MIN_VALUE; //-2147483648
        int integerMaxValue = Integer.MAX_VALUE; // 2147483647
        //int: -2147483648 ... 0 ... 2147483647

        //8 byte = 64 bit
        long longVariable = 12312312312313L;
        long longMinValue = Long.MIN_VALUE; //-9223372036854775808L
        long longMaxValue = Long.MAX_VALUE; //9223372036854775807L
        System.out.println(9_223_372_036_854_775_807L);
        // девять квадриллионов двести двадцать три триллиона триста семьдесят два миллиарда
        // тридцать шесть миллионов восемьсот пятьдесят четыре тысячи семьсот семь

        float floatVariable = 3.14F; //Float
        double doubleVar = 2.7188232234; //Double

        char charVariable = 'A';
        char charVariable2 = 'b';

        boolean booleanVariable = true;
        booleanVariable = false;

        String someText = "Какой-то текст"; // тип String
        //BigInteger

    }
}
