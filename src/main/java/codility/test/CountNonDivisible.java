package codility.test;

import java.util.Arrays;

public class CountNonDivisible {
    public static void main(String[] args) {
        int[] a1 = { 3, 1, 2, 3, 6 };
        int result2[] = solution(a1);
        System.out.println(Arrays.toString(result2));
    }

    public static int[] solution(int[] A) {

        int[][] bucket = new int[A.length * 2 + 1][2];

        for (int a : A) {
            bucket[a][0]++;
            bucket[a][1] = -1;
        }
        for (int a : A) {
            if (bucket[a][1] == -1) {
                bucket[a][1] = 0;
                for (int j = 1; j * j <= a; j++) {
                    if (a % j == 0 && a / j != j) {
                        bucket[a][1] += bucket[j][0];
                        bucket[a][1] += bucket[a / j][0];
                    } else if (a % j == 0 && a / j == j) {
                        bucket[a][1] += bucket[j][0];
                    }
                }
            }
        }
        for (int i = 0; i < A.length; i++) {
            A[i] = A.length - bucket[A[i]][1];
        }
        return A;
    }
}
