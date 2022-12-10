package EKIDS.Lessons.Lesson10;

public class CatNew {
    String name;
    int age;
    float weight;

    public CatNew(String name, int age, float weight) {
        if (name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Введите кличку");
        }

        if (age > 0 && age < 35) {
            this.age = age;
        }

        if (weight > 0.1F && weight < 600.F) {
            this.weight = weight;
        }
    }
}
