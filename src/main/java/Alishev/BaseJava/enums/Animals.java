package Alishev.BaseJava.enums;

public enum Animals {
    DOG("собака"), // new DOG("собака")
    CAT("кошка"),
    FROG("лягушка");
    private String translation;
    private Animals(String translation) {     // конструктор в Enum принято делать private
        // но он по умолчанию private, чтобы нельзя было создавать новые объекты этого класса
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "translation='" + translation + '\'' +
                '}';
    }
}
