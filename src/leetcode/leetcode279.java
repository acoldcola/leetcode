package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/4/17 16:54
 * @Version 1.0
 * 完全平方数
 */
public class leetcode279 {
    public static void main(String[] args) {
        leetcode279 leetcode279 = new leetcode279();
        leetcode279.numSquares(12);
    }
    public int numSquares(int n) {
        if (n == 0) {
            return 0;
        }
        int sum = 0;
        int x = n;
        while (n > 0) {
            if ((int)Math.sqrt(n) - Math.sqrt(n) == 0) {
                sum++;
                n = x - n;
                x = n;
            }else {
                n--;
            }
        }
        return sum;
    }
}
