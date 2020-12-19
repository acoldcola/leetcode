package leetcode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @Author ZhangKe
 * @Date 2020/8/14 11:08
 * @Version 1.0
 * 有效的括号
 */
public class leetcode20 {
    public static void main(String[] args) {
        leetcode20 l = new leetcode20();
        l.isValid("([)]");
    }
    public boolean isValid(String s) {
        if (s == null || "".equals(s)) {
            return true;
        }
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            String str = s.substring(i,i+1);
            if (str.equals("(") || str.equals("[") || str.equals("{")) {
                stack.push(str);
            }else {
                if (stack.isEmpty()) {
                    return false;
                }
                String s1 = stack.pop();
                if (str.equals(")")) {
                    if (!s1.equals("(")) {
                        return false;
                    }
                }else if (str.equals("]")){
                    if (!s1.equals("[")) {
                        return false;
                    }
                }else {
                    if (!s1.equals("{")) {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}
