package Alishev.BaseJava.lesson34wildcards;

public class Pet {
    private int id;

    public Pet() {
    }

    public Pet(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return String.valueOf(id);
    }
}
