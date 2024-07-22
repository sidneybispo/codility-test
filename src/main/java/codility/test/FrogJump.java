package codility.test;

public class FrogJump {
    public static void main(String[] args) {
        int result = solution(10, 85, 30);
        System.out.println (result);
    }

    public static int solution(int X, int Y, int D) {
        // write your code in Java SE 8
        int remJump  = Y-X;
        int CountJump = (int)remJump/D;
        int rem = remJump%D;
        if (rem!=0) {
            CountJump++;
        }
        return CountJump;
    }
}

