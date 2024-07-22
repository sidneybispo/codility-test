package codility.test;

import java.util.Arrays;

public class CountTriangles {
    public static void main(String[] args) {
        int[] a1 = { 10, 2, 5, 1, 8, 12 };
        int result2 = solution(a1);
        System.out.println(result2);
    }

    public static int solution(int[] A) {
        int N = A.length;
        if (N < 3)
            return 0;
        Arrays.sort(A);
        int result = 0;
        for (int i = 0; i < N; i++) {
            int k = i + 1;
            for (int j = i + 1; j < N; j++) {
                while (k < N && A[i] + A[j] > A[k]) {
                    k++;
                }
                result += k - j - 1;
            }
        }
        return result;
    }
}
