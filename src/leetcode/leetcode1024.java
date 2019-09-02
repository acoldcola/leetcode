package leetcode;

import java.util.Arrays;
import java.util.Stack;

/**
 * @auther ZhangKe
 * @date 2019/8/15 18:10
 * 最后一块石头的重量
 */
public class leetcode1024 {
    public int lastStoneWeight(int[] stones) {
        if (stones.length == 1) {
            return stones[0];
        }
        Arrays.sort(stones);
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < stones.length; i++) {
            stack.push(stones[i]);
        }
        while (stack.size() > 1){
            int x = stack.pop();
            int y = stack.pop();
            if (x != y) {
                x = x - y;
            }
        }
        return 0;
    }
}