package leetcode;

import java.util.*;

/**
 * @Author ZhangKe
 * @Date 2020/9/7 22:09
 * @Version 1.0
 * 变位词组
 */
public class interview10_02 {
    public static void main(String[] args) {
        interview10_02 l = new interview10_02();
        l.groupAnagrams(new String[] {"eat", "tea", "tan", "ate", "nat", "bat"});
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            List<String> list = map.getOrDefault(String.valueOf(chars),new ArrayList<>());
            list.add(strs[i]);
            map.put(String.valueOf(chars),list);
        }
        return new ArrayList<>(map.values());
    }
}