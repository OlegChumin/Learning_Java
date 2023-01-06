package quiz;

import java.util.Optional;

public class SampleOptional {
    interface I{
        String generate();

        default void print(String value){
            System.out.println(Optional.ofNullable(value).orElseGet(this::generate));
        }
    }

    public static void main(String[] args) {
        ((I) () -> "Hello!").print(null);
    }
}
