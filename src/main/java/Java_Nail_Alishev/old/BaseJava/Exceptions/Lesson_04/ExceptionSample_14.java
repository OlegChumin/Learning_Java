package Java_Nail_Alishev.old.BaseJava.Exceptions.Lesson_04;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class ExceptionSample_14 {
    public static void main(String[] args) {
        try {
            run();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    public static void run() throws IOException, FileNotFoundException, IllegalArgumentException, ParseException {

    }
}