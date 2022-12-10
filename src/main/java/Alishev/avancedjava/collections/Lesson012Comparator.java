package Alishev.avancedjava.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lesson012Comparator {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();
        animals.add("cat");
        animals.add("dog");
        animals.add("frog");
        animals.add("bird");
        animals.add("a");
        animals.add("flying Duck");

        System.out.println(animals);
        Collections.sort(animals); //сортировка лексикографически -> естественный порядок
        System.out.println(animals);
        Collections.sort(animals, new StringLengthComparator());
        System.out.println(animals);
        System.out.println();

        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(0);
        numbers.add(500);
        numbers.add(100);
        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println(numbers);
        Collections.sort(numbers, new BackwardsIntegerComparator());
        System.out.println(numbers);
//        Collections.sort(numbers, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                if (o1 > o2) {
//                    return -1;
//                } else if (o1 < o2) {
//                    return 1;
//                } else {
//                    return 0;
//                }
//            }
//        });
        // лямбда функция - в данном случае анонимный метод (анонимного класса) реализующий интерфейс Comparator
        Collections.sort(numbers, (o1, o2) -> {
            {
                if (o1 > o2) {
                    return -1;
                } else if (o1 < o2) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
        // когда не устраивает естественный порядок сортировки, а нужен свой существует interface Comparator
        System.out.println();
        List<Person500> people = new ArrayList<>();
        people.add(new Person500(1, "Oleg"));
        people.add(new Person500(5, "Vasia"));
        people.add(new Person500(3, "Man"));
        System.out.println(people);

        Collections.sort(people, new Comparator<Person500>() {
            @Override
            public int compare(Person500 o1, Person500 o2) {
                if (o1.getId() > o2.getId()) {
                    return 1;
                } else if (o1.getId() < o2.getId()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        }); //не задан порядок по умолчанию
        System.out.println(people);

    }
}

class StringLengthComparator implements Comparator<String> {
    /*
     * Если o1 > o2 -> 1;
     * если o1 < o2 -> -1;
     * если o1 == o2 -> 0 */
    @Override //компаратор для сортировки по длине строк
    public int compare(String o1, String o2) {
        if (o1.length() > o2.length()) {
            return 1;
        } else if (o1.length() < o2.length()) {
            return -1;
        } else {
            return 0;
        }
    }
}

class BackwardsIntegerComparator implements Comparator<Integer> {

    @Override //сортировка по убыванию
    public int compare(Integer o1, Integer o2) {
        if (o1 > o2) {
            return -1;
        } else if (o1 < o2) {
            return 1;
        } else {
            return 0;
        }
    }
}

// Comparator для сравнения объектов
class Person500 {
    private int id;
    private String name;

    public Person500(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Person500{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

}
