package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/4/22 20:31
 * @Version 1.0
 * 3的幂
 */
public class leetcode326 {
    public static void main(String[] args) {
        isPowerOfThree(-3);
    }
    public static boolean isPowerOfThree(int n) {
        if (n == 0) {
            return false;
        }
        while (n > 1 || n < -1) {
            if (n % 3 != 0) {
                return false;
            }
            n /= 3;
        }
        return true;
    }
}