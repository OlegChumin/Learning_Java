package lessons.lesson_07;

public class Main_2 {
    public static void main(String[] args) {
        Person personJohn = new Person();
        personJohn.name = "John";
        personJohn.surName = "Smith";
        personJohn.age = 25;

        System.out.println(personJohn.name + " " + personJohn.surName + " " + personJohn.age);

        personJohn.surName = "Ivanov";

        System.out.println(personJohn.name + " " + personJohn.surName + " " + personJohn.age);


        NewPerson newPersonAndrew = new NewPerson();
        newPersonAndrew.setName("Andrew");
        newPersonAndrew.setSurName("Petrov");
        newPersonAndrew.setAge(12);
        System.out.println( newPersonAndrew.getName() + " " + newPersonAndrew.getSurName() + " " + newPersonAndrew.getAge() );

        newPersonAndrew.canDo();
    }
}

class Person {
    public String name;
    public String surName;
    public int age;

}

class NewPerson {
    private String name;
    private String surName;
    private int age;

    //Alt + Insert

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private void cannotDoSomething() {
        System.out.println("Can't do");
    }

    public void canDo() {
        System.out.println("Can do");
        cannotDoSomething();
    }
}
