package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/12/15 16:09
 * @Version 1.0
 * 猜数字大小
 */
public class leetcode374 {
    public int guessNumber(int n) {
        int left = 1;
        int right = n;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (guess(mid) == -1) {
                right = mid - 1;
            }else if (guess(mid) == 1) {
                left = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }

    public int guess(int num) {
        if (num > 6) {
            return  -1;
        }else if (num < 6) {
            return 1;
        }else {
            return 0;
        }
    }
}
