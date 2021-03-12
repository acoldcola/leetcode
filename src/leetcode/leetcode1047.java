package leetcode;

/**
 * @Author ZhangKe
 * @Date 2021/3/9 9:53
 * @Version 1.0
 * 删除字符串中的所有相邻重复项
 */
public class leetcode1047 {
    public static String removeDuplicates(String S) {
        if (S.length() == 1) {
            return S;
        }
        int i = 1;
        while (i < S.length()) {
            if (i > 0 && S.charAt(i) == S.charAt(i - 1)) {
                S = S.substring(0,i-1) + S.substring(i + 1);
                i--;
            }else {
                i++;
            }
        }
        return S;
    }
}
