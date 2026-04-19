package Part_02_Interfaces_Comparable_and_Comparator.ContractComparator;

import java.util.Comparator;
import java.util.Objects;
import java.util.TreeSet;

/**
 * Пример проблемы
 * Рассмотрим класс Person и компаратор AgeComparator, который сравнивает объекты Person по возрасту.
 * Если equals не будет переопределен в компараторе, то это может вызвать проблемы при использовании структур
 * данных, таких как TreeSet, которые полагаются на компараторы для поддержания порядка элементов.
 */

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    // Переопределение equals и hashCode для Person
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Person person = (Person) obj;
        return age == person.age && name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }

    public static class AgeComparator implements Comparator<Person> {
        @Override
        public int compare(Person p1, Person p2) {
            return Integer.compare(p1.getAge(), p2.getAge());
        }

        // equals не переопределен
        @Override
        public boolean equals(Object obj) {
            return this == obj || obj != null && getClass() == obj.getClass();
        }

    }

    public static class AgeNameComparator implements Comparator<Person> {
        @Override
        public int compare(Person p1, Person p2) {
            int ageComparison = Integer.compare(p1.getAge(), p2.getAge());
            if (ageComparison != 0) {
                return ageComparison;
            }
            return p1.name.compareTo(p2.name);
        }
    }


    public static void main(String[] args) {
        AgeComparator ageComparator = new AgeComparator();
        AgeNameComparator ageNameComparator = new AgeNameComparator();
        //TreeSet<Person> people = new TreeSet<>(ageComparator);
        TreeSet<Person> people = new TreeSet<>(ageNameComparator);
        /**
         * Ожидаемое поведение:
         * TreeSet должен содержать только уникальные элементы по возрасту, так как мы используем AgeComparator.
         * Но если метод equals не переопределен, то поведение может быть непредсказуемым.
         * В данном примере TreeSet использует компаратор для определения порядка и уникальности элементов.
         * Если метод equals компаратора не переопределен, TreeSet может неправильно определять, какие элементы
         * считаются равными. В итоге TreeSet может содержать дублирующиеся элементы с одинаковым возрастом,
         * что нарушает контракт множества (set).
         */

        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 25)); // Дубликат по возрасту

        for (Person person : people) {
            System.out.println(person);
        }
    }
}
