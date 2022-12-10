package Alishev.avancedjava.collections;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Lesson014Queue {
    public static void main(String[] args) {
        //FIFO - первый зашел первый вышел
        People person1 = new People(1);
        People person2 = new People(2);
        People person3 = new People(3);
        People person4 = new People(4);
        People person5 = new People(5);

        Queue<People> queueLinkedList = new ArrayBlockingQueue<People>(10);
        queueLinkedList.add(person3);
        queueLinkedList.add(person4);
        queueLinkedList.add(person5);
        queueLinkedList.add(person1);
        queueLinkedList.add(person2);
        //person 3 -> person4 -> person5...
        System.out.println(queueLinkedList);
        System.out.println();

        for (People element : queueLinkedList) {
            System.out.print(element + ", ");
        }

        System.out.println();
        queueLinkedList.remove(); // по умолчанию удаляет первый элемент из списка
        System.out.println(queueLinkedList);
        System.out.println(queueLinkedList.peek());
        System.out.println(queueLinkedList);
        queueLinkedList.size();

//        queueLinkedList.offer();

    }
}

class People {
    private int id;

    public People(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "People{" +
                "id=" + id +
                '}';
    }
}
