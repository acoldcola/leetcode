package leetcode;

import java.util.Stack;

/**
 * @Author ZhangKe
 * @Date 2020/6/17 11:40
 * @Version 1.0
 */
public class leetcode946 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int j = 0;
        for (int i = 0; i < pushed.length; i++) {
            stack.push(pushed[i]);
            while (!stack.isEmpty() && stack.peek() == popped[j]) {
                j++;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
