import java.util.Stack;

/**
 * @auther ZhangKe
 * @date 2019/7/26 16:56
 * 用栈实现队列
 */
public class leetcode232 {
    public static void main(String[] args){
        leetcode232 leet = new leetcode232();
        for(int i = 0; i < 3; i++) {
            leet.push(i);
            System.out.println(leet.pop());
        }
        System.out.println(leet.empty());
        leet.push(1);
        System.out.println(leet.empty());
    }

    private static Stack<Integer> stack1 = new Stack<>();

    private static Stack<Integer> stack2 = new Stack<>();

    /**
     * Initialize your data structure here.
     */
    public leetcode232() {

    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        stack1.push(x);
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        if (stack2.isEmpty()) {
            return 0;
        }
        return stack2.pop();
    }

    /**
     * Get the front element.
     */
    public int peek() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        if (stack2.isEmpty()) {
            return 0;
        }
        return stack2.peek();
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        if (stack2.isEmpty() && stack1.isEmpty()) {
            return true;
        }
        return false;
    }
}