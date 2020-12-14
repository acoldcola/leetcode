package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author ZhangKe
 * @Date 2020/12/14 17:40
 * @Version 1.0
 * 存在重复元素
 */
public class leetcode217 {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return true;
            }else {
                map.put(nums[i],1);
            }
        }
        return false;
}
