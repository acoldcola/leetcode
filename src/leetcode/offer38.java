package leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author ZhangKe
 * @Date 2020/8/25 13:41
 * @Version 1.0
 *字符串的排列
 */
public class offer38 {
    public static void main(String[] args) {
        offer38 o = new offer38();
        o.permutation("abc");
    }
    private Set<String> set = new HashSet<>();
    public String[] permutation(String s) {
        char[] chars = s.toCharArray();
        boolean[] used = new boolean[s.length()];
        StringBuilder sb = new StringBuilder();
        dfs(chars,used,sb);
        String[] str = new String[set.size()];
        int i = 0;
        for(String s1 : set){
            str[i++] = s1;
        }
        System.out.println(str.toString());
        return str;
    }

    private void dfs(char[] chars, boolean[] used, StringBuilder sb) {
        if (sb.length() == chars.length) {
            set.add(sb.toString());
        }
        for (int i = 0; i < chars.length; i++) {
            if (used[i] == false){
                used[i] = true;
                sb.append(chars[i]);
                dfs(chars,used,sb);
                sb.deleteCharAt(sb.length() - 1);
                used[i] = false;
            }
        }
    }
}
