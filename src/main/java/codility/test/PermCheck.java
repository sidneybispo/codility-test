package codility.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PermCheck {
    public static void main(String[] args) {
        int input[] = { 1, 3, 1, 1, 2, 3, 4, 7, 6, 5, 7, 8 };
        int result = solution(input);
        System.out.println(result);
    }

    public static int solution(int[] A) {
        Arrays.sort(A);
        Set<Integer> set1 = new HashSet<Integer>();
        for (int a : A) {
            set1.add(a);
        }
        int sLen = set1.size();
        int iLen = A.length;
        if (sLen != iLen)
            return 0;

        if (A[iLen - 1] == sLen) {
            return 1;
        } else {
            return 0;
        }
    }
}
