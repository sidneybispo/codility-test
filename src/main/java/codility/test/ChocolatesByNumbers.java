package codility.test;

public class ChocolatesByNumbers {
    public static void main(String[] args) {
        int a1 = 10;
        int a2 = 4;
        int result2 = solution(a1, a2);
        System.out.println(result2);
    }

    public static int solution(int N, int M) {
        return N / gcdByDivision(N, M);
    }

    public static int gcdByDivision(int A, int B) {
        if(A % B == 0) return B;
        else           return gcdByDivision(B, A % B);
    }
}
