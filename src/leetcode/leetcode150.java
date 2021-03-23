package leetcode;

import java.util.Stack;

/**
 * @Author ZhangKe
 * @Date 2021/3/20 12:55
 * @Version 1.0
 */
public class leetcode150 {
    public static void main(String[] args) {
        evalRPN(new String[]{"4","13","5","/","+"});
    }
    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            if ("/".equals(tokens[i])) {
                int a = stack.pop();
                int b = stack.pop();
                stack.add(b / a);
            }else if ("*".equals(tokens[i])) {
                int a = stack.pop();
                int b = stack.pop();
                stack.add(b * a);
            }else if ("-".equals(tokens[i])) {
                int a = stack.pop();
                int b = stack.pop();
                stack.add(b - a);
            }else if ("+".equals(tokens[i])) {
                int a = stack.pop();
                int b = stack.pop();
                stack.add(b + a);
            }else {
                stack.add(Integer.valueOf(tokens[i]));
            }
        }
        return stack.peek();
    }
}
