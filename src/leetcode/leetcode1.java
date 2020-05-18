package leetcode;

import java.util.HashMap;

/**
 * @Author ZhangKe
 * @Date 2020/5/15 18:21
 * @Version 1.0
 * 两数之和
 */
public class leetcode1 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])){
                return new int[] {map.get(target - nums[i]), i};
            }else {
                map.put(nums[i],i);
            }
        }
        return null;
    }
}