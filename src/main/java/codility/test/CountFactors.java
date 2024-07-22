package codility.test;

public class CountFactors {
    public static void main(String[] args) {

        int result2 = solution(51);
        System.out.println(result2);
    }

    public static int solution(int N) {
        int factors = 0;
        int sq = (int) Math.sqrt(N);
        if (Math.pow(sq, 2) != N) {
            sq++;
        } else {
            factors++;
        }

        for (int i = 1; i < sq; i++) {
            if (N % i == 0) {
                factors += 2;
            }
        }
        return factors;
    }
}
