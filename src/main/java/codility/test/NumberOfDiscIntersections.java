package codility.test;

import java.util.Arrays;

public class NumberOfDiscIntersections {
    public static void main(String[] args) {

        int[] in2 = {8, 4, 5, 6,10,15,25 };
        int result = solution(in2);
        System.out.println(result);
    }

    public static int solution(int[] A) {
        if (A.length < 3)
            return 0;

        Arrays.sort(A);

        long[] aOrdered = new long[A.length];
        int index = 0;
        for (Integer i : A) {
            aOrdered[index++] = i;
        }

        for (int i = aOrdered.length - 1; i >= 2; i--) {
            if (aOrdered[i - 1] + aOrdered[i - 2] > aOrdered[i]) {
                return 1;
            }
        }
        return 0;
    }
}
