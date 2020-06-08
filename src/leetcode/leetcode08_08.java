package leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author ZhangKe
 * @Date 2020/6/5 17:41
 * @Version 1.0
 * 有重复字符串的排列组合
 */
public class leetcode08_08 {
    public static void main(String[] args) {
        leetcode08_08 leetcode08_08 = new leetcode08_08();
        leetcode08_08.permutation("qqq");
    }
    public Set<String> set = new HashSet<>();
    public int size = 0;
    public String[] permutation(String S) {
        if (S == null || "".equals(S)) {
            return new String[0];
        }
        char[] chars = S.toCharArray();
        size = chars.length;
        boolean[] used = new boolean[size];
        dfs(0,new StringBuilder(),used,chars);
        String[] strings = new String[set.size()];
        int i = 0;
        for (String h : set) {
            strings[i++] = h;
        }
        return strings;
    }

    public void dfs(int deep,StringBuilder sb,boolean[] used,char[] chars) {
        if (deep == size) {
            set.add(sb.toString());
            return;
        }
        for (int i = 0;i < size;i++) {
            if (!used[i]) {
                used[i] = true;
                sb.append(chars[i]);
                dfs(deep + 1,sb,used,chars);
                used[i] = false;
                sb.deleteCharAt(sb.length()-1);
            }
        }
    }
}
