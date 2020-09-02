package leetcode;

import java.util.*;

/**
 * @Author ZhangKe
 * @Date 2020/9/2 15:54
 * @Version 1.0
 * 根据字符出现频率排序
 */
public class leetcode451 {
    public static void main(String[] args) {
        leetcode451 l = new leetcode451();
        l.frequencySort("tree");
    }
    public String frequencySort(String s) {
        TreeMap<Character, Integer> map = new TreeMap<>();
        if(s == null || "".equals(s) ||s.length() <= 2) {
            return s;
        }
        for (int i = 0; i < s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        List<Map.Entry<Character,Integer>> list = new ArrayList<Map.Entry<Character,Integer>>(map.entrySet());
        Collections.sort(list,new Comparator<Map.Entry<Character,Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Character, Integer> e: list) {
            for (int i = 0; i < e.getValue(); i++) {
                sb.append(e.getKey());
            }
        }
        return sb.toString();
    }
}
