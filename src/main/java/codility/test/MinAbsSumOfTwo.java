package codility.test;

import java.util.Arrays;

    public class MinAbsSumOfTwo {

        public static void main(String[] args) {
            int[] a1 = { -8, 4, 5, -10, 3 };
            int result2 = solution2(a1);
            System.out.println(result2);
        }

        private static byte solution2(int[] a1) {
            return 0;
        }

        public static int solution(int[] A) {
            int N = A.length;
            Arrays.sort(A);
            int tail = 0;
            int head = N - 1;
            int minAbsSum = Math.abs(A[tail] + A[head]);
            while (tail <= head) {
                int currentSum = A[tail] + A[head];
                minAbsSum = Math.min(minAbsSum, Math.abs(currentSum));

                if (currentSum <= 0)
                    tail++;
                else
                    head--;
            }
            return minAbsSum;
        }
    }