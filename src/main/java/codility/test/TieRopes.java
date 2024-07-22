package codility.test;

public class TieRopes {
    public static void main(String[] args) {
        int[] a1 = { 1, 2, 3, 4, 1, 1, 3 };
        int k = 4;
        int result = solution(k, a1);
        System.out.println(result);
    }

    public static int solution(int K, int[] A) {
        int N = A.length;
        int cnt = 0;
        int sum = 0;

        for (int i = 0; i < N; i++) {
            sum += A[i];
            if (sum >= K) {
                cnt++;
                sum = 0;
            }
        }
        return cnt;
    }
}
