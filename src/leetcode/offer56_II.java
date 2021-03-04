package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author ZhangKe
 * @Date 2021/3/4 13:32
 * @Version 1.0
 *  数组中数字出现的次数 II
 */
public class offer56_II {
    public int singleNumber(int[] nums) {
        int[] res = new int[10001];
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for (Integer i : map.keySet()) {
            if (map.get(i) == 1) {
                return i;
            }
        }
        return 0;
    }
}
