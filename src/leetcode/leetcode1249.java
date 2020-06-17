package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

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
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(') {
                stack.add(i);
            }
            if (chars[i] == ')') {
                if (!stack.isEmpty()) {
                    stack.pop();
                }else {
                    list.add(i);
                }
            }
        }
        while (!stack.isEmpty()) {
            list.add(stack.pop());
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if (!list.contains(i)) {
                sb.append(chars[i]);
            }
        }
        return sb.toString();
    }
}
