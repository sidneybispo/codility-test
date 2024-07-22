package codility.test;

public class TapeEquilibrium {
    public TapeEquilibrium() {

    }

    public static void main(String[] args) {
        int input[] = {-1000, 1000};
        int result = solution(input);
        System.out.println (result);
    }

    public static int solution(int[] A) {
        int sumA =0, sumB = 0, sum = 0;

        for(int i=0; i<A.length; i++) {
            sum += A[i];
        }

        int minDifference = Integer.MAX_VALUE;
        int currentDifference = Integer.MAX_VALUE;

        for( int i =1 ; i<A.length; i++){
            sumA += A[i-1];
            sumB = sum-sumA;
            currentDifference = (int) Math.abs(sumA - sumB);
            minDifference = Math.min(currentDifference, minDifference);
        }
        return minDifference;
    }
}
