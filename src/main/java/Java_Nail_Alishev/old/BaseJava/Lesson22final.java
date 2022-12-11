package Java_Nail_Alishev.old.BaseJava;

public class Lesson22final {
    public static void main(String[] args) {
    final int XXX = 10;
        System.out.println(XXX);
//        XXX = 5; // невозможно!
    }
}

class Test22 {
    public static final int SIZE = 0;

//    Test22(int size) {
//        this.SIZE = size;
//    }

//    public void setSIZE(int x) {
//        this.SIZE = x;
//    }  невозможно задать значение для константы заново
}
