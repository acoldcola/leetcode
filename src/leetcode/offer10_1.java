package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/8/25 17:20
 * @Version 1.0
 * 斐波那契数列
 */
public class offer10_1 {
    public static void main(String[] args) {
        offer10_1 offer10_1 = new offer10_1();
        offer10_1.fib(4);
    }
    public int fib(int n) {
        if (n < 2) {
            return n;
        }
        int a = 0;
        int b = 1;
        int c = 0;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
            c = c % 1000000007;
            b = b % 1000000007;
            a = a % 1000000007;
        }
        return c;
    }
}
