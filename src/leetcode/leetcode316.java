package leetcode;

import java.util.*;

/**
 * @Author ZhangKe
 * @Date 2020/12/21 14:52
 * @Version 1.0
 * 去除重复字母
 */
public class leetcode316 {
    public static void main(String[] args) {
        leetcode316 l = new leetcode316();
        l.removeDuplicateLetters("bbcaac");
    }

    public String removeDuplicateLetters(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char charAt = s.charAt(i);
            if (stack.contains(charAt)) {
                int cou = map.get(charAt);
                map.put(charAt, --cou);
                continue;
            }
            while (!stack.isEmpty() && stack.peek() > charAt && map.get(stack.peek()) > 1) {
                char c = stack.pop();
                int cou = map.get(c);
                map.put(c, --cou);
            }
            stack.push(charAt);
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}
