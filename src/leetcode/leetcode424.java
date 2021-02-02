package leetcode;

/**
 * @Author ZhangKe
 * @Date 2021/2/2 14:08
 * @Version 1.0
 * 替换后的最长重复字符
 */
public class leetcode424 {
    public int characterReplacement(String s, int k) {
        if (s == null || s.length() < 1) {
            return 0;
        }
        int left = 0;
        int max = 1;
        int right = 0;
        int[] a = new int[26];
        for (; right < s.length(); right++) {
            a[s.charAt(right) - 'A']++;
            max = Math.max(max, a[s.charAt(right) - 'A']);
            if (right - left + 1 > max + k) {
                a[s.charAt(left) - 'A']--;
                left++;
            }
        }
        return right - left;
    }
}
