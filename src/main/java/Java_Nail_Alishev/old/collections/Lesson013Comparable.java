package Java_Nail_Alishev.old.collections;

import java.util.*;

public class Lesson013Comparable {
    public static void main(String[] args) {
        List<Person100> peopleList = new ArrayList<>();
        Set<Person100> peopleSet = new TreeSet<>();
        addElements(peopleList);
        addElements(peopleSet);

        System.out.println(peopleList);
        Collections.sort(peopleList);
        System.out.println(peopleList);
        System.out.println();
        System.out.println(peopleSet);
//        Collections.sort(peopleSet);
//        System.out.println(peopleSet);
    }

    private static void addElements(Collection collection) { //ClassCastException
        collection.add(new Person100(1, "Oleg"));
        collection.add(new Person100(5, "Olaf"));
        collection.add(new Person100(7, "Gag"));
        collection.add(new Person100(3, "Leonid"));
    }
}

class Person100 implements Comparable<Person100> {
    private int id;
    private String name;

    public Person100(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person100 person100 = (Person100) o;

        if (id != person100.id) return false;
        return name != null ? name.equals(person100.name) : person100.name == null;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Person100{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

//    @Override // сортировка по id
//    public int compareTo(Person100 o) {
//        if (this.id > o.getId()) {
//            return 1;
//        } else if (this.id < o.getId()) {
//            return - 1;
//        } else {
//            return 0;
//        }
//    }

    @Override // сортировка по name (при это у TreeSet автоматически отсортирует и Collections.sort у него не сработает
    public int compareTo(Person100 o) {
        if (this.name.length() > o.getName().length()) {
            return 1;
        } else if (this.name.length() < o.getName().length()) {
            return -1;
        } else {
            return 0;
        }
    }
}


