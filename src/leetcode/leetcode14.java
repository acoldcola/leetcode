package leetcode;

/**
 * @auther ZhangKe
 * @date 2019/8/12 15:34
 * 最长公共前缀
 */
public class leetcode14 {
    public static void main(String[] args) {
        String[] strs = {"ca", ""};
        longestCommonPrefix(strs);
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length < 1) {
            return "";
        }
        int temp = strs[0].length();
        int p = 0;
        for (int i = 0; i < strs.length; i++) {
            if (temp > strs[i].length()) {
                temp = strs[i].length();
                p = i;
            }
        }
        char[] chars = strs[p].toCharArray();
        int[] x = new int[chars.length];
        for (int i = 0; i < strs.length; i++) {
            char[] a = strs[i].toCharArray();
            for (int j = 0; j < chars.length; j++) {
                if (chars[j] == a[j]) {
                    x[j] = x[j] + 1;
                }
            }
        }
        int count = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] != strs.length) {
                break;
            }
            count++;
        }
        if (count == 0) {
            return "";
        }
        return strs[p].substring(0, count);
    }
}
