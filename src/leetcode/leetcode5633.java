package leetcode;

/**
 * @Author ZhangKe
 * @Date 2021/1/9 22:30
 * @Version 1.0
 */
public class leetcode5633 {
    public static void main(String[] args) {
        totalMoney(10);
    }
    public static int totalMoney(int n) {
        int res = 0;
        int a = 1;
        for (int i = 0; i < n; i++) {
            if (i % 7 == 0) {
                a = i / 7 + 1;
            }
            res += a;
            a++;
        }
        return res;
    }
}
