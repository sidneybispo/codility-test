package codility.test;

public class CountDiv {
    public static void main(String[] args) {
        int result = solution(0,50,4);
        System.out.println(result);
    }

    public static int solution(int A, int B, int K) {
        int firstCount =0;
        int allCount =0;
        if (B==0)
            return 1;
        if (A>1){
            firstCount = (int)(A-1)/K;
        }
        allCount = (int)B/K;
        if (A==0)
            allCount++;
        return allCount-firstCount;
    }
}
