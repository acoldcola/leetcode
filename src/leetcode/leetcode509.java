package leetcode;

/**
 * @auther ZhangKe
 * @date 2019/2/1 10:49
 */
public class leetcode509 {
    public int fib1(int N) {
        if (N == 0)
            return 0;
        if (N == 1)
            return 1;
        else
            return fib1(N - 1) + fib1(N - 2);
    }

    public int fib2(int N) {
        if (N == 0) {
            return 0;
        }
        if (N == 1) {
            return 1;
        }
        int a = 0;
        int b = 1;
        int c = 1;
        for (int i = 2; i <= N; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
}
