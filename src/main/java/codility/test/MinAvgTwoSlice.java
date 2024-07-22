package codility.test;

public class MinAvgTwoSlice {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        String s = "CAGCCTA";
        int[] in1 = { 2, 5, 0 };
        int[] in2 = { 4, 5, 6 };
        int result = solution(in2);
        System.out.println(result);
    }

    public static int solution(int[] A) {

        int sum1, sum2 = 0;
        double minAverage = Double.MAX_VALUE;
        double currentAverage1 = Double.MAX_VALUE;
        double currentAverage2 = Double.MAX_VALUE;
        int minAverageSliceIndex = 0;
        for (int i = 0; i < A.length - 2; i++) {
            sum1 = A[i] + A[i + 1];
            currentAverage1 = sum1 / 2.0d;
            if (currentAverage1 < minAverage) {
                minAverage = currentAverage1;
                minAverageSliceIndex = i;
            }

            sum2 = sum1 + A[i + 2];
            currentAverage2 = sum2 / 3.0d;
            if (currentAverage2 < minAverage) {
                minAverage = currentAverage2;
                minAverageSliceIndex = i;
            }
        }

        currentAverage1 = (A[A.length - 2] + A[A.length - 1]) / 2.0d;
        if (currentAverage1 < minAverage) {
            minAverage = currentAverage1;
            minAverageSliceIndex = A.length - 2;
        }

        return minAverageSliceIndex;
    }
}
