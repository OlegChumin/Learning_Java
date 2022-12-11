package Java_Nail_Alishev.old.BaseJava;

public class Lesson30primitives {
    public static void main(String[] args) {
        byte typeByte;
        short typeShort;
        int typeInt;
        long typeLong;
        float typeFloat;
        double typeDouble;

        typeFloat = 12.2f; //для float надо ставить f или F
        typeLong = 1_000_000_000_000L;  //по умолчанию int и данное число слишком большое надо ставить L
        typeInt = (int )typeLong;  //приведение к типу int

        System.out.println(typeInt);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Byte.MAX_VALUE);
        typeByte = (byte) 129;
        System.out.println(typeByte);
    }
}
