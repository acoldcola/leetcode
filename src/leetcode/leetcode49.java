package leetcode;

import java.util.*;

/**
 * @Author ZhangKe
 * @Date 2020/12/14 17:02
 * @Version 1.0
 * 字母异位词分组
 */
public class leetcode49 {
    public static void main(String[] args) {
        leetcode49 l = new leetcode49();
        l.groupAnagrams(new String[] {"eat","tea","tan","ate","nat","bat"});
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> allList = new ArrayList<>();
        if (strs == null || strs.length == 0) {
            return allList;
        }
        Map<String, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String s = String.valueOf(chars);
            List<Integer> list = new ArrayList<>();
            if (map.containsKey(s)) {
                list = map.get(s);
            }
            list.add(i);
            map.put(s,list);
        }
        for (String str : map.keySet()) {
            List<Integer> list = map.get(str);
            List<String> strings = new ArrayList<>();
            for (Integer i : list) {
                strings.add(strs[i]);
            }
            allList.add(strings);
        }
        return allList;
    }
}
