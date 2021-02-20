package leetcode;

import java.util.*;

/**
 * @Author ZhangKe
 * @Date 2021/2/20 10:41
 * @Version 1.0
 *  数组的度
 */
public class leetcode697 {
    public static int findShortestSubArray(int[] nums) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            List<Integer> list = map.getOrDefault(nums[i],new ArrayList<>());
            list.add(i);
            map.put(nums[i],list);
        }
        Stack<Integer> stack = new Stack<>();
        for (Integer i : map.keySet()) {
            if (stack.isEmpty()) {
                stack.add(i);
            }else if (map.get(i).size() > map.get(stack.peek()).size()) {
                while (!stack.isEmpty()) {
                    stack.pop();
                }
                stack.add(i);
            }else if (map.get(i).size() == map.get(stack.peek()).size()) {
                stack.add(i);
            }
        }
        int res = Integer.MAX_VALUE;
        while (!stack.isEmpty()) {
            int a = stack.pop();
            List<Integer> list = map.get(a);
            int left = list.get(0);
            int right = list.get(list.size() - 1);
            res = Math.min(res, right - left + 1);
        }
        return res;
    }
}
