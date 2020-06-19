package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/6/19 9:30
 * @Version 1.0
 * 验证回文串
 */
public class leetcode125 {
    public boolean isPalindrome(String s) {
        if (s == null || "".equals(s)) {
            return true;
        }
        char[] chars = s.toLowerCase().toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if ((chars[i] >= '0' && chars[i] <= '9') || (chars[i] >= 'a' && chars[i] <= 'z')) {
                sb.append(chars[i]);
            }
        }
        int left = 0;
        int right = sb.length() - 1;
        while (left < right) {
            if (sb.charAt(left++) != sb.charAt(right--)) {
                return false;
            }
        }
        return true;
    }
}
