package Java_Nail_Alishev.old.BaseJava;

public class Lesson42Equals {
    public static void main(String[] args) {
        int x = 1, y = 1;
        System.out.println(x == y);
        Animalz animalz1 = new Animalz(1);  // animalz1 --> {1}
        Animalz animalz2 = new Animalz(1);  // animalz2 --> {1}
        System.out.println(animalz1 == animalz2);
        System.out.println(animalz1.equals(animalz2));
        Object object = new Object();
        object.equals(object);
        String str1 = "Hello", str2 = "Hello";
        System.out.println(str1.equals(str2));

    }
}

class Animalz {
    private int id;

    public Animalz(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        Animalz animalz = (Animalz) o;
        return this.id == animalz.id;
    }


}