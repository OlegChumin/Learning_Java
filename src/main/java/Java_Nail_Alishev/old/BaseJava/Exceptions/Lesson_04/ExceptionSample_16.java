package Java_Nail_Alishev.old.BaseJava.Exceptions.Lesson_04;

import java.io.IOException;
import java.text.ParseException;

public class ExceptionSample_16 {
    public static void main(String[] args) {
        try {
            run();
        } catch (IOException | ParseException e) {
            e.printStackTrace(); //Предоставляет программный доступ к сведениям трассировки стека,
            // напечатанным с помощью printStackTrace().
        }
    }

    public static void run() throws IOException, ParseException {
    }
}