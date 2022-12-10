package DevMasters2021.tasks290821;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Baseboard0 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());    // baseboard/plinth lengths reading
        int L = Integer.parseInt(reader.readLine());    // summary length required

        int numOfPlinth = 0;
        if (L % n > 0) {
            numOfPlinth = Math.round(L / n) + 1;
        } else numOfPlinth = Math.round(L / n);

        System.out.println(numOfPlinth);
    }

}
