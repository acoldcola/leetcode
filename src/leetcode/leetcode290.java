package leetcode;

import java.util.*;

/**
 * @Author ZhangKe
 * @Date 2020/12/16 10:25
 * @Version 1.0
 * 简单规律
 */
public class leetcode290 {
    public static void main(String[] args) {
        leetcode290 l = new leetcode290();
        l.wordPattern("jquery","jquery");
    }
    // 自己写的
    /*public boolean wordPattern(String pattern, String s) {
        if (pattern == null || "".equals(pattern)) {
            return false;
        }
        if (s == null || s.length() == 0) {
            return false;
        }
        Map<Character, List<Integer>> firstMap = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char a = pattern.charAt(i);
            List<Integer> list = firstMap.getOrDefault(a,new ArrayList<>());
            list.add(i);
            firstMap.put(a,list);
        }
        Set<List<Integer>> set = new HashSet<>();
        for (Character c : firstMap.keySet()) {
            set.add(firstMap.get(c));
        }
        int size = set.size();
        Map<String,List<Integer>> secondMap = new HashMap<>();
        String[] str = s.split(" ");
        for (int j = 0; j < str.length; j++) {
            List<Integer> list = secondMap.getOrDefault(str[j],new ArrayList<>());
            list.add(j);
            secondMap.put(str[j],list);
        }
        for (String c : secondMap.keySet()) {
            set.add(secondMap.get(c));
        }
        return set.size() == size && pattern.length() == str.length;
    }*/

    // 题解，集合双射
    public boolean wordPattern(String pattern, String s) {
        Map<Character,String> charMap = new HashMap<>();
        Map<String, Character> stringMap = new HashMap<>();
        String[] str = s.split(" ");
        if (str.length != pattern.length()) {
            return false;
        }
        for (int i = 0; i < pattern.length(); i++) {
            if (charMap.containsKey(pattern.charAt(i)) && !charMap.get(pattern.charAt(i)) .equals(str[i])) {
                return false;
            }
            if (stringMap.containsKey(str[i]) && stringMap.get(str[i]) != pattern.charAt(i)) {
                return false;
            }
            charMap.put(pattern.charAt(i),str[i]);
            stringMap.put(str[i], pattern.charAt(i));
        }
        return true;
    }
}
