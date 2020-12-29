package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/12/29 14:40
 * @Version 1.0
 * 按要求补齐数组
 */
public class leetcode330 {
    public int minPatches(int[] nums, int n) {
        int res = 0;
        long x = 1;
        int index = 0;
        while (x <= n) {
            if (index <= nums.length - 1 && x >= nums[index]) {
                x+=nums[index];
                index++;
            }else {
                x <<= 1;
                res++;
            }
        }
        return res;
    }
}
