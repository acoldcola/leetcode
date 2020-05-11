package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/5/11 10:24
 * @Version 1.0
 * Pow(x, n)
 */
public class leetcode50 {
    public static void main(String[] args) {
        myPow(2.00000 ,-2147483648);
    }
    public static double myPow(double x, int n) {
        double sum = 1.0;
        long a = n;
        a = Math.abs(a);
        while (a > 0) {
            if (a % 2 == 1) {
                sum *= x;
            }
            x *= x;
            a /= 2;
        }
        return n > 0 ? sum : 1 / sum;
    }
}
