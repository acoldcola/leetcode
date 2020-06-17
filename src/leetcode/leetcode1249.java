package leetcode;

import java.util.*;

/**
 * @Author ZhangKe
 * @Date 2020/6/17 11:07
 * @Version 1.0
 * 移除无效的括号
 */
public class leetcode1249 {
    public String minRemoveToMakeValid(String s) {
        if (s == null || "".equals(s)) {
            return null;
        }
        char[] chars = s.toCharArray();
        Stack<Integer> stack = new Stack<>();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(') {
                stack.add(i);
            }
            if (chars[i] == ')') {
                if (!stack.isEmpty()) {
                    stack.pop();
                }else {
                    set.add(i);
                }
            }
        }
        while (!stack.isEmpty()) {
            set.add(stack.pop());
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if (!set.contains(i)) {
                sb.append(chars[i]);
            }
        }
        return sb.toString();
    }
}
