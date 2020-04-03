package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/3/25 10:04
 * @Version 1.0
 * 数字 1 的个数
 */
public class leetcode233 {
    public static void main(String[] args) {
        System.out.println(countDigitOne(13));
    }
    public static int countDigitOne(int n) {
        if (n == 0) {
            return 0;
        }
        int num = 0;
        for (int i =n ; i >=1 ;i--) {
            int x = i;
            while (x > 0) {
                int m = x % 10;
                if (m == 1) {
                    num ++;
                }
                x/=10;
            }
        }
        return num;
    }
}
