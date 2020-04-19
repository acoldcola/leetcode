package leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author ZhangKe
 * @Date 2020/4/18 17:13
 * @Version 1.0
 */
public class test3 {
    public int minJump(int[] jump) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(jump[0]);
        int sum = 0;
        while (!queue.isEmpty()) {
            int x = queue.poll();
            sum ++;
            if (x > jump.length - 1) {
                return sum;
            }
            queue.offer(jump[x]);
        }
        return 0;
    }
}