package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author ZhangKe
 * @Date 2020/5/19 15:10
 * @Version 1.0
 * 连续的子数组和
 */
public class leetcode523 {
    public boolean checkSubarraySum(int[] nums, int k) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i-1];
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i] % k;
            if (n == 0 && i > 0) {
                return true;
            }
            Integer index = map.get(n);
            if (index == null) {
                map.put(n, i);
            } else if (i - index >= 2) { 
            }
        }
        return false;
    }
}
