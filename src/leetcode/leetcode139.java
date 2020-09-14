package leetcode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author ZhangKe
 * @Date 2020/9/14 16:55
 * @Version 1.0
 * 单词拆分
 */
public class leetcode139 {
    public static boolean wordBreak(String s, List<String> wordDict) {
        if (wordDict == null || wordDict.size() < 1) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        Map<String, Boolean> map = new HashMap<>();
        return dfs(s, wordDict, sb, map);
    }

    private static boolean dfs(String s, List<String> wordDict, StringBuilder sb, Map<String, Boolean> map) {
        // 剪枝
        if (!s.startsWith(sb.toString())) {
            return false;
        }
        if (map.containsKey(sb.toString())) {
            return map.get(sb.toString());
        }
        if (sb.length() > s.length()) {
            return false;
        }
        if (sb.length() == s.length()) {
            return s.equals(sb.toString());
        }
        boolean res = false;
        for (int i = 0; i < wordDict.size(); i++) {
            sb.append(wordDict.get(i));
            res = res || dfs(s, wordDict, sb, map);
            if (res) {
                break;
            }
            sb.delete(sb.length() - wordDict.get(i).length(), sb.length());
        }
        // 记忆化
        map.put(sb.toString(), false);
        return res;
    }
}
