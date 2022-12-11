package Java_Nail_Alishev.old.collections;

import java.util.Stack;

public class Lesson015Stack {
    public static void main(String[] args) {
        //class Vector is old
        //Arraylist == Vector(synchronized) deprecated --> Stack

        Stack<Integer> stack = new Stack<>(); //LIFO
        // 5 <- 3 <- 1 <-
        stack.push(5);
        stack.push(3);
        stack.push(1);

        System.out.println(stack);
//        System.out.println(stack.pop()); // достает последний добавленный элемент
//        System.out.println(stack);
//        System.out.println(stack.peek()); // не извлекает а только показывает
//        stack.pop();
//        System.out.println(stack.peek());
//        stack.pop();
//        System.out.println(stack.peek());
//        stack.pop(); // будет ошибка нет элементов больше
        while (!stack.empty()) {
            System.out.println(stack.peek() + " -> " + stack.pop()); //
        }
        System.out.println(stack);

    }
}
