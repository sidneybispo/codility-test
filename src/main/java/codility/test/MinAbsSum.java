package codility.test;

import java.util.Arrays;

public class MinAbsSum {
    public static void main(String[] args) {
        int[] a1 = { 1, 5, 2, -2 };
        int result = solution(a1);
        System.out.println(result);
    }

    public static int solution(int[] A) {
        if (A.length == 0)
            return 0;
        if (A.length == 1)
            return A[0];

        int sum = 0;
        int max = A[0];

        for (int i = 0; i < A.length; i++) {
            A[i] = Math.abs(A[i]);
            sum += A[i];
            max = Math.max(A[i], max);
        }

        int[] count = new int[max + 1];
        for (int num : A) {
            count[num]++;
        }

        int[] dp = new int[sum + 1];
        Arrays.fill(dp, -1);

        dp[0] = 0;

        for (int i = 0; i <= max; i++) {
            if (count[i] > 0) {
                for (int val = 0; val <= sum; val++) {
                    if (dp[val] >= 0)
                        dp[val] = count[i];
                    else if (val >= i && dp[val - i] > 0) {
                        dp[val] = dp[val - i] - 1;
                    }
                }
            }
        }

        int result = sum;
        for (int i = 0; i <= sum / 2; i++) {
            if (dp[i] >= 0)
                result = Math.min(result, sum - (2 * i));
        }
        return result;
    }
}
