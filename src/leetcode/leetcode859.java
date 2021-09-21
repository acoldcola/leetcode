package leetcode;

/**
 * @Author ZhangKe
 * @Date 2021/9/21 20:12
 * @Version 1.0
 * 亲密字符串
 */
public class leetcode859 {
    public boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        if (s.equals(goal)) {
            int[] sum = new int[26];
            for (int i = 0; i < s.length(); i++) {
                if (sum[s.charAt(i) - 'a'] > 0) {
                    return true;
                }
                sum[s.charAt(i) - 'a'] ++;
            }
            return false;
        }
        int[] a = new int[2];
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                if (res == 2) {
                    return false;
                }
                a[res ++] = i;
            }
        }
        if (res <= 1) {
            return false;
        }
        if (s.charAt(a[0]) != goal.charAt(a[1]) ||
        s.charAt(a[1]) != goal.charAt(a[0])) {
            return false;
        }
        return true;
    }
}
