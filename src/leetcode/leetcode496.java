package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @Author ZhangKe
 * @Date 2020/12/23 16:55
 * @Version 1.0
 * 下一个更大元素 I
 */
public class leetcode496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        if (nums1 == null || nums1.length == 1) {
            return new int[0];
        }
        Stack<Integer> stack = new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums2.length; i++) {
            while (!stack.isEmpty() && nums2[i] > stack.peek()) {
                map.put(stack.pop(),nums2[i]);
            }
            stack.push(nums2[i]);
        }
        int[] res = new int[nums1.length];
        for(int i = 0; i < nums1.length; i++) {
            res[i] = map.get(nums1[i]) == null ? -1 : map.get(nums1[i]);
        }
        return res;
    }
}
