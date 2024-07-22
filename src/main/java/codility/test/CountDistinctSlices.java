package codility.test;

public class CountDistinctSlices {
    public static void main(String[] args) {
        int[] a1 = { 3, 4, 5, 1, 2, 6 };
        int a = 6;
        int result2 = solution(a, a1);
        System.out.println(result2);
    }

    public static int solution(int M, int[] A) {
        System.out.println(5 - 4 + 1);
        boolean[] seen = new boolean[M + 1];
        int leftEnd = 0;
        int rightEnd = 0;
        int numSlice = 0;

        while (leftEnd < A.length && rightEnd < A.length) {

            if (seen[A[rightEnd]] == false) {
                numSlice = numSlice + (rightEnd - leftEnd + 1);
                if (numSlice >= 1_000_000_000)
                    return 1_000_000_000;

                seen[A[rightEnd]] = true;
                rightEnd++;
            }
            else {
                seen[A[leftEnd]] = false;
                leftEnd++;
            }
        }
        return numSlice;
    }
}
