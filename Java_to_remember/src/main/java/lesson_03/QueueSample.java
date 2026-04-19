package lesson_03;

import java.util.LinkedList;
import java.util.Queue;

public class QueueSample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.offer("Element 1");
        queue.offer("Element 2");
        queue.offer("Element 3");

        System.out.println("Голова очереди " + queue.peek());

        System.out.println("Удаляем с очереди " + queue.poll());
        System.out.println("Удаляем с очереди " + queue.poll());

        queue.offer("Element 4");

        System.out.println("Голова очереди " + queue.peek());

        while (!queue.isEmpty()) {
            System.out.println("Удаляем из очереди " + queue.poll());
        }

    }
}
