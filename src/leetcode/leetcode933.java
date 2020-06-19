package leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author ZhangKe
 * @Date 2020/4/13 17:59
 * @Version 1.0
 * 最近的请求次数
 */
public class leetcode933 {
    Queue<Integer> queue;
    public leetcode933() {
        queue = new LinkedList<>();
    }

    public int ping(int t) {
        queue.add(t);
        while (queue.peek() < t - 3000){
            queue.poll();
        }
        return queue.size();
    }
}
