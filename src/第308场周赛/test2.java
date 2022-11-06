package 第308场周赛;

import java.util.Stack;

/**
 * @Author ZhangKe
 * @Date 2022/8/28 10:25
 * @Version 1.0
 */
public class test2 {
    public static void main(String[] args) {
        test2 test2 = new test2();
        test2.removeStars("erase*****");
    }
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (int i =0; i < s.length(); i++) {
            if (s.charAt(i) == '*'&& !stack.isEmpty()) {
                stack.pop();
                continue;
            }
            stack.add(s.charAt(i));
        }
        StringBuilder stringBuilder = new StringBuilder();
        while (!stack.isEmpty()) {
            stringBuilder.append(stack.pop());
        }
        s = stringBuilder.reverse().toString();
        return s;
    }
}
