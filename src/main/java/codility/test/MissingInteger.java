package codility.test;

import java.util.Arrays;

public class MissingInteger {
    public static void main(String[] args) {
        int input[] = { 3, 4, 4, 6, 1, 4, 4 };
        int result = solution(input);
        System.out.println(result);
    }

    public static int solution(int[] A) {
        Arrays.sort(A);
        int counter = 0;
        int previous = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] > 0) {
                if (previous != A[i]) {
                    counter++;
                    if (A[i] != counter) {
                        return counter;
                    }
                }
                previous = counter;
            }
        }
        if (counter >= 0) {
            return counter + 1;
        }
        return 1;
    }
}
