package codility.test;

import java.util.HashMap;

public class GenomicRangeQuery {
    public static void main(String[] args) {

        String s = "CAGCCTA";
        int[] in1 = {2, 5, 0};
        int[] in2 = {4, 5, 6};
        int[] result = solution(s, in1, in2);
        System.out.println(result);
    }

    public static int[] solution(String S, int[] P, int[] Q) {
        int[] r = new int[Q.length];
        HashMap<String, Integer> dna = new HashMap<String, Integer>();
        dna.put("A", 1);
        dna.put("C", 2);
        dna.put("G", 3);
        dna.put("T", 4);

        for (int i = 0; i<P.length; i++){
            int min = Integer.MAX_VALUE;
            for (int j = P[i]; j<=Q[i]; j++){

                System.out.println("j:" + j);
                char s =S.charAt(j);
                String str =String.valueOf(s);
                int curVal = dna.get(str);
                if (min> curVal){
                    min = curVal;
                }
            }
            r[i] = min;
        }
        return r;
    }
}
