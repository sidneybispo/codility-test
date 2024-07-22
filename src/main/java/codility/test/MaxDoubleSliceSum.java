package codility.test;

public class MaxDoubleSliceSum {
    public static void main(String[] args) {

        int[] int2 = { 3, 2, 6, -1, 4, 5, -1, 2 };
        int result2 = solution(int2);
        System.out.println(result2);
    }

    public static int solution(int[] A) {
        int[] slice1LocalMax = new int[A.length];
        int[] slice2LocalMax = new int[A.length];

        for (int i = 1; i < A.length - 1; i++) {
            slice1LocalMax[i] = Math.max(slice1LocalMax[i - 1] + A[i], 0);
        }

        for (int i = A.length - 2; i > 0; i--) {
            slice2LocalMax[i] = Math.max(slice2LocalMax[i + 1] + A[i], 0);
        }

        int maxDoubleSliceSum = 0;

        for (int i = 1; i < A.length - 1; i++) {
            maxDoubleSliceSum = Math.max(maxDoubleSliceSum, slice1LocalMax[i - 1] + slice2LocalMax[i + 1]);
        }

        return maxDoubleSliceSum;
    }
}
