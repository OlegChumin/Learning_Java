package toptal;

public class Solution {
    public int solution(int[] A, int S) {
        int count = 0;
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == S) count++;
        }

        for (int i = 0; i < A.length-1; i++) {
            if ((A[i] + A[i + 1]) / 2 == S) count++;
        }
        for (int i = 0; i < A.length-2; i++) {
            if ((A[i] + A[i + 1] + A[i + 2]) / 3 == S) count++;
        }
        for (int i = 0; i < A.length-3; i++) {
            if ((A[i] + A[i + 1] + A[i + 2] + A[i + 3]) / 4 == S) count++;
        }
        return count;
    }

    public int mean(int[] tempArray) {
        int mean = 0;
        if (tempArray.length > 0) {
            int sum = 0;
            for (int i = 0; i < tempArray.length; i++) {
                sum += tempArray[i];
            }
            mean = Math.round(sum / tempArray.length);
        }
        return mean;
    }

}
