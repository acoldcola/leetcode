package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/6/4 17:57
 * @Version 1.0
 * 丑数
 */
public class Interview49 {
    public int nthUglyNumber(int n) {
        if (n <= 1) {
            return n;
        }
        int i = 1;
        int res = 0;
        while (n > 1) {
            i++;
            if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0) {
                res = i;
                n--;
            }
        }
        return res;
    }
}
