package Java_Nail_Alishev.old.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Lesson009HashAndEquals {
    public static void main(String[] args) {
        //ключи в map уникальны
        //элементы в Set уникальны не может быть два одинаковых

//        Map<Integer, String> map = new HashMap<>();
//        Set<Integer> set = new HashSet<>();
//
//        map.put(1, "Один");
//        map.put(1, "Другое значение");
//
//        set.add(1);
//        set.add(1);

//        System.out.println(map);
//        System.out.println();
//        System.out.println(set);
//        System.out.println();

        Person person1 = new Person(1, "Mike");
        Person person2 = new Person(1, "Mike");

        Map<Person, String> hashMap = new HashMap<>();
        Set<Person> hashSet = new HashSet<>();

        hashMap.put(person1, "123");
        hashMap.put(person2, "123");

        hashSet.add(person1);
        hashSet.add(person2);

        System.out.println(hashMap);
        System.out.println(hashSet);

//        Set<String> setString = new HashSet<>();
//        setString.add("Hello");
//        setString.add("Hello");
//        System.out.println(setString);
//
//        String str1 = "testing string";
//        String str2 = "testing string";
//        String str3 = new String(str1);
//        String str4 = str2;
//        System.out.println(str1 == str2); // String Pool объекты полюбому равны
//        System.out.println(str1.equals(str2)); //ссылки на тот же объект из-за String Pool
//        System.out.println();
//        System.out.println(str3 == str2);
//        System.out.println(str3 == str1);
//        System.out.println();
//        System.out.println(str4 == str2);


    }
}

class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
    /*
     * Контракт hashcode() equals()
     * 1. вызывается hashcode(), если == то все ОК если нет то объекты точно разные тогда стоп (быстрое сравнение)
     * 2. hashcode(1) = hashcode(2) возможно два одинаковых объекта или коллизия hashcode
     * 3. в этом случае вызывается метод equals() который дает точный ответ, но equals() медленный  */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o; //cast to Person Type

        if (id != person.id) return false;
        return name != null ? name.equals(person.name) : person.name == null;
    }

    // {object} -> {int}
    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
