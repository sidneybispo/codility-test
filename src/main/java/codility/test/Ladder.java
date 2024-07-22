package codility.test;

import java.util.Arrays;

public class Ladder {
    public static void main(String[] args) {
        int[] a1 = { 4, 4, 5, 5, 1 };
        int[] a2 = { 3, 2, 4, 3, 1 };
        int[] result2 = solution(a1, a2);
        System.out.println(Arrays.toString(result2));
    }

    public static int[] solution(int[] A, int[] B) {

        int L = A.length;
        int[] fib = new int[L + 2];
        int[] result = new int[L];
        fib[1] = 1;
        fib[2] = 2;
        for (int i = 3; i <= L; i++) {
            fib[i] = (fib[i - 1] + fib[i - 2]) % (1 << 30);
        }
        for (int i = 0; i < L; i++) {
            result[i] = fib[A[i]] % (1 << B[i]);
        }
        return result;
    }
}
