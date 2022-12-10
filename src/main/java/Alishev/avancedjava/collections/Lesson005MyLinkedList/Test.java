package Alishev.avancedjava.collections.Lesson005MyLinkedList;

public class Test {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
//        System.out.println(list.get(5));  IllegalArgumentException

        list.remove(1);
        System.out.println(list);
        list.remove(1);
        System.out.println(list);

    }
}
