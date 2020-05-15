package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author ZhangKe
 * @Date 2020/5/15 10:08
 * @Version 1.0
 * 和为K的子数组
 */
public class leetcode560 {
    public int subarraySum(int[] nums, int k) {
        int sum = 0;
        int count = 0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for (int s : nums) {
            sum += s;
            if (map.containsKey(sum -k)){
                count += map.get(sum -k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}
