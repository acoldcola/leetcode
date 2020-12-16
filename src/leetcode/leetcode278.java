package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/12/16 14:42
 * @Version 1.0
 * 第一个错误的版本
 */
public class leetcode278 {
    public static void main(String[] args) {
        leetcode278 l = new leetcode278();
        l.firstBadVersion(5);
    }
    public int firstBadVersion(int n) {
        if (n == 0) {
            return 0;
        }
        int left = 1;
        int right = n;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                right = mid;
            }else {
                left = mid + 1;
            }
        }
        return left;
    }

    public boolean isBadVersion(int n) {
        return n >= 4 ? true : false;
    }
}
