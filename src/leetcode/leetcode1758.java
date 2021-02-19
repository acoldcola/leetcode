package leetcode;

/**
 * @Author ZhangKe
 * @Date 2021/2/19 10:15
 * @Version 1.0
 * 生成交替二进制字符串的最少操作数
 */
public class leetcode1758 {
    public int minOperations(String s) {
        int sum = 0;
        int sum1 = 0;
        char[] a = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (a[i] % 2 == i % 2) {
                sum++;
            }else {
                sum1++;
            }
        }
        return Math.min(sum,sum1);
    }
}
