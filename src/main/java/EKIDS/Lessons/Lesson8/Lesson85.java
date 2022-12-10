package EKIDS.Lessons.Lesson8;

import java.util.Scanner;

public class Lesson85 {
    public static void main(String[] args) {
        Person person1 = new Person("Вася", 10, "Moscow");
        System.out.println(person1);
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String str2 = scanner.next();

        if (scanner.hasNextInt()) {
            int x = scanner.nextInt();
        } else {
            System.out.println("Не вводите ерунду только число");
        }
    }
}

class Person {
    String name;
    int age;
    String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
