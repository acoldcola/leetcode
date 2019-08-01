package leetcode;

/**
 * @auther ZhangKe
 * @date 2019/2/1 10:49
 */
public class leetcode509 {
    public int fib(int N) {
        if (N == 0)
            return 0;
        if (N == 1)
            return 1;
        else
            return fib(N - 1) + fib(N - 2);
    }
}
