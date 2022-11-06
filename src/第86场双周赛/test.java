package 第86场双周赛;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author ZhangKe
 * @Date 2022/9/3 22:29
 * @Version 1.0
 */
public class test {
    public static void main(String[] args) {
        test test = new test();
        test.findSubarrays(new int[]{1, 2, 3, 4, 5});
    }

    public boolean findSubarrays(int[] nums) {
        if (nums == null || nums.length < 3) {
            return false;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length - 1; i++) {
            int a = nums[i] + nums[i + 1];
            map.put(a, map.getOrDefault(a, 0) + 1);
        }
        for (int i : map.keySet()) {
            if (map.get(i) > 1) {
                return true;
            }
        }
        return false;
    }
}
