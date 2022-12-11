package Java_Nail_Alishev.old.BaseJava;

public class Lesson16ParamMethods {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        dog1.name = "Уильям";
        dog1.age = 6;
        dog2.name = "Эрна";
        dog2.age = 11;
        dog1.weight = 45.7;
        dog2.weight = 21.8;
        dog1.calculateYearofBorn();
        dog2.calculateYearofBorn();
        double totalWeight = Dog.calculateSummaryDogsWeight(dog1.weight, dog2.weight);
        System.out.println("Вес собак: " +totalWeight);
    }
}

class Dog {
    String name;
    int age;
    double weight;

    void calculateYearofBorn() {
        int year = 2021 - age;
        System.out.println("Год рождения собаки " + name + " :" + year);
    }
    // метод объявлен статическим чтобы был виден в классе и мождно было не создавать объект для его вызова
    static double calculateSummaryDogsWeight(double weightDog1, double weightDog2) {
        double weight = weightDog1 + weightDog2 ;
        return weight;
    }
}
