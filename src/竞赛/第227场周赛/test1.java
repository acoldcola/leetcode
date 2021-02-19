package 竞赛.第227场周赛;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @Author ZhangKe
 * @Date 2021/2/7 10:26
 * @Version 1.0
 */
public class test1 {
    public boolean check(int[] nums) {
        Deque<Integer> q = new ArrayDeque<>();
        for (int i = 0; i < nums.length; i++) {
            q.add(nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            q.addFirst(q.removeLast());
            if (judge(q)) {
                return true;
            }
        }
        return false;
    }

    public boolean judge(Deque<Integer> q) {
        Deque<Integer> deque = new ArrayDeque<>(q);
        int a = deque.pollFirst();
        while (!deque.isEmpty()) {
            int b = deque.pollFirst();
            if (a > b) {
                return false;
            }
            a = b;
        }
        return true;
    }
}
