package prefix_tree;

import java.util.Random;
import java.io.PrintWriter;
import java.io.IOException;

public class PlateNumbersGenerator {
    public static void main(String[] args) {
        Random random = new Random();
        try {
            PrintWriter writer = new PrintWriter("src/main/resources/numbers.txt", "UTF-8");
            for (int i = 0; i < 100; i++) {
                char letter1 = (char) (random.nextInt(26) + 'A');
                char letter2 = (char) (random.nextInt(26) + 'A');
                int number = random.nextInt(10000);  // Генерирует число от 0 до 9999
                writer.println(String.format("18%s%04d", "" + letter1 + letter2, number));
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
