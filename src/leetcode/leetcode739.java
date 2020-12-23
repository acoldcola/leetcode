package leetcode;

import java.util.Stack;

/**
 * @Author ZhangKe
 * @Date 2020/6/11 15:00
 * @Version 1.0
 * 每日温度
 */
public class leetcode739 {
    /*public int[] dailyTemperatures(int[] T) {
        if (T == null || T.length < 1) {
            return new int[0];
        }
        Stack<Integer> stack = new Stack<>();
        int size = T.length;
        int a[] = new int[size];
        for (int i = 0; i < size; i++) {
            while (!stack.isEmpty() && T[i] > T[stack.peek()]) {
                a[stack.peek()] = i - stack.pop();
            }
            stack.push(i);
        }
        return a;
    }*/
    public int[] dailyTemperatures(int[] T) {
        if (T == null || T.length == 0) {
            return new int[0];
        }
        int[] res = new int[T.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < T.length; i++) {
            while (!stack.isEmpty() && T[i] > T[stack.peek()]) {
                int a = stack.pop();
                res[a] = i - a;
            }
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            res[stack.pop()] = 0;
        }
        return res;
    }
}
