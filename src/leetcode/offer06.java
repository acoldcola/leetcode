package leetcode;

import java.util.Stack;

/**
 * @Author ZhangKe
 * @Date 2020/6/30 10:33
 * @Version 1.0
 * 用两个栈实现队列
 */
public class offer06 {
    Stack<Integer> stack1;
    Stack<Integer> stack2;
    public offer06() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void appendTail(int value) {
        stack1.push(value);
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
    }

    public int deleteHead() {
        if (!stack2.isEmpty()) {
            return stack2.pop();
        }
        if (!stack1.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
            return stack2.pop();
        }else {
            return -1;
        }
    }
}

