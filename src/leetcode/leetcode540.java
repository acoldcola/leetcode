package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/7/13 17:10
 * @Version 1.0
 * 有序数组中的单一元素
 */
public class leetcode540 {
    public int singleNonDuplicate(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length;i++) {
            res ^= nums[i];
        }
        return res;
    }
}
