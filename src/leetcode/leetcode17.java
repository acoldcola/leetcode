package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author ZhangKe
 * @Date 2020/8/26 9:47
 * @Version 1.0
 * 电话号码的字母组合
 */
public class leetcode17 {
    Map<Character, String> map = new HashMap<Character, String>() {{
        put('2', "abc");
        put('3', "def");
        put('4', "ghi");
        put('5', "jkl");
        put('6', "mno");
        put('7', "pqrs");
        put('8', "tuv");
        put('9', "wxyz");
    }};
    public List<String> letterCombinations(String digits) {
        if (digits == null || "".equals(digits)){
            return new ArrayList<>();
        }
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        dfs(0,digits,sb,list);
        return list;
    }

    private void dfs(int start, String digits, StringBuilder sb, List<String> list) {
        if (sb.length() == digits.length()) {
            list.add(sb.toString());
        }else {
            char chr = digits.charAt(start);
            String str = map.get(chr);
            int size = str.length();
            for (int i = 0; i < size; i ++) {
                sb.append(str.charAt(i));
                dfs(start + 1,digits,sb,list);
                sb.deleteCharAt(start);
            }
        }
    }
}
