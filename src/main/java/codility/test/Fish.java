package codility.test;

import java.util.Stack;

public class Fish {
    public static void main(String[] args) {
        int[] in1 = { 4, 5, 3, 2, 1 };
        int[] in2 = { 0, 1, 0, 0, 0 };
        int result = solution(in1, in2);
        System.out.println(result);
    }

    public static int solution(int[] A, int[] B) {
        final int UPSTREAM = 0;

        Stack fishStack = new Stack();
        fishStack.push(new Fish1(A[0], B[0]));

        for (int i = 1; i < A.length; i++) {
            Fish1 f1 = (Fish1) fishStack.peek();
            if (B[i] == f1.direction) {
                fishStack.push(new Fish1(A[i], B[i]));
            } else if (f1.direction == UPSTREAM) {

                fishStack.push(new Fish1(A[i], B[i]));
            } else {

                while (!fishStack.isEmpty()) {

                    f1 = (Fish1) fishStack.peek();
                    if (f1.direction == B[i]) {
                        fishStack.push(new Fish1(A[i], B[i]));
                        break;
                    } else {
                        f1 = (Fish1) fishStack.peek();
                        if (f1.size > A[i]) {
                            break;
                        } else {
                            fishStack.pop();
                            continue;
                        }
                    }
                }
                if (fishStack.isEmpty()) {
                    fishStack.push(new Fish1(A[i], B[i]));

                }
            }
        }
        return fishStack.size();
    }

}

class Fish1 {
    public int size;
    public int direction;

    Fish1(int pSize, int pDirection) {
        size = pSize;
        direction = pDirection;
    }
}
