package materials.lesson_02_05.JavaDoc;

public class PrimitiveTypesExample {

    public static void main(String[] args) {
        // byte: 8-bit signed integer
        byte minValueByte = Byte.MIN_VALUE; // -128
        byte maxValueByte = Byte.MAX_VALUE; // 127
        // Произношение: минус сто двадцать восемь, сто двадцать семь

        // short: 16-bit signed integer
        short minValueShort = Short.MIN_VALUE; // -32,768
        short maxValueShort = Short.MAX_VALUE; // 32,767
        // Произношение: минус тридцать две тысячи семьсот шестьдесят восемь,
        // тридцать две тысячи семьсот шестьдесят семь

        // int: 32-bit signed integer
        int minValueInt = Integer.MIN_VALUE; // -2,147,483,648
        int maxValueInt = Integer.MAX_VALUE; // 2,147,483,647
        // Произношение: минус два миллиарда сто сорок семь миллионов четыреста восемьдесят три тысячи
        // шестьсот сорок восемь, два миллиарда сто сорок семь миллионов четыреста восемьдесят три тысячи шестьсот сорок семь

        // long: 64-bit signed integer
        long minValueLong = Long.MIN_VALUE; // -9,223,372,036,854,775,808
        long maxValueLong = Long.MAX_VALUE; // 9,223,372,036,854,775,807
        // Произношение: минус девять квинтиллионов двести двадцать три квадриллиона триста семьдесят два
        // триллиона тридцать шесть миллиардов восемьсот пятьдесят четыре миллиона семьсот семьдесят пять тысяч восемьсот восемь, девять квинтиллионов двести двадцать три квадриллиона триста семьдесят два триллиона тридцать шесть миллиардов восемьсот пятьдесят четыре миллиона семьсот семьдесят пять тысяч восемьсот семь

        // float: 32-bit floating point
        float minValueFloat = Float.MIN_VALUE; // 1.4E-45
        float maxValueFloat = Float.MAX_VALUE; // 3.4028235E38
        // Произношение: один пятнадцатый десятичной десятичной десятой в степени сорок пять, три десятичной десятичной десятой в степени тридцать восемь

        // double: 64-bit floating point
        double minValueDouble = Double.MIN_VALUE; // 4.9E-324
        double maxValueDouble = Double.MAX_VALUE; // 1.7976931348623157E308
        // Произношение: четыре девятых десятичной десятичной десятой в степени триста двадцать четыре, один в десятой десятичной десятой десятой в степени триста шестьдесят девять триллионов триста тридцать четыре квадриллиона восемьсот шестьдесят два триллиона сто семьдесят миллиардов пятьсот тридцать один миллион семьсот шестьдесят три тысячи сто семь

        // char: 16-bit Unicode character
        char minValueChar = Character.MIN_VALUE; // '\u0000'
        char maxValueChar = Character.MAX_VALUE; // '\uffff'
        // Произношение: символ с нулевым кодом Юникода, символ с максимальным кодом Юникода

        // boolean: true or false
        boolean trueValue = true;
        boolean falseValue = false;
        // Произношение: тру, фолс
    }
}
