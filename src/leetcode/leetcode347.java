package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @Author ZhangKe
 * @Date 2020/9/7 15:08
 * @Version 1.0
 * 前 K 个高频元素
 */
public class leetcode347 {
    public static void main(String[] args) {
        leetcode347 l = new leetcode347();
        l.topKFrequent(new int[]{4,1,-1,2,-1,2,3}, 2);
    }

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        Queue<Integer[]> queue = new PriorityQueue<Integer[]>((o1, o2) -> o1[1] - o2[1]);
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for (Integer i : map.keySet()) {
            if (queue.size() < k) {
                queue.add(new Integer[]{i,map.get(i)});
            } else {
                if (map.get(i) >= queue.peek()[1]) {
                    queue.poll();
                    queue.add(new Integer[]{i,map.get(i)});
                }
            }
        }
        int[] a = new int[k];
        for (int i = 0; i < k; i++) {
            a[i] = queue.poll()[0];
        }
        return a;
    }
}
