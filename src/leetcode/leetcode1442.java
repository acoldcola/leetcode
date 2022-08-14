package leetcode;

/**
 * @Author ZhangKe
 * @Date 2022/8/14 14:44
 * @Version 1.0
 *  分割字符串的最大得分
 */
public class leetcode1442 {
    public static void main(String[] args) {
        maxScore("00");
    }
    public static int maxScore(String s) {
        if (s == null || "".equals(s)) {
            return 0;
        }
        int[] a = new int[s.length()];
        int[] b = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            if (i == 0) {
                if (s.charAt(i) == '0') {
                    a[i] = 1;
                }else {
                    b[i] = 1;
                }
                continue;
            }
            if (s.charAt(i) == '0') {
                a[i] = a[i-1] + 1;
                b[i] = b[i-1];
            }else {
                a[i] = a[i-1];
                b[i] = b[i-1] + 1;
            }
        }
        int res = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            res = Math.max(res,a[i] + b[s.length() - 1] - b[i]);
        }
        return res;
    }
}
