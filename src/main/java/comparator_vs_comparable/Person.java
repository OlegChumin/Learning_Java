package comparator_vs_comparable;

import java.util.Comparator;

/**
 * Comparator и Comparable оба являются интерфейсами в Java, которые используются для определения порядка сортировки
 * объектов, но есть несколько ключевых различий между ними:
 *
 * Реализация: Comparable является интерфейсом, который должен быть реализован самим классом объектов, которые требуется
 * сортировать. В этом интерфейсе определен метод compareTo(), который принимает объект того же типа и возвращает
 * отрицательное, положительное число или ноль в зависимости от порядка сортировки объектов. Реализация Comparable
 * определяет естественный порядок сортировки для объектов данного класса.
 * Пример реализации Comparable:
 * */
public class Person implements Comparable<Person> {
    private String name;
    private int age;

    // ... конструктор, геттеры, сеттеры

    @Override
    public int compareTo(Person other) {
        return this.age - other.age;
    }
}

/**
 * Comparator, с другой стороны, является отдельным интерфейсом, который определяет метод compare().
 * Этот метод принимает два объекта и возвращает отрицательное, положительное число или ноль в зависимости от порядка
 * сортировки объектов. Comparator позволяет определить несколько разных стратегий сортировки для одного и того же
 * класса объектов, и его реализация не влияет на естественный порядок сортировки объектов.
 *
 * Пример реализации Comparator:
 * */

class EmployeeNameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        int nameComparison = e1.getName().compareTo(e2.getName());
        if (nameComparison != 0) {
            return nameComparison;
        } else {
            return e1.getSurname().compareTo(e2.getSurname());
        }
    }
}

/**
 * Гибкость: Comparable ограничивает вас одной реализацией сортировки для каждого класса, в то время как Comparator
 * позволяет определить несколько разных способов сортировки для одного и того же класса объектов. Это делает Comparator
 * более гибким и позволяет легко менять стратегию сортировки в зависимости от требований.
 *
 * Сортировка коллекций: При использовании Collections.sort() и Arrays.sort() с объектами, реализующими Comparable,
 * вы можете вызвать эти методы без дополнительного аргумента, и сортировка будет выполнена согласно естественному
 * порядку сортировки, определенному в compareTo(). Если же вы хотите использовать Comparator, то вам нужно передать
 * экземпляр Comparator в качестве аргумента в эти методы.
 *
 * Вкратце, Comparable используется для определения естественного порядка сортировки объектов
 * */

