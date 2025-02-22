package codility.test;

public class FibFrog {
    public static void main(String[] args) {
        int[] a1 =  {0,0,0,1,1,0,1,0,0,0,0};
        int result2 = solution(a1);
        System.out.println(result2);
    }

    public static int solution(int[] a) {
        final int[] fib = new int[a.length < 2 ? 2 : a.length + 1];
        fib[0] = 1;
        fib[1] = 2;
        int fs = 2;
        while(fib[fs - 1] <= a.length) {
            fib[fs] = fib[fs - 1] + fib[fs - 2];
            fs++;
        }
        int result = -1;
        for (int i = 0; i <= a.length; i++) {
            if (i == a.length || a[i] == 1) {
                int min = Integer.MAX_VALUE;
                for (int j = 0; j < fs && fib[j] <= i + 1; j++) {
                    final int from = i - fib[j];
                    if (from == -1) {
                        min = 1;
                    } else if (a[from] > 0) {
                        if (a[from] + 1 < min) {
                            min = a[from] + 1;
                        }
                    }
                }
                if (i < a.length) {
                    if (min == Integer.MAX_VALUE) {
                        a[i] = 0;
                    } else {
                        a[i] = min;
                    }
                } else {
                    if (min != Integer.MAX_VALUE) {
                        result = min;
                    }
                }
            }
        }
        return result;
    }
}
