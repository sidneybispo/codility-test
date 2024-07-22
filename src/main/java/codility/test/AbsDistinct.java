package codility.test;

import java.util.HashSet;
import java.util.Set;

public class AbsDistinct {
    public static void main(String[] args) {
        int[] a1 = { -5, -3, -1, 0, 3, 6 };
        int result2 = solution(a1);
        System.out.println(result2);
    }

    public static int solution(int[] A) {

        Set setA = new HashSet();
        for (int i = 0; i < A.length; i++) {
            setA.add(Math.abs(A[i]));
        }
        return setA.size();

    }
}
