package leetcode;

import java.util.Stack;

/**
 * @Author ZhangKe
 * @Date 2020/6/7 11:17
 * @Version 1.0
 */
public class leetcode5430 {
    Stack<String> backStack = new Stack<>();
    Stack<String> pushStack = new Stack<>();
    public leetcode5430(String homepage) {
        backStack.push(homepage);
    }

    public void visit(String url) {
        backStack.push(url);
        pushStack = new Stack<>();
    }

    public String back(int steps) {
        String str = null;
        if (steps > backStack.size() - 1) {
            steps = backStack.size() - 1;
        }
        for (int i = 0; i < steps; i++) {
            pushStack.add(backStack.pop());
        }
        str = backStack.peek();
        return str;
    }

    public String forward(int steps) {
        String str = null;
        if (steps > pushStack.size()) {
            steps = pushStack.size();
        }
        for (int i = 0; i < steps; i++) {
            backStack.add(pushStack.pop());
        }
        str = backStack.peek();
        return str;
    }
}

