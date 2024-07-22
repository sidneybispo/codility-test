package codility.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxProductOfThree {
    public static void main(String[] args) {
        int[] in2 = { 4, 5, 6 };
        int result = solution(in2);
        System.out.println(result);
    }

    public static int solution(int[] A) {
        List aList = new ArrayList();
        for(int i=0; i<A.length; i++) {
            aList.add(A[i]);
        }
        Collections.sort(aList);

        int product1, product2, product3, product4 = 0;

        product1 = (int)aList.get(0) * (int)aList.get(1) * (int)aList.get(2);
        product2 = (int)aList.get(aList.size()-3) * (int)aList.get(aList.size()-2) * (int)aList.get(aList.size()-1);
        product3 = (int)aList.get(0) * (int)aList.get(1) * (int)aList.get(aList.size()-1);
        product4 = (int)aList.get(0) * (int)aList.get(aList.size()-2) * (int)aList.get(aList.size()-1);

        int max1 = Math.max(product1, product2);
        int max2 = Math.max(product3, product4);

        return Math.max(max1, max2);
    }
}
