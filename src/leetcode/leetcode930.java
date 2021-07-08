package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author ZhangKe
 * @Date 2021/7/8 22:08
 * @Version 1.0
 */
public class leetcode930 {
    /*public int numSubarraysWithSum(int[] nums, int goal) {
        int[] a = new int[nums.length+1];
        a[0] = 0;
        int sum = 0;
        for (int i = 1; i < a.length; i++) {
            a[i] = a[i-1] + nums[i-1];
        }
        for (int i = a.length - 1; i > 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                if (a[i] - a[j] > goal) {
                    break;
                }
                if (a[i] - a[j] == goal) {
                    sum ++;
                }
            }
        }
        return sum;
    }*/

    public int numSubarraysWithSum(int[] nums, int goal) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int res = 0;
        for (Integer a : nums) {
            map.put(sum,map.getOrDefault(sum,0)+1);
            sum += a;
            res += map.getOrDefault(sum - goal,0);
        }
        return res;
    }
}
