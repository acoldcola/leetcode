package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther ZhangKe
 * @date 2019/8/14 16:47
 * 找到所有数组中消失的数字
 */
public class leetcode448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] a = new int[nums.length + 1];
        a[0] = 1;
        for (int i = 0; i < nums.length; i++) {
            a[nums[i]] = 1;
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < a.length; i++) {
            if (a[i] == 0) {
                list.add(i);
            }
        }
        return list;
    }
}
