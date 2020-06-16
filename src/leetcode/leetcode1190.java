package leetcode;

import java.util.Stack;

/**
 * @Author ZhangKe
 * @Date 2020/6/16 17:47
 * @Version 1.0
 * 反转每对括号间的子串
 */
public class leetcode1190 {
    public static void main(String[] args) {
        leetcode1190 leetcode1190 = new leetcode1190();
        leetcode1190.reverseParentheses("(abcd)");
    }
    public String reverseParentheses(String s) {
        if (s == null || "".equals(s)) {
            return null;
        }
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(') {
                stack.push(i);
            }
            if (chars[i] == ')'){
                reverse(chars,stack.pop() + 1,i - 1);
            }
        }
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '(' && chars[i] != ')') {
                sb.append(chars[i]);
            }
        }
        return sb.toString();
    }
    public void reverse(char[] chars, int left ,int right) {
        while (left < right) {
            char temp = chars[left];
            chars[left++] = chars[right];
            chars[right--] = temp;
        }
    }
}
