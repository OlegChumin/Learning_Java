package Alishev.avancedjava.collections.Lesson005MyLinkedList;

import java.util.Arrays;

public class MyLinkedList {
    private Node head;
    private int size; // инициализация не требуется, поскольку поле по умолчанию у примитива int = 0

    public void add(int value) {
        // если это первое добавление в список
        if (head == null) {
            this.head = new Node(value);    // создание головного узла
            //то здесь будет какая-то логика
        } else { // если не первое добавление то реализуем логику
            Node temp = head;

            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(new Node(value));
            // [1] --> [2] --> [3] ... (Node: node1...node2...node3)
        }
        size++; // увеличиваем счетчик добавления узлов
    }

    public int get(int index) {
        int currentIndex = 0;
        Node temp = head;
        while (temp != null) {
            if (currentIndex == index) {
                return temp.getValue();
            } else {
                temp = temp.getNext();
                currentIndex++;
            }
        }
        throw new IllegalArgumentException(); //превышение номера аргумента над размером list
    }

    public void remove(int index) {
        if(index == 0) {
            head = head.getNext();
            return;
        }

        int currentIndex = 0;
        Node temp = head;
        while (temp != null) {
            if (currentIndex == index - 1) {
                temp.setNext(temp.getNext().getNext()); //перескакиваем через удаляемый узел чтобы линк был на следующий после
                size--;
                return;
            } else {
                temp = temp.getNext();
                currentIndex++;
            }
        }
    }

    @Override
    public String toString() {
        int[] result = new int[size];
        int index = 0;
        Node temp = head;
        while (temp != null) {
            result[index++] = temp.getValue();
            temp = temp.getNext();
        }
        return Arrays.toString(result);
    }

    private static class Node {
        private int value;
        private Node next;

        // конструктор который требует при создании нового объекта типа Node внесения целочисленного значений объекту
        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

}
