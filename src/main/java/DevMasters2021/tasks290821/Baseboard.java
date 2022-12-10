package DevMasters2021.tasks290821;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baseboard {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());    // baseboard/plinth lengths reading
        int L = Integer.parseInt(reader.readLine());    // summary length required

        System.out.println(findMinNumOfPlinth(n, L));
    }

    public static int findMinNumOfPlinth(int n, int L) {
        int numOfPlinth = 0;
        if (L%n > 0) {
            numOfPlinth = Math.round(L / n) + 1;
        return numOfPlinth;}
        else numOfPlinth = Math.round(L / n);
            return numOfPlinth;
    }
}
