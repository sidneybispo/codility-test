package codility.test;

public class MaxProfit {
    public static void main(String[] args) {
        int[] int1 = { 23171, 21011, 21123, 21366, 21013, 21367 };
        int result1 = solution(int1);
        System.out.println(result1);

        int[] int2 = { 0, 0 };
        int result2 = solution(int2);
        System.out.println(result2);

        int[] int3 = { 4, 4, 2, 5, 3, 4, 4, 4 };
        int result3 = solution(int3);
        System.out.println(result3);

        int[] int4 = { 1, 2, 1, 1, 2, 1 };
        int result4 = solution(int3);
        System.out.println(result4);
    }

    public static int solution(int[] A) {

        if (A.length <= 1)
            return 0;

        int minPrice = A[0];
        int maxProfit = 0;

        for (int i = 1; i < A.length; i++) {
            if (A[i] < minPrice)
                minPrice = A[i];
            else {
                int curProfit = A[i] - minPrice;
                if (curProfit > maxProfit)
                    maxProfit = curProfit;
            }
        }
        return maxProfit;
    }
}
