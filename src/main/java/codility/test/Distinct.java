package codility.test;

import java.util.HashSet;
import java.util.Set;

public class Distinct {
    public static void main(String[] args) {
        int[] in2 = { 4, 5, 6 };
        int result = solution(in2);
        System.out.println(result);
    }

    public static int solution(int[] A) {
        // write your code in Java SE 8
        Set set = new HashSet();
        for (int i = 0; i < A.length; i++) {
            set.add(A[i]);
        }
        return set.size();
    }
}
