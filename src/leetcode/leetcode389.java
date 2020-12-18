package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/12/18 11:04
 * @Version 1.0
 *找不同
 */
public class leetcode389 {
    public char findTheDifference(String s, String t) {
        int[] a = new int[26];
        int[] b = new int[26];
        for (int i = 0; i < s.length(); i++) {
            a[s.charAt(i) - 'a'] += 1;
            b[t.charAt(i) - 'a'] += 1;
        }
        b[t.charAt(t.length() - 1) - 'a'] += 1;
        for (int j = 0; j < a.length; j++) {
            if (a[j] != b[j]) {
                return (char) (j + 'a');
            }
        }
        return 'a';
    }
}
