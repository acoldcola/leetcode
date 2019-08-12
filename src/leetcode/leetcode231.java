package leetcode;

/**
 * @auther ZhangKe
 * @date 2019/8/12 17:30
 * 2的幂
 */
public class leetcode231 {
    public boolean isPowerOfTwo(int n) {
        if (n < 1) {
            return false;
        }
        else if (n >= 1) {
            if ((n&(n-1)) == 0) {
                return true;
            }
        }
        return false;
    }
}
