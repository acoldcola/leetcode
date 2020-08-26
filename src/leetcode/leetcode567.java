package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author ZhangKe
 * @Date 2020/8/25 17:32
 * @Version 1.0
 * 字符串的排列
 */
public class leetcode567 {
    public static void main(String[] args) {
        leetcode567 l = new leetcode567();
        l.checkInclusion("ab" , "eidbaooo");
    }
    boolean flag = false;
    public boolean checkInclusion(String s1, String s2) {
        char[] chars = s1.toCharArray();
        boolean[] used = new boolean[s1.length()];
        StringBuilder sb = new StringBuilder();
        dfs(sb,chars,used,s2);
        return flag;
    }

    private void dfs(StringBuilder sb, char[] chars, boolean[] used,String s2) {
        if (sb.length() == chars.length) {
            if (s2.contains(sb.toString())) {
                flag = true;
                return;
            }
        }else {
            for (int i = 0; i < chars.length; i++) {
                if (!used[i]) {
                    used[i] = true;
                    sb.append(chars[i]);
                    dfs(sb, chars, used, s2);
                    sb.deleteCharAt(sb.length() - 1);
                    used[i] = false;
                }
            }
        }
    }
}