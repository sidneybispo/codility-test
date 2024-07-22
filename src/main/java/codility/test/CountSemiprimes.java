package codility.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountSemiprimes {
    public static void main(String[] args) {
        int n = 26;
        int[] a1 = { 1, 4, 16 };
        int[] a2 = { 26, 10, 20 };
        int result2[] = solution(n, a1, a2);
        System.out.println(Arrays.toString(result2));
    }

    public static int[] solution(int N, int[] P, int[] Q) {

        boolean[] primeArray = new boolean[N + 1];

        Arrays.fill(primeArray, true);
        primeArray[0] = false;
        primeArray[1] = false;
        int sqrtN = (int) Math.sqrt(N);
        for (int i = 2; i < sqrtN; i++) {
            int j = i + i;
            for (j = j; j <= N; j = j + i) {
                primeArray[j] = false;
            }
        }

        List<Integer> primeList = new ArrayList<>();
        for (int i = 2; i <= N; i++) {
            if (primeArray[i] == true) {
                primeList.add(i); // "i" is prime
            }
        }

        boolean[] semiprimeArray = new boolean[N + 1];
        Arrays.fill(semiprimeArray, false);
        long semiprimeTemp;
        for (int i = 0; i < primeList.size(); i++) {
            for (int j = i; j < primeList.size(); j++) {
                semiprimeTemp = (long) primeList.get(i) * (long) primeList.get(j);
                if (semiprimeTemp > N) {
                    break;
                } else {
                    semiprimeArray[(int) semiprimeTemp] = true;
                }
            }
        }

        int[] semiprimeCumulateCount = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            semiprimeCumulateCount[i] = semiprimeCumulateCount[i - 1];
            if (semiprimeArray[i] == true) {
                semiprimeCumulateCount[i]++;
            }
        }

        int numQuery = Q.length;
        int[] result = new int[numQuery];
        for (int i = 0; i < numQuery; i++) {
            result[i] = semiprimeCumulateCount[Q[i]] - semiprimeCumulateCount[P[i] - 1];
        }
        return result;
    }
}
