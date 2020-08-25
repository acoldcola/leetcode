package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author ZhangKe
 * @Date 2020/8/25 14:58
 * @Version 1.0
 * 字母大小写全排列
 */
public class leetcode784 {
    private List<String> list = new ArrayList<>();
    public List<String> letterCasePermutation(String S) {
        if (S == null || "".equals(S)){
            return list;
        }
        char[] chars = new char[S.length()];
        dfs(0,S,S.length(),chars);
        return list;
    }

    private void dfs(int i, String S, int length, char[] chars) {
        if (i == length){
            list.add(new String(chars));
            return;
        }
        chars[i] = S.charAt(i);
        dfs(i + 1,S,length,chars);
        if (Character.isLetter(S.charAt(i))){
            chars[i] = (char) (S.charAt(i) ^ (1 << 5));
            dfs (i + 1,S,length,chars);
        }
    }
}
