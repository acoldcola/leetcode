package 竞赛.第232场周赛;

/**
 * @Author ZhangKe
 * @Date 2021/3/14 10:27
 * @Version 1.0
 */
public class test1 {
    public boolean areAlmostEqual(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        int[] a = new int[26];
        int[] b = new int[26];
        int res = 0;
        for (int i = 0; i < s1.length(); i++) {
            a[s1.charAt(i) - 'a']++;
            b[s2.charAt(i) - 'a']++;
            if (s1.charAt(i) != s2.charAt(i)) {
                res++;
            }
        }
        for (int i = 0; i < a.length;i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return res <= 2;
    }
}
