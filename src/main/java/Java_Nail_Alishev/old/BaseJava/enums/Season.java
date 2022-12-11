package Java_Nail_Alishev.old.BaseJava.enums;

public enum Season {
    SUMMER(27), WINTER(-10), AUTUMN(10), SPRING(12);

    private int temperature;

    Season(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }
}
