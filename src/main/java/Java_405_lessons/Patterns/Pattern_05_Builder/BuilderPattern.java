package Java_405_lessons.Patterns.Pattern_05_Builder;

public class BuilderPattern {
    public static void main(String[] args) {
        NewPerson newPerson = new NewPersonBuilderImpl()
                .setPersonName("Max")
                .setPersonAge(22)
                .setSalary(190_000.)
                .build();

        System.out.println(newPerson);
    }
}

class NewPerson{
    String name;
    int age;
    double salary;

    @Override
    public String toString() {
        return "NewPerson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}

interface NewPersonBuilder{
    NewPersonBuilder setPersonName(String name);
    NewPersonBuilder setPersonAge(int age);
    NewPersonBuilder setSalary(double salary);
    NewPerson build();
}

class NewPersonBuilderImpl implements NewPersonBuilder{
    NewPerson newPerson = new NewPerson();

    @Override
    public NewPersonBuilder setPersonName(String name) {
        newPerson.name = name;
        return this;
    }

    @Override
    public NewPersonBuilder setPersonAge(int age) {
        newPerson.age =  age;
        return this;
    }

    @Override
    public NewPersonBuilder setSalary(double salary) {
        newPerson.salary = salary;
        return this;
    }

    @Override
    public NewPerson build() {
        return newPerson;
    }
}
