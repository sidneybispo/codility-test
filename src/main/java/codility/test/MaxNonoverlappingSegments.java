package codility.test;

public class MaxNonoverlappingSegments {
    public static void main(String[] args) {
        int[] a1 = { 1, 3, 7, 9, 9 };
        int[] a2 = { 5, 6, 8, 9, 10 };
        int result = solution(a1, a2);
        System.out.println(result);
    }

    public static int solution(int[] A, int[] B) {
        int N = A.length;
        if (N <= 1) {
            return N;
        }

        int cnt = 1;
        int prev_end = B[0];

        int curr;
        for (curr = 1; curr < N; curr++) {
            if (A[curr] > prev_end) {
                cnt++;
                prev_end = B[curr];
            }
        }

        return cnt;
    }
}
