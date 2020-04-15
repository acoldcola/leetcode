package leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author ZhangKe
 * @Date 2020/4/15 22:05
 * @Version 1.0
 */
public class leetcode225 {
    private Queue<Integer> data;
    private Queue<Integer> help;
    /** Initialize your data structure here. */
    public leetcode225() {
        data = new LinkedList<>();
        help = new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        data.offer(x);
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        if (data.isEmpty()) {
            return 0;
        }
        while (data.size() > 1) {
            help.offer(data.poll());
        }
        int x = data.poll();
        swap();
        return x;
    }

    /** Get the top element. */
    public int top() {
        if (data.isEmpty()) {
            return 0;
        }
        while (data.size() > 1) {
            help.offer(data.poll());
        }
        int x = data.poll();
        help.offer(x);
        swap();
        return x;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return data.isEmpty();
    }

    public void swap() {
        Queue<Integer> temp = new LinkedList<>();
        temp = data;
        data = help;
        help = data;
    }
}
