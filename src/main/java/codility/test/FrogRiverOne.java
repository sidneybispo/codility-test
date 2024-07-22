package codility.test;

import java.util.HashSet;
import java.util.Set;

public class FrogRiverOne {
    public FrogRiverOne() {

    }

    public static void main(String[] args) {
        int input[] = {1,3,1,1,2,3,4,7,6,5,7,8};
        int result = solution(6, input);
        System.out.println (result);
    }

    public static int solution(int X, int[] A) {
        // write your code in Java SE 8
        int sec =0;
        Set setA = new HashSet();

        for( int i =0; i< A.length; i++){
            if(A[i]<= X){
                setA.add(A[i]);
            }
            if (setA.size() == X){
                return i;
            }

        }
        return -1;
    }

}
