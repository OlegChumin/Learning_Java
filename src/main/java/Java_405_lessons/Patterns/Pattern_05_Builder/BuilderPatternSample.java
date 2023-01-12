package Java_405_lessons.Patterns.Pattern_05_Builder;

public class BuilderPatternSample {
    public static void main(String[] args) {
        Stuff stuff = (Stuff) new Stuff().setEmployeeName("Oleg").setEmployeeSalary(10_000.50).build();

    }
}
