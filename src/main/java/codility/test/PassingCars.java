package codility.test;

public class PassingCars {
    public static void main(String[] args) {
        int input[] = { 3, 4, 4, 6, 1, 4, 4 };
        int result = solution(input);
        System.out.println(result);
    }

    public static int solution(int[] A) {
        int zeros = 0;
        int carPasses = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) {
                zeros++;
            } else if (A[i] == 1) {
                carPasses += zeros;
                if (carPasses > 1000000000) {
                    return -1;
                }
            }
        }
        return carPasses;
    }
}
