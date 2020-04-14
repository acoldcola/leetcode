package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/4/14 15:53
 * @Version 1.0
 * 第 N 个泰波那契数
 */
public class leetcode1137 {
    public static void main(String[] args) {
        leetcode1137 leetcode1137 = new leetcode1137();
        leetcode1137.tribonacci(4);
    }
    public int tribonacci(int n) {
        if (n <= 1) {
            return n;
        }
        if (n == 2) {
            return 1;
        }
        int f0 = 0;
        int f1 = 1;
        int f2 = 1;
        int sum = 0;
        for (int i = 3; i <= n; i++) {
            sum = f0 + f1 + f2;
            f0 = f1;
            f1 = f2;
            f2 = sum;
        }
        return sum;
    }
}
