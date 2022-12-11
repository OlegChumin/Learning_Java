package Java_Nail_Alishev.old.BaseJava;

public class Lesson24Object {
    public static void main(String[] args) {
        Rocket rocket = new Rocket(51, 307650, "Союз");
        System.out.println(rocket);
        rocket.toString(); // возвращает хеш-код объекта, его уникальный номер
        System.out.println(rocket.toString());
        System.out.println(rocket);
    }
}

class Rocket {
    private int height, weight;
    private String name;

    public Rocket(int height, int weight, String name) {
        this.height = height;
        this.weight = weight;
        this.name = name;
    }

    @Override   //переопределили метод toString для вывода необходимой нам информации
    public String toString() {
        return height + " , " + weight + " , " + name;
    }
}
