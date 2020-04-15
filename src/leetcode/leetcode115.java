package leetcode;

import java.util.Stack;

/**
 * @Author ZhangKe
 * @Date 2020/4/15 21:34
 * @Version 1.0
 * 最小栈
 */
public class leetcode115 {
    /** initialize your data structure here. */
    private Stack<Integer> stack;
    private Stack<Integer> stack_min;
    public leetcode115() {
        stack = new Stack<>();
        stack_min = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        if (stack_min.isEmpty()) {
            stack_min.push(x);
        }else {
            if (stack_min.peek() > x) {
                stack_min.push(x);
            }else {
                stack_min.push(stack_min.peek());
            }
        }
    }

    public void pop() {
        stack.pop();
        stack_min.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return stack_min.peek();
    }
}
